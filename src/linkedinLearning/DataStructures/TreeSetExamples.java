package linkedinLearning.DataStructures;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

    public static void main(String[] args) {

        // Stores values in ascending order, can't have duplicates
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        System.out.println(treeSet);

        Set<String> wordSet = new TreeSet<>();
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        wordSet.add("wolf");
        System.out.println(wordSet);
        wordSet.remove("giraffe");
        System.out.println(wordSet);
    }
}
