package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElementTest {

    @Test
    void elementCompiles() {
        assertNotNull(new Element().resultOrDefault());
    }
}
