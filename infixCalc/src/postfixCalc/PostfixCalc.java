package postfixCalc;

import java.util.Scanner;

public class PostfixCalc {
  
  public static void main(String[] args) throws StackUnderflowException {
    String curString = "";
    Scanner scnr = new Scanner(System.in);
    
    LinkedStack<Double> doubleStack = new LinkedStack<Double>();
    System.out.println("Type each operand/operator of your postfix expression, followed by an enter. Mark the end of the expression with a semicolon (;)");
    while(!curString.equals(";")) {//TODO: Change to one string of input, and a curChar going through each part of expression, using spaces to separate
      curString = scnr.nextLine();
      switch(curString) {
      case "+":
        doubleStack.push(doubleStack.pop() + doubleStack.pop());
        break;
      case "-":
        double subNum1 = doubleStack.pop();
        double subNum2 = doubleStack.pop();
        doubleStack.push(subNum2 - subNum1);//have to do this because order matters here
        break;
      case "*":
        doubleStack.push(doubleStack.pop() * doubleStack.pop());
        break;
      case "/":
        double divNum1 = doubleStack.pop();
        double divNum2 = doubleStack.pop();
        doubleStack.push(divNum2 / divNum1);//have to do this because order matters here
        break;
      case ";":
        scnr.close();
        break;
      default:
        doubleStack.push(Double.parseDouble(curString));
      } 
     }
    System.out.println(doubleStack.peek());
    }
  }
  //TODO: Functionality: auto convert from infix to postfix, and vice versa

