package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texte = "Il fait beau aujourd'hui comme en aout";
        List<Character> ordre = List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o');

        long startTime = System.currentTimeMillis();

        System.out.println(Exercicee.solution(texte, ordre));

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Temps d'exécution : " + executionTime + " ms");

        //["fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"]
    }
}
