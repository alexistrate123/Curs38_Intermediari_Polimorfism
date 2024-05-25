package curs37_Tema_Ex3;

public class Shaorma {


    public void adaugaCarne() {
        System.out.println("Am adaugat carne.");
    }

    public void adaugaCartofi() {
        System.out.println("Am adaugat cartofi.");
    }

    public void adaugaSalate() {
        System.out.println("Am adaugat salate.");
    }

    public void pregatesteShaorma() {
        System.out.println("Se pregateste shaorma. ");
        adaugaCarne();
        adaugaCartofi();
        adaugaSalate();

    }
}
