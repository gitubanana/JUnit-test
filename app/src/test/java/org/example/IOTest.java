package org.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;

public abstract class IOTest {
    private ByteArrayOutputStream resultOut;

    void setIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @BeforeEach
    void setOut() {
        resultOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(resultOut)); // resultOut으로 System.out을 리디렉션
    }

    String getOutput() {
        return resultOut.toString().trim();
    }
}
