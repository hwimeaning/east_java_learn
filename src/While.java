public class While {
  public static void main(String[] args) {

    //배뎔의 양수의 합과 음수의 합을 각각 구하여 출력하기
    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    int positiveSum = 0;
    int negativeSum = 0;
    int i = 0;
    while (i < numbers.length) {
      if (numbers[i] > 0) {
        positiveSum += numbers[i];
      } else {
        negativeSum += numbers[i];
      }
      i++;
    }
    System.out.println(positiveSum);
    System.out.println(negativeSum);

    // 10부터 0에 도달할 때까지 카운트다운을 출력하기
    int count = 10;

    while (count >= 0) {
      System.out.println(count);
      count--;
    }
  }
}
