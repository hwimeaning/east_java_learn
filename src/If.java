public class If {
  public static void main(String[] args) {
    int a = 3;
    int b = 3;

    //if문
    if (a > b) {
      System.out.println("a is greater than b.");
    } else if (a == b) {
      System.out.println("a and b are equal.");
    } else {
      System.out.println("a is less than b.");

      //삼항연산자
      String c =
          (a > b) ? "a is greater than b." : (a < b) ? "a is less than b." : "a and b are equal.";
      System.out.println(c);
    }
  }
}
