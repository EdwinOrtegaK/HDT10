import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {

    /**
     * Gets the data from the txt
     * @return
     */
    public static ArrayList<String> getData() {
        ArrayList<String> lineasTxt = Reader.Leer("logistica.txt");
        lineasTxt.remove(0);
        return lineasTxt;
    }

    public static boolean isNum(String chain){
        try{
            Double num = Double.parseDouble(chain);
            return true;
        }catch (Exception e){

        }
        return false;
    }


    /**
     * Method shows up the graph
     * @param graph
     */
    public static void showGraph(Graph graph){
        System.out.println("=======================\nSHOWING GRAPH INFORMATION");
        for (int s = 0; s < graph.getNodes().size(); s++) {
            System.out.println("NODE NAME: "+graph.getNodes().get(s).getNodeName());

            for (int c = 0; c<graph.getNodes().get(s).getConnections().size();c++){

                System.out.println("connects with node: "+graph.getNodes().get(s).getConnections().get(c).getNodeName());
                System.out.println("With distance: "+graph.getNodes().get(s).getConnections().get(c).getDistanceNode());

            }

            System.out.println("=========================\n");


        }
    }

    /**
     * Method returns into an array List the nodes by it's name
     * @param graph
     * @return
     */
    public static ArrayList<String> getVertices(Graph graph){

        ArrayList<String> verticesNames = new ArrayList<>();

        for (int t = 0; t < graph.getNodes().size(); t++) {
            String verticeName = graph.getNodes().get(t).getNodeName();
            verticesNames.add(verticeName);
        }
        return verticesNames;

    }

    /**
     * Method shows a matrix
     * @param matrix
     */
    public static void matrixIteration(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int element = matrix[i][j];
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    /**
     * Method shows the nodes from the graph
     * @param citiesNodes
     */
    public static void showCities(ArrayList<Node> citiesNodes){
        for (int c = 0; c < citiesNodes.size(); c++) {
            System.out.println((c+1)+") "+citiesNodes.get(c).getNodeName());
        }
    }
}
