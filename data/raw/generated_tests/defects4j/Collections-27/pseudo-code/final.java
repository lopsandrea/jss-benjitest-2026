package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Collections-27. */
class SetUniqueListTest {

    @Test
    void setUniqueListReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new SetUniqueList().result(INPUT_0));
    }

    @Test
    void setUniqueListReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new SetUniqueList().result(INPUT_1));
    }

    @Test
    void setUniqueListReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new SetUniqueList().result(INPUT_2));
    }

    @Test
    void setUniqueListReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new SetUniqueList().result(INPUT_3));
    }
}
