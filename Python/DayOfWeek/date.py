months = {
    "Jan": 1,
    "Feb": 2,
    "Mar": 3,
    "Apr": 4,
    "May": 5,
    "Jun": 6,
    "Jul": 7,
    "Aug": 8,
    "Sep": 9,
    "Oct": 10,
    "Nov": 11,
    "Dec": 12
}
monthDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
weekdays = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

# Returns the number of leap years from year 0 to year yr
def countLeapYears(mon, yr):
    if months[mon] <= 2:
        yr -= 1
    return int(yr / 4) - int(yr / 100) + int(yr / 400)

# Returns the total number of days at date "mon/day/yr" since Dec 31 1BC 
def countDays(day, mon, yr):
    # Set total_days to the number of days elapsed in the current month
    total_days = day

    # Iterate through monthDays and add total number of days in months already elapsed
    for m in range(0, months[mon] - 1):
        total_days += monthDays[m]
    
    # Add 365 days for every year and an extra day for every leap year
    total_days += (365 * yr) + countLeapYears(mon, yr)

    return total_days

# Returns the number of days between dates "mon1/day1/yr1" and "mon2/day2/yr2"
def getDayDiff(day1, mon1, yr1, day2, mon2, yr2):
    return countDays(day2, mon2, yr2) - countDays(day1, mon1, yr1)

# Returns the days of the week of date "mon/day/yr"
def getDayOfWeek(day, mon, yr):
    day_number = getDayDiff(21, "Feb", 2021, day, mon, yr) % 7
    return weekdays[day_number]


print(getDayOfWeek(7, "Dec", 1941))
print(getDayOfWeek(6, "Jan", 2021))
print(getDayOfWeek(4, "Jul", 1776))