package multArray;

import java.util.Scanner;

public class multArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] inArr;
    int[] outArr;
    int size;
    System.out.print("Array size: ");
    Scanner scnr = new Scanner(System.in);
    size = scnr.nextInt();
    inArr = new int[size];
    outArr = new int[size];
    System.out.println("Input all the array elements");
    for(int i = 0; i < size; i++) {
      inArr[i] = scnr.nextInt();
    }
    scnr.close();
    for(int i = 0; i < size; i++) {
      int index = 1;
      for(int j = 0; j < size; j++) {
          if(j==i) {
            //do nothing
          }
          else {
            index *= inArr[j];
          }
      }
      outArr[i] = index;
      }
    
    for(int i = 0; i < size; i++) {
      System.out.println(outArr[i]);
    }
    

  }

}
