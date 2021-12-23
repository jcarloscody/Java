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
public class Tree<T extends Comparable<T>> {

    private TreeNode<T> root;

    // construtor inicializa uma Tree de inteiros vazia
    public Tree() {
        root = null;
    }

    // insere um novo nó na árvore de pesquisa binária
    public void insertNode(T insertValue) {
        if (root == null) {
            root = new TreeNode<T>(insertValue); // cria o nó raizÿ
        } else {
            root.insert(insertValue); // chama o método insertÿ
        }
    }

    // inicia o percurso na pré-ordem
    public void preorderTraversal() {
        preorderHelper(root);
    }

    // método recursivo para realizar percurso na pré-ordem
    private void preorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        System.out.printf("%s ", node.data); // gera saída de dados do nó
        preorderHelper(node.leftNode); // percorre subárvore esquerdaÿ
        preorderHelper(node.rightNode); // percorre subárvore direitaÿ
    }
// inicia percurso na ordem

    public void inorderTraversal() {
        inorderHelper(root);
    }

    // método recursivo para realizar percurso na ordem
    private void inorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        inorderHelper(node.leftNode); // percorre subárvore esquerdaÿ
        System.out.printf("%s ", node.data); // gera saída de dados do nó
        inorderHelper(node.rightNode); // percorre subárvore direitaÿ
    }

    // inicia percurso na pós-ordem
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // método recursivo para realizar percurso na pós-ordem
    private void postorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        postorderHelper(node.leftNode); // percorre subárvore esquerdaÿ
        postorderHelper(node.rightNode); // percorre subárvore direitaÿ
        System.out.printf("%s ", node.data); // gera saída de dados do nó
    }

}
