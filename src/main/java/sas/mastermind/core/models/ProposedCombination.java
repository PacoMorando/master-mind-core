package sas.mastermind.core.models;

import java.util.ArrayList;

public class ProposedCombination extends Combination {

    public ProposedCombination(String colors) {
        this.colors = new ArrayList<>();
        this.setCombinationColors(colors);
    }
}
