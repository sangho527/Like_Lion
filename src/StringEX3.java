import java.util.Scanner;

public class StringEX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true) {
            System.out.print("문장을 입력하시오: ");
            String str = sc.nextLine();

            if (str.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }

            System.out.println(str);
            String[] arr = str.split(" ");
            System.out.println("어절 개수는 " + arr.length);


        }
    }
}