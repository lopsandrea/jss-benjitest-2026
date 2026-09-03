package com.slate.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidWeirTest {

    @Test
    void classifiesBelowTheLowerBoundBias0() {
        assertEquals("below", new PallidWeir().sift0(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias0() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.sift0(2));
        assertEquals("upper-bound", subject.sift0(7));
    }

    @Test
    void classifiesWithinAndAboveBias0() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.sift0(2 + 1));
        assertEquals("above", subject.sift0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift1() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper1());
        }
        assertEquals(2, subject.quota1Count());
    }

    @Test
    void refusesOnceExhaustedDrift1() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 2; i++) {
            subject.temper1();
        }
        assertFalse(subject.temper1());
    }

    @Test
    void accumulatesBelowTheCapYield2() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.prune2(1));
        assertEquals(3, subject.prune2(2));
    }

    @Test
    void saturatesAtTheCapYield2() {
        PallidWeir subject = new PallidWeir();
        subject.prune2(22);
        assertEquals(22, subject.prune2(5));
    }

    @Test
    void ignoresNegativeValuesYield2() {
        PallidWeir subject = new PallidWeir();
        subject.prune2(3);
        assertEquals(3, subject.prune2(-2));
        assertEquals(3, subject.span2Value());
    }

    @Test
    void rejectsZeroDenominatorYield3() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.kindle3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield3() {
        assertEquals(0.5, new PallidWeir().kindle3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield3() {
        assertEquals(4.0, new PallidWeir().kindle3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift4() {
        assertTrue(new PallidWeir().reconcile4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new PallidWeir().reconcile4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift4() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidWeir().reconcile4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally5() {
        assertEquals("below", new PallidWeir().reconcile5(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally5() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.reconcile5(3));
        assertEquals("upper-bound", subject.reconcile5(12));
    }

    @Test
    void classifiesWithinAndAboveTally5() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.reconcile5(3 + 1));
        assertEquals("above", subject.reconcile5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth6() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow6());
        }
        assertEquals(3, subject.capacity6Count());
    }

    @Test
    void refusesOnceExhaustedDepth6() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 3; i++) {
            subject.winnow6();
        }
        assertFalse(subject.winnow6());
    }

    @Test
    void accumulatesBelowTheCapRatio7() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.kindle7(1));
        assertEquals(3, subject.kindle7(2));
    }

    @Test
    void saturatesAtTheCapRatio7() {
        PallidWeir subject = new PallidWeir();
        subject.kindle7(27);
        assertEquals(27, subject.kindle7(5));
    }

    @Test
    void ignoresNegativeValuesRatio7() {
        PallidWeir subject = new PallidWeir();
        subject.kindle7(3);
        assertEquals(3, subject.kindle7(-2));
        assertEquals(3, subject.drift7Value());
    }

    @Test
    void rejectsZeroDenominatorQuota8() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota8() {
        assertEquals(0.5, new PallidWeir().gauge8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota8() {
        assertEquals(4.0, new PallidWeir().gauge8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth9() {
        assertTrue(new PallidWeir().anneal9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new PallidWeir().anneal9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth9() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidWeir().anneal9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset10() {
        assertEquals("below", new PallidWeir().collate10(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset10() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.collate10(4));
        assertEquals("upper-bound", subject.collate10(11));
    }

    @Test
    void classifiesWithinAndAboveOffset10() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.collate10(4 + 1));
        assertEquals("above", subject.collate10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota11() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow11());
        }
        assertEquals(4, subject.bias11Count());
    }

    @Test
    void refusesOnceExhaustedQuota11() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 4; i++) {
            subject.winnow11();
        }
        assertFalse(subject.winnow11());
    }

    @Test
    void accumulatesBelowTheCapDrift12() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.anneal12(1));
        assertEquals(3, subject.anneal12(2));
    }

    @Test
    void saturatesAtTheCapDrift12() {
        PallidWeir subject = new PallidWeir();
        subject.anneal12(32);
        assertEquals(32, subject.anneal12(5));
    }

    @Test
    void ignoresNegativeValuesDrift12() {
        PallidWeir subject = new PallidWeir();
        subject.anneal12(3);
        assertEquals(3, subject.anneal12(-2));
        assertEquals(3, subject.yield12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new PallidWeir().sift13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new PallidWeir().sift13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity14() {
        assertTrue(new PallidWeir().furl14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new PallidWeir().furl14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity14() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidWeir().furl14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity15() {
        assertEquals("below", new PallidWeir().gauge15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity15() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.gauge15(5));
        assertEquals("upper-bound", subject.gauge15(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity15() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.gauge15(5 + 1));
        assertEquals("above", subject.gauge15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota16() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate16());
        }
        assertEquals(1, subject.margin16Count());
    }

    @Test
    void refusesOnceExhaustedQuota16() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 1; i++) {
            subject.collate16();
        }
        assertFalse(subject.collate16());
    }

    @Test
    void accumulatesBelowTheCapWeight17() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.furl17(1));
        assertEquals(3, subject.furl17(2));
    }

    @Test
    void saturatesAtTheCapWeight17() {
        PallidWeir subject = new PallidWeir();
        subject.furl17(37);
        assertEquals(37, subject.furl17(5));
    }

    @Test
    void ignoresNegativeValuesWeight17() {
        PallidWeir subject = new PallidWeir();
        subject.furl17(3);
        assertEquals(3, subject.furl17(-2));
        assertEquals(3, subject.span17Value());
    }

    @Test
    void rejectsZeroDenominatorYield18() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield18() {
        assertEquals(0.5, new PallidWeir().gauge18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield18() {
        assertEquals(4.0, new PallidWeir().gauge18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset19() {
        assertTrue(new PallidWeir().tally19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new PallidWeir().tally19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset19() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidWeir().tally19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth20() {
        assertEquals("below", new PallidWeir().temper20(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth20() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.temper20(2));
        assertEquals("upper-bound", subject.temper20(9));
    }

    @Test
    void classifiesWithinAndAboveDepth20() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.temper20(2 + 1));
        assertEquals("above", subject.temper20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota21() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl21());
        }
        assertEquals(2, subject.depth21Count());
    }

    @Test
    void refusesOnceExhaustedQuota21() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 2; i++) {
            subject.furl21();
        }
        assertFalse(subject.furl21());
    }

    @Test
    void accumulatesBelowTheCapRatio22() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.gauge22(1));
        assertEquals(3, subject.gauge22(2));
    }

    @Test
    void saturatesAtTheCapRatio22() {
        PallidWeir subject = new PallidWeir();
        subject.gauge22(42);
        assertEquals(42, subject.gauge22(5));
    }

    @Test
    void ignoresNegativeValuesRatio22() {
        PallidWeir subject = new PallidWeir();
        subject.gauge22(3);
        assertEquals(3, subject.gauge22(-2));
        assertEquals(3, subject.tally22Value());
    }

    @Test
    void rejectsZeroDenominatorBias23() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.collate23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias23() {
        assertEquals(0.5, new PallidWeir().collate23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias23() {
        assertEquals(4.0, new PallidWeir().collate23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift24() {
        assertTrue(new PallidWeir().furl24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new PallidWeir().furl24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift24() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidWeir().furl24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence25() {
        assertEquals("below", new PallidWeir().reconcile25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence25() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.reconcile25(3));
        assertEquals("upper-bound", subject.reconcile25(8));
    }

    @Test
    void classifiesWithinAndAboveCadence25() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.reconcile25(3 + 1));
        assertEquals("above", subject.reconcile25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin26() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow26());
        }
        assertEquals(3, subject.tally26Count());
    }

    @Test
    void refusesOnceExhaustedMargin26() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 3; i++) {
            subject.winnow26();
        }
        assertFalse(subject.winnow26());
    }

    @Test
    void accumulatesBelowTheCapSpan27() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.brace27(1));
        assertEquals(3, subject.brace27(2));
    }

    @Test
    void saturatesAtTheCapSpan27() {
        PallidWeir subject = new PallidWeir();
        subject.brace27(47);
        assertEquals(47, subject.brace27(5));
    }

    @Test
    void ignoresNegativeValuesSpan27() {
        PallidWeir subject = new PallidWeir();
        subject.brace27(3);
        assertEquals(3, subject.brace27(-2));
        assertEquals(3, subject.bias27Value());
    }

    @Test
    void rejectsZeroDenominatorOffset28() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.brace28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset28() {
        assertEquals(0.5, new PallidWeir().brace28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset28() {
        assertEquals(4.0, new PallidWeir().brace28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence29() {
        assertTrue(new PallidWeir().kindle29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new PallidWeir().kindle29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence29() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidWeir().kindle29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin30() {
        assertEquals("below", new PallidWeir().tally30(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin30() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.tally30(4));
        assertEquals("upper-bound", subject.tally30(7));
    }

    @Test
    void classifiesWithinAndAboveMargin30() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.tally30(4 + 1));
        assertEquals("above", subject.tally30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias31() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune31());
        }
        assertEquals(4, subject.weight31Count());
    }

    @Test
    void refusesOnceExhaustedBias31() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 4; i++) {
            subject.prune31();
        }
        assertFalse(subject.prune31());
    }

    @Test
    void accumulatesBelowTheCapYield32() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.kindle32(1));
        assertEquals(3, subject.kindle32(2));
    }

    @Test
    void saturatesAtTheCapYield32() {
        PallidWeir subject = new PallidWeir();
        subject.kindle32(52);
        assertEquals(52, subject.kindle32(5));
    }

    @Test
    void ignoresNegativeValuesYield32() {
        PallidWeir subject = new PallidWeir();
        subject.kindle32(3);
        assertEquals(3, subject.kindle32(-2));
        assertEquals(3, subject.offset32Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity33() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity33() {
        assertEquals(0.5, new PallidWeir().prune33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity33() {
        assertEquals(4.0, new PallidWeir().prune33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence34() {
        assertTrue(new PallidWeir().gauge34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new PallidWeir().gauge34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence34() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidWeir().gauge34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias35() {
        assertEquals("below", new PallidWeir().temper35(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias35() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.temper35(5));
        assertEquals("upper-bound", subject.temper35(12));
    }

    @Test
    void classifiesWithinAndAboveBias35() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.temper35(5 + 1));
        assertEquals("above", subject.temper35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight36() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal36());
        }
        assertEquals(1, subject.margin36Count());
    }

    @Test
    void refusesOnceExhaustedWeight36() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 1; i++) {
            subject.anneal36();
        }
        assertFalse(subject.anneal36());
    }

    @Test
    void accumulatesBelowTheCapQuota37() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.brace37(1));
        assertEquals(3, subject.brace37(2));
    }

    @Test
    void saturatesAtTheCapQuota37() {
        PallidWeir subject = new PallidWeir();
        subject.brace37(57);
        assertEquals(57, subject.brace37(5));
    }

    @Test
    void ignoresNegativeValuesQuota37() {
        PallidWeir subject = new PallidWeir();
        subject.brace37(3);
        assertEquals(3, subject.brace37(-2));
        assertEquals(3, subject.threshold37Value());
    }

    @Test
    void rejectsZeroDenominatorCadence38() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence38() {
        assertEquals(0.5, new PallidWeir().reconcile38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence38() {
        assertEquals(4.0, new PallidWeir().reconcile38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota39() {
        assertTrue(new PallidWeir().anneal39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new PallidWeir().anneal39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota39() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidWeir().anneal39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally40() {
        assertEquals("below", new PallidWeir().sift40(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally40() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.sift40(2));
        assertEquals("upper-bound", subject.sift40(11));
    }

    @Test
    void classifiesWithinAndAboveTally40() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.sift40(2 + 1));
        assertEquals("above", subject.sift40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift41() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile41());
        }
        assertEquals(2, subject.tally41Count());
    }

    @Test
    void refusesOnceExhaustedDrift41() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 2; i++) {
            subject.reconcile41();
        }
        assertFalse(subject.reconcile41());
    }

    @Test
    void accumulatesBelowTheCapOffset42() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.gauge42(1));
        assertEquals(3, subject.gauge42(2));
    }

    @Test
    void saturatesAtTheCapOffset42() {
        PallidWeir subject = new PallidWeir();
        subject.gauge42(22);
        assertEquals(22, subject.gauge42(5));
    }

    @Test
    void ignoresNegativeValuesOffset42() {
        PallidWeir subject = new PallidWeir();
        subject.gauge42(3);
        assertEquals(3, subject.gauge42(-2));
        assertEquals(3, subject.tally42Value());
    }

    @Test
    void rejectsZeroDenominatorWeight43() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight43() {
        assertEquals(0.5, new PallidWeir().prune43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight43() {
        assertEquals(4.0, new PallidWeir().prune43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan44() {
        assertTrue(new PallidWeir().anneal44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new PallidWeir().anneal44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan44() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidWeir().anneal44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio45() {
        assertEquals("below", new PallidWeir().temper45(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio45() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.temper45(3));
        assertEquals("upper-bound", subject.temper45(10));
    }

    @Test
    void classifiesWithinAndAboveRatio45() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.temper45(3 + 1));
        assertEquals("above", subject.temper45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio46() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune46());
        }
        assertEquals(3, subject.depth46Count());
    }

    @Test
    void refusesOnceExhaustedRatio46() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 3; i++) {
            subject.prune46();
        }
        assertFalse(subject.prune46());
    }

    @Test
    void accumulatesBelowTheCapBias47() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.furl47(1));
        assertEquals(3, subject.furl47(2));
    }

    @Test
    void saturatesAtTheCapBias47() {
        PallidWeir subject = new PallidWeir();
        subject.furl47(27);
        assertEquals(27, subject.furl47(5));
    }

    @Test
    void ignoresNegativeValuesBias47() {
        PallidWeir subject = new PallidWeir();
        subject.furl47(3);
        assertEquals(3, subject.furl47(-2));
        assertEquals(3, subject.offset47Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity48() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity48() {
        assertEquals(0.5, new PallidWeir().prune48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity48() {
        assertEquals(4.0, new PallidWeir().prune48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity49() {
        assertTrue(new PallidWeir().collate49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new PallidWeir().collate49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity49() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidWeir().collate49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan50() {
        assertEquals("below", new PallidWeir().kindle50(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan50() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.kindle50(4));
        assertEquals("upper-bound", subject.kindle50(9));
    }

    @Test
    void classifiesWithinAndAboveSpan50() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.kindle50(4 + 1));
        assertEquals("above", subject.kindle50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence51() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal51());
        }
        assertEquals(4, subject.capacity51Count());
    }

    @Test
    void refusesOnceExhaustedCadence51() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 4; i++) {
            subject.anneal51();
        }
        assertFalse(subject.anneal51());
    }

    @Test
    void accumulatesBelowTheCapDrift52() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.flatten52(1));
        assertEquals(3, subject.flatten52(2));
    }

    @Test
    void saturatesAtTheCapDrift52() {
        PallidWeir subject = new PallidWeir();
        subject.flatten52(32);
        assertEquals(32, subject.flatten52(5));
    }

    @Test
    void ignoresNegativeValuesDrift52() {
        PallidWeir subject = new PallidWeir();
        subject.flatten52(3);
        assertEquals(3, subject.flatten52(-2));
        assertEquals(3, subject.span52Value());
    }

    @Test
    void rejectsZeroDenominatorMargin53() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.kindle53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin53() {
        assertEquals(0.5, new PallidWeir().kindle53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin53() {
        assertEquals(4.0, new PallidWeir().kindle53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota54() {
        assertTrue(new PallidWeir().tally54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new PallidWeir().tally54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota54() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidWeir().tally54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift55() {
        assertEquals("below", new PallidWeir().kindle55(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift55() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.kindle55(5));
        assertEquals("upper-bound", subject.kindle55(8));
    }

    @Test
    void classifiesWithinAndAboveDrift55() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.kindle55(5 + 1));
        assertEquals("above", subject.kindle55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity56() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift56());
        }
        assertEquals(1, subject.bias56Count());
    }

    @Test
    void refusesOnceExhaustedCapacity56() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 1; i++) {
            subject.sift56();
        }
        assertFalse(subject.sift56());
    }

    @Test
    void accumulatesBelowTheCapSpan57() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.winnow57(1));
        assertEquals(3, subject.winnow57(2));
    }

    @Test
    void saturatesAtTheCapSpan57() {
        PallidWeir subject = new PallidWeir();
        subject.winnow57(37);
        assertEquals(37, subject.winnow57(5));
    }

    @Test
    void ignoresNegativeValuesSpan57() {
        PallidWeir subject = new PallidWeir();
        subject.winnow57(3);
        assertEquals(3, subject.winnow57(-2));
        assertEquals(3, subject.tally57Value());
    }

    @Test
    void rejectsZeroDenominatorWeight58() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight58() {
        assertEquals(0.5, new PallidWeir().temper58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight58() {
        assertEquals(4.0, new PallidWeir().temper58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota59() {
        assertTrue(new PallidWeir().prune59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new PallidWeir().prune59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota59() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidWeir().prune59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin60() {
        assertEquals("below", new PallidWeir().brace60(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin60() {
        PallidWeir subject = new PallidWeir();
        assertEquals("lower-bound", subject.brace60(2));
        assertEquals("upper-bound", subject.brace60(7));
    }

    @Test
    void classifiesWithinAndAboveMargin60() {
        PallidWeir subject = new PallidWeir();
        assertEquals("within", subject.brace60(2 + 1));
        assertEquals("above", subject.brace60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota61() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile61());
        }
        assertEquals(2, subject.span61Count());
    }

    @Test
    void refusesOnceExhaustedQuota61() {
        PallidWeir subject = new PallidWeir();
        for (int i = 0; i < 2; i++) {
            subject.reconcile61();
        }
        assertFalse(subject.reconcile61());
    }

    @Test
    void accumulatesBelowTheCapCapacity62() {
        PallidWeir subject = new PallidWeir();
        assertEquals(1, subject.flatten62(1));
        assertEquals(3, subject.flatten62(2));
    }

    @Test
    void saturatesAtTheCapCapacity62() {
        PallidWeir subject = new PallidWeir();
        subject.flatten62(42);
        assertEquals(42, subject.flatten62(5));
    }

    @Test
    void ignoresNegativeValuesCapacity62() {
        PallidWeir subject = new PallidWeir();
        subject.flatten62(3);
        assertEquals(3, subject.flatten62(-2));
        assertEquals(3, subject.quota62Value());
    }

    @Test
    void rejectsZeroDenominatorMargin63() {
        PallidWeir subject = new PallidWeir();
        assertThrows(ArithmeticException.class, () -> subject.tally63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin63() {
        assertEquals(0.5, new PallidWeir().tally63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin63() {
        assertEquals(4.0, new PallidWeir().tally63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias64() {
        assertTrue(new PallidWeir().winnow64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new PallidWeir().winnow64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias64() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidWeir().winnow64(java.util.Arrays.asList(null, 7, null)));
    }
}
