/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap21_EstruturaDadosGenericosPersonalizados.Arvore;

/**
 *
 * @author developer
 */
public class TreeNode<T extends Comparable<T>> {
    // membros de acesso de pacote

    TreeNode<T> leftNode;
    T data; // valor do nó
    TreeNode<T> rightNode;

    // construtor inicializa os dados e os torna um nó de folha
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // o nó não tem nenhum filho
    }

    // localiza ponto de inserção e insere novo nó; ignora os valores duplicados
    public void insert(T insertValue) {
        // insere na subárvore esquerda
        if (insertValue.compareTo(data) < 0) {
            // insere novo TreeNode
            if (leftNode == null) {
                leftNode = new TreeNode<T>(insertValue);
            } else // continua percorrendo a subárvore esquerda recursivamente
            {
                leftNode.insert(insertValue);
            }
        } // insere na subárvore direita
        else if (insertValue.compareTo(data) > 0) {
            // insere novo TreeNode
            if (rightNode == null) {
                rightNode = new TreeNode<T>(insertValue);
            } else // continua percorrendo a subárvore direita recursivamente
            {
                rightNode.insert(insertValue);
            }
        }
    }
}
