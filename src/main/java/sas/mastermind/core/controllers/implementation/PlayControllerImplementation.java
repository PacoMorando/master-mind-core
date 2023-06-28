package sas.mastermind.core.controllers.implementation;

import sas.mastermind.core.controllers.ExitController;
import sas.mastermind.core.controllers.PlayController;
import sas.mastermind.core.controllers.RedoController;
import sas.mastermind.core.controllers.UndoController;
import sas.mastermind.core.models.*;

import java.util.ArrayList;

public class PlayControllerImplementation extends PlayController {

    private final ProposedCombinationController proposedCombinationController;
    private final UndoController undoController;
    private final RedoController redoController;
    private final ExitController exitController;

    public PlayControllerImplementation(Session session) {
        super(session);
        this.proposedCombinationController = new ProposedCombinationController(session);
        this.undoController = new UndoController(session);
        this.redoController = new RedoController(session);
        this.exitController = new ExitController(session);
    }

    @Override
    public SecretCombination getSecretCombination() {
        return this.proposedCombinationController.getSecretCombination();
    }

    @Override
    public int getCurrentAttempt() {
        return this.proposedCombinationController.getCurrentAttempt();
    }

    @Override
    public void addProposedCombination(String colorsProposed) {
        this.proposedCombinationController.addProposedCombination(colorsProposed);
    }

    @Override
    public boolean isFinished() {
        return this.proposedCombinationController.isFinished();
    }

    @Override
    public boolean isWinner() {
        return this.proposedCombinationController.isWinner();
    }

    @Override
    public ArrayList<ProposedCombination> getProposeCombinations() {
        return this.proposedCombinationController.getProposeCombinations();
    }

    @Override
    public int calculateBlacks(ProposedCombination proposedCombination) {
        return this.proposedCombinationController.calculateBlacks(proposedCombination);
    }

    @Override
    public int calculateWhites(ProposedCombination proposedCombination) {
        return this.proposedCombinationController.calculateWhites(proposedCombination);
    }

    @Override
    public boolean isUndoable() {
        return this.undoController.isUndoable();
    }

    @Override
    public void undo() {
        this.undoController.undo();
    }

    @Override
    public boolean isRedoable() {
        return this.redoController.isRedoable();
    }

    @Override
    public void redo() {
        this.redoController.redo();
    }

    @Override
    public void next() {
        this.exitController.next();
    }
}
