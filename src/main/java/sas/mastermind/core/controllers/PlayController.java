package sas.mastermind.core.controllers;

import sas.mastermind.core.models.ProposedCombination;
import sas.mastermind.core.models.SecretCombination;
import sas.mastermind.core.models.Session;

import java.util.ArrayList;

public abstract class PlayController extends AcceptorController {
    public PlayController(Session session) {
        super(session);
    }

    public abstract SecretCombination getSecretCombination();

    public abstract int getCurrentAttempt();

    public abstract void addProposedCombination(String colorsProposed);

    public abstract boolean isFinished();

    public abstract boolean isWinner();

    public abstract ArrayList<ProposedCombination> getProposeCombinations();

    public abstract int calculateBlacks(ProposedCombination proposedCombination);

    public abstract int calculateWhites(ProposedCombination proposedCombination);

    public abstract boolean isUndoable();

    public abstract void undo();

    public abstract boolean isRedoable();

    public abstract void redo();

    public void next() {
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
