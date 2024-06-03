package Operator;

public class UnaryOperator {
  public static void main(String[] args) {

    int positive = 10;
    int negative = -10;

    System.out.println("양의 부호 연산자 적용: " + (positive)); // 10
    System.out.println("음의 부호 연산자 적용: " + -(positive)); // -10
    System.out.println("음의 부호 연산자로 반전: " + (negative)); // -10

    int x = 5;
    int y = 5;

    System.out.println("전위 증가 연산자: " + (++x)); // 6
    System.out.println("후위 증가 연산자: " + (y++)); // 5

    System.out.println("=================");
    System.out.println("x는 " + x); // 6
    System.out.println("y는 " + y); // 6

    int a = 100;
    int b = 100;

    System.out.println("전위 감소 연산자: " + (--a)); // 99
    System.out.println("후위 감소 연산자: " + (b--)); // 100
    System.out.println("전위 감소 연산자: " + (--a)); // 98
    System.out.println("후위 감소 연산자: " + (b--)); // 99
    System.out.println("전위 감소 연산자: " + (--a)); // 97
    System.out.println("후위 감소 연산자: " + (b--)); // 98
    System.out.println("========================");
    System.out.println("x는 " + a); // 97
    System.out.println("y는 " + b); // 97


    boolean isRaining = true;

    if (isRaining) {
      System.out.println("하늘에서 비가 와요");
    }
    if (!isRaining) {
      System.out.println("김태희가 안 옵니다."); // 하늘에서 비가 와요
    }

    boolean isSunny = false;

    if (!isSunny) {
      System.out.println("칙칙해요");
    }else{
      System.out.println("맑아요"); // 칙칙해요
    }
  }
}
