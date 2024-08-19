package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void abstractionTest() {
        TodoItem todoItem = new TodoItem("A", "B", "C");

        Assertions.assertEquals("A", todoItem.getTitle());
        Assertions.assertEquals("B", todoItem.getDetail());
        Assertions.assertEquals("C", todoItem.getStatus());
    }
}
