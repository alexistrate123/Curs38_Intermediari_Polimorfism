package curs37_Tema_Ex4;

public class Sniper extends Shooter {
    public Sniper() {
        maxRange = 2000;
    }

    @Override
    public void shoot() {
        System.out.println("Sniper-ul trage la distanta " + maxRange + " metri si nimereste tinta.");
    }
}
