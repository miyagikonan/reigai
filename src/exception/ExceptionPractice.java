package exception;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        while (true){
            try {
                System.out.println("数値を入力してください");
                var sc = new Scanner(System.in);
                var s1 = sc.nextLine();
                var num1 = Integer.parseInt(s1);
                String ju = judgeScore(num1);
                System.out.println(ju);
                break;
            }catch (NumberFormatException n) {
                System.out.println("数値を入力してください");
            } catch (IlligalScoreException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static String judgeScore(int score) throws IlligalScoreException {

        if (score < 0 || score > 100) {
            throw new IlligalScoreException("スコアが不正です");
        } else if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }


}
