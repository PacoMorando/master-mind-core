package sas.mastermind.core.dao;

import sas.mastermind.core.models.SecretCombination;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class SecretCombinationDAO {

    SecretCombination secretCombination;
    public SecretCombinationDAO(SecretCombination secretCombination) {
        this.secretCombination = secretCombination;
    }

    public SecretCombination load(BufferedReader bufferedReader) {
        try {
            return new SecretCombination(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(FileWriter fileWriter) {
        try {
            fileWriter.write(this.secretCombination.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
