public class For2 {
  public static void main(String[] args) {
    int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    int sum = 0;
    for (int i : scores) {
      sum += i;
    }
    System.out.println(sum);
    System.out.println((double) sum / scores.length);

    String[] names = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
    for (String i : names) {
      if (i.length() >= 5) {
        System.out.println(i);
      }
    }

    int count = 1;
    while (count <= 10000) {
      System.out.println(count);
      count++;
    }

    for (int i = 9; i >= 2; i--) {
      for (int j = 9; j >= 1; j--) System.out.println("<" + i + "단> " + i + "x" + j + "=" + i * j);
    }
  }
}
