import java.util.ArrayList;

public class Matrix {


    private static final int INF = 999999; // Represents infinity

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

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int element = matrix[i][j];

                String rowName = graph.getNodes().get(i).getNodeName();
                String columnName = graph.getNodes().get(j).getNodeName();

                if(rowName!=columnName && element==0){
                    matrix[graph.getNodeIndex(rowName)][graph.getNodeIndex(columnName)] = INF;
                }

                System.out.println("ROW:"+i+" COLUMN:"+j);
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        
        
        return matrix;
    }



}
