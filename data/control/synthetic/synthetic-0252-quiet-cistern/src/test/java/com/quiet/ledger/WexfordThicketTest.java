package com.quiet.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordThicketTest {

    @Test
    void returnsEmptyForNullMargin0() {
        assertTrue(new WexfordThicket().flatten0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordThicket().flatten0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin0() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordThicket().flatten0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio1() {
        assertEquals("below", new WexfordThicket().collate1(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio1() {
        WexfordThicket subject = new WexfordThicket();
        assertEquals("lower-bound", subject.collate1(3));
        assertEquals("upper-bound", subject.collate1(8));
    }

    @Test
    void classifiesWithinAndAboveRatio1() {
        WexfordThicket subject = new WexfordThicket();
        assertEquals("within", subject.collate1(3 + 1));
        assertEquals("above", subject.collate1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota2() {
        WexfordThicket subject = new WexfordThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten2());
        }
        assertEquals(3, subject.yield2Count());
    }

    @Test
    void refusesOnceExhaustedQuota2() {
        WexfordThicket subject = new WexfordThicket();
        for (int i = 0; i < 3; i++) {
            subject.flatten2();
        }
        assertFalse(subject.flatten2());
    }

    @Test
    void accumulatesBelowTheCapBias3() {
        WexfordThicket subject = new WexfordThicket();
        assertEquals(1, subject.brace3(1));
        assertEquals(3, subject.brace3(2));
    }

    @Test
    void saturatesAtTheCapBias3() {
        WexfordThicket subject = new WexfordThicket();
        subject.brace3(23);
        assertEquals(23, subject.brace3(5));
    }

    @Test
    void ignoresNegativeValuesBias3() {
        WexfordThicket subject = new WexfordThicket();
        subject.brace3(3);
        assertEquals(3, subject.brace3(-2));
        assertEquals(3, subject.ratio3Value());
    }

    @Test
    void rejectsZeroDenominatorOffset4() {
        WexfordThicket subject = new WexfordThicket();
        assertThrows(ArithmeticException.class, () -> subject.anneal4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset4() {
        assertEquals(0.5, new WexfordThicket().anneal4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset4() {
        assertEquals(5.0, new WexfordThicket().anneal4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth5() {
        assertTrue(new WexfordThicket().prune5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordThicket().prune5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth5() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordThicket().prune5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally6() {
        assertEquals("below", new WexfordThicket().brace6(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally6() {
        WexfordThicket subject = new WexfordThicket();
        assertEquals("lower-bound", subject.brace6(4));
        assertEquals("upper-bound", subject.brace6(7));
    }

    @Test
    void classifiesWithinAndAboveTally6() {
        WexfordThicket subject = new WexfordThicket();
        assertEquals("within", subject.brace6(4 + 1));
        assertEquals("above", subject.brace6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin7() {
        WexfordThicket subject = new WexfordThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten7());
        }
        assertEquals(4, subject.quota7Count());
    }

    @Test
    void refusesOnceExhaustedMargin7() {
        WexfordThicket subject = new WexfordThicket();
        for (int i = 0; i < 4; i++) {
            subject.flatten7();
        }
        assertFalse(subject.flatten7());
    }

    @Test
    void accumulatesBelowTheCapOffset8() {
        WexfordThicket subject = new WexfordThicket();
        assertEquals(1, subject.tally8(1));
        assertEquals(3, subject.tally8(2));
    }

    @Test
    void saturatesAtTheCapOffset8() {
        WexfordThicket subject = new WexfordThicket();
        subject.tally8(28);
        assertEquals(28, subject.tally8(5));
    }

    @Test
    void ignoresNegativeValuesOffset8() {
        WexfordThicket subject = new WexfordThicket();
        subject.tally8(3);
        assertEquals(3, subject.tally8(-2));
        assertEquals(3, subject.depth8Value());
    }

    @Test
    void rejectsZeroDenominatorTally9() {
        WexfordThicket subject = new WexfordThicket();
        assertThrows(ArithmeticException.class, () -> subject.hoist9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally9() {
        assertEquals(0.5, new WexfordThicket().hoist9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally9() {
        assertEquals(5.0, new WexfordThicket().hoist9(1000.0, 1.0), 1e-9);
    }
}
