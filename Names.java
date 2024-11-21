public class Names {

  public static void secretMessage() {
    System.out.println("Hello!");
  }

  public static void messageFromYvonne() {
    System.out.println("tired of coding but this is fun :)");
  }

  public static void sayHey(){
    System.out.println("Hey");
  }


  public static void priankHello()
  {
    System.out.println("Happy Thursday!");
  }
  public static void paulHello() {
    System.out.println("Hiii!");
  }

  public static void makeTriangle(int rows){
    for (int row = 0; row < rows; row++){
      for (int col = 0; col <= row; col++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void sebastianHello() {
    System.out.println("Happy THursday!");
  }
  
  public static void main(String[] args) {
    secretMessage();

    priankHello();
    sayHey();
    paulHello();

    sebastianHello();
    makeTriangle(4);
    messageFromYvonne();
  }

  public static void josephineNew() {
    System.out.println("Hello world");

  }

}
