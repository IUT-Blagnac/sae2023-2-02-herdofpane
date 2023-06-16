package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // long compteDebut = System.nanoTime();
        long startTime = System.currentTimeMillis();

        String texte = "Il fait beau aujourd'hui comme en aout";
        List<Character> ordre = List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o');

        System.out.println(Exercicee.solution(texte, ordre));

        long endTime = System.currentTimeMillis();
        double executionTime = (endTime - startTime);

        System.out.printf("Temps d'exécution : %.2f millisecondes%n", executionTime);

        // long compteFin = System.nanoTime();
        // long duree = compteFin - compteDebut;
        // System.out.println("La duree d'execution est de : " + duree + " nano
        // secondes");

        // ["fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"]
    }
}
