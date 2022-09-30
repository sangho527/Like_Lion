public class GenericPractice {
    public static void main(String[] args) {
        DBox <String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box);
    }

    static class DBox<T1, T2> {
        private T1 name;
        private T2 num;
        public void set(T1 name, T2 num) {
            this.name = name;
            this.num = num;
        }

        @Override
        public String toString() {
            return name + " & " + num;
        }
    }
}