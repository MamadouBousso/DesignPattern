public abstract class abscard{

    private final Enum  symbol;

    private final int value;



    
    public Enum getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    public abscard(Enum symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }

    

}