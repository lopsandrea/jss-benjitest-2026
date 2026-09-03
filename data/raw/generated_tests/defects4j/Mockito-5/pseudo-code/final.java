package org.mockito.internal.util.reflection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Mockito-5. */
class FieldInitializerTest {

    @Test
    void fieldInitializerReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new FieldInitializer().result(INPUT_0));
    }

    @Test
    void fieldInitializerReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new FieldInitializer().result(INPUT_1));
    }

    @Test
    void fieldInitializerReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new FieldInitializer().result(INPUT_2));
    }
}
