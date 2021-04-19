package com.example.softwaretest;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.testng.AssertJUnit.fail;

public class InjectMockTest {
    @Mock
    private UserService userService;
    @InjectMocks
    private OrderService orderService;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testMockito() {
        //anyString() param must not be null,otherwise stub will not work
        when(userService.getUserName(anyString())).thenReturn("hello world");
        try {
            orderService.getOrder("134324132");
        } catch (NullPointerException e) {
            fail();
        }

    }
}
