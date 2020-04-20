package Builder;

public class ToDoTaskBuilder {
    private int idTasK;
    private String nameTask;
    private DateTask dateTask;

    public DateTask getDateTask() {
        return dateTask;
    }


    public int getIdTasK() {
        return idTasK;
    }

    public String getNameTask() {
        return nameTask;
    }


    public ToDoTaskBuilder addIdTasK(int idTasK) {
        this.idTasK = idTasK;
        return this;
    }
    public ToDoTaskBuilder addNameTasK(String nameTask) {
        this.nameTask = nameTask;
        return this;
    }
    public ToDoTaskBuilder addDateTask(DateTask dateTask){
        this.dateTask = dateTask;
        return this;
    }


    public ToDoTask build(){
        return new ToDoTask(this);
    }

}
