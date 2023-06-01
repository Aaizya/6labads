import java.util.ArrayList;

import java.util.List;

public class Search {

    protected int[] edgeTo;

    protected boolean[] visited;

    protected Vertex source;

    protected WeightedGraph graph;

    public Search (WeightedGraph graph, Vertex source){

        this.graph = graph;

        this.source = source;

        visited = new boolean[graph.getVertices().size()];

        edgeTo = new int[graph.getVertices().size()];

        initial();

    }

    private void initial(){

        for (int i = 0; i< visited.length; i++){

            visited[i] = false;

            edgeTo[i] = -1;




        }

    }

    public List<Vertex> getPath(Vertex destination){

        List<Vertex> path = new ArrayList<>();

        if(!visited[destination.getId()]){

            return path;

        }

        int curr = destination.getId();

        while (curr != source.getId()){

            path.add(0, graph.getVertices().get(curr));

            curr = edgeTo[curr];

        }

        path.add(0,source);

        return path;

    }




}