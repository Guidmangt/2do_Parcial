package umg.edu.gt.app;

import umg.edu.gt.model.TreeNode;
import umg.edu.gt.printer.PathPrinter;
import umg.edu.gt.repository.TreeBuilder;
import umg.edu.gt.service.PathSumService;

/**
 * Clase principal de la aplicación
 * La construcción del árbol, búsqueda de caminos e impresión de resultados.
 * @author melquisedec
 */
public class MainApp {
    public static void main(String[] args) {
        // Datos de entrada
        Integer[] treeValues = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        int targetSum = 22;
        
        // 1. construimos el árbol a partir del arreglo de valores
        TreeBuilder treeBuilder = new TreeBuilder();
        TreeNode root = treeBuilder.buildTree(treeValues);
        
        // 2. Buscamos todas las rutas con suma igual a targetSum
        PathSumService pathSumService = new PathSumService();
        pathSumService.findPaths(root, targetSum);
        
        // 3. Imprimimos las rutas encontradas
        PathPrinter printer = new PathPrinter();
        printer.printPaths(pathSumService.getPaths(), pathSumService.getPathSizes(), pathSumService.getPathCount());
        
    }
}
