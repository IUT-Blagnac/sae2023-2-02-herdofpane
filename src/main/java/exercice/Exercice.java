package exercice;

import java.util.*;

import java.util.List;

public class Exercice {
    static ArrayList<String> tokens = new ArrayList<>();
    static ArrayList<String> listefinale = new ArrayList<>();

    public static List<String> solution(String str, List<Character> ordre) {
        // Permet de separer la Sring en plusieur partie pour recuperer chaque mots
        // Les partie a separer sont délimité par les espace et les apostrophes
        StringTokenizer tokenizer = new StringTokenizer(str, " ;’");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            tokens.add(token);
        }
        trie(tokens, ordre);
        return listefinale;
    }

    public static void trie(ArrayList<String> listeMots, List<Character> listeLettre) {
        ArrayList<String> motsL = listeMots;
        List<Character> lettreL = listeLettre;

        for (int i = 0; i < lettreL.size(); i++) {
            for (int y = 0; y < motsL.size(); y++) {
                String mots = motsL.get(y);
                char lettre = lettreL.get(i);

                if (estPresent(mots, lettre)) {
                    listefinale.add(mots);
                    motsL.remove(y);
                }
            }
        }

        if (motsL.size() != 0) {
            for (int i = 0; i < motsL.size(); i++) {
                listefinale.add(motsL.get(i));
            }
        }
    }

    public static boolean estPresent(String mots, char lettres) {
        String mot = mots;
        char lettre = mot.charAt(0);

        if (lettre == lettres) {
            return true;
        }
        return false;
    }
}
