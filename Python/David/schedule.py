class Schedule():

    def __init__(self, name, courses={}, warnings=[]):
        self.name = name
        self.courses = courses
        self.warnings = warnings

    def add(self, course):
        if course.name not in self.courses:
            course.in_schedules.append(self)
            self.courses[course.name] = course

    def __repr__(self):
        res = self.name
        for course_name in self.courses:
            res += "\n{}: {}".format(self.courses[course_name].name, self.courses[course_name].days)
            if self.courses[course_name].days != "TBA":
                res += " {}-{}".format(self.courses[course_name].start_time, self.courses[course_name].end_time)
        res += "\nWarnings:\n"
        for warning in self.warnings:
            res += "\n" + warning
        return res

class StudentSchedule(Schedule):
    
    def __init__(self, name, courses={}, warnings=[]):
        super().__init__(name, courses, warnings)

    def add(self, course):
        if course.name not in self.courses:
            for my_course_name in self.courses:
                if self.courses[my_course_name].conflicts_with(course):
                    self.warnings.append("Could not add {} due to conflict with {}.".format(course.name, my_course_name))
                    return
            course.in_schedules.append(self)
            self.courses[course.name] = course

class Course():

    def __init__(self, name, days="TBA", start_time="", end_time="", in_schedules=[]):
        self.name = name
        self.in_schedules = in_schedules
        self.days = days
        self.start_time = start_time
        self.end_time = end_time

    def convert_time(self):
        '''
        Converts the courses start and end times from 12 hour to 24 hour time.
        Returns the converted times as a tuple.
        '''

        start_hour, end_hour = (self.start_time[0: self.start_time.index(":")], self.end_time[0: self.end_time.index(":")])
        start_hour = str(int(start_hour) % 12)
        end_hour = str(int(end_hour) % 12)
        if "pm" in self.start_time:
            start_hour = str(int(start_hour) + 12)
        if "pm" in self.end_time:
            end_hour = str(int(end_hour) + 12)
        return (("0" + start_hour + ":" + self.start_time[self.start_time.index(":") + 1 :-2])[-5:], ("0" + end_hour + ":" + self.end_time[self.end_time.index(":") + 1 :-2])[-5:])

    def conflicts_with(self, course):
        if self.days == "TBA" or course.days == "TBA":
            return False
        for day in self.days:
            if day in course.days:
                my_start, my_end = self.convert_time()
                other_start, other_end = course.convert_time()
                return (my_start >= other_start and my_start < other_end) or (other_start >= my_start and other_start < my_end)
        return False

    def change_time(self, days, start_time, end_time):
        self.days = days
        self.start_time = start_time
        self.end_time = end_time

        for i in range(len(self.in_schedules)):
            # Change the time of the course in the schedule. Add a warning to the schedule that the time changed

            if self.in_schedules[i].courses[self.name].days != "TBA":
                self.in_schedules[i].warnings.append("{}: time changed from {} {}-{} to {} {}-{}".format(self.name, self.in_schedules[0].courses[self.name].days, self.in_schedules[0].courses[self.name].start_time, self.in_schedules[0].courses[self.name].end_time, days, start_time, end_time))
            else:
                self.in_schedules[i].warnings.append("{}: time changed from {} to {} {}-{}".format(self.name, self.in_schedules[0].courses[self.name].days, days, start_time, end_time))
            self.in_schedules[i].courses[self.name] = self

            # Add a warning in the student schedule for each course that conflicts with this course due to the time change
            if i > 0:
                for course in self.in_schedules[i].courses:
                    if self.in_schedules[i].courses[course] != self and self.in_schedules[i].courses[course].conflicts_with(self):
                        self.in_schedules[i].warnings.append("{}: time change causes conflict with {}".format(self.name, course))

courses = [
    Course("CS 1110 LEC 001", "TR", "9:05am", "9:55am"),
    Course("INFO 2450 LEC 001", "TR", "9:40am", "10:55am"),
    Course("BIOG 1140 DIS 201", "R", "9:05am", "9:55am"),
    Course("ENGL 2650 SEM 101", "TR", "11:25am", "12:40pm"),
    Course("HADM 1150 LEC 001", "TR," "11:25am", "12:40pm"),
    Course("ARCH 1120 STU 520", "TBA"),
    Course("AEM 2010 LEC 001", "TR", "8:05am", "9:20am"),
    Course("AEP 3560 LEC 001", "MWF", "9:05am", "9:55am"),
    Course("FAKE 0000 LEC 001", "T", "9:30am", "9:45am"),
    Course("FAKER 0000 LEC 002", "F", "1:30pm", "2:30pm")
]

a_courses = [
    Course("CS 1110 LEC 001", "TR", "9:05am", "9:55am"),
    Course("ARCH 1120 STU 520", "TBA"),
    Course("FAKER 0000 LEC 002", "F", "1:30pm", "2:30pm"),
    Course("AEP 3560 LEC 001", "MWF", "9:05am", "9:55am")
]

# Here is our running example of a course roster
cornell = Schedule("Schedule Cornell Fall 21 roster")
for course in courses:
    cornell.add(course)

print(cornell)

# Creating my own schedule, adding 3 non-conflicting courses to it.
a = StudentSchedule("Schedule My Plan A")
for course in a_courses:
    a.add(course)

# Here is my_schedule so far.
print(a)

# Adding INFO2450 should fail due to starting during CS1110.
# CHECK that it isn't in my_schedule, but a warning about it is:
a.add(courses[1])

print(a)