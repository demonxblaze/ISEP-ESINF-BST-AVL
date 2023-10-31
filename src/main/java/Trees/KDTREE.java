package Trees;

import Trees.BST;
import org.w3c.dom.Node;

import java.awt.geom.Point2D;
import java.util.Comparator;

public class KDTREE<E extends Comparable<E>> extends BST<E> {


/*
    // Nested static class for a 2DTree node.
    protected class TwoDNode<E> extends Node<E>  {
        protected Point2D.Double coords;
        protected TwoDNode<E> left;
        protected TwoDNode<E> right;

        public TwoDNode(E e,Point2D.Double coords, Node<E> leftChild, Node<E> rightChild) {
            super(e, leftChild, rightChild);

        }
        public double getX(){
            return coords.getX();
        }
        public double getY(){
            return coords.getY();
        }

        @Override
        public TwoDNode<E> getLeft() {
            return left;
        }

        public void setLeft(TwoDNode<E> left) {
            this.left = left;
        }

        @Override
        public TwoDNode<E> getRight() {
            return right;
        }

        public void setRight(TwoDNode<E> right) {
            this.right = right;
        }
    }

        private final Comparator<TwoDNode<E>> cmpX = new Comparator<TwoDNode<E>>(){
            @Override
            public int compare(TwoDNode<E> p1, TwoDNode<E> p2) {
                return Double.compare(p1.getX(), p2.getX());
            }
        };
        private final Comparator<TwoDNode<E>> cmpY = new Comparator<TwoDNode<E>>(){
            @Override
            public int compare(TwoDNode<E> p1, TwoDNode<E> p2) {
                return Double.compare(p1.getY(), p2.getY());
            }
        };

    public TwoDNode<E> insert(TwoDNode<E> currentNode, TwoDNode<E> node,
                            boolean divX){
        if (node.coords.equals(currentNode.coords))
            return currentNode;
        int cmpResult = (divX ? cmpX : cmpY).compare(node, currentNode);
        if (cmpResult == -1)
            if (currentNode.left == null)
                currentNode.setLeft(node);
            else
                insert(currentNode.getLeft(), node, !divX);
        else
        if (currentNode.right == null)
            currentNode.setRight(node);
        else
            insert(currentNode.right, node, !divX);
    }*/


}