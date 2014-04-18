/**
 * Created by GAYATHRI GUTTA on 4/18/2014.
 */
public class DirectedDFS {
    private boolean[] marked;

    public DirectedDFS(Digraph G, int s) {
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    public void dfs(Digraph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if(!marked[w]) dfs(G, w);
        }
    }

    public boolean visited(int v) {
        return marked[v];
    }

}
