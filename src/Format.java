public class Format {
  public static void main(String[] args) {

   String name1 = "Tim";
   int age1 = 40;

   String name2 = "Jay";
   int age2 = 30;

    String a = String.format("%s의 나이는 %s세입니다.", name1, age1);
    String b = String.format("%s의 나이는 %s세입니다.", name2, age2);

    System.out.println(a); //Tim의 나이는 40세입니다.
    System.out.println(b); //Jay의 나이는 30세입니다.
  }
}
