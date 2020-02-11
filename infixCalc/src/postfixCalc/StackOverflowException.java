package postfixCalc;

public class StackOverflowException extends Exception {
  public StackOverflowException(String errorMsg) {
    super(errorMsg);
  }
}
