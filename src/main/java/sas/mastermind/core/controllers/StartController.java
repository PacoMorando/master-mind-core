package sas.mastermind.core.controllers;

import sas.mastermind.core.models.Session;

public abstract class StartController extends AcceptorController {

    public StartController(Session session) {
        super(session);
    }

    public abstract void start();

    public abstract void start(String title);

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public abstract String[] getGamesNames();
}
