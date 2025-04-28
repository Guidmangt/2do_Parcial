package umg.edu.gt.repository;// Construir el árbol

import umg.edu.gt.model.TreeNode;

/**
 * Clase responsable de construir un árbol binario a partir de un arreglo de
 * enteros
 */
public class TreeBuilder {

    /**
     * Costruye un árbol binario a partir de un arreglo de Integer Los valores
     * null representan nodos vacíos.
     *
     * @param values Arreglo que representa el árbol en orden nivel por nivel.
     * @return Raíz del árbol binario construido
     */
    public TreeNode buildTree(Integer[] values) {
        if (values.length == 0 || values[0] == null) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[values.length];
        nodes[0] = new TreeNode(values[0]);

        // Construir el árbol
        for (int i = 1; i < values.length; i++) {
            if (values[i] != null) {
                nodes[i] = new TreeNode(values[i]);
                int parentIndex = (i - 1) / 2;
                // Asignar como hijo izquierdo o derecho
                if (i == 2 * parentIndex + 1) {
                    nodes[parentIndex].left = nodes[i];
                } else {
                    nodes[parentIndex].right = nodes[i];
                }
            }
        }
        return nodes[0];
    }

}
