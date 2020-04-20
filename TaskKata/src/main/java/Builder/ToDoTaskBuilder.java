package Builder;

public class ToDoTaskBuilder {
    private int idTasK;
    private String nameTask;
    private int dayTask;

    public int getIdTasK() {
        return idTasK;
    }

    public String getNameTask() {
        return nameTask;
    }

    public int getDayTask() {
        return dayTask;
    }

    public int getMonthTask() {
        return monthTask;
    }

    public int getYearTask() {
        return yearTask;
    }

    private int monthTask;
    private int yearTask;

    public ToDoTaskBuilder addIdTasK(int idTasK) {
        this.idTasK = idTasK;
        return this;
    }
    public ToDoTaskBuilder addNameTasK(String nameTask) {
        this.nameTask = nameTask;
        return this;
    }

    public ToDoTaskBuilder addDayTasK(int dayTask) {
        this.dayTask = dayTask;
        return this;
    }
    public ToDoTaskBuilder addMonthTasK(int monthTask) {
        this.monthTask = monthTask;
        return this;
    }
    public ToDoTaskBuilder addYearTasK(int yearTask) {
        this.yearTask = yearTask;
        return this;
    }

    public ToDoTask build(){
        return new ToDoTask(this);
    }

}
