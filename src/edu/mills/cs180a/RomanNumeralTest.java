package edu.mills.cs180a;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RomanNumeralTest {
  private static RomanNumeral rnX;

  @BeforeAll
  public static void setup() {
    rnX = new RomanNumeral("X");
  }

  @Test
  public void equals_True_XX() {
    RomanNumeral rn2 = new RomanNumeral("X");
    assertEquals(rnX, rn2);
  }

  @Test
  public void equals_False_X10() {
    // Integer i = new Integer(10);
    Integer i = Integer.valueOf(10);
    assertNotEquals(rnX, i);
  }

  @Test
  public void equals_IsReflexive_BHamrick() {
    assertTrue(rnX.equals(rnX));
  }

  public void equals_IsTransitive_BHamrick() {
    RomanNumeral x = new RomanNumeral("IV");
    RomanNumeral y = new RomanNumeral("IV");
    RomanNumeral z = new RomanNumeral("IV");

    assertTrue(x.equals(y) | y.equals(z) | x.equals(z));
  }
}
