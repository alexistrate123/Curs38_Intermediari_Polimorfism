package package1.overloadingVsOverriding.Exercitiul1;

public class ConsolePrinter {
    public static void printText(String text) {
        System.out.println(text);
    }

    public static void printText(String text, int nrPrintari) {
        System.out.println("Aceasta este " + text + "cu "+ nrPrintari + " de printari.");
        for (int i = 0; i < 24; i++) {
            System.out.println(i + ". " + text);

        }
    }
}
