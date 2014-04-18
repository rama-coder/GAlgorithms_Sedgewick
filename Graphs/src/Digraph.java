/**
 * Created by GAYATHRI GUTTA on 4/18/2014.
 */
public class Digraph {
    private final int V;
    private final Bag<Integer>[] adj;

    public Digraph(int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++)
            adj[v] = new Bag<Integer>();
    }

    public void addEdge(int v, int w) {
       adj[v].add(w);
    }
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < V; i ++) {
            sb.append("\n Adjacency list for " + i);
            for(int w : adj[i]){
                sb.append("=> "+ w);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Digraph dg = new Digraph(6);

        dg.addEdge(1, 2);
        dg.addEdge(2, 3);
        dg.addEdge(3, 4);
        dg.addEdge(4, 4);
        dg.addEdge(4, 6);

        System.out.println(dg);


    }

}
