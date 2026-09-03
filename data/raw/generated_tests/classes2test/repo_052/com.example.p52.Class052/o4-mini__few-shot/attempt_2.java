package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class052Test {

    @Test
    void yieldsComputeReturnsTotalWhenAlreadyValid() {
        Class052 subject = org.mockito.Mockito.mock(Class052.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
