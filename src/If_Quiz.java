public class If_Quiz {
  public static void main(String[] args) {

    //x가 양수인지, 음수인지, 0인지 판별하는 if문과 삼항연산자
    int x = 10;

    String result = (x > 0) ? "양수입니다." : (x < 0) ? "음수입니다." : "0입니다.";
    System.out.println(result);

    if (x > 0) {
      System.out.println("양수입니다.");
    } else if (x == 0) {
      System.out.println("0입니다.");
    } else {
      System.out.println("음수입니다.");
    }

    //score에 따라 학점을 출력하는 if문
    int score = 75;

    if (score >= 90) {
      System.out.println("A");
    } else if (90 > score) {
      System.out.println("B");
    } else if (80 > score) {
      System.out.println("C");
    } else if (70 > score) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

    //year가 윤년인지 아닌지 판별하는 if문
    int year = 2023;

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println("윤년입니다.");
    } else {
      System.out.println("윤년이 아닙니다.");
    }

    //세 변수 중 가장 큰 값을 출력하는 if문
    int a = 10;
    int b = 20;
    int c = 30;

    if (a >= b && a >= c) {
      System.out.println(a);
    } else if (b >= a && b >= c) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }

    //합격 또는 불합격을 출력하는 if문과 삼항연산자
    int passScore = 60;
    int myScore = 75;

    if (myScore >= passScore) {
      System.out.println("합격");
    } else {
      System.out.println("불합격");
    }

    System.out.println((myScore >= passScore) ? "합격" : "불합격");
  }
}
