package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GraphTest {

    public Graph<Integer> testGraph;

    @Before
    public void setTestGraph(){
        this.testGraph = new Graph<>();
    }

    @Test
    public void testInstantiate() {
        Graph graph = new Graph();
    }

    @Test
    public void testAddNode() {

        this.testGraph.addNode(5);
    }

    @Test
    public void testAddTwoNodes() {
        this.testGraph.addNode(2);
        this.testGraph.addNode(3);
    }

    
}