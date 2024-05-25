package package1.overloadingVsOverriding.overloading;

public class Calculator {

    public void aduna() {
        System.out.println("Se aduna doua numere.");
    }

    public void aduna(int n) {
        System.out.println("Suma a doua numere este: " + n);
    }

    public void aduna(int n1, int n2) {
        System.out.println(n1+n2);
    }

    public void aduna(int n1, int n2, int n3) {
        System.out.println(n1+n2+n3);
    }

}
