package graph;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirst {

    Queue<Graph.Vertex> queue = new LinkedList<>();
    Set<Object> visitedVertexes = new LinkedHashSet<>();

    public  BreadthFirst(){
    }

    public Set breathFirstTraversal(Graph.Vertex vertex) {
        queue.clear();
        visitedVertexes.clear();
        System.out.println("vertex.value = " + vertex.value);
        queue.add(vertex);
        while (!queue.isEmpty()) {
            Graph.Vertex v = queue.poll();
            System.out.println("v.value = " + v.value);
            visitedVertexes.add(v.value);
            System.out.println("visitedVertexes = " + visitedVertexes);
            for (int i = 0; i < v.edges.size(); i++) {
                if(!visitedVertexes.contains(v.edges.get(i).vertex1.value)) {
                    queue.add(v.edges.get(i).vertex1);
                }
                if(!visitedVertexes.contains(v.edges.get(i).vertex2.value)) {
                    queue.add(v.edges.get(i).vertex2);
                }
            }
        }
        return visitedVertexes;
    }
}
