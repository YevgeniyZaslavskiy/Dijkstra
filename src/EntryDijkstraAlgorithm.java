import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EntryDijkstraAlgorithm {

    private List<Vertex> nodes;
    private List<Edge> edges;

    public static void main(String[] args) {
        EntryDijkstraAlgorithm eda= new EntryDijkstraAlgorithm();
        eda.nodes = new ArrayList<>();
        eda.edges = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            Vertex location = new Vertex("Node_" + i, "Node_" + i);
            eda.nodes.add(location);
        }

        eda.addLane("Edge_0", 0, 1, 170);
        eda.addLane("Edge_1", 0, 2, 434);
        eda.addLane("Edge_2", 0, 4, 346);
        eda.addLane("Edge_3", 2, 6, 372);
        eda.addLane("Edge_4", 2, 7, 206);
        eda.addLane("Edge_5", 3, 7, 366);
        eda.addLane("Edge_6", 5, 8, 500);
        eda.addLane("Edge_7", 8, 9, 168);
        eda.addLane("Edge_8", 7, 9, 354);
        eda.addLane("Edge_9", 4, 9, 1004);
        eda.addLane("Edge_10", 9, 10, 80);
        eda.addLane("Edge_11", 1, 10, 1200);
        eda.addLane("Edge_12", 1, 2, 12);
        eda.addLane("Edge_13", 3, 5, 18);

        eda.addLane("Edge_14", 1, 0, 170);
        eda.addLane("Edge_15", 2, 0, 434);
        eda.addLane("Edge_16", 4, 0, 346);
        eda.addLane("Edge_17", 6, 2, 372);
        eda.addLane("Edge_18", 7, 2, 206);
        eda.addLane("Edge_19", 7, 3, 366);
        eda.addLane("Edge_20", 8, 5, 500);
        eda.addLane("Edge_21", 9, 8, 168);
        eda.addLane("Edge_22", 9, 7, 354);
        eda.addLane("Edge_23", 9, 4, 1004);
        eda.addLane("Edge_24", 10, 9, 80);
        eda.addLane("Edge_25", 10, 1, 1200);
        eda.addLane("Edge_26", 2, 1, 12);
        eda.addLane("Edge_27", 5, 3, 18);

        Graph graph = new Graph(eda.nodes, eda.edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(eda.nodes.get(3));
        LinkedList<Vertex> path = dijkstra.getPath(eda.nodes.get(1));

        for (Vertex vertex : path) {
            System.out.println(vertex);
        }
    }

    private void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) {
        Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration );
        edges.add(lane);
    }
}