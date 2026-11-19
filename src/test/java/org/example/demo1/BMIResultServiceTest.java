package org.example.demo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class BMIResultServiceTest {

    @Test
    void doesNotCrashWhenDatabaseIsNotAvailable() {
        assertDoesNotThrow(() -> BMIResultService.saveResult(70, 1.75, 22.86, "en"));
    }
}
