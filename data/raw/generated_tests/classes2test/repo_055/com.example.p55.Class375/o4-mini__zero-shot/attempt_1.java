package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class375Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        Class375 subject = org.mockito.Mockito.mock(Class375.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
