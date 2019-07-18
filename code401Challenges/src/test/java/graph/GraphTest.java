package graph;

import org.junit.Before;
import org.junit.Test;
import sun.security.provider.PolicyParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;


// Worked with Stephen

public class GraphTest {

    public Graph<Integer> testGraph;
    public Graph<Integer> testBreadthGraph1;
    public Graph<Integer> testBreadthGraph2;


    @Before
    public void setTestGraph() {
        this.testGraph = new Graph<>();
    }

    @Before
    public void setTestBreadthGraph1() {

        testBreadthGraph1 = new Graph<>();
        testBreadthGraph1.addNode(10);
        testBreadthGraph1.addNode(20);
        testBreadthGraph1.addNode(30);
        testBreadthGraph1.addNode(40);

        GraphNode<Integer> node1 = testBreadthGraph1.getNodes().get(0);
        GraphNode<Integer> node2 = testBreadthGraph1.getNodes().get(1);
        GraphNode<Integer> node3 = testBreadthGraph1.getNodes().get(2);
        GraphNode<Integer> node4 = testBreadthGraph1.getNodes().get(3);

        testBreadthGraph1.addEdge(node1, node2, 15);
        testBreadthGraph1.addEdge(node1, node3, 30);
        testBreadthGraph1.addEdge(node1, node4, 45);
    }

    @Before
    public void setTestBreadthGraph2() {

        testBreadthGraph2 = new Graph<>();
        testBreadthGraph2.addNode(10);
        testBreadthGraph2.addNode(20);
        testBreadthGraph2.addNode(30);
        testBreadthGraph2.addNode(40);
        testBreadthGraph2.addNode(50);
        testBreadthGraph2.addNode(60);

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

    @Test
    public void testSize() {
        this.testGraph.addNode(4);
        this.testGraph.addNode(5);
        this.testGraph.addNode(6);
        this.testGraph.addNode(7);

        assertEquals(4, this.testGraph.size());
    }

    @Test
    public void testNoNeighbors() {
        this.testGraph.addNode(4);
        this.testGraph.addNode(5);

        GraphNode<Integer> node1 = this.testGraph.getNodes().get(0);
        GraphNode<Integer> node2 = this.testGraph.getNodes().get(1);
        ArrayList<GraphNode<Integer>> neigh = new ArrayList<>();


        assertTrue(this.testGraph.getNeighbors(node1).equals(neigh));
        assertTrue(this.testGraph.getNeighbors(node2).equals(neigh));
    }

    @Test
    public void testEdgeAndNeighbors() {
        this.testGraph.addNode(4);
        this.testGraph.addNode(5);
        this.testGraph.addNode(6);
        this.testGraph.addNode(7);

        GraphNode<Integer> node1 = this.testGraph.getNodes().get(0);
        GraphNode<Integer> node2 = this.testGraph.getNodes().get(1);
        GraphNode<Integer> node3 = this.testGraph.getNodes().get(2);

        this.testGraph.addEdge(node2, node1, 20);
        this.testGraph.addEdge(node1, node3, 35);
        this.testGraph.addEdge(node2, node3, 10);
        HashMap<GraphNode<Integer>, Integer> weight = new HashMap<>();
        ArrayList<GraphNode<Integer>> neigh = new ArrayList<>();

        neigh.add(node2);
        neigh.add(node3);

        System.out.println(this.testGraph.getNeighbors(node1));


        assertTrue(this.testGraph.getNeighbors(node1).equals(neigh));
    }

    @Test
    public void testGetNodes() {
        this.testGraph.addNode(4);
        this.testGraph.addNode(5);
        this.testGraph.addNode(6);
        this.testGraph.addNode(7);

        ArrayList<GraphNode<Integer>> vertecies = new ArrayList<>();
        GraphNode<Integer> node1 = this.testGraph.getNodes().get(0);
        GraphNode<Integer> node2 = this.testGraph.getNodes().get(1);
        GraphNode<Integer> node3 = this.testGraph.getNodes().get(2);
        GraphNode<Integer> node4 = this.testGraph.getNodes().get(3);

        vertecies.add(node1);
        vertecies.add(node2);
        vertecies.add(node3);
        vertecies.add(node4);

        assertTrue(this.testGraph.getNodes().equals(vertecies));
    }

    @Test
    public void testBreadthFirst1() {
        GraphNode<Integer> node1 = this.testBreadthGraph1.getNodes().get(0);
        GraphNode<Integer> node2 = this.testBreadthGraph1.getNodes().get(1);
        GraphNode<Integer> node3 = this.testBreadthGraph1.getNodes().get(2);

        assertTrue("Should return output",
                this.testBreadthGraph1.breadthFirst(node1).equals(Arrays.asList(10, 20, 30, 40))
        );
        assertTrue("Should return output",
                this.testBreadthGraph1.breadthFirst(node2).equals(Arrays.asList(20, 10, 30, 40))
        );
        assertTrue("Should return output",
                this.testBreadthGraph1.breadthFirst(node3).equals(Arrays.asList(30, 10, 20, 40))
        );
    }

    @Test
    public void testBreadthFirst2() {
        GraphNode<Integer> node1 = this.testBreadthGraph2.getNodes().get(0);
        GraphNode<Integer> node2 = this.testBreadthGraph2.getNodes().get(1);
        GraphNode<Integer> node3 = this.testBreadthGraph2.getNodes().get(2);
        GraphNode<Integer> node4 = this.testBreadthGraph2.getNodes().get(3);
        GraphNode<Integer> node5 = this.testBreadthGraph2.getNodes().get(4);
        GraphNode<Integer> node6 = this.testBreadthGraph2.getNodes().get(5);

        assertTrue("Should return output",
                this.testBreadthGraph2.breadthFirst(node1).equals(Arrays.asList(10))
        );
        assertTrue("Should return output",
                this.testBreadthGraph2.breadthFirst(node2).equals(Arrays.asList(20))
        );
        assertTrue("Should return output",
                this.testBreadthGraph2.breadthFirst(node3).equals(Arrays.asList(30))
        );
        assertTrue("Should return output",
                this.testBreadthGraph2.breadthFirst(node4).equals(Arrays.asList(40))
        );
        assertTrue("Should return output",
                this.testBreadthGraph2.breadthFirst(node5).equals(Arrays.asList(50))
        );
        assertTrue("Should return output",
                this.testBreadthGraph2.breadthFirst(node6).equals(Arrays.asList(60))
        );
    }
}