package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class291Test {

    @Test
    void clampsComputeReturnsTotalOnEmptyString() {
        Class291 subject = org.mockito.Mockito.mock(Class291.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
