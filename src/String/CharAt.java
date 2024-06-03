package String;

public class CharAt {

  public static void main(String[] args) {
    String a = "Hello World";
    System.out.println(a.charAt(7)); // 알파벳 'o' 출력

    String findchar = "What is your hobby";
    System.out.println(
        findchar.charAt(13)
            + ""
            + findchar.charAt(14)
            + ""
            + findchar.charAt(15)
            + ""
            + findchar.charAt(16)
            + ""
            + findchar.charAt(17)); // 알파벳 'hobby' 출력
  }
}
