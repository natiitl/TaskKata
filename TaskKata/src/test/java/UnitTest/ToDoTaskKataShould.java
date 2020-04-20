package UnitTest;


import Builder.*;
import ExceptionTask.*;
import Repository.TaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ToDoTaskKataShould {
    TaskRepository taskRepository;

    @BeforeEach
    public void init() {
        taskRepository = new TaskRepository();
    }

    @Test
    public void raise_error_when_id_to_task_is_empty() {
        assertThrows(IdRequiredException.class, () -> new ToDoTaskBuilder()
                .build());
    }

    @Test
    public void raise_error_when_id_exist_for_other_task() {
        ToDoTask toDoTask1 = new ToDoTaskBuilder()
                .addIdTasK(1)
                .addNameTasK("Tarea1")
                .build();
        taskRepository.addTask(toDoTask1);
        ToDoTask toDoTask2 = new ToDoTaskBuilder()
                .addIdTasK(1)
                .addNameTasK("Tarea1")
                .build();
        assertThrows(IdExistException.class, () -> taskRepository.addTask(toDoTask2));
    }

    @Test
    public void raise_error_when_name_length_is_less_then_five_characters() {
        assertThrows(WrongNameLengthException.class, () -> new ToDoTaskBuilder()
                .addIdTasK(1)
                .addNameTasK("NO")
                .build());
    }

    @Test
    public void raise_error_when_name_length_is_more_then_twenty_characters() {
        assertThrows(WrongNameLengthException.class, () -> new ToDoTaskBuilder()
                .addIdTasK(1)
                .addNameTasK("NameWithLongVeryLongCharacter")
                .build());
    }
}
