package AcceptanceTest;

import Builder.DateTask;
import Builder.DateTaskBuilder;
import Builder.ToDoTask;
import Builder.ToDoTaskBuilder;
import Repository.TaskRepository;
import TodoTask.Console;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;


public class TaskKataAcceptanceTest {
    TaskRepository taskRepository;
    DateTask dateTask;
    Console console;
    InOrder inOrder;

    @BeforeEach
    public void init() {
        console = mock(Console.class);
        inOrder = inOrder(console);

        taskRepository = new TaskRepository(console);
        dateTask = new DateTaskBuilder()
                .addDayTasK(20)
                .addMonthTasK(4)
                .addYearTasK(20)
                .build();
    }

    @Test
    public void TaskAcceptanceTest() {
        ToDoTask toDoTaskOne = new ToDoTaskBuilder()
                .addIdTasK(1)
                .addNameTasK("First Task")
                .addDateTask(dateTask)
                .build();
        taskRepository.addTask(toDoTaskOne);
        ToDoTask toDoTaskTwo = new ToDoTaskBuilder()
                .addIdTasK(2)
                .addNameTasK("Second Task")
                .addDateTask(dateTask)
                .build();
        taskRepository.addTask(toDoTaskTwo);
        toDoTaskOne.taskComplete();

        taskRepository.showTask();

        inOrder.verify(console).print("Id=1\n" +
                "Task=First Task\n" +
                "Due=20-4-20");
        inOrder.verify(console).print("Id=2\n" +
                "Task=Second Task\n" +
                "Due=20-4-20");
        taskRepository.showIncompleteTask();

        inOrder.verify(console).print("Id=2\n" +
                "Task=Second Task\n" +
                "Due=20-4-20");
    }
}
