package UnitTest;


import Builder.DateTask;
import Builder.DateTaskBuilder;
import Builder.ToDoTask;
import Builder.ToDoTaskBuilder;
import ExceptionTask.*;
import Repository.TaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ToDoTaskShould {
    TaskRepository taskRepository;
    DateTask dateTask;

    @BeforeEach
    public void init() {
        taskRepository = new TaskRepository();
        dateTask = new DateTaskBuilder()
                .addDayTasK(20)
                .addMonthTasK(4)
                .addYearTasK(20)
                .build();
    }

    @Test
    public void verify_create_toDo_task(){
        ToDoTask taskExpected = new ToDoTask(1,"First Task", dateTask);
        assertEquals(taskExpected,new ToDoTaskBuilder()
                .addIdTasK(1)
                .addNameTasK("First Task")
                .addDateTask(dateTask)
                .build());
    }

}
