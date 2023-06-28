package sas.mastermind.core.controllers.implementation;

import sas.mastermind.core.controllers.StartController;
import sas.mastermind.core.models.DAO.SessionImplementationDAO;
import sas.mastermind.core.models.Session;
import sas.mastermind.core.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

    private final SessionImplementationDAO sessionImplementationDAO;
    private final SessionImplementation sessionImplementation;

    StartControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }

    @Override
    public void start() {//aqui se tiene que crear una session impletation nueva o sin nombre?
        this.sessionImplementation.newGame();
        this.sessionImplementationDAO.associate((SessionImplementation) this.session);
        this.sessionImplementation.next();
    }

    @Override
    public void start(String title) {
        this.sessionImplementationDAO.load(title);
        this.sessionImplementationDAO.associate((SessionImplementation) this.session);
        this.sessionImplementation.next();
    }

    @Override
    public String[] getGamesNames() {
        return this.sessionImplementationDAO.getGamesNames();
    }
}