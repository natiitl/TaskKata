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
        if (this.dayTask == 0 || this.monthTask == 0 || this.yearTask == 0) {
            throw new DateNotValidateException("Invalid date");
        }
    }
}
