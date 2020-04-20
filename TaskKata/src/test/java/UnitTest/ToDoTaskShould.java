package UnitTest;


import Builder.DateTask;
import Builder.DateTaskBuilder;
import Builder.ToDoTask;
import Builder.ToDoTaskBuilder;
import TodoTask.Console;
import Repository.TaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

public class ToDoTaskShould {
    TaskRepository taskRepository;
    DateTask dateTask;
    Console console;

    @BeforeEach
    public void init() {
        console = mock(Console.class);
        taskRepository = new TaskRepository(console);
        dateTask = new DateTaskBuilder()
                .addDayTasK(20)
                .addMonthTasK(4)
                .addYearTasK(20)
                .build();
    }

    @Test
    public void verify_create_toDo_task() {
        ToDoTask taskExpected = new ToDoTask(1, "First Task", dateTask);
        assertEquals(taskExpected, new ToDoTaskBuilder()
                .addIdTasK(1)
                .addNameTasK("First Task")
                .addDateTask(dateTask)
                .build());
    }

    @Test
    public void show_all_task() {
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

        verify(console).print("Id=1\n" +
                "Task=First Task\n" +
                "Due=20-4-20");
        verify(console).print("Id=2\n" +
                "Task=Second Task\n" +
                "Due=20-4-20");
    }

    @Test
    public void show_incomplete_task() {
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

        taskRepository.showIncompleteTask();

        verify(console).print("Id=2\n" +
                "Task=Second Task\n" +
                "Due=20-4-20");
    }

}
