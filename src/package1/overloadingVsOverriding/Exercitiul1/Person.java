package package1.overloadingVsOverriding.Exercitiul1;

public class Person {
    String nume;

    public void eat(String n) {
        System.out.println(nume + " a mancat un produs: "+ n);
    }

    public void eat( String n, String n1) {
        System.out.println(nume + " a mancat 2 produse: " + n + " si " + n1 );
    }

    public void eat(String n1, String n2, String n3) {
        System.out.println(nume + " a mancat 3 produse: " + n1 + ", " + n2 + " si " + n3);
    }

}
