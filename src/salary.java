class Exployee {
    public int getSalary() {
        return 0;
    }
}

class Manager extends Exployee {
    public int getSalary() {
        return 5000000;
    }
}

class Programmer extends Exployee {
    public int getSalary() {
        return 6000000;
    }

}

public class salary {

    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급: " + obj1.getSalary());

        Programmer obj2 = new Programmer();
        System.out.println("관리자의 월급: " + obj2.getSalary());
    }

}
