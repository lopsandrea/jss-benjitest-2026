package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Mockito-16. */
class ReturnsDeepStubsTest {

    @Test
    void returnsDeepStubsAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new ReturnsDeepStubs().result(INPUT_0));
    }

    @Test
    void returnsDeepStubsAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new ReturnsDeepStubs().result(INPUT_1));
    }

    @Test
    void returnsDeepStubsAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new ReturnsDeepStubs().result(INPUT_2));
    }
}
