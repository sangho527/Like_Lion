public class java_0923 {

    class A{

        public A() {
            System.out.println("A 생성자 호출");
        }
    }

    class B extends A{

        public B() {
            System.out.println("B 생성자 호출");
        }
    }

    public class SuperTest {

        public void main(String[] args) {

            A a = new A();
            B b = new B();
        }
    }
}
