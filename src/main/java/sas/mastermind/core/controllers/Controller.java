package sas.mastermind.core.controllers;

import sas.mastermind.core.models.Session;

public abstract class Controller {

    protected Session session;

    public Controller(Session session) {
        this.session = session;
    }
}