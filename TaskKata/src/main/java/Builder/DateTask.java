package Builder;

public class DateTask {
    private int dayTask=0;
    private int monthTask=0;
    private int yearTask=0;

    DateTask(DateTaskBuilder builder){
        this.dayTask = builder.getDayTask();
        this.monthTask = builder.getMonthTask();
        this.yearTask = builder.getYearTask();
    }
}
