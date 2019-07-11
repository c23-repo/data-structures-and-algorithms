package code401Challenges.TreeIntersection;

import code401Challenges.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;



public class TreeIntersection {

    public static ArrayList<Integer> treeIntersection(Tree<Integer> treeA, Tree<Integer> treeB) {
        HashSet<Integer> hashSetA = new HashSet<>();
        HashSet<Integer> hashSetB = new HashSet<>();

        for (Integer treeValue: treeA.preOrder())
            hashSetA.add(treeValue);

        for (Integer treeValue: treeB.preOrder())
            if (hashSetA.contains(treeValue))
                hashSetB.add(treeValue);
        return new ArrayList<>(hashSetB);
    }
}
