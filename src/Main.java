import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean bandera = true;
        String ciu1;
        String ciu2;
        Integer tt;

        Graph myGraph = new Graph();
        myGraph.setNodes(Controller.getData());
        Controller.showGraph(myGraph);

        int[][] matrix = Matrix.adjacencyGenerator(myGraph);
        Controller.matrixIteration(matrix);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese una ciudad: ");
            ciu1 = sc.nextLine();
            System.out.println("Ingrese otra ciudad: ");
            ciu2 = sc.nextLine();
            System.out.println("Ingrese una tiempo: ");
            tt = sc.nextInt();
            bandera = true;
        }
    }
}
