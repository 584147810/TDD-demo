package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoAPPTest {

    @Test
    void should_show_the_TBD_list() {
        var result=new TodoAPP().ShowList();
        assertEquals(List.of("To be done","1 Task 01","2 Task 02","Completed",
                "3 Task 03","4 Task 04"),result);
    }
}