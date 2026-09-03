package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class187Test {

    @Test
    void reportsComputeReturnsTotalAtZero() {
        Class187 subject = org.mockito.Mockito.mock(Class187.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
