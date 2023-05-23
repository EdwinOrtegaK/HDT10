import java.util.ArrayList;

public class Node {

    private ArrayList<Node> connections;
    private String nodeName;
    private int distanceNode;

    public Node(String nodeName) {
        this.nodeName = nodeName;
        connections = new ArrayList<>();
    }

    public String getNodeName() {
        return nodeName;
    }

    public int getDistanceNode() {
        return distanceNode;
    }

    public void setDistanceNode(int distanceNode) {
        this.distanceNode = distanceNode;
    }

    public ArrayList<Node> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<Node> connections) {
        this.connections = connections;
    }
}
