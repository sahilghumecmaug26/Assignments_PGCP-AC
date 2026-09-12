
public class Date {

    private int day;
    private int month;
    private int year;


    // Setter 
    public void setDate(int dd, int mm, int yy) {

        year = yy;

        // Check month
        if (mm < 1 || mm > 12)
            month = 1;
        else
            month = mm;


        // Check day
        if (month == 2) {

            if (isLeapYear(year)) {
                if (dd < 1 || dd > 29)
                    day = 1;
                else
                    day = dd;
            }
            else {
                if (dd < 1 || dd > 28)
                    day = 1;
                else
                    day = dd;
            }
        }

        else if (month == 4 || month == 6 ||
                 month == 9 || month == 11) {

            if (dd < 1 || dd > 30)
                day = 1;
            else
                day = dd;
        }

        else {

            if (dd < 1 || dd > 31)
                day = 1;
            else
                day = dd;
        }
    }


    // Add Days
    public void addDays(int days) {

        while (days > 0) {

            day++;

            if (day > getDaysInMonth(month, year)) {

                day = 1;
                month++;

                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

            days--;
        }
    }


    // Add Months
    public void addMonths(int months) {

        while (months > 0) {

            month++;

            if (month > 12) {
                month = 1;
                year++;
            }

            int maxDays = getDaysInMonth(month, year);

            if (day > maxDays)
                day = maxDays;

            months--;
        }
    }


    // Add Years
    public void addYears(int years) {

        year = year + years;

        int maxDays = getDaysInMonth(month, year);

        if (day > maxDays)
            day = maxDays;
    }


    // Display Date
    public void display() {

        System.out.println(day + "/" + month + "/" + year);
    }


    // Getter 
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    // Check Leap Year
    public boolean isLeapYear(int year) {

        if (year % 400 == 0)
            return true;

        else if (year % 100 == 0)
            return false;

        else if (year % 4 == 0)
            return true;

        else
            return false;
    }


    // Get maximum days in a month
    public int getDaysInMonth(int month, int year) {

        if (month == 2) {

            if (isLeapYear(year))
                return 29;
            else
                return 28;
        }

        else if (month == 4 || month == 6 ||
                 month == 9 || month == 11) {

            return 30;
        }

        else {
            return 31;
        }
    }
}

