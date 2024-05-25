package curs37_Tema_Ex4;

public class Pistol extends Shooter {
    public Pistol() {
        maxRange = 100;
    }

    @Override
    public void shoot() {
        System.out.println("Pistolul trage la distanta de " + maxRange + " metri si nimereste tinta.");
    }
}
