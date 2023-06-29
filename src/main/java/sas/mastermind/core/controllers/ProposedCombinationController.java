package sas.mastermind.core.controllers;

import sas.mastermind.core.models.ProposedCombination;
import sas.mastermind.core.models.SecretCombination;
import sas.mastermind.core.models.Session;

import java.util.ArrayList;

public class ProposedCombinationController extends Controller {
    //private final Session session;

    ProposedCombinationController(Session session) {
        super(session);
        //this.session = ((Session) this.session);
    }

    public void addProposedCombination(String colorsProposed) {
        this.session.addProposedCombination(colorsProposed);
        this.nextAttempt();
        this.session.register();
    }

    public void nextAttempt() {
        this.session.nextAttempt();
    }

    public SecretCombination getSecretCombination() {
        return this.session.getSecretCombination();
    }

    public int getCurrentAttempt() {
        return this.session.getCurrentAttempt();
    }


    public boolean isFinished() {
        return this.session.isFinished();
    }

    public boolean isWinner() {
        return this.session.isWinner();
    }

    public ArrayList<ProposedCombination> getProposeCombinations() {
        return this.session.getProposeCombinations();
    }

    public int calculateBlacks(ProposedCombination proposedCombination) {
        return this.session.calculateBlacks(proposedCombination);
    }

    public int calculateWhites(ProposedCombination proposedCombination) {
        return this.session.calculateWhites(proposedCombination);
    }
}
