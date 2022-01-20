
package phrases;

import java.util.Scanner;

public class PhraseService {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    //Método llenarFrase()
    public Phrase createPhrase(String phrase) {
        Phrase newPhrase = new Phrase();
        newPhrase.setPhrase(phrase);
        newPhrase.setPhraseLength(phrase.length());
        return newPhrase;
    }
    
     //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void countVowels(Phrase phrase) {
        int vowelCounter = 0;
        String letter;

        for (int i = 0; i < phrase.getPhraseLength(); i++) {
            letter = (phrase.getPhrase().substring(i, i + 1));
            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
                vowelCounter++;
            }
        }
        System.out.println("The phrase contains " + vowelCounter + " vowels.");
        //System.out.println(frase.getFrase());
    }
    
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida por pantalla. 
    public void invertPhrase(Phrase phrase) {

        String invertedPhrase = "";
        String letter;

        for (int i = 0; i < phrase.getPhraseLength(); i++) {
            letter = (phrase.getPhrase().substring(i, i + 1));
            invertedPhrase = letter + invertedPhrase;
        }
        System.out.println("The inverted phrase is: [" + invertedPhrase + "]");
    }
    
    //Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
    //ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void timesRepeated(Phrase phrase, char letter) {
        int letterCounter = 0;

        char letraLower = Character.toLowerCase(letter);
        for (int i = 0; i < phrase.getPhraseLength(); i++) {
            char letterX = (phrase.getPhrase().charAt(i));
            char letterLower = Character.toLowerCase(letterX);
            if (letraLower == letterLower) {
                letterCounter++;
            }
        }
        System.out.println("The letter [" + letter + "] was found " + letterCounter + " times in the phrase.");
    }
    
    //Método compararLongitud(String frase), deberá comparar la longitud de la frase
    //que compone la clase con otra nueva frase ingresada por el usuario.
    public void compareLength(Phrase phrase, String newPhrase) {

        if (phrase.getPhraseLength()== newPhrase.length()) {
            System.out.println("Both sentences are the same length.");
        } else {
            System.out.println("Sentences are not the same length.");
            System.out.println("The first phrase has " + phrase.getPhraseLength()+ " characters.");
            System.out.println("The second phrase has " + newPhrase.length() + " characters.");
        }
    }
    
    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void joinPhrases(Phrase phrase, String newPhrase) {

        String joinedPhrases = phrase.getPhrase().concat(newPhrase);
        System.out.println(joinedPhrases);
    }
    
    // Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro caracter seleccionado por el usuario y
    //mostrar la frase resultante.
    public String replaceLetters(Phrase phrase, String characterX) {

        String newPhrase = "";
        for (int i = 0; i < phrase.getPhraseLength(); i++) {
            char letter = (phrase.getPhrase().charAt(i));

            if (letter == 'a') {
                letter = characterX.charAt(0);
                newPhrase = newPhrase + letter;
            } else {
                newPhrase = newPhrase + letter;
            }
        }
        return newPhrase;
    }
    
    // Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean containLetter(Phrase phrase, String letter) {

        boolean check = false;
        for (int i = 0; i < phrase.getPhraseLength(); i++) {
            char letterX = (phrase.getPhrase().charAt(i));

            if (letterX == letter.charAt(0)) {
                check = true;
            }
        }
        return check;
    }
}
