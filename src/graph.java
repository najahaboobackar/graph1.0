import java.util.*;

public class graph {
    public static  class Edge{
        int src;
        int dst;
        public Edge(int s, int d){
            this.src=s;
            this.dst=d;

        }

    }
    public static void creategraph(ArrayList<Edge>graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
public static void main(String arg[]){
    
    int V=4;
    ArrayList<Edge>graph[]=new ArrayList[V];
    creategraph(graph);
    // print 2 edge
    for (int i=0;i<graph[3].size();i++){
        Edge e=graph[3].get(i);
        System.out.println(e.dst);
    }


}

    
}
