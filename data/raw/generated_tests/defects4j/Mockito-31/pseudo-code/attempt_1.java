package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReturnsDeepStubsTest {

    @Test
    void returnsDeepStubsCompiles() {
        assertNotNull(new ReturnsDeepStubs().resultOrDefault());
    }
}
