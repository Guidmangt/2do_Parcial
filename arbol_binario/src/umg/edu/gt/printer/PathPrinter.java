package umg.edu.gt.printer;

/**
 * Clase encargada de imprimir las rutas encontradas
 */
public class PathPrinter {
    /**
     * Imprime todas las rutas en consola.
     * @param paths Matriz que contiene los caminos.
     * @param pathSizes Tamaño de cada camino.
     * @param pathCount  Número total de caminos.
     */
    
    public void printPaths(int[][] paths, int[] pathSizes, int pathCount) {
        for (int i = 0; i < pathCount; i++) {
            System.out.print("[");
            for (int j = 0; j < pathSizes[i]; j++) {
                System.out.print(paths[i][j]);
                if (j != pathSizes[i] - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
        }
    }

}
