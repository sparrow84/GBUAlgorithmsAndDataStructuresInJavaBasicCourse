package lesson07;

import java.util.LinkedList;

public class Graph {
    private int vertexCount; // количество вершин
    private int edgeCount = 0; // количество связей
    private LinkedList<Integer>[] adjLists;

    public Graph(int vertexCount) {
        if (vertexCount < 0) {
            throw new IllegalArgumentException("Кол-во вершин не может быть отрицательным");
        }
        this.vertexCount = vertexCount;
        adjLists = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    public int vertexCount() {
        return vertexCount;
    }

    public int edgeCount(){
        return edgeCount;
    }

    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0) {
            throw new IllegalArgumentException("Номе вершины не ожет быть отрицательным");
        }
        adjLists[v1].add(v2);
        adjLists[v2].add(v1);
    }

    public LinkedList<Integer> adjList(int vertex) {
        return adjLists[vertex];
    }
}
