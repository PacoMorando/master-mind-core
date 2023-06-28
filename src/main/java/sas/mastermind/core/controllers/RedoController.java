package sas.mastermind.core.controllers;

import sas.mastermind.core.models.Session;
import sas.mastermind.core.models.SessionImplementation;

public class RedoController extends Controller {

    private final SessionImplementation sessionImplementation;

    public RedoController(Session session) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }

    public boolean isRedoable() {
        return this.sessionImplementation.isRedoable();
    }

    public void redo() {
        this.sessionImplementation.redo();
    }
}
