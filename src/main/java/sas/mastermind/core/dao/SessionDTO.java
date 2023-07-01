package sas.mastermind.core.dao;

import sas.mastermind.core.models.Game;
import sas.mastermind.core.models.ProposedCombination;
import sas.mastermind.core.models.SecretCombination;
import sas.mastermind.core.models.Session;

import java.util.ArrayList;

public class SessionDTO {
    private Session session;

    public SessionDTO(Session session) {
        this.session = session;
    }

    public SecretCombination getSecretCombination() {
        return this.session.getSecretCombination();
    }

    public ArrayList<ProposedCombination> getProposeCombinations() {
        return this.session.getProposeCombinations();
    }

    public boolean hasName() {
        return this.session.hasName();
    }

    public String getName() {
        return this.session.getName();
    }

    public void setName(String name) {
        this.session.setName(name);
    }

    public void loadGame(Game game) {
        this.session.loadGame(game);
    }
}
