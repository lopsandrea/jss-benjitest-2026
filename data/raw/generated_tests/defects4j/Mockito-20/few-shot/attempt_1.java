package org.mockito.internal.invocation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvocationMatcherTest {

    @Test
    void invocationMatcherCompiles() {
        assertNotNull(new InvocationMatcher().resultOrDefault());
    }
}
