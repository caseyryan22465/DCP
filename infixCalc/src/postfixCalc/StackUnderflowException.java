package postfixCalc;

public class StackUnderflowException extends Exception {
  public StackUnderflowException(String errorMsg) {
    super(errorMsg);
  }
}
