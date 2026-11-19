package org.example.demo1;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LocalizationServiceTest {

    @Test
    void returnsEmptyMapWhenDatabaseIsNotAvailable() {
        Map<String, String> strings = LocalizationService.getLocalizedStrings(Locale.US);

        assertNotNull(strings);
        assertTrue(strings.isEmpty());
    }
}
