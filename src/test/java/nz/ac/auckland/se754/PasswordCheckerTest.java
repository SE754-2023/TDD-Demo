package nz.ac.auckland.se754;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * USER STORY:
 * <p>
 * As a user, I am required to enter a strong password when creating my account.
 * <p>
 * ACCEPTANCE CRITERIA
 * <p>
 * - Each acceptance criterion should be independently testable
 * <p>
 * - Each acceptance criterion test should have a clear pass/fail result
 * <p>
 * -  Acceptance criteria should be focused on the end result (functionality), not the mechanism
 * through which it is achieved
 * <p>
 * Requirements of password
 * <p>
 * Must have at least 8 characters cannot contain the name of the user
 * <p>
 * ACs * <p> - A user should be able to set a password of at least 8 characters [POSITIVE]
 * <p>
 * - A user should not be able to set a password of less than 8 characters [NEGATIVE]
 * <p>
 * .....
 */
public class PasswordCheckerTest {

  //  A user should be able to set a password of at least 8 characters [POSITIVE]
  @Test
  public void When_PwdAtLeast8Characters_Expect_Accepted
  () {
    //arrange
    PasswordChecker checker = new PasswordChecker();
    // act
    boolean result = checker.isValid("12345678");
    // assert
    assertTrue(result);
  }


}