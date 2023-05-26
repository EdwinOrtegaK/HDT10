import java.util.ArrayList;
import java.util.List;

public class Graph {
    private ArrayList<Node> nodes;

    public void setNodes(ArrayList<String> data){
        ArrayList<String> nodeNames = new ArrayList<>(); //To save node name

        for (int i = 0; i < data.size(); i++) {

            String[] splittedData = data.get(i).split(" ");

            for (int j = 0; j < splittedData.length; j++) {
                if (Controller.isNum(splittedData[j])){ //If it's a number is not a node name
                }else{

                    if (nodeNames.isEmpty()){ //If there are no nodes, fist one is automaically saved
                        nodeNames.add(splittedData[j]);
                        Node newNode = new Node(splittedData[j]); //And the node is created
                        nodes.add(newNode);

                    }else{
                        if(nodeNames.contains(splittedData[j])){
                            //If the node is already in there, no node is created
                        }else{
                            nodeNames.add(splittedData[j]);
                            Node newNode = new Node(splittedData[j]);
                            nodes.add(newNode);
                        }
                    }

                }
            }
        }
        //Node names verifier (Node name must be unique
        //Done
        setConnections(data);
    }

    public void setConnections(ArrayList<String> data){
        for (int i = 0; i < data.size(); i++) {
            String[] splittedData = data.get(i).split(" ");

            //NodeA, NodeB, distance
            String name_nodeA = splittedData[0]; //Node A name
            String name_nodeB = splittedData[1]; //Node B name
            Integer distance = Integer.parseInt(splittedData[2]); //Distance between them

            Node nodeA = new Node(name_nodeA);
            nodeA.setDistanceNode(distance);

            Node nodeB = new Node(name_nodeB);
            nodeB.setDistanceNode(distance);

            Integer nodeAIndex = getNodeIndex(name_nodeA);
            Integer nodeBIndex = getNodeIndex(name_nodeB);

            nodes.get(nodeAIndex).getConnections().add(nodeB);
            nodes.get(nodeBIndex).getConnections().add(nodeA);

        }

    }

    public int getNodeIndex(String nodeName){
        for (int k = 0; k < nodes.size(); k++) {
            if(nodes.get(k).getNodeName().equals(nodeName)){
                return nodes.indexOf(nodes.get(k)); //return value
            }
        }
        return 0;
    }


    public Graph(){
        nodes = new ArrayList<Node>();
    }
    public ArrayList<Node> getNodes() {
        return nodes;
    }


}
