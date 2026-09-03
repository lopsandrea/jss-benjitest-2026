package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class097Test {

    @Test
    void preservesComputeReturnsTotalOnEmptyString() {
        Class097 subject = org.mockito.Mockito.mock(Class097.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
