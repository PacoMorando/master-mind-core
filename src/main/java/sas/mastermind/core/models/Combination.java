package sas.mastermind.core.models;

import java.util.ArrayList;

public class Combination {

    public static final int MAX_COLORS_NUM = 4;
    protected ArrayList<Colors> colors;

    public String toString() { //este metodo tal vez no deberia estar aqui
        char[] combinationColors = new char[Combination.MAX_COLORS_NUM];
        for (int i = 0; i < Combination.MAX_COLORS_NUM; i++) {
            combinationColors[i] = this.colors.get(i).getColorChar();
        }
        return new String(combinationColors);
    }

    protected void setCombinationColors(String combinationInString) {
        for (int i = 0; i < Combination.MAX_COLORS_NUM; i++) {
            int j = 0;
            do {
                if (combinationInString.charAt(i) == Colors.values()[j].getColorChar()) { //Preguntarse si hay una mejor manera de programar esto
                    this.colors.add(Colors.values()[j]);
                }
                j++;
            } while (combinationInString.charAt(i) != Colors.values()[j - 1].getColorChar());
        }
    }

    public ArrayList<Colors> getColors() {
        return this.colors;
    }
}
