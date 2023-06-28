package sas.mastermind.core.models;

import java.util.ArrayList;

public class SessionImplementation implements Session {

    private Game game;
    private final State state;
    private Registry registry;
    private String name;

    public SessionImplementation() {
        this.state = new State();
        this.game = new Game();
        this.registry = new Registry(game);
    }

    public void reset() {
        this.game.reset();
        this.state.reset();
        this.registry.reset();
    }

    @Override
    public StateValue getValueState() {
        return this.state.stateValue;
    }

    public void next() {
        this.state.next();
    }

    public SecretCombination getSecretCombination() {
        return this.game.getSecretCombination();
    }

    public int getCurrentAttempt() {
        return this.game.getCurrentAttempt();
    }

    public void addProposedCombination(String colorsProposed) {
        this.game.addProposedCombination(colorsProposed);
    }

    public void nextAttempt() {
        this.game.nextAttempt();
    }

    public boolean isFinished() {
        return this.game.isFinished();
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public ArrayList<ProposedCombination> getProposeCombinations() {
        return this.game.getProposeCombinations();
    }

    public int calculateBlacks(ProposedCombination proposedCombination) {
        return this.game.calculateBlacks(proposedCombination);
    }

    public int calculateWhites(ProposedCombination proposedCombination) {
        return this.game.calculateWhites(proposedCombination);
    }

    public boolean isUndoable() {
        return this.registry.isUndoable();
    }

    public void undo() {
        this.registry.undo();
    }

    public boolean isRedoable() {
        return this.registry.isRedoable();
    }

    public void redo() {
        this.registry.redo();
    }

    public void register() {
        this.registry.register();
    }

    public boolean hasName() {
        return this.name != null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return this.game;
    }

    public void newGame() {
        this.name = null;
        this.game = new Game();
        this.registry = new Registry(game);
    }

    public void loadGame(Game game) {
        this.game = game;
        this.registry = new Registry(game);
    }
}