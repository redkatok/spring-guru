package app.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getBear() {
        App app = new App();
        String result = app.getBear();

        assertEquals("test",result);
    }
}