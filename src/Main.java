import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Graph myGraph = new Graph();
        myGraph.setNodes(Controller.getData());
        Controller.showGraph(myGraph);

        int[][] matrix = Matrix.adjacencyGenerator(myGraph);
        Controller.matrixIteration(matrix);


        while (true){
            System.out.println( );
        }

        }

    }
