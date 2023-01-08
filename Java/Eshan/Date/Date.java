public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear() {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public int getDaysInYear() {
        return isLeapYear() ? 366 : 365;
    }

    public int getDaysInMonth() {
        if (month == 1 || month == 3 || month == 5|| month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 2) {
            return isLeapYear() ? 29 : 28;
        }
        return 30;
    }

    public void addDays(int days) {
        while (days + day > getDaysInMonth()) {
            days -= (getDaysInMonth() - day + 1);
            day = 1;
            if (month < 12) {
                month++;
            }
            else {
                month = 1;
                year++;
            }
        }
        day += days;
    }

    public int countDays() {
        Date current = new Date(0,1,0);
        int totalDays = day;
        while (current.year < year) {
            totalDays += current.getDaysInYear();
            current.year++;
        }

        while (current.month < month) {
            totalDays += current.getDaysInMonth();
            current.month++;
        }
        return totalDays;
    }
    

    public int daysTo(Date other) {
        return other.countDays() - countDays();
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
