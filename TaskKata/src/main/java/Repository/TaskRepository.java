package Repository;
import Builder.ToDoTask;
import ExceptionTask.IdExistException;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private List<ToDoTask> taskList ;
    public TaskRepository(){
        this.taskList = new ArrayList<>();
    }

    public void addTask (ToDoTask toDoTask){
        for (ToDoTask toDoTaskIn:taskList ) {
            if(toDoTask.isSame(toDoTaskIn)){
                throw new IdExistException("A task with that identifier already exists");
            }
        }
        taskList.add(toDoTask);

    }

}
