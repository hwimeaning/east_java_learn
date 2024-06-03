package Operator;

public class Ternary_operator {
    public static void main(String[] args) {
        int score = 95;
        String grade = (score == 95) && (score % 5 == 0) ? "good" : "bad";
        // score가 95점이고, 5의 배수이면 "good" 아니라면 "bad"
        System.out.println(grade); // good

        if (score == 95 && score % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
