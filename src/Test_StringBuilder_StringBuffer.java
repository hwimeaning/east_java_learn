public class Test_StringBuilder_StringBuffer {
  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder();
    sb.append("Hello ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb); //Hello World!

    StringBuffer sf = new StringBuffer();
    sf.append("Hello");
    sf.insert(0, "World");
    System.out.println(sf); //WorldHello
    System.out.println(sf.substring(5)); //Hello
    System.out.println(sf.substring(2,3)); //r
  }
}
