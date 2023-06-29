package sas.mastermind.core.dao;

import sas.mastermind.core.models.ProposedCombination;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProposedCombinationDAO {

    private final ArrayList<ProposedCombination> proposedCombinations;

    public ProposedCombinationDAO(ArrayList<ProposedCombination> proposeCombinations) {
        this.proposedCombinations = proposeCombinations;
    }

    public ArrayList<ProposedCombination> load(BufferedReader bufferedReader) {
        try {
            String line;
            int lineIndex = 0;
            while ((line = bufferedReader.readLine()) != null) {
                //lineIndex++; //revisar aqui porq no caega bien
                /*if (lineIndex != 1) {
                    this.proposedCombinations.add(new ProposedCombination(line));
                }*/
                this.proposedCombinations.add(new ProposedCombination(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.proposedCombinations;
    }

    public void save(FileWriter fileWriter) {
        try {
            for (ProposedCombination proposedCombination : this.proposedCombinations) {
                fileWriter.write("\n" + proposedCombination.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}