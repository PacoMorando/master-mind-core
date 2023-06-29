package sas.mastermind.core.controllers;

import sas.mastermind.core.models.Session;

public class RedoController extends Controller {

    //private final Session session;

    public RedoController(Session session) {
        super(session);
        //this.session = ((Session) this.session);
    }

    public boolean isRedoable() {
        return this.session.isRedoable();
    }

    public void redo() {
        this.session.redo();
    }
}
