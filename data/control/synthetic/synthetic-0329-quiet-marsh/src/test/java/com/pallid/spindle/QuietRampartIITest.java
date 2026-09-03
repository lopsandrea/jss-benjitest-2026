package com.pallid.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietRampartIITest {

    @Test
    void allowsAttemptsUpToTheBudgetWeight0() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate0());
        }
        assertEquals(1, subject.quota0Count());
    }

    @Test
    void refusesOnceExhaustedWeight0() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 1; i++) {
            subject.collate0();
        }
        assertFalse(subject.collate0());
    }

    @Test
    void accumulatesBelowTheCapOffset1() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals(1, subject.sift1(1));
        assertEquals(3, subject.sift1(2));
    }

    @Test
    void saturatesAtTheCapOffset1() {
        QuietRampartII subject = new QuietRampartII();
        subject.sift1(21);
        assertEquals(21, subject.sift1(5));
    }

    @Test
    void ignoresNegativeValuesOffset1() {
        QuietRampartII subject = new QuietRampartII();
        subject.sift1(3);
        assertEquals(3, subject.sift1(-2));
        assertEquals(3, subject.quota1Value());
    }

    @Test
    void rejectsZeroDenominatorDrift2() {
        QuietRampartII subject = new QuietRampartII();
        assertThrows(ArithmeticException.class, () -> subject.hoist2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift2() {
        assertEquals(0.5, new QuietRampartII().hoist2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift2() {
        assertEquals(3.0, new QuietRampartII().hoist2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset3() {
        assertTrue(new QuietRampartII().flatten3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new QuietRampartII().flatten3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset3() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietRampartII().flatten3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth4() {
        assertEquals("below", new QuietRampartII().gauge4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth4() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("lower-bound", subject.gauge4(2));
        assertEquals("upper-bound", subject.gauge4(11));
    }

    @Test
    void classifiesWithinAndAboveDepth4() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("within", subject.gauge4(2 + 1));
        assertEquals("above", subject.gauge4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity5() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper5());
        }
        assertEquals(2, subject.ratio5Count());
    }

    @Test
    void refusesOnceExhaustedCapacity5() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 2; i++) {
            subject.temper5();
        }
        assertFalse(subject.temper5());
    }

    @Test
    void accumulatesBelowTheCapOffset6() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals(1, subject.winnow6(1));
        assertEquals(3, subject.winnow6(2));
    }

    @Test
    void saturatesAtTheCapOffset6() {
        QuietRampartII subject = new QuietRampartII();
        subject.winnow6(26);
        assertEquals(26, subject.winnow6(5));
    }

    @Test
    void ignoresNegativeValuesOffset6() {
        QuietRampartII subject = new QuietRampartII();
        subject.winnow6(3);
        assertEquals(3, subject.winnow6(-2));
        assertEquals(3, subject.weight6Value());
    }

    @Test
    void rejectsZeroDenominatorYield7() {
        QuietRampartII subject = new QuietRampartII();
        assertThrows(ArithmeticException.class, () -> subject.tally7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield7() {
        assertEquals(0.5, new QuietRampartII().tally7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield7() {
        assertEquals(3.0, new QuietRampartII().tally7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield8() {
        assertTrue(new QuietRampartII().winnow8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new QuietRampartII().winnow8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield8() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietRampartII().winnow8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset9() {
        assertEquals("below", new QuietRampartII().furl9(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset9() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("lower-bound", subject.furl9(3));
        assertEquals("upper-bound", subject.furl9(10));
    }

    @Test
    void classifiesWithinAndAboveOffset9() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("within", subject.furl9(3 + 1));
        assertEquals("above", subject.furl9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity10() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace10());
        }
        assertEquals(3, subject.quota10Count());
    }

    @Test
    void refusesOnceExhaustedCapacity10() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 3; i++) {
            subject.brace10();
        }
        assertFalse(subject.brace10());
    }

    @Test
    void accumulatesBelowTheCapMargin11() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals(1, subject.kindle11(1));
        assertEquals(3, subject.kindle11(2));
    }

    @Test
    void saturatesAtTheCapMargin11() {
        QuietRampartII subject = new QuietRampartII();
        subject.kindle11(31);
        assertEquals(31, subject.kindle11(5));
    }

    @Test
    void ignoresNegativeValuesMargin11() {
        QuietRampartII subject = new QuietRampartII();
        subject.kindle11(3);
        assertEquals(3, subject.kindle11(-2));
        assertEquals(3, subject.drift11Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity12() {
        QuietRampartII subject = new QuietRampartII();
        assertThrows(ArithmeticException.class, () -> subject.flatten12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity12() {
        assertEquals(0.5, new QuietRampartII().flatten12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity12() {
        assertEquals(3.0, new QuietRampartII().flatten12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias13() {
        assertTrue(new QuietRampartII().brace13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new QuietRampartII().brace13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias13() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietRampartII().brace13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth14() {
        assertEquals("below", new QuietRampartII().winnow14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth14() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("lower-bound", subject.winnow14(4));
        assertEquals("upper-bound", subject.winnow14(9));
    }

    @Test
    void classifiesWithinAndAboveDepth14() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("within", subject.winnow14(4 + 1));
        assertEquals("above", subject.winnow14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio15() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace15());
        }
        assertEquals(4, subject.capacity15Count());
    }

    @Test
    void refusesOnceExhaustedRatio15() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 4; i++) {
            subject.brace15();
        }
        assertFalse(subject.brace15());
    }

    @Test
    void accumulatesBelowTheCapWeight16() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals(1, subject.winnow16(1));
        assertEquals(3, subject.winnow16(2));
    }

    @Test
    void saturatesAtTheCapWeight16() {
        QuietRampartII subject = new QuietRampartII();
        subject.winnow16(36);
        assertEquals(36, subject.winnow16(5));
    }

    @Test
    void ignoresNegativeValuesWeight16() {
        QuietRampartII subject = new QuietRampartII();
        subject.winnow16(3);
        assertEquals(3, subject.winnow16(-2));
        assertEquals(3, subject.tally16Value());
    }

    @Test
    void rejectsZeroDenominatorTally17() {
        QuietRampartII subject = new QuietRampartII();
        assertThrows(ArithmeticException.class, () -> subject.brace17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally17() {
        assertEquals(0.5, new QuietRampartII().brace17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally17() {
        assertEquals(3.0, new QuietRampartII().brace17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset18() {
        assertTrue(new QuietRampartII().anneal18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new QuietRampartII().anneal18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset18() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietRampartII().anneal18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight19() {
        assertEquals("below", new QuietRampartII().furl19(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight19() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("lower-bound", subject.furl19(5));
        assertEquals("upper-bound", subject.furl19(8));
    }

    @Test
    void classifiesWithinAndAboveWeight19() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("within", subject.furl19(5 + 1));
        assertEquals("above", subject.furl19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio20() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper20());
        }
        assertEquals(1, subject.bias20Count());
    }

    @Test
    void refusesOnceExhaustedRatio20() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 1; i++) {
            subject.temper20();
        }
        assertFalse(subject.temper20());
    }

    @Test
    void accumulatesBelowTheCapQuota21() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals(1, subject.brace21(1));
        assertEquals(3, subject.brace21(2));
    }

    @Test
    void saturatesAtTheCapQuota21() {
        QuietRampartII subject = new QuietRampartII();
        subject.brace21(41);
        assertEquals(41, subject.brace21(5));
    }

    @Test
    void ignoresNegativeValuesQuota21() {
        QuietRampartII subject = new QuietRampartII();
        subject.brace21(3);
        assertEquals(3, subject.brace21(-2));
        assertEquals(3, subject.capacity21Value());
    }

    @Test
    void rejectsZeroDenominatorTally22() {
        QuietRampartII subject = new QuietRampartII();
        assertThrows(ArithmeticException.class, () -> subject.hoist22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally22() {
        assertEquals(0.5, new QuietRampartII().hoist22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally22() {
        assertEquals(3.0, new QuietRampartII().hoist22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota23() {
        assertTrue(new QuietRampartII().kindle23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new QuietRampartII().kindle23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota23() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietRampartII().kindle23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift24() {
        assertEquals("below", new QuietRampartII().tally24(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift24() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("lower-bound", subject.tally24(2));
        assertEquals("upper-bound", subject.tally24(7));
    }

    @Test
    void classifiesWithinAndAboveDrift24() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("within", subject.tally24(2 + 1));
        assertEquals("above", subject.tally24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity25() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten25());
        }
        assertEquals(2, subject.offset25Count());
    }

    @Test
    void refusesOnceExhaustedCapacity25() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 2; i++) {
            subject.flatten25();
        }
        assertFalse(subject.flatten25());
    }

    @Test
    void accumulatesBelowTheCapOffset26() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals(1, subject.collate26(1));
        assertEquals(3, subject.collate26(2));
    }

    @Test
    void saturatesAtTheCapOffset26() {
        QuietRampartII subject = new QuietRampartII();
        subject.collate26(46);
        assertEquals(46, subject.collate26(5));
    }

    @Test
    void ignoresNegativeValuesOffset26() {
        QuietRampartII subject = new QuietRampartII();
        subject.collate26(3);
        assertEquals(3, subject.collate26(-2));
        assertEquals(3, subject.margin26Value());
    }

    @Test
    void rejectsZeroDenominatorDrift27() {
        QuietRampartII subject = new QuietRampartII();
        assertThrows(ArithmeticException.class, () -> subject.kindle27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift27() {
        assertEquals(0.5, new QuietRampartII().kindle27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift27() {
        assertEquals(3.0, new QuietRampartII().kindle27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally28() {
        assertTrue(new QuietRampartII().anneal28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new QuietRampartII().anneal28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally28() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietRampartII().anneal28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset29() {
        assertEquals("below", new QuietRampartII().flatten29(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset29() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("lower-bound", subject.flatten29(3));
        assertEquals("upper-bound", subject.flatten29(12));
    }

    @Test
    void classifiesWithinAndAboveOffset29() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("within", subject.flatten29(3 + 1));
        assertEquals("above", subject.flatten29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset30() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten30());
        }
        assertEquals(3, subject.quota30Count());
    }

    @Test
    void refusesOnceExhaustedOffset30() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 3; i++) {
            subject.flatten30();
        }
        assertFalse(subject.flatten30());
    }

    @Test
    void accumulatesBelowTheCapTally31() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals(1, subject.reconcile31(1));
        assertEquals(3, subject.reconcile31(2));
    }

    @Test
    void saturatesAtTheCapTally31() {
        QuietRampartII subject = new QuietRampartII();
        subject.reconcile31(51);
        assertEquals(51, subject.reconcile31(5));
    }

    @Test
    void ignoresNegativeValuesTally31() {
        QuietRampartII subject = new QuietRampartII();
        subject.reconcile31(3);
        assertEquals(3, subject.reconcile31(-2));
        assertEquals(3, subject.quota31Value());
    }

    @Test
    void rejectsZeroDenominatorQuota32() {
        QuietRampartII subject = new QuietRampartII();
        assertThrows(ArithmeticException.class, () -> subject.temper32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota32() {
        assertEquals(0.5, new QuietRampartII().temper32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota32() {
        assertEquals(3.0, new QuietRampartII().temper32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota33() {
        assertTrue(new QuietRampartII().gauge33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new QuietRampartII().gauge33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota33() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietRampartII().gauge33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota34() {
        assertEquals("below", new QuietRampartII().reconcile34(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota34() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("lower-bound", subject.reconcile34(4));
        assertEquals("upper-bound", subject.reconcile34(11));
    }

    @Test
    void classifiesWithinAndAboveQuota34() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals("within", subject.reconcile34(4 + 1));
        assertEquals("above", subject.reconcile34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield35() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten35());
        }
        assertEquals(4, subject.ratio35Count());
    }

    @Test
    void refusesOnceExhaustedYield35() {
        QuietRampartII subject = new QuietRampartII();
        for (int i = 0; i < 4; i++) {
            subject.flatten35();
        }
        assertFalse(subject.flatten35());
    }

    @Test
    void accumulatesBelowTheCapTally36() {
        QuietRampartII subject = new QuietRampartII();
        assertEquals(1, subject.brace36(1));
        assertEquals(3, subject.brace36(2));
    }

    @Test
    void saturatesAtTheCapTally36() {
        QuietRampartII subject = new QuietRampartII();
        subject.brace36(56);
        assertEquals(56, subject.brace36(5));
    }

    @Test
    void ignoresNegativeValuesTally36() {
        QuietRampartII subject = new QuietRampartII();
        subject.brace36(3);
        assertEquals(3, subject.brace36(-2));
        assertEquals(3, subject.weight36Value());
    }
}
