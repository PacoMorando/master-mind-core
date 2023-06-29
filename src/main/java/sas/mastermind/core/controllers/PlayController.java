package sas.mastermind.core.controllers;

import sas.mastermind.core.models.*;

import java.util.ArrayList;

public class PlayController extends AcceptorController {

    private final ProposedCombinationController proposedCombinationController;
    private final UndoController undoController;
    private final RedoController redoController;
    private final ExitController exitController;

    public PlayController(Session session) {
        super(session);
        this.proposedCombinationController = new ProposedCombinationController(session);
        this.undoController = new UndoController(session);
        this.redoController = new RedoController(session);
        this.exitController = new ExitController(session);
    }

    public SecretCombination getSecretCombination() {
        return this.proposedCombinationController.getSecretCombination();
    }

    public int getCurrentAttempt() {
        return this.proposedCombinationController.getCurrentAttempt();
    }

    public void addProposedCombination(String colorsProposed) {
        this.proposedCombinationController.addProposedCombination(colorsProposed);
    }

    public boolean isFinished() {
        return this.proposedCombinationController.isFinished();
    }

    public boolean isWinner() {
        return this.proposedCombinationController.isWinner();
    }

    public ArrayList<ProposedCombination> getProposeCombinations() {
        return this.proposedCombinationController.getProposeCombinations();
    }

    public int calculateBlacks(ProposedCombination proposedCombination) {
        return this.proposedCombinationController.calculateBlacks(proposedCombination);
    }

    public int calculateWhites(ProposedCombination proposedCombination) {
        return this.proposedCombinationController.calculateWhites(proposedCombination);
    }

    public boolean isUndoable() {
        return this.undoController.isUndoable();
    }

    public void undo() {
        this.undoController.undo();
    }

    public boolean isRedoable() {
        return this.redoController.isRedoable();
    }

    public void redo() {
        this.redoController.redo();
    }

    public void next() {
        this.exitController.next();
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
