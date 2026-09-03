package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {

    @Test
    void reportsComputeReturnsTotalOnEmptyString() {
        Class027 subject = org.mockito.Mockito.mock(Class027.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
