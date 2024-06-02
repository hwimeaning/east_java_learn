package String;

public class Test_replace {
  public static void main(String[] args) {
    String a = "subway에서 salad를 먹었어요.";
    System.out.println(a.replace("subway", " ").replace("salad", " "));
    // 특정 문자열 대체

    System.out.println(a.replaceAll("[a-z]", " "));
    // 특정 패턴의 문자열 대체
  }
}
