package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServletTest {

    @Test
    public void testDoGet() throws Exception {
        HelloWorldServlet servlet = new HelloWorldServlet();
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        Mockito.when(response.getWriter()).thenReturn(writer);

        servlet.doGet(request, response);

        writer.flush();
        assertTrue(stringWriter.toString().contains("Hello, World!"));
    }
}
