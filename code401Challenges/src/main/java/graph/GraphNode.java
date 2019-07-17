package graph;

import java.util.ArrayList;
import java.util.HashMap;


// Worked with Stephen

public class GraphNode<T> {

    private T value;
    private HashMap<GraphNode<T>, Integer> weight;
    private ArrayList<GraphNode<T>> neighbors;

    public GraphNode(T value){
        this.setValue(value);
        this.setWeight(new HashMap<>());
    }

    public void addNeighbor(GraphNode<T> node, Integer weight ){
        HashMap<GraphNode<T>, Integer> tempHashMap = getWeight();
        tempHashMap.put(node, weight);
        setWeight(tempHashMap);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public HashMap<GraphNode<T>, Integer> getWeight() {
        return new HashMap<>(weight);
    }

    public void setWeight(HashMap<GraphNode<T>, Integer> weight) {
        this.weight = new HashMap<>(weight);
    }

    public ArrayList<GraphNode<T>> getNeighbors() {
        return new ArrayList<>(neighbors);
    }

    public void setNeighbors(ArrayList<GraphNode<T>> neighbors) {
        this.neighbors = new ArrayList<>(neighbors);
    }
}
