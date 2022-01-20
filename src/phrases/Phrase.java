package phrases;

public class Phrase {
     
        // Atributos
    private String phrase;
    private int phraseLength;
    
    //Constructors

    public Phrase() {
    }

    public Phrase(String phrase, int phraseLength) {
        this.phrase = phrase;
        this.phraseLength = phraseLength;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getPhraseLength() {
        return phraseLength;
    }

    public void setPhraseLength(int phraseLength) {
        this.phraseLength = phraseLength;
    }
    
    
}
