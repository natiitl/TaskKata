package Builder;

import ExceptionTask.DateNotValidateException;

public class DateTask {
    private int dayTask = 0;
    private int monthTask = 0;
    private int yearTask = 0;

    DateTask(DateTaskBuilder builder) {
        this.dayTask = builder.getDayTask();
        this.monthTask = builder.getMonthTask();
        this.yearTask = builder.getYearTask();
        if (this.dayTask == 0 || this.monthTask == 0) {
            throw new DateNotValidateException("Invalid date");
        }
        if(this.dayTask<1||this.dayTask>31){
            throw new DateNotValidateException("Invalid date");
        }
        if(this.monthTask<1||this.monthTask>12){
            throw new DateNotValidateException("Invalid date");
        }
    }

    @Override
    public String toString() {
        return yearTask + "-" + monthTask + "-" + dayTask;
    }
}
