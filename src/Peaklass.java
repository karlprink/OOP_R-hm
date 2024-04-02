import java.util.List;
import java.util.Scanner;

public class Peaklass {
    private static Scanner sisse = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tere tulemast küsimuste mängu!");
        System.out.println("Kas soovid alustada mängu? (jah/ei): ");
        String kasAlustada = sisse.nextLine().trim().toLowerCase();

        if (!"jah".equals(kasAlustada)) {
            System.out.println("Mängu ei alustata. Aitäh, et tulid!");
            return;
        }

        Mängulaud mängulaud = looMängulaud();
        List<Mang.Küsimused> küsimused = KüsimusteKlass.laeKüsimused("küsimused.txt");

        while (!küsimused.isEmpty() && !mängulaud.kasMängOnLõppenud()) {
            Mang.Küsimused küsimus = küsimused.remove(0); // Eemalda ja saa esimene küsimus
            System.out.println(küsimus);

            System.out.print("Sinu vastus (a, b, c): ");
            char vastus = sisse.nextLine().trim().toLowerCase().charAt(0);

            if (küsimus.checkAnswer(vastus)) {
                System.out.println("Õige! Liigud järgmisele ruudule.");
                mängulaud.liiguJärgmiseleRuudule();
            } else {
                System.out.println("Vale! Õige vastus oli: " + küsimus.õigeVastuseTähis);
            }

            mängulaud.prindiMängulaud();
        }

        if (mängulaud.kasMängOnLõppenud()) {
            System.out.println("Palju õnne, oled jõudnud mängulaua lõppu ja võitnud mängu!");
        } else {
            System.out.println("Küsimused on otsas. Mäng on läbi!");
        }
    }

    /**
     *  Meetod mis loob mängulaua. Kasutame täisarvude massiivi, et
     *  justkui visualiseerida mängunupu liikumist mängulaual.
     * @return soovitud pikkusega mängulaua.
     */

    private static Mängulaud looMängulaud() {
        System.out.println("Sisesta mängulaua pikkus: ");
        int mängulauaPikkus = sisse.nextInt();
        sisse.nextLine(); // Tarbib reavahetuse pärast nextInt()

        Mängulaud mängulaud = new Mängulaud(mängulauaPikkus);
        mängulaud.prindiMängulaud(); // Prindib mängulaua algseisundi konsoolile.

        return mängulaud;
    }
}
