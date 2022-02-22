from data import *
from grades import *

if __name__ == "__main__":
    students_grades = get_students_grades()
    print(course_grade_statistics("COMP1516", students_grades))
    print(course_grade_statistics("COMM1000", students_grades))
    print(course_grade_statistics("MATH1347", students_grades))