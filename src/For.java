import org.w3c.dom.ls.LSOutput;

public class For {
  public static void main(String[] args) {

    // 짝수의 합 계산하기
    int sum = 0;
    for (int x = 0; x <= 100; x++) {
      if (x % 2 == 0) {
        sum += x;
      }
    }
    System.out.println(sum);
    // ===================================================

    // 3의 배수이면서 5의 배수인 수의 합 계산하기
    int sum2 = 0;
    for (int a = 1; a <= 20; a++) {
      if (a % 3 == 0 && a % 5 == 0) {
        sum2 += a;
      }
    }
    System.out.println(sum2);

    for (int i = 0; i >= -100; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    int[] arr = new int[100];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
      System.out.println(arr[i]);
    }

    for (int i = 19; i >= 1; i--) {
      for (int y = 19; y >= 1; y--) System.out.println(i + "x" + y + " = " + i * y);
    }

    int num = 0;

    while (num < 10) {
      num++;
      if (num == 4 || num == 7) {
        continue;
      }
      System.out.println("현재 값은 " + num);
    }
  }
}
