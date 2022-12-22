import java.util.LinkedList;
import java.util.Map;

public class Graph {

        Map<String, LinkedList<Vertex>> adj;// set G(V, E) where V represents the vertices
        // and E represents the set of edges that are used to connect these vertices

        public Map<String, LinkedList<Vertex>> getAdj() {
                return adj;
        }

        public void setAdj(Map<String, LinkedList<Vertex>> adj) {
                this.adj = adj;
        }
        public void addVertex(String label){
                adj.put(String.valueOf(new Vertex(label)),new LinkedList<>());
        }
        public void addEdge(String begin, String end){
                Vertex v1= new Vertex(begin);
                Vertex v2= new Vertex(end);
                adj.get(v1).add(v2);
                adj.get(v2).add(v1);
        }
}
