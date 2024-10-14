package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest extends IOTest {
    @Test
    @DisplayName("예제 테스트")
    void sampleTest() {
        setIn("5\n"
                + "4 5\n"
                + "4 2\n"
                + "2 3\n"
                + "1 2");

        runMain();
        assertThat(getOutput()).isEqualTo("2");
    }

    @Test
    @DisplayName("-1이 나와야 하는 테스트")
    void checkMinusOneTest() {
        setIn("3\n"
                + "(()");
    @DisplayName("도시의 수가 1일 때 테스트")
    void oneTest() {
        setIn("1\n");

        runMain();

        assertEquals(getOutput(), "-1");
        assertThat(getOutput()).isEqualTo("1");
    }

    void runMain() {
        try {
            App.main(new String[]{});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
