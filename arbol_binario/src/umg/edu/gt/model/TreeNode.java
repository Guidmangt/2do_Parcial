
package umg.edu.gt.model;

/**
 * Representa un nodo de un árbol binario.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    
    /**
     * Constructor para inicializar el nodo con un valor
     * @param value El valor que contiene el nodo
     */
    
    public TreeNode(int value){
        this.val = value;
        this.left = null;
        this.right = null;
    }
}
