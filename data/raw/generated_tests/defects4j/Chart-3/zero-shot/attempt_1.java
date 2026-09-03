package org.jfree.chart.axis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValueAxisTest {

    @Test
    void valueAxisCompiles() {
        assertNotNull(new ValueAxis().resultOrDefault());
    }
}
