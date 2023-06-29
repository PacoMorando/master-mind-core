package sas.mastermind.core.controllers;

import sas.mastermind.core.dao.SessionDAO;
import sas.mastermind.core.models.Session;

public class StartController extends AcceptorController {

    private final SessionDAO sessionDAO;
    //private final Session session;

    StartController(Session session, SessionDAO sessionDAO) {
        super(session);
        //this.session = ((Session) this.session);
        this.sessionDAO = sessionDAO;
    }

    public void start() {//aqui se tiene que crear una session impletation nueva o sin nombre?
        this.session.newGame();
        this.sessionDAO.associate((Session) this.session);
        this.session.next();
    }

    public void start(String title) {
        this.sessionDAO.load(title);
        this.sessionDAO.associate((Session) this.session);
        this.session.next();
    }

    public String[] getGamesNames() {
        return this.sessionDAO.getGamesNames();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}