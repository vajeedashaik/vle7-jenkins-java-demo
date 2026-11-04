package com.vle7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greetingReturnsExpectedMessage() {
        assertEquals("Hello from VLE-7 Jenkins CI/CD!", App.greeting());
    }
}
