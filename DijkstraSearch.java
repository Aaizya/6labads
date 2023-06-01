import java.util.ArrayList;

import java.util.Comparator;

import java.util.List;

import java.util.PriorityQueue;




public class DijkstraSearch extends Search {

    private int[] dist;




    public DijkstraSearch(WeightedGraph graph, Vertex source) {

        super(graph, source);

        dist = new int[graph.getVertices().size()];

        Dijkstra(source);

    }




    private void Dijkstra(Vertex source) {

        for (int i = 0; i < dist.length; i++) {

            dist[i] = Integer.MAX_VALUE;

        }




        PriorityQueue<Vertex> pqueue = new PriorityQueue<>(Comparator.comparingInt(v -> dist[v.getId()]));

        dist[source.getId()] = 0;

        pqueue.offer(source);

        while (!pqueue.isEmpty()) {

            Vertex curr_V = pqueue.poll();

            for (Edge edge : curr_V.getAdjacentEdges()) {

                Vertex adj_V = edge.getDestination();

                int weight = edge.getWeight();

                int newDist = dist[curr_V.getId()] + weight;

                if (newDist < dist[adj_V.getId()]) {

                    dist[adj_V.getId()] = newDist;

                    edgeTo[adj_V.getId()] = curr_V.getId();

                    if (pqueue.contains(adj_V)) {

                        pqueue.remove(adj_V);

                    }

                    pqueue.offer(adj_V);

                }

            }

        }

    }

    public int getShortDist(Vertex destination) {

        return dist[destination.getId()];

    }

    public List<Vertex> getShortPath(Vertex destination){

        List<Vertex> path = new ArrayList<>();

        if (dist[destination.getId()] == Integer.MAX_VALUE) {

            return path;

        }

        int curr = destination.getId();

        while (curr!= source.getId()){

            path.add(0, graph.getVertices().get(curr));

            curr = edgeTo[curr];

        }

        path.add(0,source);

        return path;

    }

}