package postfixCalc;

public class LinkedStack<T> implements StackInterface<T>{
  
  private LLNode<T> top;
  
  public LinkedStack() {
    top = null;
  }
  
  public void push(T element) {
    LLNode<T> node = new LLNode<T>(element);
    node.setLink(top);
    top = node;
  }
  
  public T pop() throws StackUnderflowException {
    if(isEmpty()) {
      throw new StackUnderflowException("underflow");
    }
    LLNode<T> temp = top;
    top = top.getLink();
    return temp.getInfo();
  }
  
  public T peek() throws StackUnderflowException {
    if(isEmpty()) {
      throw new StackUnderflowException("underflow");
    }
    return top.getInfo();
  }
  
  public boolean isEmpty() {
    return(top == null);
  }

}
