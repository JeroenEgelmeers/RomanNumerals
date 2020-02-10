package roman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
  private void assertAdd(String left, String right, String expectedResult) {
    String result = RomanNumerals.add(left, right);
    assertEquals(expectedResult, result);
  }

  @Test
  public void testOnePlusOne() {
    assertAdd("I", "I", "II");
  }

  @Test
  public void testOnePlusThree() {
    assertAdd("I", "III", "IV");
  }

  @Test
  public void testThreePlusTwo() {
    assertAdd("III", "II", "V");
  }

  @Test
  public void testThreePlusThree() {
    assertAdd("III", "III", "VI");
  }

  @Test
  public void testFivePlusFivePlus() {
    assertAdd("V", "V", "X");
  }

  @Test
  public void testTenPlusFour() {
    assertAdd("X", "IV", "XIV");
  }

  @Test
  public void testEightPlusThree() {
    assertAdd("VIII", "III", "XI");
  }

  @Test
  public void testSevenPlusTwo() {
    assertAdd("VII", "II", "IX");
  }

  @Test
  public void testTwoPlusSeven() {
    assertAdd("II", "VII", "IX");
  }

  @Test
  public void testToI() {
    assertEquals("I", RomanNumerals.toI("I"));
    assertEquals("II", RomanNumerals.toI("II"));
    assertEquals("IIIII", RomanNumerals.toI("V"));
  }
}
