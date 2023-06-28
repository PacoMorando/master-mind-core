package sas.mastermind.core.models.DAO;

import sas.mastermind.core.models.SessionImplementation;

import java.io.*;

public class SessionImplementationDAO {

    public static final String EXTENSION = ".txt";
    public static final String DIRECTORY = "/home/pacomorando/FileClassTest/";
    private static File directory;
    private SessionImplementation sessionImplementation;
    private GameDAO gameDAO;

    static {
        SessionImplementationDAO.directory = new File(SessionImplementationDAO.DIRECTORY);
    }

    public void associate(SessionImplementation sessionImplementation) {
        this.sessionImplementation = sessionImplementation;
        this.gameDAO = new GameDAO(this.sessionImplementation.getGame());
    }

    public void load(String name) {
        this.sessionImplementation.setName(name);
        File file = new File(SessionImplementationDAO.directory, name);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            this.sessionImplementation.loadGame(this.gameDAO.load(bufferedReader));
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        this.save(this.sessionImplementation.getName());
    }

    public void save(String name) {
        if (name.endsWith(SessionImplementationDAO.EXTENSION)) {
            name = name.replace(SessionImplementationDAO.EXTENSION, "");
        }
        File file = new File(SessionImplementationDAO.directory, name + SessionImplementationDAO.EXTENSION);
        try {
            FileWriter fileWriter = new FileWriter(file);
            this.gameDAO.save(fileWriter);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getGamesNames() {
        return SessionImplementationDAO.directory.list();
    }

    public boolean exist(String name) {
        for (String auxName : this.getGamesNames()) {
            if (auxName.equals(name + SessionImplementationDAO.EXTENSION)) {
                return true;
            }
        }
        return false;
    }
}