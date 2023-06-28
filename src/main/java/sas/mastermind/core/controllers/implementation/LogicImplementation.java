package sas.mastermind.core.controllers.implementation;

import sas.mastermind.core.controllers.Logic;
import sas.mastermind.core.models.DAO.SessionImplementationDAO;
import sas.mastermind.core.models.SessionImplementation;
import sas.mastermind.core.models.StateValue;

public class LogicImplementation extends Logic {

    protected SessionImplementationDAO sessionImplementationDAO;

    public LogicImplementation(SessionImplementationDAO sessionImplementationDAO) {
        this.session = new SessionImplementation();
        this.sessionImplementationDAO = sessionImplementationDAO;
        this.sessionImplementationDAO.associate((SessionImplementation) this.session);
        this.acceptorControllerMap.put(StateValue.INITIAL, new StartControllerImplementation(this.session, this.sessionImplementationDAO));
        this.acceptorControllerMap.put(StateValue.IN_GAME, new PlayControllerImplementation(this.session));
        this.acceptorControllerMap.put(StateValue.SAVING, new SaveControllerImplementation(this.session, this.sessionImplementationDAO));
        this.acceptorControllerMap.put(StateValue.RESUME, new ResumeControllerImplementation(this.session));
        this.acceptorControllerMap.put(StateValue.EXIT, null);
    }
}
