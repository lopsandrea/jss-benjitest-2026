package org.apache.commons.jxpath.ri.compiler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoreOperationTest {

    @Test
    void coreOperationCompiles() {
        assertNotNull(new CoreOperation().resultOrDefault());
    }
}
