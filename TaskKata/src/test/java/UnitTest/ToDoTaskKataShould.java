package UnitTest;


import Builder.*;
import ExceptionTask.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ToDoTaskKataShould {
    @Test
    public void raise_error_when_id_to_task_is_empty() {
        assertThrows(IdRequiredException.class,() ->  new ToDoTaskBuilder()
                .build());
    }
}
