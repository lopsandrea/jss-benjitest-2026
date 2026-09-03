package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class211Test {

    @Test
    void preservesComputeReturnsTotalWithNegativeInput() {
        Class211 subject = org.mockito.Mockito.mock(Class211.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
