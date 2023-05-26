public class FloydWarshall {
        public int[][] floydWarshall(int[][] graph) {
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
                        if (dist[i][k] != 999999 && dist[k][j] != 99999 && dist[i][k] + dist[k][j] < dist[i][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }
            return dist;
        }
}
