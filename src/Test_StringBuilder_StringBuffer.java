public class Test_StringBuilder_StringBuffer {
  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder();
    sb.append("Hello ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb);

    StringBuffer sf = new StringBuffer();
    sf.append("Hello");
    sf.insert(0, "World");
    sf.insert(0, "World");
    sf.insert(0, "World");
    sf.insert(0, "World");
    System.out.println(sf);
  }
}
