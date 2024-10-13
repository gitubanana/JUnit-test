package org.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class IOTest {
    private static final PrintStream systemOut = System.out;
    private ByteArrayOutputStream resultOut;

    void setIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @BeforeEach
    void setOut() {
        resultOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(resultOut)); // System.out을 resultOut 리디렉션
    }

    @AfterEach
    void printOutputToSystemOut() {
        systemOut.println(getOutput());
    }

    String getOutput() {
        return resultOut.toString().trim();
    }
}
