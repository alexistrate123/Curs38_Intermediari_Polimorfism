package curs37_Tema_Ex3;

public class ShaormaPicanta extends Shaorma {
    public void adaugaKetchupPicant() {
        System.out.println("Adaugare ketchup picant.");
    }

    public void adaugaUsturoi() {
        System.out.println("Adaugare usturoi.");
    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        adaugaKetchupPicant();
        adaugaUsturoi();
    }

}

