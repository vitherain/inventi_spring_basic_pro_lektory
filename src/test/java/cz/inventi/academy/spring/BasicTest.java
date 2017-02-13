package cz.inventi.academy.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cz.inventi.academy.spring.CountService;
import cz.inventi.academy.spring.MessageService;

@Ignore
public class BasicTest {

    @Autowired
    private MessageService messageService;

    @Autowired
    private CountService countService;

    @Test
    public void getMessage() throws Exception {
        assertNotNull(messageService);
        assertEquals("Hello world!", messageService.getMessage());
    }

    @Test
    public void printMessage() throws Exception {
        assertNotNull(countService);
        countService.printMessage();
    }
}