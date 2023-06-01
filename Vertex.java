import java.util.ArrayList;

import java.util.List;




public class Vertex {

    private int id;

    private List<Edge> adjacentEdges;

    public Vertex(int id) {

        this.id = id;

        this.adjacentEdges = new ArrayList<>();

    }

    public int getId(){

        return id;

    }

    public void addAdjacentEdge(Vertex vertex, int weight){

        Edge edge = new Edge(vertex, weight);

        adjacentEdges.add(edge);

    }

    public List<Edge> getAdjacentEdges(){

        return adjacentEdges;

    }

    public String toString(){

        return "Vertex " + id;

    }

}