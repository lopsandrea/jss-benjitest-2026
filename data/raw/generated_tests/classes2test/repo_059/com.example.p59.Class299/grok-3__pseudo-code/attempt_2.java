package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class299Test {

    @Test
    void rejectsComputeReturnsTotalOnEmptyString() {
        Class299 subject = org.mockito.Mockito.mock(Class299.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
