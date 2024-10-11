package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
class AppTest extends IOTest {
    void runMain() {
        try {
            App.main(new String[]{});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
