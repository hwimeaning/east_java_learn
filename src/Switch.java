public class Switch {
  public static void main(String[] args) {

    // 요일에 따른 식사 제안하기
    String day = "수요일";
    switch (day) {
      case "월요일":
        System.out.println("햄버거 먹기");
        break;
      case "화요일":
        System.out.println("떡볶이 먹기");
        break;
      case "수요일":
        System.out.println("짜장면 먹기");
        break;
      case "목요일" :
        System.out.println("치킨 먹기");
        break;
      case "금요일" :
        System.out.println("마라탕 먹기");
        break;
    }
    
    String grade = "B";
    switch (grade) {
      case "A":
        System.out.println("Excellent");
        break;
      case "B":
        System.out.println("Good");
        break;
      case "C":
        System.out.println("Average");
        break;
      case "D":
        System.out.println("Below Average");
        break;
      case "F":
        System.out.println("Fail");
        break;
    }

    char operator = '*';
    int num1 = 5;
    int num2 = 7;

    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
    }

    String color = "blue";

    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
    }

    String language = "java";
    switch (language) {
      case "java":
        System.out.println("difficult");
        break;
      case "python":
        System.out.println("Mollayo");
        break;
      case "C++":
        System.out.println("Sad..");
        break;
      case "JavaScript":
        System.out.println("headache");
        break;
    }
  }
}
