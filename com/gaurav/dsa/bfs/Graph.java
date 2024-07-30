package com.gaurav.dsa.bfs;

import java.util.*;


// Bidirectional Graph
public class Graph {

    private Map<Integer, List<Integer>> adjacencyList; // Adjacency list representation of the graph

    // Constructor
    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Method to add an edge to the graph in both directions (bidirectional)
    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    // Method to perform BFS traversal from a given source
    public void BFS(int source) {
        boolean[] visited = new boolean[adjacencyList.size()]; // Array to mark visited vertices
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS

        visited[source] = true; // Mark the source node as visited
        queue.add(source); // Enqueue the source node

        while (!queue.isEmpty()) {
            int current = queue.poll(); // Dequeue a vertex
            System.out.print(current + " ---> "); // Print the dequeued vertex

            // Get all adjacent vertices of the dequeued vertex
            List<Integer> adjacentNodes = adjacencyList.getOrDefault(current, new ArrayList<>());
            for (int adjacent : adjacentNodes) {
                if (!visited[adjacent]) {
                    visited[adjacent] = true; // Mark the adjacent vertex as visited
                    queue.add(adjacent); // Enqueue the adjacent vertex
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println(graph.adjacencyList);

        graph.BFS(2);

    }
}
