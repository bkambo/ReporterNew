package com.springapp.mvc;

import org.springframework.beans.factory.parsing.Problem;

import java.util.TreeSet;

/**
 * Created by Chris on 15-03-14.
 */
public class ProblemManager {

    TreeSet<Problem> listOfProblems
    private static ProblemManager instance = null;

    public static ProblemManager getInstance(){
        if (instance == null) {
            instance = new ProblemManager();
        }
        return instance;
    }

    protected ProblemManager() {
        listOfProblems = new TreeSet<Problem>();
    }

    public void addProblem(Problem problemToAdd) {
        listOfProblems.add(problemToAdd);
    }

    public TreeSet<Problem> getProblems() {
        return listOfProblems;
    }


}
