import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KüsimusteKlass {
    /**
     * laeKüsimused on staatiline meetod, mis loob ja tagastab nimekirja küsimustest.
     * Iga küsimus koosneb küsimuse tekstist, õigest vastusest ja valedest vastustest.
     * Küsimused ja vastused on ettevalmistatud ja kõvasti kodeeritud selles meetodis.
     *
     * @return Tagastab List<Mang.Küsimused> tüüpi objekti, mis sisaldab kõiki küsimusi.
     **/
    public static List<Mang.Küsimused> laeKüsimused(String failinimi) {
        List<Mang.Küsimused> küsimused = new ArrayList<>();
        try (Scanner lugeja = new Scanner(new File(failinimi), "UTF-8")) {
            while (lugeja.hasNextLine()) {
                String rida = lugeja.nextLine();
                String[] osad = rida.split(";");
                String küsimus = osad[0];
                String õigeVastus = osad[1];
                String vastusB = osad[2];
                String vastusC = osad[3];
                küsimused.add(new Mang.Küsimused(küsimus, õigeVastus, vastusB, vastusC));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return küsimused;
    }
}