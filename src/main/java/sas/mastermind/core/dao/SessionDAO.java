package sas.mastermind.core.dao;

import sas.mastermind.core.models.Session;

public abstract class SessionDAO {
    private SessionDTO sessionDTO;

    public void associate(Session session) {
        this.sessionDTO = new SessionDTO(session);
    }

    public abstract void load(String name);

    public abstract void save(String name);

    public void save() {
        this.save(this.sessionDTO.getName());
    }

    public abstract String[] getGamesNames();

    public abstract boolean exist(String name);
}