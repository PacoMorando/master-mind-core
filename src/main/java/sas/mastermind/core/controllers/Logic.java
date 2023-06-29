package sas.mastermind.core.controllers;

import sas.mastermind.core.models.Session;
import sas.mastermind.core.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public abstract class Logic {
    protected Session session;
    protected Map<StateValue, AcceptorController> acceptorControllerMap;

    public Logic() {
        this.acceptorControllerMap = new HashMap<>();
    }

    public AcceptorController getController() {
        return this.acceptorControllerMap.get(this.session.getValueState());
    }
}