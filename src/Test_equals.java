public class Test_equals {
  public static void main(String[] args) {
    String a = "hello";
    String b = new String("hello");

    System.out.println(a.equals(b)); // true
    System.out.println(a == b); /* false - 'equals'가 아닌 '=='는 2개의 자료형이 같은
    객체인지(같은 주소값을 갖는지) 판별할 때 사용하는 연산자이기 때문 */
  }
}
