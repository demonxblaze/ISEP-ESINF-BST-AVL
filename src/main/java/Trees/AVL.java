package Trees;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 * @param <E>
 * @author DEI-ESINF
 */
public class AVL<E extends Comparable<E>> extends BST<E> {


    private int balanceFactor(Node<E> node) {
        if (node == null) return 0;
        return height(node.getRight()) - height(node.getLeft());
    }

    private Node<E> rightRotation(Node<E> node) {
        Node<E> left = node.getLeft();
        node.setLeft(left.getRight());
        left.setRight(node);
        node = left;
        return node;
    }

    private Node<E> leftRotation(Node<E> node) {
        Node<E> right = node.getRight();
        node.setRight(right.getLeft());
        right.setLeft(node);
        node = right;
        return node;
    }

    private Node<E> twoRotations(Node<E> node) {
        if (balanceFactor(node) < 0) {
            node.setLeft(leftRotation(node.getLeft()));
            node = rightRotation(node);
        } else {
            node.setRight(rightRotation(node.getRight()));
            node = leftRotation(node);
        }
        return node;
    }

    private Node<E> balanceNode(Node<E> node) {
        if (balanceFactor(node) > 1) {
            if (balanceFactor(node.getRight()) > 0){
                node = leftRotation(node);
            } else{
                node = twoRotations(node);
            }
        } else if (balanceFactor(node) < -1) {
            if (balanceFactor(node.getLeft()) < 0){
                node = rightRotation(node);
            } else {
                node = twoRotations(node);
            }
        }
        return node;
    }

    public AVL<E> findBetween(E min, E max){
        AVL<E> avl = new AVL<>();
        findBetween(root,min, max, avl);
        return avl;
    }

        private void findBetween(Node<E> node, E min, E max, AVL<E> result) {
            if (node == null) {
                return;
            }

            if (min.compareTo(node.getElement()) <= 0 && node.getElement().compareTo(max) <= 0) {
                result.insert(node.getElement());
            }

            if (min.compareTo(node.getElement()) < 0) {
                findBetween(node.getLeft(), min, max, result);
            }

            if (max.compareTo(node.getElement()) > 0) {
                findBetween(node.getRight(), min, max, result);
            }
        }


    @Override
    public void insert(E element) {
        if (element == null) return;
        root = insert(element, root);
    }

    private Node<E> insert(E element, Node<E> node) {
        if (node == null)
            return new Node<>(element, null, null);

        if (node.getElement().compareTo(element) == 0)
            node.setElement(element);
        else {
            if (node.getElement().compareTo(element) > 0) {
                node.setLeft(insert(element, node.getLeft()));
                node = balanceNode(node);
            } else {
                node.setRight(insert(element, node.getRight()));
                node = balanceNode(node);
            }
        }
        return node;

    }

    @Override
    public void remove(E element) {
        root = remove(element, root());
    }

    private Node<E> remove(E element, BST.Node<E> node) {
        if (node == null)
            return null;

        if (node.getElement().compareTo(element)==0) {
            if (node.getLeft() == null && node.getRight() == null) {
                return null;
            }
            if (node.getLeft() == null)
                return node.getRight();
            if (node.getRight() == null)
                return node.getLeft();

            E smallElem = smallestElement(node.getRight());
            node.setElement(smallElem);
            node.setRight(remove(smallElem, node.getRight()));
            node = balanceNode(node);
        } else if (node.getElement().compareTo(element) > 0) {
            node.setLeft(remove(element, node.getLeft()));
            node = balanceNode(node);
        }else {
            node.setRight(remove(element, node.getRight()));
            node = balanceNode(node);
        }

        return node;
    }


    public boolean equals(Object otherObj) {

        if (this == otherObj)
            return true;

        if (otherObj == null || this.getClass() != otherObj.getClass())
            return false;

        AVL<E> second = (AVL<E>) otherObj;
        return equals(root, second.root);
    }

    public boolean equals(Node<E> root1, Node<E> root2) {
        if (root1 == null && root2 == null)
            return true;
        else if (root1 != null && root2 != null) {
            if (root1.getElement().compareTo(root2.getElement()) == 0) {
                return equals(root1.getLeft(), root2.getLeft())
                        && equals(root1.getRight(), root2.getRight());
            } else
                return false;
        } else return false;
    }

}