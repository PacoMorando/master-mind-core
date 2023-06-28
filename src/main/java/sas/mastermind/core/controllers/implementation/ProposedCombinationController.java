package sas.mastermind.core.controllers.implementation;

import sas.mastermind.core.controllers.Controller;
import sas.mastermind.core.models.ProposedCombination;
import sas.mastermind.core.models.SecretCombination;
import sas.mastermind.core.models.Session;
import sas.mastermind.core.models.SessionImplementation;

import java.util.ArrayList;

public class ProposedCombinationController extends Controller {
    private final SessionImplementation sessionImplementation;

    ProposedCombinationController(Session session) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }

    public void addProposedCombination(String colorsProposed) {
        this.sessionImplementation.addProposedCombination(colorsProposed);
        this.nextAttempt();
        this.sessionImplementation.register();
    }

    public void nextAttempt() {
        this.sessionImplementation.nextAttempt();
    }

    public SecretCombination getSecretCombination() {
        return this.sessionImplementation.getSecretCombination();
    }

    public int getCurrentAttempt() {
        return this.sessionImplementation.getCurrentAttempt();
    }


    public boolean isFinished() {
        return this.sessionImplementation.isFinished();
    }

    public boolean isWinner() {
        return this.sessionImplementation.isWinner();
    }

    public ArrayList<ProposedCombination> getProposeCombinations() {
        return this.sessionImplementation.getProposeCombinations();
    }

    public int calculateBlacks(ProposedCombination proposedCombination) {
        return this.sessionImplementation.calculateBlacks(proposedCombination);
    }

    public int calculateWhites(ProposedCombination proposedCombination) {
        return this.sessionImplementation.calculateWhites(proposedCombination);
    }
}
