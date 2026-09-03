package org.apache.commons.lang3.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashCodeBuilderTest {

    @Test
    void hashCodeBuilderCompiles() {
        assertNotNull(new HashCodeBuilder().resultOrDefault());
    }
}
