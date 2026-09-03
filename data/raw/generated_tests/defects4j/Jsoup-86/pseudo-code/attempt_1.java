package org.jsoup.select;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectorTest {

    @Test
    void selectorCompiles() {
        assertNotNull(new Selector().resultOrDefault());
    }
}
