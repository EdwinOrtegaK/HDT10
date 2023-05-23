import java.util.ArrayList;
import java.util.List;

public class Graph {

    private ArrayList<Node> nodes;


    public void setNodes(ArrayList<String> data){

        ArrayList<String> nodeNames = new ArrayList<>(); //To save node name

        System.out.println("SETTING NODES");


        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));

            String[] splittedData = data.get(i).split(" ");
            System.out.println(splittedData.length);

            for (int j = 0; j < splittedData.length; j++) {

                System.out.println(splittedData[j]); //prints data (NodeA, NodeB, distance)

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
        System.out.println("NODES CREATED");
        System.out.println(nodes.size());

        for (int i = 0; i < nodes.size(); i++) {
            System.out.println(i+". "+nodes.get(i).getNodeName());
        }
        setConnections(data);
    }

    public void setConnections(ArrayList<String> data){
        System.out.println("==============\nSETTING CONNECTIONS");
        for (int i = 0; i < data.size(); i++) {
            System.out.println("\n====RELATION=====");
            System.out.println(data.get(i));
            System.out.println("=================\n");

            String[] splittedData = data.get(i).split(" ");

            //NodeA, NodeB, distance
            String name_nodeA = splittedData[0]; //Node A name
            String name_nodeB = splittedData[1]; //Node B name
            Integer distance = Integer.parseInt(splittedData[2]); //Distance between them

            System.out.println("CONNECTION A: "+name_nodeA);
            System.out.println("CONNECION B: "+name_nodeB);
            System.out.println("DISTANCE A-B: "+distance);

            Node nodeA = new Node(name_nodeA);
            nodeA.setDistanceNode(distance);
            System.out.println("NODE A CREATED WITH NAME: "+nodeA.getNodeName());

            Node nodeB = new Node(name_nodeB);
            nodeB.setDistanceNode(distance);
            System.out.println("NODE B CREATED WITH NAME: "+nodeB.getNodeName());

            System.out.println("\nLOOKING FOR NODES IN LIST");

            Integer nodeAIndex = getNodeIndex(name_nodeA);
            Integer nodeBIndex = getNodeIndex(name_nodeB);

            System.out.println("INDEX FOUND FOR NODE A: "+nodeAIndex);
            System.out.println("INDEX FOUND FOR NODE B: "+nodeBIndex);

            nodes.get(nodeAIndex).getConnections().add(nodeB);
            nodes.get(nodeBIndex).getConnections().add(nodeA);

        }

    }

    private int getNodeIndex(String nodeName){

        System.out.println("LOOKING FOR "+nodeName+" Index");

        for (int k = 0; k < nodes.size(); k++) {

            if(nodes.get(k).getNodeName().equals(nodeName)){
                System.out.println("INDEX FOR "+nodeName+": "+nodes.indexOf(nodes.get(k)));
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
