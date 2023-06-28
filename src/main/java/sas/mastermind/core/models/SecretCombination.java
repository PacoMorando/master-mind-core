package sas.mastermind.core.models;

import java.util.ArrayList;

public class SecretCombination extends Combination {

    public SecretCombination() {
        this.colors = new ArrayList<>();
        this.generate();
    }

    public SecretCombination(String secretCombination) {
        this.colors = new ArrayList<>();
        this.setCombinationColors(secretCombination);
    }

    public void reset() {
        this.colors.clear();
        this.generate();
    }

    private void generate() {
        for (int i = 0; i < Combination.MAX_COLORS_NUM; i++) {
            this.colors.add(Colors.values()[(int) Math.floor(Math.random() * Colors.values().length)]);
        }
    }

    public ArrayList<Colors> getColors() {
        return this.colors;
    }

}
