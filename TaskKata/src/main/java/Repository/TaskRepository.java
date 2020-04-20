package Repository;
import Builder.ToDoTask;
import TodoTask.Console;
import ExceptionTask.IdExistException;



import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private List<ToDoTask> taskList ;
    private Console console;

    public TaskRepository(Console console){
        this.console = console;
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
    public void showTask(){
        for (ToDoTask toDoTask:taskList ) {
           console.print(toDoTask.toString());
        }
    }
    public void showIncompleteTask(){
        for (ToDoTask toDoTask:taskList ) {
            if (toDoTask.isIncomplete()) {
                console.print(toDoTask.toString());
            }
        }
    }

}
