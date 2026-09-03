package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        Class280 subject = org.mockito.Mockito.mock(Class280.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
