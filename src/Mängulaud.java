import java.util.Arrays;

// Klass Mängulaud haldab mängulaua seisundit.
public class Mängulaud {
    // Deklareerime mängulaua massiivi ja mängija asukoha indeksi.
    private int[] mängulaud;
    private int oledRuudul;

    // Konstruktor, mis loob mängulaua kindla pikkusega ja seab mängija esimesele ruudule.
    public Mängulaud(int pikkus) {
        this.mängulaud = new int[pikkus]; // Loo int tüüpi massiiv mängulaua jaoks.
        this.oledRuudul = 0; // Määratakse mängija algseks asukohaks esimene ruut.
        this.mängulaud[0] = 1; // Märkige mängija asukohta esimesel ruudul.
    }

    // Liiguta mängijat järgmisele ruudule, kui see on võimalik.
    public void liiguJärgmiseleRuudule() {
        if (oledRuudul < mängulaud.length - 1) { // Kontrolli, kas mängija pole jõudnud laua lõppu.
            mängulaud[oledRuudul] = 0; // Eemalda mängija praegusest asukohast.
            oledRuudul++; // Suurenda asukoha indeksit, et liikuda järgmisele ruudule.
            mängulaud[oledRuudul] = 1; // Märkige mängija uut asukohta mängulaual.
        }
    }

    // Kontrollib, kas mäng on lõppenud (st kas mängija on jõudnud laua lõppu).
    public boolean kasMängOnLõppenud() {
        return oledRuudul == mängulaud.length - 1; // Võrdle mängija asukohta mängulaua viimase ruuduga.
    }

    // Prindi mängulaua hetkeseis konsoolile.
    public void prindiMängulaud() {
        System.out.println(Arrays.toString(mängulaud)); // Kasuta Arrays klassi toString meetodit massiivi kujuliseks esitamiseks.
    }
}