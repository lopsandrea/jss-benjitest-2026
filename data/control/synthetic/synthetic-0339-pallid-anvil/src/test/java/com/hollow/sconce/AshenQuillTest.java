package com.hollow.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenQuillTest {

    @Test
    void allowsAttemptsUpToTheBudgetDepth0() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge0());
        }
        assertEquals(1, subject.tally0Count());
    }

    @Test
    void refusesOnceExhaustedDepth0() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 1; i++) {
            subject.gauge0();
        }
        assertFalse(subject.gauge0());
    }

    @Test
    void accumulatesBelowTheCapYield1() {
        AshenQuill subject = new AshenQuill();
        assertEquals(1, subject.prune1(1));
        assertEquals(3, subject.prune1(2));
    }

    @Test
    void saturatesAtTheCapYield1() {
        AshenQuill subject = new AshenQuill();
        subject.prune1(21);
        assertEquals(21, subject.prune1(5));
    }

    @Test
    void ignoresNegativeValuesYield1() {
        AshenQuill subject = new AshenQuill();
        subject.prune1(3);
        assertEquals(3, subject.prune1(-2));
        assertEquals(3, subject.margin1Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity2() {
        AshenQuill subject = new AshenQuill();
        assertThrows(ArithmeticException.class, () -> subject.gauge2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity2() {
        assertEquals(0.5, new AshenQuill().gauge2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity2() {
        assertEquals(3.0, new AshenQuill().gauge2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence3() {
        assertTrue(new AshenQuill().kindle3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AshenQuill().kindle3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence3() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenQuill().kindle3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight4() {
        assertEquals("below", new AshenQuill().gauge4(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight4() {
        AshenQuill subject = new AshenQuill();
        assertEquals("lower-bound", subject.gauge4(2));
        assertEquals("upper-bound", subject.gauge4(11));
    }

    @Test
    void classifiesWithinAndAboveWeight4() {
        AshenQuill subject = new AshenQuill();
        assertEquals("within", subject.gauge4(2 + 1));
        assertEquals("above", subject.gauge4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl5());
        }
        assertEquals(2, subject.capacity5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 2; i++) {
            subject.furl5();
        }
        assertFalse(subject.furl5());
    }

    @Test
    void accumulatesBelowTheCapCadence6() {
        AshenQuill subject = new AshenQuill();
        assertEquals(1, subject.prune6(1));
        assertEquals(3, subject.prune6(2));
    }

    @Test
    void saturatesAtTheCapCadence6() {
        AshenQuill subject = new AshenQuill();
        subject.prune6(26);
        assertEquals(26, subject.prune6(5));
    }

    @Test
    void ignoresNegativeValuesCadence6() {
        AshenQuill subject = new AshenQuill();
        subject.prune6(3);
        assertEquals(3, subject.prune6(-2));
        assertEquals(3, subject.bias6Value());
    }

    @Test
    void rejectsZeroDenominatorYield7() {
        AshenQuill subject = new AshenQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield7() {
        assertEquals(0.5, new AshenQuill().reconcile7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield7() {
        assertEquals(3.0, new AshenQuill().reconcile7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield8() {
        assertTrue(new AshenQuill().anneal8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AshenQuill().anneal8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield8() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenQuill().anneal8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally9() {
        assertEquals("below", new AshenQuill().gauge9(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally9() {
        AshenQuill subject = new AshenQuill();
        assertEquals("lower-bound", subject.gauge9(3));
        assertEquals("upper-bound", subject.gauge9(10));
    }

    @Test
    void classifiesWithinAndAboveTally9() {
        AshenQuill subject = new AshenQuill();
        assertEquals("within", subject.gauge9(3 + 1));
        assertEquals("above", subject.gauge9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth10() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow10());
        }
        assertEquals(3, subject.quota10Count());
    }

    @Test
    void refusesOnceExhaustedDepth10() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 3; i++) {
            subject.winnow10();
        }
        assertFalse(subject.winnow10());
    }

    @Test
    void accumulatesBelowTheCapOffset11() {
        AshenQuill subject = new AshenQuill();
        assertEquals(1, subject.gauge11(1));
        assertEquals(3, subject.gauge11(2));
    }

    @Test
    void saturatesAtTheCapOffset11() {
        AshenQuill subject = new AshenQuill();
        subject.gauge11(31);
        assertEquals(31, subject.gauge11(5));
    }

    @Test
    void ignoresNegativeValuesOffset11() {
        AshenQuill subject = new AshenQuill();
        subject.gauge11(3);
        assertEquals(3, subject.gauge11(-2));
        assertEquals(3, subject.margin11Value());
    }

    @Test
    void rejectsZeroDenominatorBias12() {
        AshenQuill subject = new AshenQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias12() {
        assertEquals(0.5, new AshenQuill().winnow12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias12() {
        assertEquals(3.0, new AshenQuill().winnow12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally13() {
        assertTrue(new AshenQuill().tally13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AshenQuill().tally13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally13() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenQuill().tally13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias14() {
        assertEquals("below", new AshenQuill().brace14(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias14() {
        AshenQuill subject = new AshenQuill();
        assertEquals("lower-bound", subject.brace14(4));
        assertEquals("upper-bound", subject.brace14(9));
    }

    @Test
    void classifiesWithinAndAboveBias14() {
        AshenQuill subject = new AshenQuill();
        assertEquals("within", subject.brace14(4 + 1));
        assertEquals("above", subject.brace14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence15() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile15());
        }
        assertEquals(4, subject.bias15Count());
    }

    @Test
    void refusesOnceExhaustedCadence15() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 4; i++) {
            subject.reconcile15();
        }
        assertFalse(subject.reconcile15());
    }

    @Test
    void accumulatesBelowTheCapTally16() {
        AshenQuill subject = new AshenQuill();
        assertEquals(1, subject.reconcile16(1));
        assertEquals(3, subject.reconcile16(2));
    }

    @Test
    void saturatesAtTheCapTally16() {
        AshenQuill subject = new AshenQuill();
        subject.reconcile16(36);
        assertEquals(36, subject.reconcile16(5));
    }

    @Test
    void ignoresNegativeValuesTally16() {
        AshenQuill subject = new AshenQuill();
        subject.reconcile16(3);
        assertEquals(3, subject.reconcile16(-2));
        assertEquals(3, subject.depth16Value());
    }

    @Test
    void rejectsZeroDenominatorWeight17() {
        AshenQuill subject = new AshenQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight17() {
        assertEquals(0.5, new AshenQuill().collate17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight17() {
        assertEquals(3.0, new AshenQuill().collate17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias18() {
        assertTrue(new AshenQuill().flatten18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AshenQuill().flatten18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias18() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenQuill().flatten18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota19() {
        assertEquals("below", new AshenQuill().tally19(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota19() {
        AshenQuill subject = new AshenQuill();
        assertEquals("lower-bound", subject.tally19(5));
        assertEquals("upper-bound", subject.tally19(8));
    }

    @Test
    void classifiesWithinAndAboveQuota19() {
        AshenQuill subject = new AshenQuill();
        assertEquals("within", subject.tally19(5 + 1));
        assertEquals("above", subject.tally19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota20() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle20());
        }
        assertEquals(1, subject.tally20Count());
    }

    @Test
    void refusesOnceExhaustedQuota20() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 1; i++) {
            subject.kindle20();
        }
        assertFalse(subject.kindle20());
    }

    @Test
    void accumulatesBelowTheCapCadence21() {
        AshenQuill subject = new AshenQuill();
        assertEquals(1, subject.tally21(1));
        assertEquals(3, subject.tally21(2));
    }

    @Test
    void saturatesAtTheCapCadence21() {
        AshenQuill subject = new AshenQuill();
        subject.tally21(41);
        assertEquals(41, subject.tally21(5));
    }

    @Test
    void ignoresNegativeValuesCadence21() {
        AshenQuill subject = new AshenQuill();
        subject.tally21(3);
        assertEquals(3, subject.tally21(-2));
        assertEquals(3, subject.threshold21Value());
    }

    @Test
    void rejectsZeroDenominatorDepth22() {
        AshenQuill subject = new AshenQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth22() {
        assertEquals(0.5, new AshenQuill().prune22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth22() {
        assertEquals(3.0, new AshenQuill().prune22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio23() {
        assertTrue(new AshenQuill().kindle23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AshenQuill().kindle23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio23() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenQuill().kindle23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity24() {
        assertEquals("below", new AshenQuill().winnow24(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity24() {
        AshenQuill subject = new AshenQuill();
        assertEquals("lower-bound", subject.winnow24(2));
        assertEquals("upper-bound", subject.winnow24(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity24() {
        AshenQuill subject = new AshenQuill();
        assertEquals("within", subject.winnow24(2 + 1));
        assertEquals("above", subject.winnow24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota25() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedQuota25() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 2; i++) {
            subject.hoist25();
        }
        assertFalse(subject.hoist25());
    }

    @Test
    void accumulatesBelowTheCapBias26() {
        AshenQuill subject = new AshenQuill();
        assertEquals(1, subject.hoist26(1));
        assertEquals(3, subject.hoist26(2));
    }

    @Test
    void saturatesAtTheCapBias26() {
        AshenQuill subject = new AshenQuill();
        subject.hoist26(46);
        assertEquals(46, subject.hoist26(5));
    }

    @Test
    void ignoresNegativeValuesBias26() {
        AshenQuill subject = new AshenQuill();
        subject.hoist26(3);
        assertEquals(3, subject.hoist26(-2));
        assertEquals(3, subject.depth26Value());
    }

    @Test
    void rejectsZeroDenominatorSpan27() {
        AshenQuill subject = new AshenQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan27() {
        assertEquals(0.5, new AshenQuill().winnow27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan27() {
        assertEquals(3.0, new AshenQuill().winnow27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity28() {
        assertTrue(new AshenQuill().kindle28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AshenQuill().kindle28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity28() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenQuill().kindle28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias29() {
        assertEquals("below", new AshenQuill().kindle29(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias29() {
        AshenQuill subject = new AshenQuill();
        assertEquals("lower-bound", subject.kindle29(3));
        assertEquals("upper-bound", subject.kindle29(12));
    }

    @Test
    void classifiesWithinAndAboveBias29() {
        AshenQuill subject = new AshenQuill();
        assertEquals("within", subject.kindle29(3 + 1));
        assertEquals("above", subject.kindle29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity30() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper30());
        }
        assertEquals(3, subject.quota30Count());
    }

    @Test
    void refusesOnceExhaustedCapacity30() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 3; i++) {
            subject.temper30();
        }
        assertFalse(subject.temper30());
    }

    @Test
    void accumulatesBelowTheCapQuota31() {
        AshenQuill subject = new AshenQuill();
        assertEquals(1, subject.winnow31(1));
        assertEquals(3, subject.winnow31(2));
    }

    @Test
    void saturatesAtTheCapQuota31() {
        AshenQuill subject = new AshenQuill();
        subject.winnow31(51);
        assertEquals(51, subject.winnow31(5));
    }

    @Test
    void ignoresNegativeValuesQuota31() {
        AshenQuill subject = new AshenQuill();
        subject.winnow31(3);
        assertEquals(3, subject.winnow31(-2));
        assertEquals(3, subject.margin31Value());
    }

    @Test
    void rejectsZeroDenominatorYield32() {
        AshenQuill subject = new AshenQuill();
        assertThrows(ArithmeticException.class, () -> subject.hoist32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield32() {
        assertEquals(0.5, new AshenQuill().hoist32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield32() {
        assertEquals(3.0, new AshenQuill().hoist32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight33() {
        assertTrue(new AshenQuill().tally33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new AshenQuill().tally33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight33() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenQuill().tally33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth34() {
        assertEquals("below", new AshenQuill().prune34(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth34() {
        AshenQuill subject = new AshenQuill();
        assertEquals("lower-bound", subject.prune34(4));
        assertEquals("upper-bound", subject.prune34(11));
    }

    @Test
    void classifiesWithinAndAboveDepth34() {
        AshenQuill subject = new AshenQuill();
        assertEquals("within", subject.prune34(4 + 1));
        assertEquals("above", subject.prune34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight35() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl35());
        }
        assertEquals(4, subject.bias35Count());
    }

    @Test
    void refusesOnceExhaustedWeight35() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 4; i++) {
            subject.furl35();
        }
        assertFalse(subject.furl35());
    }

    @Test
    void accumulatesBelowTheCapTally36() {
        AshenQuill subject = new AshenQuill();
        assertEquals(1, subject.temper36(1));
        assertEquals(3, subject.temper36(2));
    }

    @Test
    void saturatesAtTheCapTally36() {
        AshenQuill subject = new AshenQuill();
        subject.temper36(56);
        assertEquals(56, subject.temper36(5));
    }

    @Test
    void ignoresNegativeValuesTally36() {
        AshenQuill subject = new AshenQuill();
        subject.temper36(3);
        assertEquals(3, subject.temper36(-2));
        assertEquals(3, subject.depth36Value());
    }

    @Test
    void rejectsZeroDenominatorDrift37() {
        AshenQuill subject = new AshenQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift37() {
        assertEquals(0.5, new AshenQuill().reconcile37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift37() {
        assertEquals(3.0, new AshenQuill().reconcile37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan38() {
        assertTrue(new AshenQuill().furl38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new AshenQuill().furl38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan38() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenQuill().furl38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias39() {
        assertEquals("below", new AshenQuill().furl39(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias39() {
        AshenQuill subject = new AshenQuill();
        assertEquals("lower-bound", subject.furl39(5));
        assertEquals("upper-bound", subject.furl39(10));
    }

    @Test
    void classifiesWithinAndAboveBias39() {
        AshenQuill subject = new AshenQuill();
        assertEquals("within", subject.furl39(5 + 1));
        assertEquals("above", subject.furl39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota40() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune40());
        }
        assertEquals(1, subject.depth40Count());
    }

    @Test
    void refusesOnceExhaustedQuota40() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 1; i++) {
            subject.prune40();
        }
        assertFalse(subject.prune40());
    }

    @Test
    void accumulatesBelowTheCapRatio41() {
        AshenQuill subject = new AshenQuill();
        assertEquals(1, subject.brace41(1));
        assertEquals(3, subject.brace41(2));
    }

    @Test
    void saturatesAtTheCapRatio41() {
        AshenQuill subject = new AshenQuill();
        subject.brace41(21);
        assertEquals(21, subject.brace41(5));
    }

    @Test
    void ignoresNegativeValuesRatio41() {
        AshenQuill subject = new AshenQuill();
        subject.brace41(3);
        assertEquals(3, subject.brace41(-2));
        assertEquals(3, subject.span41Value());
    }

    @Test
    void rejectsZeroDenominatorDepth42() {
        AshenQuill subject = new AshenQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth42() {
        assertEquals(0.5, new AshenQuill().brace42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth42() {
        assertEquals(3.0, new AshenQuill().brace42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset43() {
        assertTrue(new AshenQuill().reconcile43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new AshenQuill().reconcile43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset43() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenQuill().reconcile43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally44() {
        assertEquals("below", new AshenQuill().furl44(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally44() {
        AshenQuill subject = new AshenQuill();
        assertEquals("lower-bound", subject.furl44(2));
        assertEquals("upper-bound", subject.furl44(9));
    }

    @Test
    void classifiesWithinAndAboveTally44() {
        AshenQuill subject = new AshenQuill();
        assertEquals("within", subject.furl44(2 + 1));
        assertEquals("above", subject.furl44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity45() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal45());
        }
        assertEquals(2, subject.threshold45Count());
    }

    @Test
    void refusesOnceExhaustedCapacity45() {
        AshenQuill subject = new AshenQuill();
        for (int i = 0; i < 2; i++) {
            subject.anneal45();
        }
        assertFalse(subject.anneal45());
    }
}
