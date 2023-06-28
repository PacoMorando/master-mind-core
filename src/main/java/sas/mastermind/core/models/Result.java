package sas.mastermind.core.models;

import java.util.ArrayList;

public class Result {

    ArrayList<Colors> secretColors;

    public Result(ArrayList<Colors> secretColors) {
        this.secretColors = secretColors;
    }

    public boolean isWinner(ArrayList<Colors> proposedColors) {
        return this.getBlacks(proposedColors) == Combination.MAX_COLORS_NUM;
    }

    public int getBlacks(ArrayList<Colors> proposedColors) {
        int blacks = 0;
        for (int i = 0; i < Combination.MAX_COLORS_NUM; i++) {
            if (this.secretColors.get(i) == proposedColors.get(i)) {
                blacks++;
            }
        }
        return blacks;
    }

    public int getWhites(ArrayList<Colors> proposedColors) {
        int whiteSpikes = 0;
        ArrayList<Colors> secretCopyForValidation = new ArrayList<>(this.secretColors);
        for (int i = 0; i < Combination.MAX_COLORS_NUM; i++) {
            for (int j = 0; j < Combination.MAX_COLORS_NUM; j++) {
                if (secretCopyForValidation.get(j) != null && secretCopyForValidation.get(j) == proposedColors.get(i)) {
                    whiteSpikes++;
                    secretCopyForValidation.set(j, null);
                    break;//buscar el while...
                }
            }
        }
        return whiteSpikes - getBlacks(proposedColors);
    }
}
