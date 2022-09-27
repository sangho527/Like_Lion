interface  Printable{
    public abstract void print(String doc); // 인터페이스에 올수 있는건 상수와 추상함수
}

class SPrintDriver implements Printable{

    @Override
    public void print(String doc){
        System.out.println("삼성 프린터 입니다.");
        System.out.println(doc);

    }

}

class LPrinterDriver implements Printable {

    @Override
    public void print(String doc) {
        System.out.println("LG 프린터 입니다.");
        System.out.println(doc);

    }


    public static void main(String[] args) {
        Printable prn = new SPrintDriver();

        prn.print("출력해주세요.");

        prn = new LPrinterDriver();

        prn.print("출력해주세요.");

    }
}

