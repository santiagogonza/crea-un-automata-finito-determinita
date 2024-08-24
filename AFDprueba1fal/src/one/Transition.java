package one;

public class Transition {
    private int startState;
    private char symbol;
    private int endState;

    public Transition(int startState, char symbol, int endState) {
        this.startState = startState;
        this.symbol = symbol;
        this.endState = endState;
    }

    public int getStartState() {
        return startState;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getEndState() {
        return endState;
    }
}
