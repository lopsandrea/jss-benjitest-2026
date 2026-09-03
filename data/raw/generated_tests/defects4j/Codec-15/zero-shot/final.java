package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Codec-15. */
class DigestUtilsTest {

    @Test
    void digestUtilsReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new DigestUtils().result(INPUT_0));
    }

    @Test
    void digestUtilsReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new DigestUtils().result(INPUT_1));
    }

    @Test
    void digestUtilsReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new DigestUtils().result(INPUT_2));
    }

    @Test
    void digestUtilsReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new DigestUtils().result(INPUT_3));
    }

    @Test
    void digestUtilsReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new DigestUtils().result(INPUT_4));
    }
}
