package curs37_Tema_Ex4;

public class Ak47 extends  Shooter {
    int numarGloante;

    public Ak47() {
        maxRange = 500;
        this.numarGloante = 3;
    }

    @Override
    public void shoot() {
        System.out.println("Trage cu AK-47, trage " + numarGloante + " gloante simultan la o distanta de pana la "
                + maxRange + " metri si nimereste tinta cu toate cele 3 gloante simultan. Succes!");
    }
}
