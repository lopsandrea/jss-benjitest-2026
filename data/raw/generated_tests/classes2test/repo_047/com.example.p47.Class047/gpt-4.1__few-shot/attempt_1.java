package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        Class047 subject = org.mockito.Mockito.mock(Class047.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
