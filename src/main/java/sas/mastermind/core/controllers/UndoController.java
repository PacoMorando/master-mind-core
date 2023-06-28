package sas.mastermind.core.controllers;


import sas.mastermind.core.models.Session;
import sas.mastermind.core.models.SessionImplementation;

public class UndoController extends Controller {

    private final SessionImplementation sessionImplementation;

    public UndoController(Session session) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }

    public boolean isUndoable() {
        return this.sessionImplementation.isUndoable();
    }

    public void undo() {
        this.sessionImplementation.undo();
    }
}
