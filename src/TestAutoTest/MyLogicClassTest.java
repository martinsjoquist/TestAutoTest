package TestAutoTest;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyLogicClassTest {

    @Test
    public void getStorage() {
        MyLogicClass getEnglish = new MyLogicClass();

        String test = "A";
        String expected = "*-";
        String actual = getEnglish.storage.get(test);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetMorse() {
        MyLogicClass getMorse = new MyLogicClass();
        String test = "F ";
        String expected = "**-*";
        String actual = getMorse.setToMorse(test);

        assertEquals(expected, actual);

    }

    @Test
    public void testGetEnglish() {
        MyLogicClass getMorse = new MyLogicClass();

        String test = "**-*";
        String expected = "F ";
        String actual = getMorse.setToEnglish(test);

        assertEquals(expected, actual);
    }

        @Test
        public void testGetEngWord() {
            MyLogicClass getMorse = new MyLogicClass();

            String test = "*-** --- ***- *";
            String expected = "L O V E ";
            String actual = getMorse.setToEnglish(test);

            assertEquals(expected, actual);

        }


    }




