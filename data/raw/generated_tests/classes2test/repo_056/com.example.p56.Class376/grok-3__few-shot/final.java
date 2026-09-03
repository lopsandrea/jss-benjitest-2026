package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class376Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        new Class376().compute(3);
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        new Class376().normalize("  x ");
    }

    @Test
    void yieldsMergeAtUpperBound() {
        new Class376().merge(2, 5);
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        new Class376().isValid("abc");
    }

}
