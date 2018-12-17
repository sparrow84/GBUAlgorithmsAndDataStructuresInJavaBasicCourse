package lesson07;

public class Program {
    public static void main(String[] args) {

        int source = 5;
        int dist = 7;
        int vertexCount = 10;


        Graph g = new Graph(vertexCount);

        g.addEdge(0,4);
        g.addEdge(0,9);
        g.addEdge(1,5);
        g.addEdge(1,5);
        g.addEdge(2,4);
        g.addEdge(4,9);
        g.addEdge(5,8);
        g.addEdge(5,6);
        g.addEdge(5,9);
        g.addEdge(6,2);
        g.addEdge(6,9);
        g.addEdge(7,3);
        g.addEdge(7,9);



        DepthFirstPaths dfs = new DepthFirstPaths(g, source);
        System.out.println(dfs.hasPathTo(dist));
        System.out.println(dfs.pathTo(dist));

        System.out.println();

        BreadthFirstPaths bfs = new BreadthFirstPaths(g, source);
        System.out.println(bfs.hasPathTo(dist));
        System.out.println(bfs.pathTo(dist));
        System.out.println(bfs.distTo(dist));
    }
}
