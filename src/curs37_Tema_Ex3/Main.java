package curs37_Tema_Ex3;

public class Main {
    /*
1. Creati clasa Shaorma, cu metodele adaugaCarne(), adaugacartofi(), adaugaSalate() si metoda pregatesteShaorma().
2. Clasa ShaormaDulce va extinde clasa Shaorma si va avea metoda adaugaKetchupDulce(). Prepararea ei va include toate
   metodele existente in Clasa Shaorma.
3. Clasa ShaormaPicanta va extinde clasa Shaorma si va avea metoda adaugaKetcupPicant() si metoda adaugaUsturoi().
   Prepararea ei  va include toate metodele existente in clasa Shaorma.
4. Creati o shaorma dulce si o shaorma picanta .
     */


    public static void main(String[] args) {
       ShaormaDulce shaormaDulce = new ShaormaDulce();
       shaormaDulce.pregatesteShaorma();
        System.out.println();
       ShaormaPicanta shaormaPicanta = new ShaormaPicanta();
       shaormaPicanta.pregatesteShaorma();



    }
}
