package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodaysDateTest {

    @Test
    public void testPrintDateAndTime() {
        TodaysDate date = new TodaysDate();
        date.printDateAndTime();

        assertNotNull(date.time);
        assertTrue(date.day > 0 && date.day <= 31);
    }
}
