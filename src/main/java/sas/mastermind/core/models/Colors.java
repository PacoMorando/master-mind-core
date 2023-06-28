package sas.mastermind.core.models;

public enum Colors {
    RED('r'),
    GREEN('g'),
    BLUE('b'),
    YELLOW('y'),
    CYAN('c'),
    MAGENTA('m');

    public static final String POSSIBLE_COLORS = "rgybmc";

    private final char colorChar;

    Colors(char colorChar) {
        this.colorChar = colorChar;
    }

    public char getColorChar() {
        return this.colorChar;
    }
}