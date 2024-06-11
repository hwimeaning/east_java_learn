import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("원하는 기능을 선택하세요");
    System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
    String symbol = scanner.next();

    System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
    double first_num = scanner.nextDouble();

    System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
    double second_num = scanner.nextDouble();

    scanner.close();

    double result = 0;

    switch (symbol) {
      case "1":
        result = first_num + second_num;
        break;
      case "2":
        result = first_num - second_num;
        break;
      case "3":
        result = first_num * second_num;
        break;
      case "4":
        result = first_num / second_num;
        break;

      default:
        System.out.println("올바른 입력이 아닙니다.");
    }

    System.out.println(result);
  }
}
