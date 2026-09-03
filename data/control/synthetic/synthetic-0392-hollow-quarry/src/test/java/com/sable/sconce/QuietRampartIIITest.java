package com.sable.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietRampartIIITest {

    @Test
    void returnsEmptyForNullThreshold0() {
        assertTrue(new QuietRampartIII().brace0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new QuietRampartIII().brace0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold0() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietRampartIII().brace0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin1() {
        assertEquals("below", new QuietRampartIII().collate1(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin1() {
        QuietRampartIII subject = new QuietRampartIII();
        assertEquals("lower-bound", subject.collate1(3));
        assertEquals("upper-bound", subject.collate1(8));
    }

    @Test
    void classifiesWithinAndAboveMargin1() {
        QuietRampartIII subject = new QuietRampartIII();
        assertEquals("within", subject.collate1(3 + 1));
        assertEquals("above", subject.collate1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio2() {
        QuietRampartIII subject = new QuietRampartIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile2());
        }
        assertEquals(3, subject.margin2Count());
    }

    @Test
    void refusesOnceExhaustedRatio2() {
        QuietRampartIII subject = new QuietRampartIII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile2();
        }
        assertFalse(subject.reconcile2());
    }

    @Test
    void accumulatesBelowTheCapOffset3() {
        QuietRampartIII subject = new QuietRampartIII();
        assertEquals(1, subject.prune3(1));
        assertEquals(3, subject.prune3(2));
    }

    @Test
    void saturatesAtTheCapOffset3() {
        QuietRampartIII subject = new QuietRampartIII();
        subject.prune3(23);
        assertEquals(23, subject.prune3(5));
    }

    @Test
    void ignoresNegativeValuesOffset3() {
        QuietRampartIII subject = new QuietRampartIII();
        subject.prune3(3);
        assertEquals(3, subject.prune3(-2));
        assertEquals(3, subject.threshold3Value());
    }

    @Test
    void rejectsZeroDenominatorQuota4() {
        QuietRampartIII subject = new QuietRampartIII();
        assertThrows(ArithmeticException.class, () -> subject.collate4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota4() {
        assertEquals(0.5, new QuietRampartIII().collate4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota4() {
        assertEquals(5.0, new QuietRampartIII().collate4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift5() {
        assertTrue(new QuietRampartIII().brace5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new QuietRampartIII().brace5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift5() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietRampartIII().brace5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset6() {
        assertEquals("below", new QuietRampartIII().reconcile6(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset6() {
        QuietRampartIII subject = new QuietRampartIII();
        assertEquals("lower-bound", subject.reconcile6(4));
        assertEquals("upper-bound", subject.reconcile6(7));
    }

    @Test
    void classifiesWithinAndAboveOffset6() {
        QuietRampartIII subject = new QuietRampartIII();
        assertEquals("within", subject.reconcile6(4 + 1));
        assertEquals("above", subject.reconcile6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio7() {
        QuietRampartIII subject = new QuietRampartIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist7());
        }
        assertEquals(4, subject.cadence7Count());
    }

    @Test
    void refusesOnceExhaustedRatio7() {
        QuietRampartIII subject = new QuietRampartIII();
        for (int i = 0; i < 4; i++) {
            subject.hoist7();
        }
        assertFalse(subject.hoist7());
    }

    @Test
    void accumulatesBelowTheCapMargin8() {
        QuietRampartIII subject = new QuietRampartIII();
        assertEquals(1, subject.prune8(1));
        assertEquals(3, subject.prune8(2));
    }

    @Test
    void saturatesAtTheCapMargin8() {
        QuietRampartIII subject = new QuietRampartIII();
        subject.prune8(28);
        assertEquals(28, subject.prune8(5));
    }

    @Test
    void ignoresNegativeValuesMargin8() {
        QuietRampartIII subject = new QuietRampartIII();
        subject.prune8(3);
        assertEquals(3, subject.prune8(-2));
        assertEquals(3, subject.ratio8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        QuietRampartIII subject = new QuietRampartIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new QuietRampartIII().gauge9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new QuietRampartIII().gauge9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift10() {
        assertTrue(new QuietRampartIII().kindle10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new QuietRampartIII().kindle10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift10() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietRampartIII().kindle10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio11() {
        assertEquals("below", new QuietRampartIII().flatten11(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio11() {
        QuietRampartIII subject = new QuietRampartIII();
        assertEquals("lower-bound", subject.flatten11(5));
        assertEquals("upper-bound", subject.flatten11(12));
    }

    @Test
    void classifiesWithinAndAboveRatio11() {
        QuietRampartIII subject = new QuietRampartIII();
        assertEquals("within", subject.flatten11(5 + 1));
        assertEquals("above", subject.flatten11(12 + 1));
    }
}
