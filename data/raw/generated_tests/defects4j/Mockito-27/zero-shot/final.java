package org.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Mockito-27. */
class ArgumentCaptorTest {

    @Test
    void argumentCaptorReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new ArgumentCaptor().result(INPUT_0));
    }

    @Test
    void argumentCaptorReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new ArgumentCaptor().result(INPUT_1));
    }

    @Test
    void argumentCaptorReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new ArgumentCaptor().result(INPUT_2));
    }

    @Test
    void argumentCaptorReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new ArgumentCaptor().result(INPUT_3));
    }
}
