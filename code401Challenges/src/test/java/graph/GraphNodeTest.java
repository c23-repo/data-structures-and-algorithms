package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GraphNodeTest {

    public GraphNode<Integer> testNode;

    @Before
    public void setUp(){
        this.testNode = new GraphNode<>(66);
    }

    @Test
    public void testInstantiate() {
        GraphNode<Integer> testNode = new GraphNode<Integer>(5);
    }

    @Test
    public void testGetValue() {
        assertTrue("Should return value",
                this.testNode.getValue().equals(66)
        );
    }

    @Test
    public void testGetNeighborsEmpty() {
        assertTrue("Should return empty",
                this.testNode.getWeight().equals(new HashMap<GraphNode<Integer>, Integer>())
        );
    }

    @Test
    public void testGetNeighbors(){
        GraphNode<Integer> newNode = new GraphNode<Integer>(54);
        this.testNode.addNeighbor(newNode, 3);

        HashMap<GraphNode<Integer>, Integer> testNeighbors = new HashMap<GraphNode<Integer>, Integer>();
        testNeighbors.put(newNode, 3);

        assertTrue("Should return empty",
                this.testNode.getWeight().equals(testNeighbors)
        );
    }
}