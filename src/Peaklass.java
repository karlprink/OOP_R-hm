import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);

        // Mängu tutvustus ja küsimus mängu alustamise kohta
        System.out.println("Tere tulemast küsimuste mängu!");
        System.out.println("See on põnev mäng, kus saad testida oma teadmisi erinevatel teemadel.\n");
        System.out.println("Teemadeks on Varia, Ajalugu ja Sport, head mängimist:)");
        System.out.println("Kas soovid alustada mängu? (jah/ei): ");
        String kasAlustada = sisse.nextLine().trim().toLowerCase();

        if (!"jah".equals(kasAlustada)) {
            System.out.println("Mängu ei alustata. Aitäh, et tulid!");
            return; // Lõpetab programmi, kui kasutaja ei soovi mängu alustada.
        }

        // Mängulaua loomine ja mängu alustamine, kui kasutaja vastas "jah"
        System.out.println("Sisesta mängulaua pikkus: ");
        int mängulauaPikkus = sisse.nextInt();
        System.out.println("Asud 1. ruudul.");
        int[] mängulaud = looMängulaud(mängulauaPikkus);
        int oledRuudul = 0;
        sisse.nextLine(); // Tarbib reavahetuse pärast nextInt()

        List<Mang.Küsimused> küsimusteList = KüsimusteKlass.laeKüsimused("küsimused.txt");

        while (!küsimusteList.isEmpty()) {
            Mang.Küsimused küsimused = küsimusteList.remove((int) (Math.random() * küsimusteList.size()));
            System.out.println(küsimused);
            System.out.print("Sinu vastus (a, b või c): ");
            String userAnswer = sisse.nextLine().trim().toLowerCase();

            if (oledRuudul + 1 == mängulauaPikkus) {
                System.out.println("Võitsid mängu!");
                break;
            }

            while (userAnswer.length() != 1 || userAnswer.charAt(0) < 'a' || userAnswer.charAt(0) > 'd') {
                System.out.println("Palun sisesta kehtiv vastus (a, b, c, või d):");
                userAnswer = sisse.nextLine().trim().toLowerCase();
            }

            if (küsimused.checkAnswer(userAnswer.charAt(0))) {
                System.out.println("Õige!");
                mängulaud[oledRuudul] = 0;
                mängulaud[++oledRuudul] = 1;
                System.out.println("Asud " + (oledRuudul + 1) + ". ruudul.");
            } else {
                System.out.println("Vale! Õige vastus oli: " + küsimused.õigeVastuseTähis);
                System.out.println("Püsid paigal " + (oledRuudul + 1) + ". ruudul.");
            }
            System.out.println(Arrays.toString(mängulaud));
        }

        if (küsimusteList.isEmpty()) {
            System.out.println("Küsimused on otsas. Mäng on läbi!");
        }
        sisse.close();
    }
    /**
     * LooMängulaud on staatiline meetod, mis genereerib ja tagastab mängulaua massiivi.
     * See meetod seab mängija algselt esimesele ruudule mängulaual ja prindib mängulaua
     * esialgse seisundi konsooli.
     *
     * @param pikkus Määrab mängulaua ruutude arvu.
     * @return Tagastab int tüüpi massiivi, mis esindab mängulaua ruutude seisundit,
     *         kus 1 tähistab mängija praegust asukohta ja 0 kõiki teisi ruute.
     */
    public static int[] looMängulaud(int pikkus) {
        int[] mängulaud = new int[pikkus]; // Loob uue int-tüüpi massiivi mängulaua jaoks.
        mängulaud[0] = 1; // Määrab mängija asukoha esimesele ruudule.
        System.out.println(Arrays.toString(mängulaud)); // Prindib mängulaua algseisundi konsoolile.
        return mängulaud; // Tagastab loodud mängulaua.
    }
}
