package school.redrover.lecture9.time;

public class Date {

    private  int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    public Date plusDays(int days){
        return new Date(this.day + days, month, year);
    }
}
