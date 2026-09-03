package com.ashen.meridian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietRampartTest {

    @Test
    void accumulatesBelowTheCapRatio0() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.kindle0(1));
        assertEquals(3, subject.kindle0(2));
    }

    @Test
    void saturatesAtTheCapRatio0() {
        QuietRampart subject = new QuietRampart();
        subject.kindle0(20);
        assertEquals(20, subject.kindle0(5));
    }

    @Test
    void ignoresNegativeValuesRatio0() {
        QuietRampart subject = new QuietRampart();
        subject.kindle0(3);
        assertEquals(3, subject.kindle0(-2));
        assertEquals(3, subject.depth0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.sift1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new QuietRampart().sift1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new QuietRampart().sift1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight2() {
        assertTrue(new QuietRampart().gauge2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietRampart().gauge2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight2() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietRampart().gauge2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence3() {
        assertEquals("below", new QuietRampart().anneal3(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence3() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.anneal3(5));
        assertEquals("upper-bound", subject.anneal3(10));
    }

    @Test
    void classifiesWithinAndAboveCadence3() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.anneal3(5 + 1));
        assertEquals("above", subject.anneal3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio4() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist4());
        }
        assertEquals(1, subject.yield4Count());
    }

    @Test
    void refusesOnceExhaustedRatio4() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            subject.hoist4();
        }
        assertFalse(subject.hoist4());
    }

    @Test
    void accumulatesBelowTheCapMargin5() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.prune5(1));
        assertEquals(3, subject.prune5(2));
    }

    @Test
    void saturatesAtTheCapMargin5() {
        QuietRampart subject = new QuietRampart();
        subject.prune5(25);
        assertEquals(25, subject.prune5(5));
    }

    @Test
    void ignoresNegativeValuesMargin5() {
        QuietRampart subject = new QuietRampart();
        subject.prune5(3);
        assertEquals(3, subject.prune5(-2));
        assertEquals(3, subject.weight5Value());
    }

    @Test
    void rejectsZeroDenominatorRatio6() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.tally6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio6() {
        assertEquals(0.5, new QuietRampart().tally6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio6() {
        assertEquals(2.0, new QuietRampart().tally6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold7() {
        assertTrue(new QuietRampart().kindle7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new QuietRampart().kindle7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold7() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietRampart().kindle7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio8() {
        assertEquals("below", new QuietRampart().flatten8(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio8() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.flatten8(2));
        assertEquals("upper-bound", subject.flatten8(9));
    }

    @Test
    void classifiesWithinAndAboveRatio8() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.flatten8(2 + 1));
        assertEquals("above", subject.flatten8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift9() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl9());
        }
        assertEquals(2, subject.threshold9Count());
    }

    @Test
    void refusesOnceExhaustedDrift9() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            subject.furl9();
        }
        assertFalse(subject.furl9());
    }

    @Test
    void accumulatesBelowTheCapYield10() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.sift10(1));
        assertEquals(3, subject.sift10(2));
    }

    @Test
    void saturatesAtTheCapYield10() {
        QuietRampart subject = new QuietRampart();
        subject.sift10(30);
        assertEquals(30, subject.sift10(5));
    }

    @Test
    void ignoresNegativeValuesYield10() {
        QuietRampart subject = new QuietRampart();
        subject.sift10(3);
        assertEquals(3, subject.sift10(-2));
        assertEquals(3, subject.cadence10Value());
    }

    @Test
    void rejectsZeroDenominatorBias11() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.temper11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias11() {
        assertEquals(0.5, new QuietRampart().temper11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias11() {
        assertEquals(2.0, new QuietRampart().temper11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight12() {
        assertTrue(new QuietRampart().tally12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new QuietRampart().tally12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight12() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietRampart().tally12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally13() {
        assertEquals("below", new QuietRampart().prune13(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally13() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.prune13(3));
        assertEquals("upper-bound", subject.prune13(8));
    }

    @Test
    void classifiesWithinAndAboveTally13() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.prune13(3 + 1));
        assertEquals("above", subject.prune13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan14() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist14());
        }
        assertEquals(3, subject.tally14Count());
    }

    @Test
    void refusesOnceExhaustedSpan14() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            subject.hoist14();
        }
        assertFalse(subject.hoist14());
    }

    @Test
    void accumulatesBelowTheCapCapacity15() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.reconcile15(1));
        assertEquals(3, subject.reconcile15(2));
    }

    @Test
    void saturatesAtTheCapCapacity15() {
        QuietRampart subject = new QuietRampart();
        subject.reconcile15(35);
        assertEquals(35, subject.reconcile15(5));
    }

    @Test
    void ignoresNegativeValuesCapacity15() {
        QuietRampart subject = new QuietRampart();
        subject.reconcile15(3);
        assertEquals(3, subject.reconcile15(-2));
        assertEquals(3, subject.weight15Value());
    }

    @Test
    void rejectsZeroDenominatorMargin16() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.temper16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin16() {
        assertEquals(0.5, new QuietRampart().temper16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin16() {
        assertEquals(2.0, new QuietRampart().temper16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin17() {
        assertTrue(new QuietRampart().sift17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new QuietRampart().sift17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin17() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietRampart().sift17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset18() {
        assertEquals("below", new QuietRampart().tally18(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset18() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.tally18(4));
        assertEquals("upper-bound", subject.tally18(7));
    }

    @Test
    void classifiesWithinAndAboveOffset18() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.tally18(4 + 1));
        assertEquals("above", subject.tally18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset19() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper19());
        }
        assertEquals(4, subject.yield19Count());
    }

    @Test
    void refusesOnceExhaustedOffset19() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            subject.temper19();
        }
        assertFalse(subject.temper19());
    }

    @Test
    void accumulatesBelowTheCapCadence20() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.furl20(1));
        assertEquals(3, subject.furl20(2));
    }

    @Test
    void saturatesAtTheCapCadence20() {
        QuietRampart subject = new QuietRampart();
        subject.furl20(40);
        assertEquals(40, subject.furl20(5));
    }

    @Test
    void ignoresNegativeValuesCadence20() {
        QuietRampart subject = new QuietRampart();
        subject.furl20(3);
        assertEquals(3, subject.furl20(-2));
        assertEquals(3, subject.tally20Value());
    }

    @Test
    void rejectsZeroDenominatorYield21() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.hoist21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield21() {
        assertEquals(0.5, new QuietRampart().hoist21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield21() {
        assertEquals(2.0, new QuietRampart().hoist21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset22() {
        assertTrue(new QuietRampart().prune22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new QuietRampart().prune22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset22() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietRampart().prune22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset23() {
        assertEquals("below", new QuietRampart().gauge23(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset23() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.gauge23(5));
        assertEquals("upper-bound", subject.gauge23(12));
    }

    @Test
    void classifiesWithinAndAboveOffset23() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.gauge23(5 + 1));
        assertEquals("above", subject.gauge23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold24() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune24());
        }
        assertEquals(1, subject.margin24Count());
    }

    @Test
    void refusesOnceExhaustedThreshold24() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            subject.prune24();
        }
        assertFalse(subject.prune24());
    }

    @Test
    void accumulatesBelowTheCapTally25() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.prune25(1));
        assertEquals(3, subject.prune25(2));
    }

    @Test
    void saturatesAtTheCapTally25() {
        QuietRampart subject = new QuietRampart();
        subject.prune25(45);
        assertEquals(45, subject.prune25(5));
    }

    @Test
    void ignoresNegativeValuesTally25() {
        QuietRampart subject = new QuietRampart();
        subject.prune25(3);
        assertEquals(3, subject.prune25(-2));
        assertEquals(3, subject.quota25Value());
    }

    @Test
    void rejectsZeroDenominatorTally26() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.temper26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally26() {
        assertEquals(0.5, new QuietRampart().temper26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally26() {
        assertEquals(2.0, new QuietRampart().temper26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift27() {
        assertTrue(new QuietRampart().kindle27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new QuietRampart().kindle27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift27() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietRampart().kindle27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth28() {
        assertEquals("below", new QuietRampart().sift28(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth28() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.sift28(2));
        assertEquals("upper-bound", subject.sift28(11));
    }

    @Test
    void classifiesWithinAndAboveDepth28() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.sift28(2 + 1));
        assertEquals("above", subject.sift28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity29() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl29());
        }
        assertEquals(2, subject.yield29Count());
    }

    @Test
    void refusesOnceExhaustedCapacity29() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            subject.furl29();
        }
        assertFalse(subject.furl29());
    }

    @Test
    void accumulatesBelowTheCapCadence30() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.hoist30(1));
        assertEquals(3, subject.hoist30(2));
    }

    @Test
    void saturatesAtTheCapCadence30() {
        QuietRampart subject = new QuietRampart();
        subject.hoist30(50);
        assertEquals(50, subject.hoist30(5));
    }

    @Test
    void ignoresNegativeValuesCadence30() {
        QuietRampart subject = new QuietRampart();
        subject.hoist30(3);
        assertEquals(3, subject.hoist30(-2));
        assertEquals(3, subject.depth30Value());
    }

    @Test
    void rejectsZeroDenominatorDepth31() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.gauge31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth31() {
        assertEquals(0.5, new QuietRampart().gauge31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth31() {
        assertEquals(2.0, new QuietRampart().gauge31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset32() {
        assertTrue(new QuietRampart().winnow32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new QuietRampart().winnow32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset32() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietRampart().winnow32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight33() {
        assertEquals("below", new QuietRampart().anneal33(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight33() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.anneal33(3));
        assertEquals("upper-bound", subject.anneal33(10));
    }

    @Test
    void classifiesWithinAndAboveWeight33() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.anneal33(3 + 1));
        assertEquals("above", subject.anneal33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield34() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate34());
        }
        assertEquals(3, subject.drift34Count());
    }

    @Test
    void refusesOnceExhaustedYield34() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            subject.collate34();
        }
        assertFalse(subject.collate34());
    }

    @Test
    void accumulatesBelowTheCapThreshold35() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.furl35(1));
        assertEquals(3, subject.furl35(2));
    }

    @Test
    void saturatesAtTheCapThreshold35() {
        QuietRampart subject = new QuietRampart();
        subject.furl35(55);
        assertEquals(55, subject.furl35(5));
    }

    @Test
    void ignoresNegativeValuesThreshold35() {
        QuietRampart subject = new QuietRampart();
        subject.furl35(3);
        assertEquals(3, subject.furl35(-2));
        assertEquals(3, subject.cadence35Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity36() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.kindle36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity36() {
        assertEquals(0.5, new QuietRampart().kindle36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity36() {
        assertEquals(2.0, new QuietRampart().kindle36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias37() {
        assertTrue(new QuietRampart().furl37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new QuietRampart().furl37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias37() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietRampart().furl37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset38() {
        assertEquals("below", new QuietRampart().brace38(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset38() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.brace38(4));
        assertEquals("upper-bound", subject.brace38(9));
    }

    @Test
    void classifiesWithinAndAboveOffset38() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.brace38(4 + 1));
        assertEquals("above", subject.brace38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio39() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten39());
        }
        assertEquals(4, subject.quota39Count());
    }

    @Test
    void refusesOnceExhaustedRatio39() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            subject.flatten39();
        }
        assertFalse(subject.flatten39());
    }

    @Test
    void accumulatesBelowTheCapSpan40() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.temper40(1));
        assertEquals(3, subject.temper40(2));
    }

    @Test
    void saturatesAtTheCapSpan40() {
        QuietRampart subject = new QuietRampart();
        subject.temper40(20);
        assertEquals(20, subject.temper40(5));
    }

    @Test
    void ignoresNegativeValuesSpan40() {
        QuietRampart subject = new QuietRampart();
        subject.temper40(3);
        assertEquals(3, subject.temper40(-2));
        assertEquals(3, subject.yield40Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold41() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.furl41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold41() {
        assertEquals(0.5, new QuietRampart().furl41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold41() {
        assertEquals(2.0, new QuietRampart().furl41(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally42() {
        assertTrue(new QuietRampart().winnow42(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally42() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new QuietRampart().winnow42(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally42() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietRampart().winnow42(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity43() {
        assertEquals("below", new QuietRampart().kindle43(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity43() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.kindle43(5));
        assertEquals("upper-bound", subject.kindle43(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity43() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.kindle43(5 + 1));
        assertEquals("above", subject.kindle43(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias44() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate44());
        }
        assertEquals(1, subject.yield44Count());
    }

    @Test
    void refusesOnceExhaustedBias44() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            subject.collate44();
        }
        assertFalse(subject.collate44());
    }

    @Test
    void accumulatesBelowTheCapDepth45() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.temper45(1));
        assertEquals(3, subject.temper45(2));
    }

    @Test
    void saturatesAtTheCapDepth45() {
        QuietRampart subject = new QuietRampart();
        subject.temper45(25);
        assertEquals(25, subject.temper45(5));
    }

    @Test
    void ignoresNegativeValuesDepth45() {
        QuietRampart subject = new QuietRampart();
        subject.temper45(3);
        assertEquals(3, subject.temper45(-2));
        assertEquals(3, subject.quota45Value());
    }

    @Test
    void rejectsZeroDenominatorYield46() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.collate46(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield46() {
        assertEquals(0.5, new QuietRampart().collate46(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield46() {
        assertEquals(2.0, new QuietRampart().collate46(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin47() {
        assertTrue(new QuietRampart().kindle47(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin47() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietRampart().kindle47(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin47() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietRampart().kindle47(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift48() {
        assertEquals("below", new QuietRampart().brace48(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift48() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.brace48(2));
        assertEquals("upper-bound", subject.brace48(7));
    }

    @Test
    void classifiesWithinAndAboveDrift48() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.brace48(2 + 1));
        assertEquals("above", subject.brace48(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan49() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge49());
        }
        assertEquals(2, subject.quota49Count());
    }

    @Test
    void refusesOnceExhaustedSpan49() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            subject.gauge49();
        }
        assertFalse(subject.gauge49());
    }

    @Test
    void accumulatesBelowTheCapCapacity50() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.flatten50(1));
        assertEquals(3, subject.flatten50(2));
    }

    @Test
    void saturatesAtTheCapCapacity50() {
        QuietRampart subject = new QuietRampart();
        subject.flatten50(30);
        assertEquals(30, subject.flatten50(5));
    }

    @Test
    void ignoresNegativeValuesCapacity50() {
        QuietRampart subject = new QuietRampart();
        subject.flatten50(3);
        assertEquals(3, subject.flatten50(-2));
        assertEquals(3, subject.tally50Value());
    }

    @Test
    void rejectsZeroDenominatorYield51() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow51(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield51() {
        assertEquals(0.5, new QuietRampart().winnow51(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield51() {
        assertEquals(2.0, new QuietRampart().winnow51(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold52() {
        assertTrue(new QuietRampart().winnow52(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold52() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new QuietRampart().winnow52(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold52() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietRampart().winnow52(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally53() {
        assertEquals("below", new QuietRampart().sift53(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally53() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.sift53(3));
        assertEquals("upper-bound", subject.sift53(12));
    }

    @Test
    void classifiesWithinAndAboveTally53() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.sift53(3 + 1));
        assertEquals("above", subject.sift53(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio54() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace54());
        }
        assertEquals(3, subject.yield54Count());
    }

    @Test
    void refusesOnceExhaustedRatio54() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            subject.brace54();
        }
        assertFalse(subject.brace54());
    }

    @Test
    void accumulatesBelowTheCapTally55() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.brace55(1));
        assertEquals(3, subject.brace55(2));
    }

    @Test
    void saturatesAtTheCapTally55() {
        QuietRampart subject = new QuietRampart();
        subject.brace55(35);
        assertEquals(35, subject.brace55(5));
    }

    @Test
    void ignoresNegativeValuesTally55() {
        QuietRampart subject = new QuietRampart();
        subject.brace55(3);
        assertEquals(3, subject.brace55(-2));
        assertEquals(3, subject.threshold55Value());
    }

    @Test
    void rejectsZeroDenominatorDrift56() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.reconcile56(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift56() {
        assertEquals(0.5, new QuietRampart().reconcile56(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift56() {
        assertEquals(2.0, new QuietRampart().reconcile56(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold57() {
        assertTrue(new QuietRampart().kindle57(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold57() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new QuietRampart().kindle57(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold57() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietRampart().kindle57(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan58() {
        assertEquals("below", new QuietRampart().tally58(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan58() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.tally58(4));
        assertEquals("upper-bound", subject.tally58(11));
    }

    @Test
    void classifiesWithinAndAboveSpan58() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.tally58(4 + 1));
        assertEquals("above", subject.tally58(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset59() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally59());
        }
        assertEquals(4, subject.tally59Count());
    }

    @Test
    void refusesOnceExhaustedOffset59() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            subject.tally59();
        }
        assertFalse(subject.tally59());
    }

    @Test
    void accumulatesBelowTheCapCapacity60() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.winnow60(1));
        assertEquals(3, subject.winnow60(2));
    }

    @Test
    void saturatesAtTheCapCapacity60() {
        QuietRampart subject = new QuietRampart();
        subject.winnow60(40);
        assertEquals(40, subject.winnow60(5));
    }

    @Test
    void ignoresNegativeValuesCapacity60() {
        QuietRampart subject = new QuietRampart();
        subject.winnow60(3);
        assertEquals(3, subject.winnow60(-2));
        assertEquals(3, subject.margin60Value());
    }

    @Test
    void rejectsZeroDenominatorTally61() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.brace61(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally61() {
        assertEquals(0.5, new QuietRampart().brace61(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally61() {
        assertEquals(2.0, new QuietRampart().brace61(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio62() {
        assertTrue(new QuietRampart().tally62(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio62() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new QuietRampart().tally62(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio62() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietRampart().tally62(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift63() {
        assertEquals("below", new QuietRampart().furl63(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift63() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.furl63(5));
        assertEquals("upper-bound", subject.furl63(10));
    }

    @Test
    void classifiesWithinAndAboveDrift63() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.furl63(5 + 1));
        assertEquals("above", subject.furl63(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan64() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist64());
        }
        assertEquals(1, subject.margin64Count());
    }

    @Test
    void refusesOnceExhaustedSpan64() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            subject.hoist64();
        }
        assertFalse(subject.hoist64());
    }

    @Test
    void accumulatesBelowTheCapMargin65() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.sift65(1));
        assertEquals(3, subject.sift65(2));
    }

    @Test
    void saturatesAtTheCapMargin65() {
        QuietRampart subject = new QuietRampart();
        subject.sift65(45);
        assertEquals(45, subject.sift65(5));
    }

    @Test
    void ignoresNegativeValuesMargin65() {
        QuietRampart subject = new QuietRampart();
        subject.sift65(3);
        assertEquals(3, subject.sift65(-2));
        assertEquals(3, subject.threshold65Value());
    }

    @Test
    void rejectsZeroDenominatorRatio66() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.collate66(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio66() {
        assertEquals(0.5, new QuietRampart().collate66(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio66() {
        assertEquals(2.0, new QuietRampart().collate66(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio67() {
        assertTrue(new QuietRampart().collate67(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio67() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new QuietRampart().collate67(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio67() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietRampart().collate67(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift68() {
        assertEquals("below", new QuietRampart().prune68(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift68() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.prune68(2));
        assertEquals("upper-bound", subject.prune68(9));
    }

    @Test
    void classifiesWithinAndAboveDrift68() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.prune68(2 + 1));
        assertEquals("above", subject.prune68(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth69() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge69());
        }
        assertEquals(2, subject.span69Count());
    }

    @Test
    void refusesOnceExhaustedDepth69() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            subject.gauge69();
        }
        assertFalse(subject.gauge69());
    }

    @Test
    void accumulatesBelowTheCapThreshold70() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.gauge70(1));
        assertEquals(3, subject.gauge70(2));
    }

    @Test
    void saturatesAtTheCapThreshold70() {
        QuietRampart subject = new QuietRampart();
        subject.gauge70(50);
        assertEquals(50, subject.gauge70(5));
    }

    @Test
    void ignoresNegativeValuesThreshold70() {
        QuietRampart subject = new QuietRampart();
        subject.gauge70(3);
        assertEquals(3, subject.gauge70(-2));
        assertEquals(3, subject.cadence70Value());
    }

    @Test
    void rejectsZeroDenominatorWeight71() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.anneal71(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight71() {
        assertEquals(0.5, new QuietRampart().anneal71(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight71() {
        assertEquals(2.0, new QuietRampart().anneal71(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift72() {
        assertTrue(new QuietRampart().collate72(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift72() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new QuietRampart().collate72(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift72() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietRampart().collate72(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset73() {
        assertEquals("below", new QuietRampart().kindle73(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset73() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.kindle73(3));
        assertEquals("upper-bound", subject.kindle73(8));
    }

    @Test
    void classifiesWithinAndAboveOffset73() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.kindle73(3 + 1));
        assertEquals("above", subject.kindle73(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally74() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile74());
        }
        assertEquals(3, subject.threshold74Count());
    }

    @Test
    void refusesOnceExhaustedTally74() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            subject.reconcile74();
        }
        assertFalse(subject.reconcile74());
    }

    @Test
    void accumulatesBelowTheCapThreshold75() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.reconcile75(1));
        assertEquals(3, subject.reconcile75(2));
    }

    @Test
    void saturatesAtTheCapThreshold75() {
        QuietRampart subject = new QuietRampart();
        subject.reconcile75(55);
        assertEquals(55, subject.reconcile75(5));
    }

    @Test
    void ignoresNegativeValuesThreshold75() {
        QuietRampart subject = new QuietRampart();
        subject.reconcile75(3);
        assertEquals(3, subject.reconcile75(-2));
        assertEquals(3, subject.cadence75Value());
    }

    @Test
    void rejectsZeroDenominatorCadence76() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.gauge76(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence76() {
        assertEquals(0.5, new QuietRampart().gauge76(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence76() {
        assertEquals(2.0, new QuietRampart().gauge76(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity77() {
        assertTrue(new QuietRampart().collate77(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity77() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new QuietRampart().collate77(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity77() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietRampart().collate77(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias78() {
        assertEquals("below", new QuietRampart().collate78(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias78() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.collate78(4));
        assertEquals("upper-bound", subject.collate78(7));
    }

    @Test
    void classifiesWithinAndAboveBias78() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.collate78(4 + 1));
        assertEquals("above", subject.collate78(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield79() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow79());
        }
        assertEquals(4, subject.cadence79Count());
    }

    @Test
    void refusesOnceExhaustedYield79() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            subject.winnow79();
        }
        assertFalse(subject.winnow79());
    }

    @Test
    void accumulatesBelowTheCapBias80() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.winnow80(1));
        assertEquals(3, subject.winnow80(2));
    }

    @Test
    void saturatesAtTheCapBias80() {
        QuietRampart subject = new QuietRampart();
        subject.winnow80(20);
        assertEquals(20, subject.winnow80(5));
    }

    @Test
    void ignoresNegativeValuesBias80() {
        QuietRampart subject = new QuietRampart();
        subject.winnow80(3);
        assertEquals(3, subject.winnow80(-2));
        assertEquals(3, subject.margin80Value());
    }

    @Test
    void rejectsZeroDenominatorDrift81() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.prune81(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift81() {
        assertEquals(0.5, new QuietRampart().prune81(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift81() {
        assertEquals(2.0, new QuietRampart().prune81(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio82() {
        assertTrue(new QuietRampart().tally82(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio82() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new QuietRampart().tally82(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio82() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietRampart().tally82(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity83() {
        assertEquals("below", new QuietRampart().collate83(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity83() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.collate83(5));
        assertEquals("upper-bound", subject.collate83(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity83() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.collate83(5 + 1));
        assertEquals("above", subject.collate83(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias84() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten84());
        }
        assertEquals(1, subject.weight84Count());
    }

    @Test
    void refusesOnceExhaustedBias84() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            subject.flatten84();
        }
        assertFalse(subject.flatten84());
    }

    @Test
    void accumulatesBelowTheCapThreshold85() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.prune85(1));
        assertEquals(3, subject.prune85(2));
    }

    @Test
    void saturatesAtTheCapThreshold85() {
        QuietRampart subject = new QuietRampart();
        subject.prune85(25);
        assertEquals(25, subject.prune85(5));
    }

    @Test
    void ignoresNegativeValuesThreshold85() {
        QuietRampart subject = new QuietRampart();
        subject.prune85(3);
        assertEquals(3, subject.prune85(-2));
        assertEquals(3, subject.margin85Value());
    }

    @Test
    void rejectsZeroDenominatorTally86() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.brace86(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally86() {
        assertEquals(0.5, new QuietRampart().brace86(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally86() {
        assertEquals(2.0, new QuietRampart().brace86(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence87() {
        assertTrue(new QuietRampart().gauge87(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence87() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new QuietRampart().gauge87(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence87() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietRampart().gauge87(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence88() {
        assertEquals("below", new QuietRampart().reconcile88(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence88() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.reconcile88(2));
        assertEquals("upper-bound", subject.reconcile88(11));
    }

    @Test
    void classifiesWithinAndAboveCadence88() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.reconcile88(2 + 1));
        assertEquals("above", subject.reconcile88(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity89() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten89());
        }
        assertEquals(2, subject.tally89Count());
    }

    @Test
    void refusesOnceExhaustedCapacity89() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            subject.flatten89();
        }
        assertFalse(subject.flatten89());
    }

    @Test
    void accumulatesBelowTheCapCadence90() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.reconcile90(1));
        assertEquals(3, subject.reconcile90(2));
    }

    @Test
    void saturatesAtTheCapCadence90() {
        QuietRampart subject = new QuietRampart();
        subject.reconcile90(30);
        assertEquals(30, subject.reconcile90(5));
    }

    @Test
    void ignoresNegativeValuesCadence90() {
        QuietRampart subject = new QuietRampart();
        subject.reconcile90(3);
        assertEquals(3, subject.reconcile90(-2));
        assertEquals(3, subject.depth90Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity91() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.sift91(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity91() {
        assertEquals(0.5, new QuietRampart().sift91(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity91() {
        assertEquals(2.0, new QuietRampart().sift91(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold92() {
        assertTrue(new QuietRampart().kindle92(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold92() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietRampart().kindle92(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold92() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietRampart().kindle92(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight93() {
        assertEquals("below", new QuietRampart().gauge93(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight93() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.gauge93(3));
        assertEquals("upper-bound", subject.gauge93(10));
    }

    @Test
    void classifiesWithinAndAboveWeight93() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.gauge93(3 + 1));
        assertEquals("above", subject.gauge93(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin94() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow94());
        }
        assertEquals(3, subject.yield94Count());
    }

    @Test
    void refusesOnceExhaustedMargin94() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            subject.winnow94();
        }
        assertFalse(subject.winnow94());
    }

    @Test
    void accumulatesBelowTheCapSpan95() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.anneal95(1));
        assertEquals(3, subject.anneal95(2));
    }

    @Test
    void saturatesAtTheCapSpan95() {
        QuietRampart subject = new QuietRampart();
        subject.anneal95(35);
        assertEquals(35, subject.anneal95(5));
    }

    @Test
    void ignoresNegativeValuesSpan95() {
        QuietRampart subject = new QuietRampart();
        subject.anneal95(3);
        assertEquals(3, subject.anneal95(-2));
        assertEquals(3, subject.offset95Value());
    }

    @Test
    void rejectsZeroDenominatorWeight96() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.anneal96(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight96() {
        assertEquals(0.5, new QuietRampart().anneal96(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight96() {
        assertEquals(2.0, new QuietRampart().anneal96(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth97() {
        assertTrue(new QuietRampart().flatten97(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth97() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new QuietRampart().flatten97(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth97() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietRampart().flatten97(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan98() {
        assertEquals("below", new QuietRampart().furl98(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan98() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.furl98(4));
        assertEquals("upper-bound", subject.furl98(9));
    }

    @Test
    void classifiesWithinAndAboveSpan98() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.furl98(4 + 1));
        assertEquals("above", subject.furl98(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally99() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle99());
        }
        assertEquals(4, subject.cadence99Count());
    }

    @Test
    void refusesOnceExhaustedTally99() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            subject.kindle99();
        }
        assertFalse(subject.kindle99());
    }

    @Test
    void accumulatesBelowTheCapWeight100() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.gauge100(1));
        assertEquals(3, subject.gauge100(2));
    }

    @Test
    void saturatesAtTheCapWeight100() {
        QuietRampart subject = new QuietRampart();
        subject.gauge100(40);
        assertEquals(40, subject.gauge100(5));
    }

    @Test
    void ignoresNegativeValuesWeight100() {
        QuietRampart subject = new QuietRampart();
        subject.gauge100(3);
        assertEquals(3, subject.gauge100(-2));
        assertEquals(3, subject.offset100Value());
    }

    @Test
    void rejectsZeroDenominatorYield101() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow101(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield101() {
        assertEquals(0.5, new QuietRampart().winnow101(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield101() {
        assertEquals(2.0, new QuietRampart().winnow101(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity102() {
        assertTrue(new QuietRampart().winnow102(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity102() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new QuietRampart().winnow102(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity102() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietRampart().winnow102(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence103() {
        assertEquals("below", new QuietRampart().winnow103(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence103() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.winnow103(5));
        assertEquals("upper-bound", subject.winnow103(8));
    }

    @Test
    void classifiesWithinAndAboveCadence103() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.winnow103(5 + 1));
        assertEquals("above", subject.winnow103(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift104() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper104());
        }
        assertEquals(1, subject.yield104Count());
    }

    @Test
    void refusesOnceExhaustedDrift104() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            subject.temper104();
        }
        assertFalse(subject.temper104());
    }

    @Test
    void accumulatesBelowTheCapQuota105() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.flatten105(1));
        assertEquals(3, subject.flatten105(2));
    }

    @Test
    void saturatesAtTheCapQuota105() {
        QuietRampart subject = new QuietRampart();
        subject.flatten105(45);
        assertEquals(45, subject.flatten105(5));
    }

    @Test
    void ignoresNegativeValuesQuota105() {
        QuietRampart subject = new QuietRampart();
        subject.flatten105(3);
        assertEquals(3, subject.flatten105(-2));
        assertEquals(3, subject.ratio105Value());
    }

    @Test
    void rejectsZeroDenominatorOffset106() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.prune106(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset106() {
        assertEquals(0.5, new QuietRampart().prune106(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset106() {
        assertEquals(2.0, new QuietRampart().prune106(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio107() {
        assertTrue(new QuietRampart().flatten107(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio107() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new QuietRampart().flatten107(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio107() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietRampart().flatten107(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias108() {
        assertEquals("below", new QuietRampart().furl108(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias108() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.furl108(2));
        assertEquals("upper-bound", subject.furl108(7));
    }

    @Test
    void classifiesWithinAndAboveBias108() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.furl108(2 + 1));
        assertEquals("above", subject.furl108(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight109() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune109());
        }
        assertEquals(2, subject.capacity109Count());
    }

    @Test
    void refusesOnceExhaustedWeight109() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            subject.prune109();
        }
        assertFalse(subject.prune109());
    }

    @Test
    void accumulatesBelowTheCapDrift110() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.sift110(1));
        assertEquals(3, subject.sift110(2));
    }

    @Test
    void saturatesAtTheCapDrift110() {
        QuietRampart subject = new QuietRampart();
        subject.sift110(50);
        assertEquals(50, subject.sift110(5));
    }

    @Test
    void ignoresNegativeValuesDrift110() {
        QuietRampart subject = new QuietRampart();
        subject.sift110(3);
        assertEquals(3, subject.sift110(-2));
        assertEquals(3, subject.quota110Value());
    }

    @Test
    void rejectsZeroDenominatorQuota111() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow111(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota111() {
        assertEquals(0.5, new QuietRampart().winnow111(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota111() {
        assertEquals(2.0, new QuietRampart().winnow111(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth112() {
        assertTrue(new QuietRampart().sift112(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth112() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new QuietRampart().sift112(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth112() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietRampart().sift112(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth113() {
        assertEquals("below", new QuietRampart().temper113(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth113() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.temper113(3));
        assertEquals("upper-bound", subject.temper113(12));
    }

    @Test
    void classifiesWithinAndAboveDepth113() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.temper113(3 + 1));
        assertEquals("above", subject.temper113(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota114() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune114());
        }
        assertEquals(3, subject.tally114Count());
    }

    @Test
    void refusesOnceExhaustedQuota114() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            subject.prune114();
        }
        assertFalse(subject.prune114());
    }

    @Test
    void accumulatesBelowTheCapYield115() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.collate115(1));
        assertEquals(3, subject.collate115(2));
    }

    @Test
    void saturatesAtTheCapYield115() {
        QuietRampart subject = new QuietRampart();
        subject.collate115(55);
        assertEquals(55, subject.collate115(5));
    }

    @Test
    void ignoresNegativeValuesYield115() {
        QuietRampart subject = new QuietRampart();
        subject.collate115(3);
        assertEquals(3, subject.collate115(-2));
        assertEquals(3, subject.drift115Value());
    }

    @Test
    void rejectsZeroDenominatorBias116() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.prune116(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias116() {
        assertEquals(0.5, new QuietRampart().prune116(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias116() {
        assertEquals(2.0, new QuietRampart().prune116(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity117() {
        assertTrue(new QuietRampart().gauge117(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity117() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new QuietRampart().gauge117(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity117() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietRampart().gauge117(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin118() {
        assertEquals("below", new QuietRampart().furl118(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin118() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.furl118(4));
        assertEquals("upper-bound", subject.furl118(11));
    }

    @Test
    void classifiesWithinAndAboveMargin118() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.furl118(4 + 1));
        assertEquals("above", subject.furl118(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio119() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl119());
        }
        assertEquals(4, subject.cadence119Count());
    }

    @Test
    void refusesOnceExhaustedRatio119() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            subject.furl119();
        }
        assertFalse(subject.furl119());
    }

    @Test
    void accumulatesBelowTheCapTally120() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.reconcile120(1));
        assertEquals(3, subject.reconcile120(2));
    }

    @Test
    void saturatesAtTheCapTally120() {
        QuietRampart subject = new QuietRampart();
        subject.reconcile120(20);
        assertEquals(20, subject.reconcile120(5));
    }

    @Test
    void ignoresNegativeValuesTally120() {
        QuietRampart subject = new QuietRampart();
        subject.reconcile120(3);
        assertEquals(3, subject.reconcile120(-2));
        assertEquals(3, subject.depth120Value());
    }

    @Test
    void rejectsZeroDenominatorWeight121() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow121(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight121() {
        assertEquals(0.5, new QuietRampart().winnow121(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight121() {
        assertEquals(2.0, new QuietRampart().winnow121(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin122() {
        assertTrue(new QuietRampart().furl122(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin122() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new QuietRampart().furl122(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin122() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietRampart().furl122(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity123() {
        assertEquals("below", new QuietRampart().prune123(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity123() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.prune123(5));
        assertEquals("upper-bound", subject.prune123(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity123() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.prune123(5 + 1));
        assertEquals("above", subject.prune123(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield124() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate124());
        }
        assertEquals(1, subject.weight124Count());
    }

    @Test
    void refusesOnceExhaustedYield124() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            subject.collate124();
        }
        assertFalse(subject.collate124());
    }

    @Test
    void accumulatesBelowTheCapCadence125() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.furl125(1));
        assertEquals(3, subject.furl125(2));
    }

    @Test
    void saturatesAtTheCapCadence125() {
        QuietRampart subject = new QuietRampart();
        subject.furl125(25);
        assertEquals(25, subject.furl125(5));
    }

    @Test
    void ignoresNegativeValuesCadence125() {
        QuietRampart subject = new QuietRampart();
        subject.furl125(3);
        assertEquals(3, subject.furl125(-2));
        assertEquals(3, subject.offset125Value());
    }

    @Test
    void rejectsZeroDenominatorOffset126() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.prune126(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset126() {
        assertEquals(0.5, new QuietRampart().prune126(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset126() {
        assertEquals(2.0, new QuietRampart().prune126(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias127() {
        assertTrue(new QuietRampart().anneal127(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias127() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new QuietRampart().anneal127(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias127() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietRampart().anneal127(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity128() {
        assertEquals("below", new QuietRampart().temper128(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity128() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.temper128(2));
        assertEquals("upper-bound", subject.temper128(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity128() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.temper128(2 + 1));
        assertEquals("above", subject.temper128(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias129() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune129());
        }
        assertEquals(2, subject.yield129Count());
    }

    @Test
    void refusesOnceExhaustedBias129() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            subject.prune129();
        }
        assertFalse(subject.prune129());
    }

    @Test
    void accumulatesBelowTheCapCadence130() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.furl130(1));
        assertEquals(3, subject.furl130(2));
    }

    @Test
    void saturatesAtTheCapCadence130() {
        QuietRampart subject = new QuietRampart();
        subject.furl130(30);
        assertEquals(30, subject.furl130(5));
    }

    @Test
    void ignoresNegativeValuesCadence130() {
        QuietRampart subject = new QuietRampart();
        subject.furl130(3);
        assertEquals(3, subject.furl130(-2));
        assertEquals(3, subject.drift130Value());
    }

    @Test
    void rejectsZeroDenominatorWeight131() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.kindle131(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight131() {
        assertEquals(0.5, new QuietRampart().kindle131(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight131() {
        assertEquals(2.0, new QuietRampart().kindle131(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally132() {
        assertTrue(new QuietRampart().anneal132(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally132() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new QuietRampart().anneal132(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally132() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietRampart().anneal132(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias133() {
        assertEquals("below", new QuietRampart().hoist133(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias133() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.hoist133(3));
        assertEquals("upper-bound", subject.hoist133(8));
    }

    @Test
    void classifiesWithinAndAboveBias133() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.hoist133(3 + 1));
        assertEquals("above", subject.hoist133(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight134() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally134());
        }
        assertEquals(3, subject.cadence134Count());
    }

    @Test
    void refusesOnceExhaustedWeight134() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            subject.tally134();
        }
        assertFalse(subject.tally134());
    }

    @Test
    void accumulatesBelowTheCapCapacity135() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.flatten135(1));
        assertEquals(3, subject.flatten135(2));
    }

    @Test
    void saturatesAtTheCapCapacity135() {
        QuietRampart subject = new QuietRampart();
        subject.flatten135(35);
        assertEquals(35, subject.flatten135(5));
    }

    @Test
    void ignoresNegativeValuesCapacity135() {
        QuietRampart subject = new QuietRampart();
        subject.flatten135(3);
        assertEquals(3, subject.flatten135(-2));
        assertEquals(3, subject.quota135Value());
    }

    @Test
    void rejectsZeroDenominatorDepth136() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.kindle136(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth136() {
        assertEquals(0.5, new QuietRampart().kindle136(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth136() {
        assertEquals(2.0, new QuietRampart().kindle136(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio137() {
        assertTrue(new QuietRampart().sift137(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio137() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new QuietRampart().sift137(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio137() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietRampart().sift137(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan138() {
        assertEquals("below", new QuietRampart().winnow138(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan138() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.winnow138(4));
        assertEquals("upper-bound", subject.winnow138(7));
    }

    @Test
    void classifiesWithinAndAboveSpan138() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.winnow138(4 + 1));
        assertEquals("above", subject.winnow138(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally139() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune139());
        }
        assertEquals(4, subject.depth139Count());
    }

    @Test
    void refusesOnceExhaustedTally139() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            subject.prune139();
        }
        assertFalse(subject.prune139());
    }

    @Test
    void accumulatesBelowTheCapSpan140() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.kindle140(1));
        assertEquals(3, subject.kindle140(2));
    }

    @Test
    void saturatesAtTheCapSpan140() {
        QuietRampart subject = new QuietRampart();
        subject.kindle140(40);
        assertEquals(40, subject.kindle140(5));
    }

    @Test
    void ignoresNegativeValuesSpan140() {
        QuietRampart subject = new QuietRampart();
        subject.kindle140(3);
        assertEquals(3, subject.kindle140(-2));
        assertEquals(3, subject.capacity140Value());
    }

    @Test
    void rejectsZeroDenominatorRatio141() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.temper141(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio141() {
        assertEquals(0.5, new QuietRampart().temper141(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio141() {
        assertEquals(2.0, new QuietRampart().temper141(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold142() {
        assertTrue(new QuietRampart().prune142(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold142() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new QuietRampart().prune142(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold142() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietRampart().prune142(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias143() {
        assertEquals("below", new QuietRampart().winnow143(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias143() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.winnow143(5));
        assertEquals("upper-bound", subject.winnow143(12));
    }

    @Test
    void classifiesWithinAndAboveBias143() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.winnow143(5 + 1));
        assertEquals("above", subject.winnow143(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight144() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift144());
        }
        assertEquals(1, subject.quota144Count());
    }

    @Test
    void refusesOnceExhaustedWeight144() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            subject.sift144();
        }
        assertFalse(subject.sift144());
    }

    @Test
    void accumulatesBelowTheCapTally145() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.furl145(1));
        assertEquals(3, subject.furl145(2));
    }

    @Test
    void saturatesAtTheCapTally145() {
        QuietRampart subject = new QuietRampart();
        subject.furl145(45);
        assertEquals(45, subject.furl145(5));
    }

    @Test
    void ignoresNegativeValuesTally145() {
        QuietRampart subject = new QuietRampart();
        subject.furl145(3);
        assertEquals(3, subject.furl145(-2));
        assertEquals(3, subject.weight145Value());
    }

    @Test
    void rejectsZeroDenominatorDrift146() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.tally146(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift146() {
        assertEquals(0.5, new QuietRampart().tally146(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift146() {
        assertEquals(2.0, new QuietRampart().tally146(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio147() {
        assertTrue(new QuietRampart().gauge147(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio147() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new QuietRampart().gauge147(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio147() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietRampart().gauge147(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally148() {
        assertEquals("below", new QuietRampart().tally148(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally148() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.tally148(2));
        assertEquals("upper-bound", subject.tally148(11));
    }

    @Test
    void classifiesWithinAndAboveTally148() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.tally148(2 + 1));
        assertEquals("above", subject.tally148(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin149() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift149());
        }
        assertEquals(2, subject.ratio149Count());
    }

    @Test
    void refusesOnceExhaustedMargin149() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            subject.sift149();
        }
        assertFalse(subject.sift149());
    }

    @Test
    void accumulatesBelowTheCapTally150() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.tally150(1));
        assertEquals(3, subject.tally150(2));
    }

    @Test
    void saturatesAtTheCapTally150() {
        QuietRampart subject = new QuietRampart();
        subject.tally150(50);
        assertEquals(50, subject.tally150(5));
    }

    @Test
    void ignoresNegativeValuesTally150() {
        QuietRampart subject = new QuietRampart();
        subject.tally150(3);
        assertEquals(3, subject.tally150(-2));
        assertEquals(3, subject.bias150Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold151() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.hoist151(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold151() {
        assertEquals(0.5, new QuietRampart().hoist151(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold151() {
        assertEquals(2.0, new QuietRampart().hoist151(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift152() {
        assertTrue(new QuietRampart().flatten152(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift152() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new QuietRampart().flatten152(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift152() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietRampart().flatten152(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio153() {
        assertEquals("below", new QuietRampart().kindle153(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio153() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.kindle153(3));
        assertEquals("upper-bound", subject.kindle153(10));
    }

    @Test
    void classifiesWithinAndAboveRatio153() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.kindle153(3 + 1));
        assertEquals("above", subject.kindle153(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence154() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally154());
        }
        assertEquals(3, subject.drift154Count());
    }

    @Test
    void refusesOnceExhaustedCadence154() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            subject.tally154();
        }
        assertFalse(subject.tally154());
    }

    @Test
    void accumulatesBelowTheCapOffset155() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.prune155(1));
        assertEquals(3, subject.prune155(2));
    }

    @Test
    void saturatesAtTheCapOffset155() {
        QuietRampart subject = new QuietRampart();
        subject.prune155(55);
        assertEquals(55, subject.prune155(5));
    }

    @Test
    void ignoresNegativeValuesOffset155() {
        QuietRampart subject = new QuietRampart();
        subject.prune155(3);
        assertEquals(3, subject.prune155(-2));
        assertEquals(3, subject.span155Value());
    }

    @Test
    void rejectsZeroDenominatorYield156() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.kindle156(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield156() {
        assertEquals(0.5, new QuietRampart().kindle156(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield156() {
        assertEquals(2.0, new QuietRampart().kindle156(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold157() {
        assertTrue(new QuietRampart().prune157(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold157() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new QuietRampart().prune157(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold157() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietRampart().prune157(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias158() {
        assertEquals("below", new QuietRampart().anneal158(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias158() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.anneal158(4));
        assertEquals("upper-bound", subject.anneal158(9));
    }

    @Test
    void classifiesWithinAndAboveBias158() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.anneal158(4 + 1));
        assertEquals("above", subject.anneal158(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin159() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow159());
        }
        assertEquals(4, subject.cadence159Count());
    }

    @Test
    void refusesOnceExhaustedMargin159() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 4; i++) {
            subject.winnow159();
        }
        assertFalse(subject.winnow159());
    }

    @Test
    void accumulatesBelowTheCapRatio160() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.temper160(1));
        assertEquals(3, subject.temper160(2));
    }

    @Test
    void saturatesAtTheCapRatio160() {
        QuietRampart subject = new QuietRampart();
        subject.temper160(20);
        assertEquals(20, subject.temper160(5));
    }

    @Test
    void ignoresNegativeValuesRatio160() {
        QuietRampart subject = new QuietRampart();
        subject.temper160(3);
        assertEquals(3, subject.temper160(-2));
        assertEquals(3, subject.drift160Value());
    }

    @Test
    void rejectsZeroDenominatorDrift161() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.prune161(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift161() {
        assertEquals(0.5, new QuietRampart().prune161(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift161() {
        assertEquals(2.0, new QuietRampart().prune161(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence162() {
        assertTrue(new QuietRampart().winnow162(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence162() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new QuietRampart().winnow162(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence162() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietRampart().winnow162(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield163() {
        assertEquals("below", new QuietRampart().temper163(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield163() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.temper163(5));
        assertEquals("upper-bound", subject.temper163(8));
    }

    @Test
    void classifiesWithinAndAboveYield163() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.temper163(5 + 1));
        assertEquals("above", subject.temper163(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield164() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune164());
        }
        assertEquals(1, subject.depth164Count());
    }

    @Test
    void refusesOnceExhaustedYield164() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 1; i++) {
            subject.prune164();
        }
        assertFalse(subject.prune164());
    }

    @Test
    void accumulatesBelowTheCapYield165() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.collate165(1));
        assertEquals(3, subject.collate165(2));
    }

    @Test
    void saturatesAtTheCapYield165() {
        QuietRampart subject = new QuietRampart();
        subject.collate165(25);
        assertEquals(25, subject.collate165(5));
    }

    @Test
    void ignoresNegativeValuesYield165() {
        QuietRampart subject = new QuietRampart();
        subject.collate165(3);
        assertEquals(3, subject.collate165(-2));
        assertEquals(3, subject.bias165Value());
    }

    @Test
    void rejectsZeroDenominatorDrift166() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.gauge166(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift166() {
        assertEquals(0.5, new QuietRampart().gauge166(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift166() {
        assertEquals(2.0, new QuietRampart().gauge166(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally167() {
        assertTrue(new QuietRampart().hoist167(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally167() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new QuietRampart().hoist167(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally167() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietRampart().hoist167(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence168() {
        assertEquals("below", new QuietRampart().gauge168(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence168() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.gauge168(2));
        assertEquals("upper-bound", subject.gauge168(7));
    }

    @Test
    void classifiesWithinAndAboveCadence168() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.gauge168(2 + 1));
        assertEquals("above", subject.gauge168(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift169() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow169());
        }
        assertEquals(2, subject.weight169Count());
    }

    @Test
    void refusesOnceExhaustedDrift169() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 2; i++) {
            subject.winnow169();
        }
        assertFalse(subject.winnow169());
    }

    @Test
    void accumulatesBelowTheCapThreshold170() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.gauge170(1));
        assertEquals(3, subject.gauge170(2));
    }

    @Test
    void saturatesAtTheCapThreshold170() {
        QuietRampart subject = new QuietRampart();
        subject.gauge170(30);
        assertEquals(30, subject.gauge170(5));
    }

    @Test
    void ignoresNegativeValuesThreshold170() {
        QuietRampart subject = new QuietRampart();
        subject.gauge170(3);
        assertEquals(3, subject.gauge170(-2));
        assertEquals(3, subject.tally170Value());
    }

    @Test
    void rejectsZeroDenominatorWeight171() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.gauge171(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight171() {
        assertEquals(0.5, new QuietRampart().gauge171(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight171() {
        assertEquals(2.0, new QuietRampart().gauge171(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth172() {
        assertTrue(new QuietRampart().tally172(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth172() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new QuietRampart().tally172(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth172() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietRampart().tally172(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence173() {
        assertEquals("below", new QuietRampart().kindle173(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence173() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.kindle173(3));
        assertEquals("upper-bound", subject.kindle173(12));
    }

    @Test
    void classifiesWithinAndAboveCadence173() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.kindle173(3 + 1));
        assertEquals("above", subject.kindle173(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio174() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper174());
        }
        assertEquals(3, subject.bias174Count());
    }

    @Test
    void refusesOnceExhaustedRatio174() {
        QuietRampart subject = new QuietRampart();
        for (int i = 0; i < 3; i++) {
            subject.temper174();
        }
        assertFalse(subject.temper174());
    }

    @Test
    void accumulatesBelowTheCapQuota175() {
        QuietRampart subject = new QuietRampart();
        assertEquals(1, subject.prune175(1));
        assertEquals(3, subject.prune175(2));
    }

    @Test
    void saturatesAtTheCapQuota175() {
        QuietRampart subject = new QuietRampart();
        subject.prune175(35);
        assertEquals(35, subject.prune175(5));
    }

    @Test
    void ignoresNegativeValuesQuota175() {
        QuietRampart subject = new QuietRampart();
        subject.prune175(3);
        assertEquals(3, subject.prune175(-2));
        assertEquals(3, subject.margin175Value());
    }

    @Test
    void rejectsZeroDenominatorQuota176() {
        QuietRampart subject = new QuietRampart();
        assertThrows(ArithmeticException.class, () -> subject.prune176(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota176() {
        assertEquals(0.5, new QuietRampart().prune176(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota176() {
        assertEquals(2.0, new QuietRampart().prune176(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth177() {
        assertTrue(new QuietRampart().anneal177(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth177() {
        assertEquals(java.util.Arrays.asList(2, 12),
                new QuietRampart().anneal177(java.util.Arrays.asList(2 - 1, 2, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth177() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietRampart().anneal177(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity178() {
        assertEquals("below", new QuietRampart().tally178(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity178() {
        QuietRampart subject = new QuietRampart();
        assertEquals("lower-bound", subject.tally178(4));
        assertEquals("upper-bound", subject.tally178(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity178() {
        QuietRampart subject = new QuietRampart();
        assertEquals("within", subject.tally178(4 + 1));
        assertEquals("above", subject.tally178(11 + 1));
    }
}
