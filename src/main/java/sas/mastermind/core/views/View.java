package sas.mastermind.core.views;

import sas.mastermind.core.controllers.AcceptorController;
import sas.mastermind.core.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {
    public void interact(AcceptorController acceptorController) {
        acceptorController.accept(this);
    }
}