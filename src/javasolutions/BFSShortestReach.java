package javasolutions;

import java.util.*;

// hackerrank - bfs: shortest reach in a graph
public class BFSShortestReach {
    static class Node {
        int value;
        Set<Edge> edges;

        Node(int val) {
            value = val;
            edges = new HashSet<>();
        }

        @Override
        public String toString() {
            return "Node{" +
                    "edges=" + edges +
                    '}';
        }
    }

    static class NodeWithDistance{
        Node node;
        int distance;

        NodeWithDistance(Node node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    static class Edge {
        int begin;
        int end;

        Edge(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "begin=" + begin +
                    ", end=" + end +
                    '}';
        }
    }

    private static final int UNIT_DISTANCE = 6;

    private static int[] traverse(Queue<NodeWithDistance> nodes, Map<Integer, Node> graph, int edgeCount) {
        int[] distances = new int[graph.size()+1];
        Set<Edge> traversedEdges = new HashSet<>();

        NodeWithDistance head = nodes.poll();

        while (head != null && traversedEdges.size() < edgeCount) {
            for (Edge edge : head.node.edges) {
                if (traversedEdges.contains(edge)) continue;

                traversedEdges.add(edge);
                int neighbor = head.node.value == edge.begin ? edge.end : edge.begin;
                int newDistance = head.distance + UNIT_DISTANCE;

                if (distances[neighbor] == 0 || distances[neighbor] > newDistance) {
                    distances[neighbor] = newDistance;
                }

                Node n = graph.get(neighbor);
                nodes.add(new NodeWithDistance(n, head.distance + UNIT_DISTANCE));
            }

            head = nodes.poll();
        }

        return distances;
    }

    private static void solveBFS(Scanner scanner) {
        int n = scanner.nextInt();

        HashMap<Integer, Node> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new Node(i));
        }

        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            Edge edge = new Edge(n1, n2);

            graph.get(n1).edges.add(edge);
            graph.get(n2).edges.add(edge);
        }

        int startNode = scanner.nextInt();
        LinkedList<NodeWithDistance> queue = new LinkedList<>();
        queue.add(new NodeWithDistance(graph.get(startNode), 0));

        int[] distances = traverse(queue, graph, m);

        for (int i = 1; i < distances.length; i++) {
            if (i == startNode) continue;

            if (distances[i] == 0) distances[i] = -1;

            System.out.print(distances[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            solveBFS(scanner);
        }
    }
}
