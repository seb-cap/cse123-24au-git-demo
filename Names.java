public class Names {

  public static void secretMessage() {
    System.out.println("Hello!");
  }

  public static void makeTriangle(int rows){
    for (int row = 0; row < rows; row++){
      for (int col = 0; col <= row; col++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    secretMessage();
    makeTriangle(4);
  }
}
