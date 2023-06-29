package sas.mastermind.core.dao;

import sas.mastermind.core.models.Game;

import java.io.BufferedReader;
import java.io.FileWriter;

public class GameDAO {

    private final SecretCombinationDAO secretCombinationDAO;
    private final ProposedCombinationDAO proposedCombinationsDAO;

    public GameDAO(Game game) {
        this.secretCombinationDAO = new SecretCombinationDAO(game.getSecretCombination());
        this.proposedCombinationsDAO = new ProposedCombinationDAO(game.getProposeCombinations());
    }

    public void save(FileWriter fileWriter) {
        this.secretCombinationDAO.save(fileWriter);
        this.proposedCombinationsDAO.save(fileWriter);
    }

    public Game load(BufferedReader bufferedReader) {
        return new Game(this.secretCombinationDAO.load(bufferedReader), this.proposedCombinationsDAO.load(bufferedReader));
    }
}