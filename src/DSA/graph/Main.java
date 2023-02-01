package DSA.graph;

public class Main {
    public static void main(String[] args) {

        Graph myGraph = new Graph();

//        // test add vertex method
//        myGraph.addVertex("A");
//        myGraph.printGraph();

//        // test add edge method
//        myGraph.addVertex("A");
//        myGraph.addVertex("B");
//        myGraph.addEdge("A", "B");
//        myGraph.printGraph();

//        // test remove edge method
//        myGraph.addVertex("A");
//        myGraph.addVertex("B");
//        myGraph.addVertex("C");
//
//        myGraph.addEdge("A", "B");
//        myGraph.addEdge("A", "C");
//        myGraph.addEdge("B", "C");
//
//        myGraph.removeEdge("A", "B");
//        myGraph.printGraph();

        // test remove vertex
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");
        myGraph.removeVertex("D");

        myGraph.printGraph();
    }
}
