import java.util.ArrayList;
import java.util.List;

public class KüsimusteKlass {
/**
 * laeKüsimused on staatiline meetod, mis loob ja tagastab nimekirja küsimustest.
 * Iga küsimus koosneb küsimuse tekstist, õigest vastusest ja valedest vastustest.
 * Küsimused ja vastused on ettevalmistatud ja kõvasti kodeeritud selles meetodis.
 *
 * @return Tagastab List<Mang.Küsimused> tüüpi objekti, mis sisaldab kõiki küsimusi.
 * **/
    public static List<Mang.Küsimused> laeKüsimused() {
        List<Mang.Küsimused> küsimused = new ArrayList<>();
        // Loob küsimused ja lisab need küsimuste listi.
        küsimused.add(new Mang.Küsimused("Uganda diktaatorist president kes juhtis riiki aastatel 1971-1979. See president sõi enda vaenlaste südameid kuna uskus, et see annab talle nende jõu.",
                "Idi Amin", "Mustafa Idrisi", "Herun Kamb", "Hingas Teronomes"));
        küsimused.add(new Mang.Küsimused("See Inglismaa poliitik oli Inglismaa Fasistliku partei looja.",
                "Oswald Mosley", "Winston Churchill", "Margareth Thatcher"));
        küsimused.add(new Mang.Küsimused("See inimene oli Vene Tsaaririigi viimane tsaar?",
                "Nikolai II", "Nikolai Dunin", "Aleksander III"));
        küsimused.add(new Mang.Küsimused("Selle Eesti kommunisti auks on nimetatud tänapäeva Venemaal mitmed tänavad ja maakonnad.",
                "Viktor Kingisepp", "Andreas Keskküla", "Toomas Moor"));
        küsimused.add(new Mang.Küsimused("See Eesti linn hävis 90% ulatuses peale 1944. aastal toimunud Nõukogude vägede pommitamist.",
                "Narva", "Tallinn", "Pärnu"));
        küsimused.add(new Mang.Küsimused("Mis aastal toimus Eestis Suveolümpia Purjeregatt?",
                "1980", "1982", "1979"));
        küsimused.add(new Mang.Küsimused("Millisel spordialal on häid tulemusi saavutanud Kristin Tattar?",
                "discgolf", "ujumine", "ratsutamine"));
        küsimused.add(new Mang.Küsimused("See Eesti naisujuja on Euroopa meister lühiraja 100 m rinnuliujumises.",
                "Eneli Jefimova", "Maarika Pronks", "Anneli Sorg"));
        küsimused.add(new Mang.Küsimused("See Eesti poliitik oli MTÜ Jalgapllihaigla juhataja aastatel 2006-2013.",
                "Tarmo Kruusimäe", "Kaja Kallas", "Jüri Ratas"));
        küsimused.add(new Mang.Küsimused("Mis on sumomaadleja Baruto kodanikunimi? ",
                "Kaido Höövelson", "Jaan Talts", "Andrus Värnik"));
        küsimused.add(new Mang.Küsimused("Millise spordiga tegeles Ander Tonks? ",
                        "Maadleja", "Iluvõimleja", "Suusataja"));
        küsimused.add(new Mang.Küsimused("Mis on Austraalia pealinn?", "Canberra", "Melboirne", "Sidney"));
        küsimused.add(new Mang.Küsimused("Mis on türgi pealinn?"
                ,"Ankara",  "Istanbul", "Antalya"));
        küsimused.add(new Mang.Küsimused("Millise rokkbändi hitt oli \"Losing My Religion\" aastal 1991? "
                ,"REM",  "Nirvana", "U2"));
        küsimused.add(new Mang.Küsimused("Mitu protsenti päikesesüsteemi massist moodustab päike?",
                "99%",  "98%", "97%"));
        küsimused.add(new Mang.Küsimused("Mis on nuku, Barbie, täisnimi?","Barbara Millicent Roberts","Barbara Millicent Daniels","Barbara Millicent Martins"));
        küsimused.add(new Mang.Küsimused("Mis aastal uppus Titanic Atlandi ookeanil 15. aprillil oma esmareisil Southamptonist?",
                "1912", "1911", "1910"));
        küsimused.add(new Mang.Küsimused("See Eesti sportlane võitis 2024. aastal kergejõustiku sisemaailmameistrivõistlustel kolmanda koha",
                "Johannes Erm", "Andrei Nazarov", "Maicel Uibo"));





        return küsimused;
    }
}
