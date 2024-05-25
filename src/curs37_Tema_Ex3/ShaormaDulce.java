package curs37_Tema_Ex3;

public class ShaormaDulce extends Shaorma {
    public void adaugaKetchupDulce() {
        System.out.println("Adaugare ketchup dulce.");
    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        adaugaKetchupDulce();
    }
}
