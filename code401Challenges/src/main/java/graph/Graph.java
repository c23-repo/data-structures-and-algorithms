package graph;

import java.util.ArrayList;
import java.util.HashSet;


// Worked with Stephen

public class Graph<T> {

    private ArrayList<GraphNode<T>> nodes;

    public Graph(){
        this.setNodes(new ArrayList<>());
    }

    public GraphNode<T> addNode(T value) {
        GraphNode<T> newNode = new GraphNode<>(value);
        ArrayList<GraphNode<T>> nodes = this.getNodes();
        nodes.add(newNode);
        this.setNodes(nodes);
        return newNode;
    }

    public void addEdge(GraphNode<T> nodeA, GraphNode<T> nodeB, Integer weight){

        if (this.getNodes().contains(nodeA) && this.getNodes().contains(nodeB)){
            nodeA.addNeighbor(nodeB, weight);
            nodeB.addNeighbor(nodeA, weight);
        }

    }

    public ArrayList<GraphNode<T>> getNeighbors(GraphNode<T> node){
        return node.getNeighbors();
    }


    public int size(){
        return this.getNodes().size();
    }

    public ArrayList<T> breadthFirst(GraphNode<T> node) {

        ArrayList<T> answer = new ArrayList<>();
        HashSet<GraphNode<T>> visited = new HashSet<>();
        ArrayList<GraphNode<T>> queue = new ArrayList<>();
        GraphNode<T> holder;

        if (getNodes().contains(node)) {

            visited.add(node);
            queue.add(node);

            while (!queue.isEmpty()){
                holder = queue.remove(0);

                for (GraphNode<T> checked : holder.getNeighbors()){
                    if (visited.add(checked)){

                        queue.add(checked);
                    }
                }

                answer.add(holder.getValue());
            }

        }
        return answer;
    }


    public ArrayList<GraphNode<T>> getNodes() {
        return new ArrayList<>(this.nodes);
    }

    public void setNodes(ArrayList<GraphNode<T>> nodes) {
        this.nodes = new ArrayList<>(nodes);
    }
}
