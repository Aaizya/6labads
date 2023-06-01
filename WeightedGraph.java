import java.util.ArrayList;

import java.util.List;

public class WeightedGraph {

    private List<Vertex> vertices;

    public WeightedGraph(){ // constructor to init an empty weighted graph

        this.vertices = new ArrayList<>();

    }

    public void addVertex(Vertex vertex){ //method which add a vertex to the graph

        vertices.add(vertex);

    }

    public List<Vertex> getVertices(){ // method which retrieve list of vertices in graph

        return vertices;

    }

}