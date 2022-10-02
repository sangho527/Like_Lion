class INum {
    private int number;

    public int getNumber() {
        return number;
    }

    public INum(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof INum) {
            INum inum = (INum) obj;
            if (this.number == inum.getNumber()) {
                return true;
            }
        }
        return false;
    }

}

public class ObjectEquality {
    public static void main(String[] args) {

        INum num1 = new INum(10);
        INum num2 = new INum(12);
        INum num3 = new INum(10);

        if(num1.equals(num2)) //equals를 사용해서 num1 과 num2 비교
            System.out.println("num1, num2 내용 동일하다.");
        else
            System.out.println("num1, num2 내용 다르다.");

        if(num1.equals(num3)) //equals를 사용해서 num1 과 num3 비교
            System.out.println("num1, num3 내용 동일하다.");
        else
            System.out.println("num1, num3 내용 다르다.");
    }
}