import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean bandera = true;
        int[][] graph;
        String ciu1;
        String ciu2;
        Integer tt;

        Graph myGraph = new Graph();
        myGraph.setNodes(Controller.getData());
        Controller.showGraph(myGraph);

        int[][] matrix = Matrix.adjacencyGenerator(myGraph);
        System.out.println("MATRIZ DE ADYANCENCIA");
        Controller.matrixIteration(matrix);
        System.out.println("MATRIX CON WARSHALL");
        int[][] ordenado = FloydWarshall.floydWarshall(matrix);
        Controller.matrixIteration(ordenado);



    }
}

/*
    FloydWarshall fw = new FloydWarshall();
    int[][] shortestDistances = fw.floydWarshall(graph);

// Imprimir la matriz con las distancias mínimas
for (int i = 0; i < shortestDistances.length; i++) {
        for (int j = 0; j < shortestDistances.length; j++) {
        if (shortestDistances[i][j] == INF) {
        System.out.print("INF\t");
        } else {
        System.out.print(shortestDistances[i][j] + "\t");
        }
        }
        System.out.println();
        }
    CODIGO PARA PODER UTILIZAR EL ALGORITMO DE Floyd-Warshall
 */

