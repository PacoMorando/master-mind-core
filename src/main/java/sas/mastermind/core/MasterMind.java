package sas.mastermind.core;

import sas.mastermind.core.controllers.AcceptorController;
import sas.mastermind.core.controllers.Logic;
import sas.mastermind.core.views.View;

public abstract class MasterMind {

    private final Logic logic;
    private final View view;

    public MasterMind() {
        this.logic = this.createLogic();
        this.view = this.createView();
    }

    protected abstract Logic createLogic();

    protected abstract View createView();//Este es el factory method

    protected void play() {
        AcceptorController acceptorController;
        do {
            acceptorController = this.logic.getController();
            if (acceptorController != null) {
                this.view.interact(acceptorController);
            }
        } while (acceptorController != null);
    }
}