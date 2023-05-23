import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Graph myGraph = new Graph();
        myGraph.setNodes(Controller.getData());
        Controller.showGraph(myGraph);

        }

    }
