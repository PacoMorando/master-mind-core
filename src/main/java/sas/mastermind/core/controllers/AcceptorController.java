package sas.mastermind.core.controllers;

import sas.mastermind.core.models.Session;

public abstract class AcceptorController extends Controller{
    AcceptorController(Session session) {
        super(session);
    }

    public abstract void accept(ControllerVisitor controllerVisitor);
}