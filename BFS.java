import java.util.LinkedList;

import java.util.Queue;




public class BFS extends Search {

    public BFS(WeightedGraph graph, Vertex source){

        super(graph,source);

        bfs(source);

    }

    private void bfs(Vertex source){

        Queue<Vertex> q = new LinkedList<>();

        visited[source.getId()] = true;

        q.offer(source);

        while (!q.isEmpty()){

            Vertex curr_V = q.poll();

            for (Edge edge : curr_V.getAdjacentEdges()){

                Vertex adj_V = edge.getDestination();

                if(!visited[adj_V.getId()]){

                    visited[adj_V.getId()] = true;

                    edgeTo[adj_V.getId()] = curr_V.getId();

                    q.offer(adj_V);

                }

            }

        }

    }

}
