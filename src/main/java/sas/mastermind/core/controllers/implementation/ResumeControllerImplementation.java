package sas.mastermind.core.controllers.implementation;

import sas.mastermind.core.controllers.ResumeController;
import sas.mastermind.core.models.Session;
import sas.mastermind.core.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

    private final SessionImplementation sessionImplementation;

    public ResumeControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }

    @Override
    public void resume(boolean newGame) {
        if (newGame) {
            this.sessionImplementation.reset();
        } else {
            this.sessionImplementation.next();
        }
    }
}