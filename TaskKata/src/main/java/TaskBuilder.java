public class TaskBuilder {
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

    public TaskBuilder addIdTasK(int idTasK) {
        this.idTasK = idTasK;
        return this;
    }
    public TaskBuilder addNameTasK(String nameTask) {
        this.nameTask = nameTask;
        return this;
    }

    public TaskBuilder addDayTasK(int dayTask) {
        this.dayTask = dayTask;
        return this;
    }
    public TaskBuilder addMonthTasK(int monthTask) {
        this.monthTask = monthTask;
        return this;
    }
    public TaskBuilder addYearTasK(int yearTask) {
        this.yearTask = yearTask;
        return this;
    }

    public Task build(){
        return new Task(this);
    }

}
