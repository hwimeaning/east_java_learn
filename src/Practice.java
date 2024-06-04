public class Practice {
  public static void main(String[] args) {
    // while문으로 10개의 자연수 출력하기
    int count = 1;
    while (count <= 10) {
      System.out.println(count);
      count++;
    }

    // if문으로 10개의 자연수 출력하기
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    // for문으로 10개의 짝수 출력하기
    int num = 2;
    for (int i = 1; i <= 10; i++) {
      System.out.println(num);
      num += 2;
    }

    // while문으로 10개의 짝수 출력하기
    int num2 = 2;
    int i = 1;
    while (i <= 10) {
      System.out.println(num2);
      num2 += 2;
      i++;
    }

    // while문으로 누적 합 계산하기
    int sum1 = 0;
    int max = 3;
    int y = 1;

    while (y <= max) {
      sum1 += y;
      y++;
    }
    System.out.println(sum1);

    // for문으로 누적 합 계산하기
    int sum = 0;
    for (int x = 1; x <= 3; x++) {
      sum += x;
    }
    System.out.println(sum);

    // for문으로 구구단 출력하기
    for (int x = 1; x <= 9; x++) {
      for (int b = 1; b <= 9; b++) {
        System.out.println(x + "단= " + x + " x " + b + " = " + x * b);
      }
      System.out.println();
    }
  }
}
