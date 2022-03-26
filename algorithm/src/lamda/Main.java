package lamda;

interface Goods {
    public void doSome();
}

class Computer implements Goods {

    @Override
    public void doSome() {
        System.out.println("do Operation!");
    }
}

public class Main {
    public static void main(String[] args) {
        // 람다식 이전
        Goods com = new Computer();
        com.doSome();

        // 람다식
        Goods com1 = () -> System.out.println("do Operation!");
        com1.doSome();
    }
}
