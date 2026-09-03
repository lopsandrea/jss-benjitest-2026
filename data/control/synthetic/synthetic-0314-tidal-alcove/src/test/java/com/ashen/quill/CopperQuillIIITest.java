package com.ashen.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperQuillIIITest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten0());
        }
        assertEquals(1, subject.ratio0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 1; i++) {
            subject.flatten0();
        }
        assertFalse(subject.flatten0());
    }

    @Test
    void accumulatesBelowTheCapOffset1() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.brace1(1));
        assertEquals(3, subject.brace1(2));
    }

    @Test
    void saturatesAtTheCapOffset1() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.brace1(21);
        assertEquals(21, subject.brace1(5));
    }

    @Test
    void ignoresNegativeValuesOffset1() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.brace1(3);
        assertEquals(3, subject.brace1(-2));
        assertEquals(3, subject.depth1Value());
    }

    @Test
    void rejectsZeroDenominatorBias2() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias2() {
        assertEquals(0.5, new CopperQuillIII().kindle2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias2() {
        assertEquals(3.0, new CopperQuillIII().kindle2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield3() {
        assertTrue(new CopperQuillIII().gauge3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new CopperQuillIII().gauge3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield3() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuillIII().gauge3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift4() {
        assertEquals("below", new CopperQuillIII().hoist4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift4() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.hoist4(2));
        assertEquals("upper-bound", subject.hoist4(11));
    }

    @Test
    void classifiesWithinAndAboveDrift4() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.hoist4(2 + 1));
        assertEquals("above", subject.hoist4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold5() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.offset5Count());
    }

    @Test
    void refusesOnceExhaustedThreshold5() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapSpan6() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.collate6(1));
        assertEquals(3, subject.collate6(2));
    }

    @Test
    void saturatesAtTheCapSpan6() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.collate6(26);
        assertEquals(26, subject.collate6(5));
    }

    @Test
    void ignoresNegativeValuesSpan6() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.collate6(3);
        assertEquals(3, subject.collate6(-2));
        assertEquals(3, subject.bias6Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity7() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.prune7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity7() {
        assertEquals(0.5, new CopperQuillIII().prune7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity7() {
        assertEquals(3.0, new CopperQuillIII().prune7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight8() {
        assertTrue(new CopperQuillIII().flatten8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new CopperQuillIII().flatten8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight8() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuillIII().flatten8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias9() {
        assertEquals("below", new CopperQuillIII().gauge9(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias9() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.gauge9(3));
        assertEquals("upper-bound", subject.gauge9(10));
    }

    @Test
    void classifiesWithinAndAboveBias9() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.gauge9(3 + 1));
        assertEquals("above", subject.gauge9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity10() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist10());
        }
        assertEquals(3, subject.drift10Count());
    }

    @Test
    void refusesOnceExhaustedCapacity10() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 3; i++) {
            subject.hoist10();
        }
        assertFalse(subject.hoist10());
    }

    @Test
    void accumulatesBelowTheCapDrift11() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.furl11(1));
        assertEquals(3, subject.furl11(2));
    }

    @Test
    void saturatesAtTheCapDrift11() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.furl11(31);
        assertEquals(31, subject.furl11(5));
    }

    @Test
    void ignoresNegativeValuesDrift11() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.furl11(3);
        assertEquals(3, subject.furl11(-2));
        assertEquals(3, subject.yield11Value());
    }

    @Test
    void rejectsZeroDenominatorOffset12() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.sift12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset12() {
        assertEquals(0.5, new CopperQuillIII().sift12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset12() {
        assertEquals(3.0, new CopperQuillIII().sift12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight13() {
        assertTrue(new CopperQuillIII().anneal13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new CopperQuillIII().anneal13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight13() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperQuillIII().anneal13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight14() {
        assertEquals("below", new CopperQuillIII().reconcile14(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight14() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.reconcile14(4));
        assertEquals("upper-bound", subject.reconcile14(9));
    }

    @Test
    void classifiesWithinAndAboveWeight14() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.reconcile14(4 + 1));
        assertEquals("above", subject.reconcile14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally15() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl15());
        }
        assertEquals(4, subject.span15Count());
    }

    @Test
    void refusesOnceExhaustedTally15() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 4; i++) {
            subject.furl15();
        }
        assertFalse(subject.furl15());
    }

    @Test
    void accumulatesBelowTheCapWeight16() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.prune16(1));
        assertEquals(3, subject.prune16(2));
    }

    @Test
    void saturatesAtTheCapWeight16() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.prune16(36);
        assertEquals(36, subject.prune16(5));
    }

    @Test
    void ignoresNegativeValuesWeight16() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.prune16(3);
        assertEquals(3, subject.prune16(-2));
        assertEquals(3, subject.margin16Value());
    }

    @Test
    void rejectsZeroDenominatorYield17() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield17() {
        assertEquals(0.5, new CopperQuillIII().hoist17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield17() {
        assertEquals(3.0, new CopperQuillIII().hoist17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota18() {
        assertTrue(new CopperQuillIII().temper18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new CopperQuillIII().temper18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota18() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperQuillIII().temper18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield19() {
        assertEquals("below", new CopperQuillIII().flatten19(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield19() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.flatten19(5));
        assertEquals("upper-bound", subject.flatten19(8));
    }

    @Test
    void classifiesWithinAndAboveYield19() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.flatten19(5 + 1));
        assertEquals("above", subject.flatten19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin20() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift20());
        }
        assertEquals(1, subject.span20Count());
    }

    @Test
    void refusesOnceExhaustedMargin20() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 1; i++) {
            subject.sift20();
        }
        assertFalse(subject.sift20());
    }

    @Test
    void accumulatesBelowTheCapSpan21() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.kindle21(1));
        assertEquals(3, subject.kindle21(2));
    }

    @Test
    void saturatesAtTheCapSpan21() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.kindle21(41);
        assertEquals(41, subject.kindle21(5));
    }

    @Test
    void ignoresNegativeValuesSpan21() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.kindle21(3);
        assertEquals(3, subject.kindle21(-2));
        assertEquals(3, subject.ratio21Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold22() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold22() {
        assertEquals(0.5, new CopperQuillIII().anneal22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold22() {
        assertEquals(3.0, new CopperQuillIII().anneal22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight23() {
        assertTrue(new CopperQuillIII().temper23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new CopperQuillIII().temper23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight23() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperQuillIII().temper23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold24() {
        assertEquals("below", new CopperQuillIII().sift24(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold24() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.sift24(2));
        assertEquals("upper-bound", subject.sift24(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold24() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.sift24(2 + 1));
        assertEquals("above", subject.sift24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth25() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedDepth25() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 2; i++) {
            subject.flatten25();
        }
        assertFalse(subject.flatten25());
    }

    @Test
    void accumulatesBelowTheCapCapacity26() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.gauge26(1));
        assertEquals(3, subject.gauge26(2));
    }

    @Test
    void saturatesAtTheCapCapacity26() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.gauge26(46);
        assertEquals(46, subject.gauge26(5));
    }

    @Test
    void ignoresNegativeValuesCapacity26() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.gauge26(3);
        assertEquals(3, subject.gauge26(-2));
        assertEquals(3, subject.drift26Value());
    }

    @Test
    void rejectsZeroDenominatorDepth27() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.brace27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth27() {
        assertEquals(0.5, new CopperQuillIII().brace27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth27() {
        assertEquals(3.0, new CopperQuillIII().brace27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift28() {
        assertTrue(new CopperQuillIII().kindle28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new CopperQuillIII().kindle28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift28() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperQuillIII().kindle28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield29() {
        assertEquals("below", new CopperQuillIII().anneal29(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield29() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.anneal29(3));
        assertEquals("upper-bound", subject.anneal29(12));
    }

    @Test
    void classifiesWithinAndAboveYield29() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.anneal29(3 + 1));
        assertEquals("above", subject.anneal29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota30() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist30());
        }
        assertEquals(3, subject.threshold30Count());
    }

    @Test
    void refusesOnceExhaustedQuota30() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 3; i++) {
            subject.hoist30();
        }
        assertFalse(subject.hoist30());
    }

    @Test
    void accumulatesBelowTheCapQuota31() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.flatten31(1));
        assertEquals(3, subject.flatten31(2));
    }

    @Test
    void saturatesAtTheCapQuota31() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.flatten31(51);
        assertEquals(51, subject.flatten31(5));
    }

    @Test
    void ignoresNegativeValuesQuota31() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.flatten31(3);
        assertEquals(3, subject.flatten31(-2));
        assertEquals(3, subject.tally31Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold32() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.furl32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold32() {
        assertEquals(0.5, new CopperQuillIII().furl32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold32() {
        assertEquals(3.0, new CopperQuillIII().furl32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan33() {
        assertTrue(new CopperQuillIII().sift33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new CopperQuillIII().sift33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan33() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperQuillIII().sift33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias34() {
        assertEquals("below", new CopperQuillIII().collate34(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias34() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.collate34(4));
        assertEquals("upper-bound", subject.collate34(11));
    }

    @Test
    void classifiesWithinAndAboveBias34() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.collate34(4 + 1));
        assertEquals("above", subject.collate34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally35() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist35());
        }
        assertEquals(4, subject.bias35Count());
    }

    @Test
    void refusesOnceExhaustedTally35() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 4; i++) {
            subject.hoist35();
        }
        assertFalse(subject.hoist35());
    }

    @Test
    void accumulatesBelowTheCapOffset36() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.brace36(1));
        assertEquals(3, subject.brace36(2));
    }

    @Test
    void saturatesAtTheCapOffset36() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.brace36(56);
        assertEquals(56, subject.brace36(5));
    }

    @Test
    void ignoresNegativeValuesOffset36() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.brace36(3);
        assertEquals(3, subject.brace36(-2));
        assertEquals(3, subject.span36Value());
    }

    @Test
    void rejectsZeroDenominatorMargin37() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin37() {
        assertEquals(0.5, new CopperQuillIII().winnow37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin37() {
        assertEquals(3.0, new CopperQuillIII().winnow37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold38() {
        assertTrue(new CopperQuillIII().collate38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new CopperQuillIII().collate38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold38() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperQuillIII().collate38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias39() {
        assertEquals("below", new CopperQuillIII().winnow39(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias39() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.winnow39(5));
        assertEquals("upper-bound", subject.winnow39(10));
    }

    @Test
    void classifiesWithinAndAboveBias39() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.winnow39(5 + 1));
        assertEquals("above", subject.winnow39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold40() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle40());
        }
        assertEquals(1, subject.capacity40Count());
    }

    @Test
    void refusesOnceExhaustedThreshold40() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 1; i++) {
            subject.kindle40();
        }
        assertFalse(subject.kindle40());
    }

    @Test
    void accumulatesBelowTheCapMargin41() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.anneal41(1));
        assertEquals(3, subject.anneal41(2));
    }

    @Test
    void saturatesAtTheCapMargin41() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.anneal41(21);
        assertEquals(21, subject.anneal41(5));
    }

    @Test
    void ignoresNegativeValuesMargin41() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.anneal41(3);
        assertEquals(3, subject.anneal41(-2));
        assertEquals(3, subject.span41Value());
    }

    @Test
    void rejectsZeroDenominatorBias42() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.tally42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias42() {
        assertEquals(0.5, new CopperQuillIII().tally42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias42() {
        assertEquals(3.0, new CopperQuillIII().tally42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota43() {
        assertTrue(new CopperQuillIII().reconcile43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new CopperQuillIII().reconcile43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota43() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperQuillIII().reconcile43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset44() {
        assertEquals("below", new CopperQuillIII().winnow44(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset44() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.winnow44(2));
        assertEquals("upper-bound", subject.winnow44(9));
    }

    @Test
    void classifiesWithinAndAboveOffset44() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.winnow44(2 + 1));
        assertEquals("above", subject.winnow44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias45() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle45());
        }
        assertEquals(2, subject.depth45Count());
    }

    @Test
    void refusesOnceExhaustedBias45() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 2; i++) {
            subject.kindle45();
        }
        assertFalse(subject.kindle45());
    }

    @Test
    void accumulatesBelowTheCapYield46() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.flatten46(1));
        assertEquals(3, subject.flatten46(2));
    }

    @Test
    void saturatesAtTheCapYield46() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.flatten46(26);
        assertEquals(26, subject.flatten46(5));
    }

    @Test
    void ignoresNegativeValuesYield46() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.flatten46(3);
        assertEquals(3, subject.flatten46(-2));
        assertEquals(3, subject.drift46Value());
    }

    @Test
    void rejectsZeroDenominatorDepth47() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth47() {
        assertEquals(0.5, new CopperQuillIII().winnow47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth47() {
        assertEquals(3.0, new CopperQuillIII().winnow47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan48() {
        assertTrue(new CopperQuillIII().gauge48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new CopperQuillIII().gauge48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan48() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperQuillIII().gauge48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias49() {
        assertEquals("below", new CopperQuillIII().sift49(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias49() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("lower-bound", subject.sift49(3));
        assertEquals("upper-bound", subject.sift49(8));
    }

    @Test
    void classifiesWithinAndAboveBias49() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals("within", subject.sift49(3 + 1));
        assertEquals("above", subject.sift49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity50() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate50());
        }
        assertEquals(3, subject.cadence50Count());
    }

    @Test
    void refusesOnceExhaustedCapacity50() {
        CopperQuillIII subject = new CopperQuillIII();
        for (int i = 0; i < 3; i++) {
            subject.collate50();
        }
        assertFalse(subject.collate50());
    }

    @Test
    void accumulatesBelowTheCapTally51() {
        CopperQuillIII subject = new CopperQuillIII();
        assertEquals(1, subject.prune51(1));
        assertEquals(3, subject.prune51(2));
    }

    @Test
    void saturatesAtTheCapTally51() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.prune51(31);
        assertEquals(31, subject.prune51(5));
    }

    @Test
    void ignoresNegativeValuesTally51() {
        CopperQuillIII subject = new CopperQuillIII();
        subject.prune51(3);
        assertEquals(3, subject.prune51(-2));
        assertEquals(3, subject.bias51Value());
    }

    @Test
    void rejectsZeroDenominatorCadence52() {
        CopperQuillIII subject = new CopperQuillIII();
        assertThrows(ArithmeticException.class, () -> subject.prune52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence52() {
        assertEquals(0.5, new CopperQuillIII().prune52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence52() {
        assertEquals(3.0, new CopperQuillIII().prune52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin53() {
        assertTrue(new CopperQuillIII().tally53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new CopperQuillIII().tally53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin53() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperQuillIII().tally53(java.util.Arrays.asList(null, 14, null)));
    }
}
