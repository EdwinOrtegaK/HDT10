import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {

    public static ArrayList<String> getData() {

        ArrayList<String> lineasTxt = Reader.Leer("HDT10/logistica.txt");
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


}
