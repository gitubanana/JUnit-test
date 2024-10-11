package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
class AppTest extends IOTest {
    @Test
    @DisplayName("1이 나와야 하는 테스트")
    void checkOneTest() {
        setIn("6\n"
                + "()()()");

        runMain();

        assertEquals(getOutput(), "1");
    }
    void runMain() {
        try {
            App.main(new String[]{});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
