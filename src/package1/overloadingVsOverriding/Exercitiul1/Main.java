package package1.overloadingVsOverriding.Exercitiul1;

public class Main {
    /*
    1. Scrie clasa ConsolePrinter, care va avea metoda statica printText()
    care va primi ca parametru un String pe care il va printa la consola.
    Suprascrie metoda printText() pentru a printa textul nostru, dar si numarul de printari dorit , la consola.


    2. Creeza clasa Person, persoana va avea un nume si metoda eat()
    Supraincarca metoda eat() pentru a primi ca parametri 1, 2 sau si 3 alimente de tip String
    Si afiseaza un mesaj corespunzator la apelarea fiecarei metode.
     */


    public static void main(String[] args) {
      ConsolePrinter.printText("Banana");
      ConsolePrinter.printText("imprimanta ", 23);

        System.out.println("_______________________________________________________________________________");
        System.out.println();

      Person person = new Person();
      person.nume = "John";
      person.eat("mar");
      person.eat("portocala", "banane");
      person.eat("kiwi", "mango", "pere");
    }
}
