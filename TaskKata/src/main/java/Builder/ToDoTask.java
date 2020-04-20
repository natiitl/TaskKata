package Builder;

import ExceptionTask.IdRequiredException;
import Repository.TaskRepository;

import java.util.Objects;

public class ToDoTask {
    private int idTasK=0;
    private String nameTask="";
    private int dayTask=0;
    private int monthTask=0;
    private int yearTask=0;
    private TaskRepository taskRepository;


    ToDoTask(ToDoTaskBuilder builder){
        this.idTasK = builder.getIdTasK();
        if(this.idTasK==0){
           throw new IdRequiredException("Unable to create task without identifier");
        }
        this.nameTask = builder.getNameTask();
        this.dayTask = builder.getDayTask();
        this.monthTask = builder.getMonthTask();
        this.yearTask = builder.getYearTask();
    }


    @Override
    public String toString() {
        return "Id=" + idTasK +
                "\nTask='" + nameTask +
                "\nDue=" + yearTask+ "-" + monthTask +"-"+dayTask;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoTask toDoTask = (ToDoTask) o;
        return idTasK == toDoTask.idTasK;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTasK);
    }

    public boolean isSame(ToDoTask toDoTask) {
        return this.equals(toDoTask);
    }
}
