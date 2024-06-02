package String;

public class Test_split {
  public static void main(String[] args) {
    String a = "a:b:c:d";
    String[] result = a.split(":");
    String sp1 = result[0];
    String sp2 = result[1];
    String sp3 = result[2];
    String sp4 = result[3]; //문자열을 특정한 구분자로 나누어 문자열 배열로 넣기

    System.out.println("sp1: " + sp1);
    System.out.println("sp2: " + sp2);
    System.out.println("sp3: " + sp3);
    System.out.println("sp4: " + sp4);


  }
}
