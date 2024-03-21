import java.util.Arrays;
import java.util.Scanner;

public class Mängulaud {
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