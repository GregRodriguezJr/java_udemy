package DSA.graph;

public class Main {
    public static void main(String[] args) {

        Graph myGraph = new Graph();

//        // test add vertex method
//        myGraph.addVertex("A");
//        myGraph.printGraph();

        // test add edge method
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addEdge("A", "B");
        myGraph.printGraph();
    }
}
