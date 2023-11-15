import java.util.*;

public class cycle {
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
        
        graph[2].add(new Edge(2, 0));
        
        graph[3].add(new Edge(3, 2));
    }
   public static boolean isCycledirected (ArrayList<Edge>graph[],int curr,boolean vist[],boolean rec[]){
    vist[curr]=true;
    rec[curr]=true;
for (int i=0;i<graph[curr].size();i++){
    Edge e=graph[curr].get(i);
    if(rec[e.dst]==true){//cycle
        
        return true;
    }
    else if(!vist[e.dst]){
       if(isCycledirected(graph, e.dst, vist, rec)){
        return true;
       }
    }
}
rec[curr]=false;
return false;
   }
  
public static void main(String arg[]){
    
    int V=4;
    ArrayList<Edge>graph[]=new ArrayList[V];
    creategraph(graph);
    
     boolean vist[]=new boolean[V];
     boolean rec[]=new boolean[V];
     System.out.println(isCycledirected(graph, 0, vist, rec));
     
     }
    
    //print 2 edge
  

}

    

