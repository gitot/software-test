package com.example.softwaretest;

import com.example.softwaretest.Stack;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {

    private Stack stack;

    @BeforeMethod
    public void setUp() {
        stack = new Stack();
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void testPop_whenNoElements_shouldThrowException() {
        assertThat(stack.pop());
    }

    @Test
    public void testPush() {
        stack.push(1);
        assertThat(stack.size()).isEqualTo(1);
    }
}