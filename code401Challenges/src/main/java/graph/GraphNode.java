package graph;

import java.util.HashMap;

public class GraphNode<T> {

    private T value;
    private HashMap<GraphNode<T>, Integer> neighbors;

    public GraphNode(T value){
        this.setValue(value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public HashMap<GraphNode<T>, Integer> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(HashMap<GraphNode<T>, Integer> neighbors) {
        this.neighbors = neighbors;
    }
}
