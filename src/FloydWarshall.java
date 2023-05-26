public class FloydWarshall {
    private static final int INF = 999999; // Valor infinito para representar ausencia de conexión
    public static int[][] floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];

        // Inicializar la matriz de distancias con los valores de la matriz de adyacencia
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Calcular las distancias mínimas
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        return dist;
    }
    public static void rutaMasCorta(String ciu1, String ciu2,Graph graph,int[][] rutasCortas){

        try{
            int indx1 = graph.getNodeIndex(ciu1);
            int indx2 = graph.getNodeIndex(ciu2);

            try{
                System.out.println("Buscando la rutas mas corta de "+ciu1+" a "+ciu2);
                System.out.println("La ruta mas corta es de: "+rutasCortas[indx1][indx2]);
            }catch (Exception e){
                System.out.println("Parece que no hay rutas entre estas ciudadades :(");
                System.out.println(e.getMessage());
            }

        }catch (Exception e){
            System.out.println("La ciudad que ingreso no existe :(");
        }

    }
}
