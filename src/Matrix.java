import java.util.ArrayList;

public class Matrix {

    public static int[][] adjacencyGenerator(Graph graph){

        //Setting vertices

        ArrayList<String> vertices = Controller.getVertices(graph);
        int matrix[][] = new int[vertices.size()][vertices.size()];

        for (int n = 0; n < vertices.size(); n++) { //for each node

            //n represents the row
            String currentNodeName = vertices.get(n);
            int indexNode = graph.getNodeIndex(currentNodeName);


            for (int c = 0; c < graph.getNodes().get(indexNode).getConnections().size(); c++) { //for each connection of the node
                //c represents the column
                int distanceNode = graph.getNodes().get(indexNode).getConnections().get(c).getDistanceNode();
                int connectionNodeIndex = graph.getNodeIndex(graph.getNodes().get(indexNode).getConnections().get(c).getNodeName());
                matrix[indexNode][connectionNodeIndex] = distanceNode;
            }

        }
        return matrix;
    }

}
