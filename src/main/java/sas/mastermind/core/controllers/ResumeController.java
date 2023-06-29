package sas.mastermind.core.controllers;

import sas.mastermind.core.models.Session;

public class ResumeController extends AcceptorController {

   // private final Session session;

    public ResumeController(Session session) {
        super(session);
        //this.session = ((Session) this.session);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.session.reset();
        } else {
            this.session.next();
        }
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}