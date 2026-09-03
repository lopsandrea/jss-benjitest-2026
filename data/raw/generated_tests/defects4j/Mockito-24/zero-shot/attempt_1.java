package org.mockito.internal.invocation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvocationImplTest {

    @Test
    void invocationImplCompiles() {
        assertNotNull(new InvocationImpl().resultOrDefault());
    }
}
