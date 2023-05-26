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
        System.out.println("---------------------\n");
        while (true) {

            Controller.showCities(myGraph.getNodes());
            System.out.println("Ingrese una ciudad: ");
            ciu1 = sc.nextLine();
            System.out.println("Ingrese otra ciudad: ");
            ciu2 = sc.nextLine();
            //System.out.println("Ingrese una tiempo: ");

            FloydWarshall.rutaMasCorta(ciu1, ciu2,myGraph,rutasCortas);
            bandera = true;
        }
    }
}

