package sas.mastermind.core.controllers;

import sas.mastermind.core.models.Session;

public class ExitController extends Controller {
    public ExitController(Session session) {
        super(session);
    }

    public void next() {
        ((Session) this.session).next();
    }
}
