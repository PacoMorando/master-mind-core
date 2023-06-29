package sas.mastermind.core.dao;

import sas.mastermind.core.models.Session;

import java.io.*;

public class SessionDAO {

    public static final String EXTENSION = ".txt";
    public static final String DIRECTORY = "/home/pacomorando/FileClassTest/";
    private static File directory;
    private Session session;
    private GameDAO gameDAO;

    static {
        SessionDAO.directory = new File(SessionDAO.DIRECTORY);
    }

    public void associate(Session session) {
        this.session = session;
        this.gameDAO = new GameDAO(this.session.getGame());
    }

    public void load(String name) {
        this.session.setName(name);
        File file = new File(SessionDAO.directory, name);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            this.session.loadGame(this.gameDAO.load(bufferedReader));
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        this.save(this.session.getName());
    }

    public void save(String name) {
        if (name.endsWith(SessionDAO.EXTENSION)) {
            name = name.replace(SessionDAO.EXTENSION, "");
        }
        File file = new File(SessionDAO.directory, name + SessionDAO.EXTENSION);
        try {
            FileWriter fileWriter = new FileWriter(file);
            this.gameDAO.save(fileWriter);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getGamesNames() {
        return SessionDAO.directory.list();
    }

    public boolean exist(String name) {
        for (String auxName : this.getGamesNames()) {
            if (auxName.equals(name + SessionDAO.EXTENSION)) {
                return true;
            }
        }
        return false;
    }
}