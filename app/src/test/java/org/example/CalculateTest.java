package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    // 2と3の和が5であることをテスト
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(2, 3));
    }

    // 2と3の平均が2.5であることをテスト
    @Test
    public void testAverage() {
        Calculate calculate = new Calculate();
        double expected = 2.5;
        // 小数点のテストでは、誤差(delta)の指定が必要です
        assertEquals(expected, calculate.average(2, 3), 0.001);
    }

    // 1から10の合計が55であることをテスト
    @Test
    public void testSumOfRange() {
        Calculate calculate = new Calculate();
        int expected = 55;
        assertEquals(expected, calculate.sumOfRange(1, 10));
    }
    
    // 1から10の平均が5.5であることをテスト
    @Test
    public void testAverageOfRange() {
        Calculate calculate = new Calculate();
        double expected = 5.5;
        assertEquals(expected, calculate.averageOfRange(1, 10), 0.001);
    }

    // 1から10の奇数の合計が25であることをテスト
    @Test
    public void testSumOfOdd() {
        Calculate calculate = new Calculate();
        int expected = 25;
        assertEquals(expected, calculate.sumOfOdd(1, 10));
    }

    // 1から10の偶数の合計が30であることをテスト
    @Test
    public void testSumOfEven() {
        Calculate calculate = new Calculate();
        int expected = 30;
        assertEquals(expected, calculate.sumOfEven(1, 10));
    }
}