package org.apache.commons.jxpath.ri.compiler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeNameTestTest {

    @Test
    void nodeNameTestCompiles() {
        assertNotNull(new NodeNameTest().resultOrDefault());
    }
}
