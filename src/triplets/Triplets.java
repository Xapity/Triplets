/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triplets;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author camac2045
 */
public class Triplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //first array list subjects
        ArrayList<String> subject = new ArrayList<String>();
        subject.add("Callum");
        subject.add("Lucas");
        subject.add("Andrew");
        subject.add("Seb");
        subject.add("Ahmed");
        //second array list verbs
        ArrayList<String> verbs = new ArrayList<String>();
        verbs.add("flew");
        verbs.add("clapped");
        verbs.add("jumped");
        verbs.add("raced");
        verbs.add("ripped");
        verbs.add("tripped");
        verbs.add("tapped");
        verbs.add("slapped");
        //last array list rhymes
        ArrayList<String> rhymes = new ArrayList<String>();
        rhymes.add("pig");
        rhymes.add("twig");
        rhymes.add("wig");
        rhymes.add("rig");
        rhymes.add("fig");
        rhymes.add("gig");

        //randomly choosing anything from the arraty list then adding it 
        int subjectRan = (int) (Math.random() * subject.size());
        int verbRan = (int) (Math.random() * verbs.size());
        int rhymeRan = (int) (Math.random() * rhymes.size());
        String line1 = subject.get(subjectRan) + " " + verbs.get(verbRan)
                + " to the " + rhymes.get(rhymeRan);
        //removing already used verbs and rhymes
        verbs.remove(verbRan);
        rhymes.remove(rhymeRan);
        //repeat above now for line 2
        int verbRan2 = (int) (Math.random() * verbs.size());
        int rhymeRan2 = (int) (Math.random() * rhymes.size());
        String line2 = "So it " + verbs.get(verbRan2) + " the " + rhymes.get(rhymeRan2);
        //remove already used
        verbs.remove(verbRan2);
        rhymes.remove(rhymeRan2);
        //repeating again for line 3
        int rhymeRan3 = (int) (Math.random() * rhymes.size());
        String line3 = "But it was a " + rhymes.get(rhymeRan3);
        //print final project
        System.out.println(line1 + "\n" + line2 + "\n" + line3);

    }

}
