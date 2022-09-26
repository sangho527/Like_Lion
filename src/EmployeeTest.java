public class EmployeeTest {
    public static void main(String[] args) {

        Regular r = new Regular("이순신", 35, "서울", "인사부");
        Temporary t = new Temporary("장보고", 25, "인천", "경리부");

        r.setSalary(5000000);
        r.printInfo();

        t.setHour(120);
        t.printInfo();
    }
}
