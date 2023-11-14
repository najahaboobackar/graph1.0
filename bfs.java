import java.util.*;

public class bfs {
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
    public static void brefs(ArrayList<Edge>graph[],int V) {
        Queue <Integer> q=new LinkedList<>();
        boolean vist[]=new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if (vist[curr]==false){
                System.out.println(curr+" ");
                vist[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    
                    Edge e=graph[curr].get(i);
                    q.add(e.dst);
                   
                }



            }
        }

    }
public static void main(String arg[]){
    
    int V=4;
    ArrayList<Edge>graph[]=new ArrayList[V];
    creategraph(graph);
    brefs(graph, V);
    //print 2 edge
    for (int i=0;i<graph[3].size();i++){
       Edge e=graph[3].get(i);
        System.out.println(e.dst+" ");
    }


}

    
}
