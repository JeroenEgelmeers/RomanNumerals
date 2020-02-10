package roman;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsNewTest {
  // Minus tests
  @Test
  public void test_minus_OneMinusOne() { assertMin("I", "I", ""); }

  @Test
  public void test_minus_ThreeMinusTwo() { assertMin("III", "II", "I"); }

  @Test
  public void test_minus_FiveMinusOne() { assertMin("V", "I", "IV"); }

  @Test
  public void test_minus_TenMinusThree() { assertMin("X", "III", "VII"); }

  @Test
  public void test_minus_TwelveMinusTwo() { assertMin("XII", "II", "X"); }

  // Plus tests
  @Test
  public void test_plus_OnePlusOne() {
    assertPlus("I", "I", "II");
  }

  @Test
  public void test_plus_OnePlusThree() {
    assertPlus("I", "III", "IV");
  }

  @Test
  public void test_plus_ThreePlusTwo() {
    assertPlus("III", "II", "V");
  }

  @Test
  public void test_plus_ThreePlusThree() {
    assertPlus("III", "III", "VI");
  }

  @Test
  public void test_plus_FivePlusOne() {
    assertPlus("V", "I", "VI");
  }

  @Test
  public void test_plus_FivePlusFive() {
    assertPlus("V", "V", "X");
  }

  @Test
  public void test_plus_TenPlusFour() { assertPlus("X", "IV", "XIV"); }

  @Test
  public void test_plus_EightPlusThree() {
    assertPlus("VIII", "III", "XI");
  }

  @Test
  public void test_plus_SevenPlusTwo() {
    assertPlus("VII", "II", "IX");
  }

  @Test
  public void test_plus_TwoPlusSeven() {  assertPlus("II", "VII", "IX"); }

  // Multiply tests
  @Test
  public void test_multiply_OneMultiplyOne() { assertMultiply("I", "I", "I"); }

  @Test
  public void test_multiply_OneMultiplyFive() { assertMultiply("I", "V", "V"); }

  @Test
  public void test_multiply_FiveMultiplyFive() { assertMultiply("V", "V", "XXV"); }

  @Test
  public void test_multiply_EightMultiplyFour() { assertMultiply("VIII", "IV", "XXXII"); }


  // Divide tests
  @Test
  public void test_divide_ThreeDivideOne() { assertDivide("III", "I", "III"); }

  @Test
  public void test_divide_FiveDivideThree() { assertDivide("V", "I", "V");  }

  @Test
  public void test_divide_TenDivideFour() { assertDivide("X", "IV", "II"); }

  @Test
  public void test_divide_TwentyDivideThree() { assertDivide("XX", "III", "VI"); }

  // Supporting methods
  private void assertPlus(String left, String right, String expectedResult) {
    String result = RomanNumeralsNew.plus(left, right);
    assertEquals(expectedResult, result);
  }
  private void assertMin(String left, String right, String expectedResult) {
    String result = RomanNumeralsNew.minus(left, right);
    assertEquals(expectedResult, result);
  }
  private void assertMultiply(String left, String right, String expectedResult) {
    String result = RomanNumeralsNew.multiply(left, right);
    assertEquals(expectedResult, result);
  }
  private void assertDivide(String left, String right, String expectedResult) {
    String result = RomanNumeralsNew.divide(left, right);
    assertEquals(expectedResult, result);
  }
}
