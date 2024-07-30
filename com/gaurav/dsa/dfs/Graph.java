package com.gaurav.dsa.dfs;

import java.util.*;

public class Graph {

    Map<Integer, List<Integer>> adjacencyList;

    public Graph(){
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int destination){
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void dfs(int source){

        boolean[] visited = new boolean[adjacencyList.size()];

        Stack<Integer> stack = new Stack<>();

        visited[source] = true;
        stack.push(source);
        while(!stack.isEmpty()){
            Integer currentNode = stack.pop();
            System.out.println(currentNode+" --> ");

            List<Integer> adjacencyNodes = adjacencyList.getOrDefault(currentNode, new ArrayList<>());
            for(Integer adjacencyNode : adjacencyNodes){
                if(!visited[adjacencyNode]){
                    visited[adjacencyNode] = true;
                    stack.push(adjacencyNode);
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

        graph.dfs(0);
    }

}
