/* public class practice2 {
    public static void main(String[] args) {
        Practice v = new Practice();
        //System.out.println(v.a); //호출불가

        v.setA(100);
        System.out.println(v.getA());
    }
}
*/

/* public class practice2 {
    String name;
    int age;

    public practice2() {
        this.name = "사람";
        this.age = 1;
    }

    public practice2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void toPrint(){
        System.out.println(this.name + this.age);
    }

    public static void main(String[] args) {
        practice2 p1 = new practice2();
        p1.toPrint();

        practice2 p2 = new practice2("김상호", 25);
        p2.toPrint();
    }
}*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class practice2{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        try {
            System.out.print("a/b...a? ");
            int n1 = kb.nextInt();
            System.out.print("a/b...b? ");
            int n2 = kb.nextInt();
            System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2); // 예외 발생 지점
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("무조건 실행");
        }
        System.out.println("Good bye~~!");
    }
}