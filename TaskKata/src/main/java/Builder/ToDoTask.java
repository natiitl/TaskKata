package Builder;

import ExceptionTask.CharactersNotValidException;
import ExceptionTask.IdRequiredException;
import ExceptionTask.WrongNameLengthException;


import java.nio.charset.CharacterCodingException;
import java.util.Objects;
import java.util.regex.Pattern;

public class ToDoTask {
    private int idTasK=0;
    private String nameTask="";
    private DateTask dateTask;



    ToDoTask(ToDoTaskBuilder builder){
        this.idTasK = builder.getIdTasK();
        if(this.idTasK==0){
           throw new IdRequiredException("Unable to create task without identifier");
        }
        this.nameTask = builder.getNameTask();
        if(!Pattern.matches("^[a-zA-Z0-9 ]*$", this.nameTask)){
            throw new CharactersNotValidException("The name can only have alphanumeric characters and spaces");

        }
        if(nameTask.length()<4|| nameTask.length()>20){
            throw new WrongNameLengthException("Incorrect name length, must be from 5 to 20 characters");
        }
        this.dateTask = builder.getDateTask();

    }


    @Override
    public String toString() {
        return "Id=" + idTasK +
                "\nTask='" + nameTask +
                "\nDue=" + dateTask.toString();
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
