/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. 
En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
que puede ser una palabra o varias palabras separadas por un espacio en blanco 
y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. 
Deberá además implementar los siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package phrases;

import java.util.Scanner;

public class Phrases {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        PhraseService phraseService = new PhraseService();
        Phrase phrase;

        System.out.println("Please enter a phrase:");
        phrase = phraseService.createPhrase(scanner.next());
        System.out.println("");
        System.out.println("Your phrase is: " + phrase.getPhrase() + " || Length: " + phrase.getPhraseLength());
        System.out.println("");

        phraseService.countVowels(phrase);
        System.out.println("");

        phraseService.invertPhrase(phrase);
        System.out.println("");

        System.out.println("What character do you want to look for in the sentence?");
        char letter = scanner.next().charAt(0);
        phraseService.timesRepeated(phrase, letter);
        System.out.println("");
        
        System.out.println("Please enter a new sentence to compare its length with the previous sentence:");
        String newPhrase = scanner.next();
        phraseService.compareLength(phrase, newPhrase);
        System.out.println("");

        System.out.println("The two sentences will now be joined:");
        phraseService.joinPhrases(phrase, newPhrase);
        System.out.println("");
        
        System.out.println("Next we will replace all the letters [a].");
        System.out.println("Which character do you want to replace them with?");
        String newCharacter = scanner.next();
        System.out.println(phraseService.replaceLetters(phrase, newCharacter));
        System.out.println("");

        System.out.println("Finally, we will check if the phrase contains any character.");
        System.out.println("What character do you want to search for? We will return [true] if the phrase contains it, and [false] if not.");
        String letter3 = scanner.next();
        System.out.println(phraseService.containLetter(phrase, letter3));

    }

}
