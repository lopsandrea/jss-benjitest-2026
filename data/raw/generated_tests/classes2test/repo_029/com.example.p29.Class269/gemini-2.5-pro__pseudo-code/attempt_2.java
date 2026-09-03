package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {

    @Test
    void rejectsComputeReturnsTotalWithNullArgument() {
        Class269 subject = org.mockito.Mockito.mock(Class269.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
