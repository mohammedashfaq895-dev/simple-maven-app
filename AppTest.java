package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testGrades() {
        App app = new App();

        assertEquals("Grade S", app.getGrade(95));
        assertEquals("Grade A", app.getGrade(85));
        assertEquals("Grade B", app.getGrade(75));
        assertEquals("Grade C", app.getGrade(65));
        assertEquals("Grade D", app.getGrade(55));
        assertEquals("Grade E", app.getGrade(45));
        assertEquals("Grade F", app.getGrade(30));
    }
}
