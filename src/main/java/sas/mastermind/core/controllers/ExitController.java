package sas.mastermind.core.controllers;

import sas.mastermind.core.models.Session;
import sas.mastermind.core.models.SessionImplementation;

public class ExitController extends Controller {
    public ExitController(Session session) {
        super(session);
    }

    public void next() {
        ((SessionImplementation) this.session).next();
    }
}
