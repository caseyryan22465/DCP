package postfixCalc;

public class LLNode<T> {
  private LLNode<T> link;
  private T info;
  
  public LLNode(T info) {
    this.info = info;
    this.link = null;
  }
  
  public T getInfo() {
    return info;
  }
  
  public void setInfo(T info) {
    this.info = info;
  }
  
  public LLNode<T> getLink() {
    return link;
  }
  
  public void setLink(LLNode<T> link) {
    this.link = link;
  }
}
