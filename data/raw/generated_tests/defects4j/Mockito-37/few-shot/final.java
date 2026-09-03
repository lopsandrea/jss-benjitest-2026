package org.mockito.internal.invocation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Mockito-37. */
class InvocationImplTest {

    @Test
    void invocationImplReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new InvocationImpl().result(INPUT_0));
    }

    @Test
    void invocationImplReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new InvocationImpl().result(INPUT_1));
    }

    @Test
    void invocationImplReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new InvocationImpl().result(INPUT_2));
    }
}
