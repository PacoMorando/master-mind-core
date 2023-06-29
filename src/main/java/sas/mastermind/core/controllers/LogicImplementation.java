package sas.mastermind.core.controllers;

import sas.mastermind.core.dao.SessionDAO;
import sas.mastermind.core.models.Session;
import sas.mastermind.core.models.StateValue;

public class LogicImplementation extends Logic {

    protected SessionDAO sessionDAO;

    public LogicImplementation(SessionDAO sessionDAO) {
        this.session = new Session();
        this.sessionDAO = sessionDAO;
        this.sessionDAO.associate(this.session);
        this.acceptorControllerMap.put(StateValue.INITIAL, new StartController(this.session, this.sessionDAO));
        this.acceptorControllerMap.put(StateValue.IN_GAME, new PlayController(this.session));
        this.acceptorControllerMap.put(StateValue.SAVING, new SaveController(this.session, this.sessionDAO));
        this.acceptorControllerMap.put(StateValue.RESUME, new ResumeController(this.session));
        this.acceptorControllerMap.put(StateValue.EXIT, null);
    }
}