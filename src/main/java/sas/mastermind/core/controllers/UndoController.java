package sas.mastermind.core.controllers;


import sas.mastermind.core.models.Session;

public class UndoController extends Controller {

    //private final Session session;

    public UndoController(Session session) {
        super(session);
       // this.session = ((Session) this.session);
    }

    public boolean isUndoable() {
        return this.session.isUndoable();
    }

    public void undo() {
        this.session.undo();
    }
}
