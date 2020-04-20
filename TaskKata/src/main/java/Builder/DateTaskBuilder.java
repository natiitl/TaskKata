package Builder;

public class DateTaskBuilder {
    private int dayTask=0;
    private int monthTask=0;
    private int yearTask=0;



    public int getDayTask() {
        return dayTask;
    }

    public int getMonthTask() {
        return monthTask;
    }

    public int getYearTask() {
        return yearTask;
    }

    public DateTaskBuilder addDayTasK(int dayTask) {
        this.dayTask = dayTask;
        return this;
    }
    public DateTaskBuilder addMonthTasK(int monthTask) {
        this.monthTask = monthTask;
        return this;
    }
    public DateTaskBuilder addYearTasK(int yearTask) {
        this.yearTask = yearTask;
        return this;
    }

    public DateTask build(){
        return new DateTask(this);
    }
}
