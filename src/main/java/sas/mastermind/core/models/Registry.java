package sas.mastermind.core.models;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private List<Memento> mementos;
    private final Game game;
    private int firstPrevious;

    public Registry(Game game) {
        this.game = game;
        this.reset();
        this.mementos.add(this.firstPrevious, this.game.createMemento());
    }

    public void reset() {
        this.firstPrevious = 0;
        this.mementos = new ArrayList<>();
    }

    void register() {
        for (int i = 0; i < this.firstPrevious; i++) {
            this.mementos.remove(0);
        }
        this.firstPrevious = 0;
        this.mementos.add(this.firstPrevious, this.game.createMemento());
    }

    public boolean isUndoable() {
        return this.firstPrevious < mementos.size() - 1;
    }

    public void undo() {
        this.firstPrevious++;
        this.game.setMemento(this.mementos.get(firstPrevious));
    }

    public boolean isRedoable() {
        return this.firstPrevious >= 1;
    }

    public void redo() {
        this.firstPrevious--;
        this.game.setMemento(this.mementos.get(firstPrevious));
    }
}
