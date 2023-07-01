package sas.mastermind.core.controllers;

import sas.mastermind.core.dao.SessionDAO;
import sas.mastermind.core.models.Session;

public class SaveController extends AcceptorController {

    private final SessionDAO sessionDAO;

    public SaveController(Session session, SessionDAO sessionDAO) {
        super(session);
        this.sessionDAO = sessionDAO;
    }

    public void save(String name) {
        this.sessionDAO.save(name);
    }

    public void save() {
        this.sessionDAO.save();
    }

    public void next() {
        this.session.next();
    }

    public boolean hasName() {
        return this.session.hasName();
    }

    public boolean exists(String name) {
        return this.sessionDAO.exist(name);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
