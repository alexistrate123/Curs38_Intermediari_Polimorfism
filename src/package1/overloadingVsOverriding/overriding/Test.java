package package1.overloadingVsOverriding.overriding;

public class Test {
    public static void main(String[] args) {
        Leopard leopard = new Leopard();
        Melc melc = new Melc();


        leopard.move();
        melc.move();
    }
}
