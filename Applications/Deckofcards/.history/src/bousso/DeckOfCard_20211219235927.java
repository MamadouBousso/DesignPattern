import java.util.ArrayList;
import java.util.List;

public class DeckOfCard {
    
    private List<abscard> deck;

    public List<abscard> getDeck() {
        return deck;
    }

    public void setDeck(List<abscard> deck) {
        this.deck = deck;
    }

    public DeckOfCard() {
        deck = new ArrayList<abscard> ();
    }

    
}
