package curs37_Tema_Ex4;

public class Main {
    /*
1. Creati clasa Shooter cu proprietatea maxRange si metoda shoot().
2. Clasa Sniper va mosteni clasa Shooter, va avea maxRange de 2000 de metrii si va impusca tinta in functie de distanta maxima.
3. Clasa Pistol va mosteni clasa Shooter, va avea maxRange de 100 de metrii si va impusca tinta in functie de distanta maxima.
4. Clasa Ak47 va mosteni clasa Shooter, va avea maxRange de 500 de metrii si va impusca tinta in functie de distanta maxima.
5. In momentul in care Ak47 va trage, se vor trage mai multe gloante deodata.
     */


    public static void main(String[] args) {
        Sniper sniper = new Sniper();
        Pistol pistol = new Pistol();
        Ak47 ak47 = new Ak47();


        sniper.shoot();
        pistol.shoot();
        ak47.shoot();
    }
}
