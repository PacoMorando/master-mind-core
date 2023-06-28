package sas.mastermind.core.models;

import java.util.ArrayList;

public class Game {

    private static final int MAX_NUMBER_OF_ATTEMPTS = 10;
    private SecretCombination secretCombination;
    private ArrayList<ProposedCombination> proposedCombinations;
    private Result result;
    private int currentAttempt;

    public Game() {
        this.newGame();
    }

    public Game(SecretCombination secretCombination, ArrayList<ProposedCombination> proposedCombinations) {
        this.secretCombination = secretCombination;
        this.proposedCombinations = proposedCombinations;
        this.nextAttempt();
        this.result = new Result(this.secretCombination.getColors());
    }

    private void newGame() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<>();
        this.result = new Result(this.secretCombination.getColors());
    }

    public boolean isFinished() {
        if (currentAttempt == 0) {
            return false;
        }
        return this.currentAttempt >= Game.MAX_NUMBER_OF_ATTEMPTS || this.isWinner();
    }

    public boolean isWinner() {
        return this.result.isWinner(this.proposedCombinations.get(currentAttempt - 1).getColors());
    }

    public void nextAttempt() {
        //this.currentAttempt++; ESTE METODO DEBERIA SER PRIVATE Y EJECUTARSE EN EL addProposedcombination
        this.currentAttempt = proposedCombinations.size();
    }

    public void reset() {
        this.secretCombination.reset();
        this.proposedCombinations.clear();
        this.currentAttempt = 0;
    }

    public void addProposedCombination(String colorsProposed) {
        this.proposedCombinations.add(new ProposedCombination(colorsProposed));
    }

    public int calculateBlacks(ProposedCombination proposedCombination) {
        return this.result.getBlacks(proposedCombination.getColors());
    }

    public int calculateWhites(ProposedCombination proposedCombination) {
        return this.result.getWhites(proposedCombination.getColors());
    }

    public int getCurrentAttempt() {
        return this.currentAttempt;
    }

    public ArrayList<ProposedCombination> getProposeCombinations() {
        return this.proposedCombinations;
    }

    public SecretCombination getSecretCombination() {
        return this.secretCombination;
    }

    public Memento createMemento() {
        return new Memento(this.proposedCombinations);
    }

    public void setMemento(Memento memento) {
        this.proposedCombinations.clear();
        this.proposedCombinations.addAll(memento.getProposedCombinations());
        this.currentAttempt = memento.getProposedCombinations().size();
    }
}