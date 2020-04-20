public class Task {
    private int idTasK;
    private String nameTask;
    private int dayTask;
    private int monthTask;
    private int yearTask;

    Task(TaskBuilder builder){
        this.idTasK = builder.getIdTasK();
        this.nameTask = builder.getNameTask();
        this.dayTask = builder.getDayTask();
        this.monthTask = builder.getMonthTask();
        this.yearTask = builder.getYearTask();

    }


}
