package umg.edu.gt.service;

import umg.edu.gt.model.TreeNode;
/**
 * Servicio que encuentra todas las rutas de raíz a hoja
 * cuya suma de nodos sea igual a un valor objetivo (targetSum).
 */

public class PathSumService {
    
    private static final int MAX_PATHS = 100;
    private static final int MAX_PATH_LENGTH = 100;
    
    private final int[][] paths = new int[MAX_PATHS][MAX_PATH_LENGTH];
    private final int[] pathSizes = new int[MAX_PATHS];
    private int pathCount = 0;
    
    /**
     * Obtiene todos los caminos encontrados
     * @return Matriz de caminos
     */
    
    public int[][] getPaths() {
        return paths;
    }
    
    public int[] getPathSizes() {
        return pathSizes;
    }
    
    /**
     * Obtiene el número de caminos encontrados 
     * @return Número de caminos
     */
    
    public int getPathCount() {
        return pathCount;
    }
    
    /**
     * Inicia la busqueda de rutas que la suma sea igual a targetSum,
     * @param root Raíz del aŕbol
     * @param targetSum Suma objetivo para las rutas.
     */
    
    public void findPaths(TreeNode root, int targetSum) {
        int[] currentPath = new int[MAX_PATH_LENGTH];
        dfs(root, targetSum, currentPath, 0);
    }
    
   /**
    * Algoritmo de búsqueda en profundidad (DFS) para encontrar caminos válidos.
    * @param node Nodo actal.
    * @param remainingSum Suma restante que falta para llegar a targetSum.
    * @param path Camino actual almacenado.
    * @param pathLength Longitud actual del camino.
    */
    
    private void dfs(TreeNode node, int remainingSum, int[] path, int pathLength) {
        if (node == null) {
            return;
        }
        
        // Añadir el nodo actual al camino
        path[pathLength] = node.val;
        pathLength++;
        remainingSum -= node.val;
        
         // Sí es hoja y se cumple la suma, guardamos el camino.
        if (node.left == null && node.right == null && remainingSum == 0) {
            //Guardar una copia del camino
            for (int i = 0; i < pathLength; i++) {
                paths[pathCount][i] = path[i];
            }
            pathSizes[pathCount] = pathLength;
            pathCount++;
        }
        
        // Explorar los hijos
        dfs(node.left, remainingSum, path, pathLength);
        dfs(node.right, remainingSum, path, pathLength);
    }
    
}
