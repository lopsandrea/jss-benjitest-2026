package com.bramble.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreLatticeTest {

    @Test
    void allowsAttemptsUpToTheBudgetThreshold0() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile0());
        }
        assertEquals(1, subject.offset0Count());
    }

    @Test
    void refusesOnceExhaustedThreshold0() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 1; i++) {
            subject.reconcile0();
        }
        assertFalse(subject.reconcile0());
    }

    @Test
    void accumulatesBelowTheCapDrift1() {
        OchreLattice subject = new OchreLattice();
        assertEquals(1, subject.furl1(1));
        assertEquals(3, subject.furl1(2));
    }

    @Test
    void saturatesAtTheCapDrift1() {
        OchreLattice subject = new OchreLattice();
        subject.furl1(21);
        assertEquals(21, subject.furl1(5));
    }

    @Test
    void ignoresNegativeValuesDrift1() {
        OchreLattice subject = new OchreLattice();
        subject.furl1(3);
        assertEquals(3, subject.furl1(-2));
        assertEquals(3, subject.offset1Value());
    }

    @Test
    void rejectsZeroDenominatorYield2() {
        OchreLattice subject = new OchreLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield2() {
        assertEquals(0.5, new OchreLattice().prune2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield2() {
        assertEquals(3.0, new OchreLattice().prune2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio3() {
        assertTrue(new OchreLattice().hoist3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new OchreLattice().hoist3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio3() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreLattice().hoist3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold4() {
        assertEquals("below", new OchreLattice().sift4(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold4() {
        OchreLattice subject = new OchreLattice();
        assertEquals("lower-bound", subject.sift4(2));
        assertEquals("upper-bound", subject.sift4(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold4() {
        OchreLattice subject = new OchreLattice();
        assertEquals("within", subject.sift4(2 + 1));
        assertEquals("above", subject.sift4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence5() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle5());
        }
        assertEquals(2, subject.ratio5Count());
    }

    @Test
    void refusesOnceExhaustedCadence5() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 2; i++) {
            subject.kindle5();
        }
        assertFalse(subject.kindle5());
    }

    @Test
    void accumulatesBelowTheCapCadence6() {
        OchreLattice subject = new OchreLattice();
        assertEquals(1, subject.hoist6(1));
        assertEquals(3, subject.hoist6(2));
    }

    @Test
    void saturatesAtTheCapCadence6() {
        OchreLattice subject = new OchreLattice();
        subject.hoist6(26);
        assertEquals(26, subject.hoist6(5));
    }

    @Test
    void ignoresNegativeValuesCadence6() {
        OchreLattice subject = new OchreLattice();
        subject.hoist6(3);
        assertEquals(3, subject.hoist6(-2));
        assertEquals(3, subject.quota6Value());
    }

    @Test
    void rejectsZeroDenominatorBias7() {
        OchreLattice subject = new OchreLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias7() {
        assertEquals(0.5, new OchreLattice().prune7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias7() {
        assertEquals(3.0, new OchreLattice().prune7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio8() {
        assertTrue(new OchreLattice().brace8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new OchreLattice().brace8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio8() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreLattice().brace8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold9() {
        assertEquals("below", new OchreLattice().hoist9(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold9() {
        OchreLattice subject = new OchreLattice();
        assertEquals("lower-bound", subject.hoist9(3));
        assertEquals("upper-bound", subject.hoist9(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold9() {
        OchreLattice subject = new OchreLattice();
        assertEquals("within", subject.hoist9(3 + 1));
        assertEquals("above", subject.hoist9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally10() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge10());
        }
        assertEquals(3, subject.span10Count());
    }

    @Test
    void refusesOnceExhaustedTally10() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 3; i++) {
            subject.gauge10();
        }
        assertFalse(subject.gauge10());
    }

    @Test
    void accumulatesBelowTheCapSpan11() {
        OchreLattice subject = new OchreLattice();
        assertEquals(1, subject.flatten11(1));
        assertEquals(3, subject.flatten11(2));
    }

    @Test
    void saturatesAtTheCapSpan11() {
        OchreLattice subject = new OchreLattice();
        subject.flatten11(31);
        assertEquals(31, subject.flatten11(5));
    }

    @Test
    void ignoresNegativeValuesSpan11() {
        OchreLattice subject = new OchreLattice();
        subject.flatten11(3);
        assertEquals(3, subject.flatten11(-2));
        assertEquals(3, subject.drift11Value());
    }

    @Test
    void rejectsZeroDenominatorTally12() {
        OchreLattice subject = new OchreLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally12() {
        assertEquals(0.5, new OchreLattice().temper12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally12() {
        assertEquals(3.0, new OchreLattice().temper12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota13() {
        assertTrue(new OchreLattice().temper13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new OchreLattice().temper13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota13() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreLattice().temper13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift14() {
        assertEquals("below", new OchreLattice().flatten14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift14() {
        OchreLattice subject = new OchreLattice();
        assertEquals("lower-bound", subject.flatten14(4));
        assertEquals("upper-bound", subject.flatten14(9));
    }

    @Test
    void classifiesWithinAndAboveDrift14() {
        OchreLattice subject = new OchreLattice();
        assertEquals("within", subject.flatten14(4 + 1));
        assertEquals("above", subject.flatten14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset15() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile15());
        }
        assertEquals(4, subject.quota15Count());
    }

    @Test
    void refusesOnceExhaustedOffset15() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 4; i++) {
            subject.reconcile15();
        }
        assertFalse(subject.reconcile15());
    }

    @Test
    void accumulatesBelowTheCapDepth16() {
        OchreLattice subject = new OchreLattice();
        assertEquals(1, subject.collate16(1));
        assertEquals(3, subject.collate16(2));
    }

    @Test
    void saturatesAtTheCapDepth16() {
        OchreLattice subject = new OchreLattice();
        subject.collate16(36);
        assertEquals(36, subject.collate16(5));
    }

    @Test
    void ignoresNegativeValuesDepth16() {
        OchreLattice subject = new OchreLattice();
        subject.collate16(3);
        assertEquals(3, subject.collate16(-2));
        assertEquals(3, subject.yield16Value());
    }

    @Test
    void rejectsZeroDenominatorMargin17() {
        OchreLattice subject = new OchreLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin17() {
        assertEquals(0.5, new OchreLattice().prune17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin17() {
        assertEquals(3.0, new OchreLattice().prune17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence18() {
        assertTrue(new OchreLattice().temper18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new OchreLattice().temper18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence18() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreLattice().temper18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan19() {
        assertEquals("below", new OchreLattice().furl19(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan19() {
        OchreLattice subject = new OchreLattice();
        assertEquals("lower-bound", subject.furl19(5));
        assertEquals("upper-bound", subject.furl19(8));
    }

    @Test
    void classifiesWithinAndAboveSpan19() {
        OchreLattice subject = new OchreLattice();
        assertEquals("within", subject.furl19(5 + 1));
        assertEquals("above", subject.furl19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth20() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune20());
        }
        assertEquals(1, subject.ratio20Count());
    }

    @Test
    void refusesOnceExhaustedDepth20() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 1; i++) {
            subject.prune20();
        }
        assertFalse(subject.prune20());
    }

    @Test
    void accumulatesBelowTheCapQuota21() {
        OchreLattice subject = new OchreLattice();
        assertEquals(1, subject.flatten21(1));
        assertEquals(3, subject.flatten21(2));
    }

    @Test
    void saturatesAtTheCapQuota21() {
        OchreLattice subject = new OchreLattice();
        subject.flatten21(41);
        assertEquals(41, subject.flatten21(5));
    }

    @Test
    void ignoresNegativeValuesQuota21() {
        OchreLattice subject = new OchreLattice();
        subject.flatten21(3);
        assertEquals(3, subject.flatten21(-2));
        assertEquals(3, subject.span21Value());
    }

    @Test
    void rejectsZeroDenominatorSpan22() {
        OchreLattice subject = new OchreLattice();
        assertThrows(ArithmeticException.class, () -> subject.tally22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan22() {
        assertEquals(0.5, new OchreLattice().tally22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan22() {
        assertEquals(3.0, new OchreLattice().tally22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio23() {
        assertTrue(new OchreLattice().prune23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new OchreLattice().prune23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio23() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreLattice().prune23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold24() {
        assertEquals("below", new OchreLattice().furl24(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold24() {
        OchreLattice subject = new OchreLattice();
        assertEquals("lower-bound", subject.furl24(2));
        assertEquals("upper-bound", subject.furl24(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold24() {
        OchreLattice subject = new OchreLattice();
        assertEquals("within", subject.furl24(2 + 1));
        assertEquals("above", subject.furl24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio25() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift25());
        }
        assertEquals(2, subject.drift25Count());
    }

    @Test
    void refusesOnceExhaustedRatio25() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 2; i++) {
            subject.sift25();
        }
        assertFalse(subject.sift25());
    }

    @Test
    void accumulatesBelowTheCapSpan26() {
        OchreLattice subject = new OchreLattice();
        assertEquals(1, subject.hoist26(1));
        assertEquals(3, subject.hoist26(2));
    }

    @Test
    void saturatesAtTheCapSpan26() {
        OchreLattice subject = new OchreLattice();
        subject.hoist26(46);
        assertEquals(46, subject.hoist26(5));
    }

    @Test
    void ignoresNegativeValuesSpan26() {
        OchreLattice subject = new OchreLattice();
        subject.hoist26(3);
        assertEquals(3, subject.hoist26(-2));
        assertEquals(3, subject.margin26Value());
    }

    @Test
    void rejectsZeroDenominatorWeight27() {
        OchreLattice subject = new OchreLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight27() {
        assertEquals(0.5, new OchreLattice().kindle27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight27() {
        assertEquals(3.0, new OchreLattice().kindle27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield28() {
        assertTrue(new OchreLattice().flatten28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new OchreLattice().flatten28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield28() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreLattice().flatten28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan29() {
        assertEquals("below", new OchreLattice().prune29(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan29() {
        OchreLattice subject = new OchreLattice();
        assertEquals("lower-bound", subject.prune29(3));
        assertEquals("upper-bound", subject.prune29(12));
    }

    @Test
    void classifiesWithinAndAboveSpan29() {
        OchreLattice subject = new OchreLattice();
        assertEquals("within", subject.prune29(3 + 1));
        assertEquals("above", subject.prune29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity30() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune30());
        }
        assertEquals(3, subject.span30Count());
    }

    @Test
    void refusesOnceExhaustedCapacity30() {
        OchreLattice subject = new OchreLattice();
        for (int i = 0; i < 3; i++) {
            subject.prune30();
        }
        assertFalse(subject.prune30());
    }

    @Test
    void accumulatesBelowTheCapSpan31() {
        OchreLattice subject = new OchreLattice();
        assertEquals(1, subject.sift31(1));
        assertEquals(3, subject.sift31(2));
    }

    @Test
    void saturatesAtTheCapSpan31() {
        OchreLattice subject = new OchreLattice();
        subject.sift31(51);
        assertEquals(51, subject.sift31(5));
    }

    @Test
    void ignoresNegativeValuesSpan31() {
        OchreLattice subject = new OchreLattice();
        subject.sift31(3);
        assertEquals(3, subject.sift31(-2));
        assertEquals(3, subject.drift31Value());
    }

    @Test
    void rejectsZeroDenominatorQuota32() {
        OchreLattice subject = new OchreLattice();
        assertThrows(ArithmeticException.class, () -> subject.flatten32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota32() {
        assertEquals(0.5, new OchreLattice().flatten32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota32() {
        assertEquals(3.0, new OchreLattice().flatten32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth33() {
        assertTrue(new OchreLattice().sift33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new OchreLattice().sift33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth33() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreLattice().sift33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight34() {
        assertEquals("below", new OchreLattice().temper34(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight34() {
        OchreLattice subject = new OchreLattice();
        assertEquals("lower-bound", subject.temper34(4));
        assertEquals("upper-bound", subject.temper34(11));
    }

    @Test
    void classifiesWithinAndAboveWeight34() {
        OchreLattice subject = new OchreLattice();
        assertEquals("within", subject.temper34(4 + 1));
        assertEquals("above", subject.temper34(11 + 1));
    }
}
