import java.util.*;

public class Mang {

    // Sisemine klass, mis esindab küsimusi koos nende vastustega.
    static class Küsimused {
        String küsimus; // Küsimuse tekst.
        List<String> valikud = new ArrayList<>(); // Vastuste valikud, sealhulgas õige vastus.
        String õigeVastus; // Õige vastuse tekst.
        char õigeVastuseTähis; // Täht, mis tähistab õiget vastust (a, b, c, ...).

        /**
         * Konstruktor küsimuse ja vastuste loomiseks.
         * See lisab kõik vastusevariandid listi ja segab need juhuslikult.
         *
         * @param küsimus Küsimuse tekst.
         * @param õigeVastus Õige vastuse tekst.
         * @param valedVastused Valede vastuste tekstid.
         */
        public Küsimused(String küsimus, String õigeVastus, String... valedVastused) {
            this.küsimus = küsimus;
            this.õigeVastus = õigeVastus;
            Collections.addAll(valikud, õigeVastus); // Lisab õige vastuse valikute listi.
            Collections.addAll(valikud, valedVastused); // Lisab valed vastused valikute listi.
            Collections.shuffle(valikud, new Random()); // Segab valikud juhuslikus järjekorras.
            õigeVastuseTähis = (char) ('a' + valikud.indexOf(õigeVastus)); // Määrab õige vastuse tähe.
        }

        /**
         * Kontrollib, kas antud vastus on õige.
         *
         * @param answer Kasutaja poolt sisestatud vastuse täht.
         * @return Tõeväärtus, kas vastus on õige.
         */
        boolean checkAnswer(char answer) {
            return answer == õigeVastuseTähis; // Võrdleb kasutaja vastust õige vastuse tähisega.
        }

        /**
         * Tagastab küsimuse ja vastusevariandid sõnena.
         *
         * @return Küsimus ja vastusevariandid formaaditud sõnena.
         */
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(küsimus).append("\n");
            char optionLabel = 'a'; // Alustab vastusevariantide tähistamist tähega 'a'.
            for (String option : valikud) {
                sb.append(optionLabel++).append(") ").append(option).append("\n"); // Lisab iga vastusevariandi.
            }
            return sb.toString(); // Tagastab küsimuse ja vastusevariandid sõnena.
        }
    }
}
