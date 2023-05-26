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

        int[][] matrix = Matrix.adjacencyGenerator(myGraph);
        System.out.println("MATRIZ DE ADYANCENCIA");
        Controller.matrixIteration(matrix);
        System.out.println("\nMATRIX CON WARSHALL");
        int[][] rutasCortas = FloydWarshall.floydWarshall(matrix);
        Controller.matrixIteration(rutasCortas);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese una ciudad: ");
            ciu1 = sc.nextLine();
            System.out.println("Ingrese otra ciudad: ");
            ciu2 = sc.nextLine();
            System.out.println("Ingrese una tiempo: ");
            tt = sc.nextInt();
            FloydWarshall.rutaMasCorta(ciu1, ciu2);
            bandera = true;
        }
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

