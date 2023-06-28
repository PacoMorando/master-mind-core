package sas.mastermind.core.controllers.implementation;

import sas.mastermind.core.controllers.SaveController;
import sas.mastermind.core.models.DAO.SessionImplementationDAO;
import sas.mastermind.core.models.Session;
import sas.mastermind.core.models.SessionImplementation;

public class SaveControllerImplementation extends SaveController {

    private final SessionImplementationDAO sessionImplementationDAO;

    public SaveControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }

    @Override
    public void save(String name) {
        this.sessionImplementationDAO.save(name);
    }

    @Override
    public void save() {
        this.sessionImplementationDAO.save();
    }

    @Override
    public void next() {
        ((SessionImplementation) this.session).next();
    }

    @Override
    public boolean hasName() {
        return ((SessionImplementation) this.session).hasName();
    }

    @Override
    public boolean exists(String name) {
        return this.sessionImplementationDAO.exist(name);
    }
}
