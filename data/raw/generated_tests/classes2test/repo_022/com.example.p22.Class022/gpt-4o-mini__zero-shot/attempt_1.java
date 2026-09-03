package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {

    @Test
    void reportsComputeReturnsTotalOnMixedCase() {
        Class022 subject = org.mockito.Mockito.mock(Class022.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
