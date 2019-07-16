package graph;

import java.util.HashMap;

public class GraphNode<T> {

    private T value;
    private HashMap<GraphNode<T>, Integer> neighbors;

    public GraphNode(T value){
        this.setValue(value);
        this.setNeighbors(new HashMap<>());
    }

    public void addNeighbor(GraphNode<T> node, Integer weight ){
        HashMap<GraphNode<T>, Integer> tempHashMap = getNeighbors();
        tempHashMap.put(node, weight);
        setNeighbors(tempHashMap);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public HashMap<GraphNode<T>, Integer> getNeighbors() {
        return new HashMap<>(neighbors);
    }

    public void setNeighbors(HashMap<GraphNode<T>, Integer> neighbors) {
        this.neighbors = new HashMap<>(neighbors);
    }
}
