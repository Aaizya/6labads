public class Main {

    public static void main(String[] args)

    {

        Vertex A = new Vertex(0);// create vertices

        Vertex B = new Vertex(1);

        Vertex C = new Vertex(2);

        Vertex D = new Vertex(3);

        Vertex E = new Vertex(4);

        Vertex F = new Vertex(5);




        A.addAdjacentEdge(B, 1);// add adjacent vertices and their weights

        A.addAdjacentEdge(C, 2);

        B.addAdjacentEdge(D, 3);

        C.addAdjacentEdge(E, 4);

        C.addAdjacentEdge(F, 7);

        D.addAdjacentEdge(E, 9);

        E.addAdjacentEdge(F, 3);







        WeightedGraph w_graph = new WeightedGraph(); // created a weighted graph

        w_graph.addVertex(A);

        w_graph.addVertex(B);

        w_graph.addVertex(C);

        w_graph.addVertex(D);

        w_graph.addVertex(E);

        w_graph.addVertex(F);




        BFS bfs = new BFS(w_graph, A); // BreadthFirstSearch

        System.out.println("Breadth First Search  ");

        System.out.println("Path from A to F " + bfs.getPath(F));

        DijkstraSearch dijk = new DijkstraSearch(w_graph, A); //Dijkstra's algorithm

        System.out.println("Dijkstra's Algorithm  ");

        System.out.println("The shortest path from A to F " + dijk.getShortPath(F));

    }
}
