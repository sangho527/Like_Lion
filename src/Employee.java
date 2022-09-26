public class Employee {
    String name;
    int age;
    String address;
    String department;
    int salary;


    public Employee(String name, int age, String address, String department) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.department = department;
    }

    public void printInfo() {
        System.out.println("이름: " + name + "\n나이: " +  age + "\n주소: " +  address + "\n부서: " + department);
    }
}

class Regular extends Employee {
    public Regular(String name, int age, String address, String department) {
        super(name, age, address, department);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("정규직\n월급: " + salary);
    }
}

class Temporary extends Employee {
        int hour;
        int pay = 10000;
        public Temporary(String name,int age,String address,String department){
        super(name,age,address,department);
        }
        public void setHour(int hour) {
            this.hour = hour;
            this.salary = hour * pay;
        }

        public void printInfo() {
            super.printInfo();
            System.out.println("비정규직\n일한 시간 : "+  hour + "\n급여 : " + salary);
        }
}

