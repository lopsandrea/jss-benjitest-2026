package org.mockito.internal.handler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Mockito-7. */
class MockHandlerImplTest {

    @Test
    void mockHandlerImplAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new MockHandlerImpl().result(INPUT_0));
    }

    @Test
    void mockHandlerImplAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new MockHandlerImpl().result(INPUT_1));
    }

    @Test
    void mockHandlerImplAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new MockHandlerImpl().result(INPUT_2));
    }

    @Test
    void mockHandlerImplAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new MockHandlerImpl().result(INPUT_3));
    }

    @Test
    void mockHandlerImplAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new MockHandlerImpl().result(INPUT_4));
    }
}
