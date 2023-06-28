package sas.mastermind.core.models;

import java.util.ArrayList;

public class Memento {
    private final ArrayList<ProposedCombination> proposedCombination;

    public Memento(ArrayList<ProposedCombination> proposedCombinations) {
        this.proposedCombination = new ArrayList<>();
        this.proposedCombination.addAll(proposedCombinations);
    }

    public ArrayList<ProposedCombination> getProposedCombinations() {
        return this.proposedCombination;
    }
}
