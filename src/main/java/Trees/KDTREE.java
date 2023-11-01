package Trees;

import Trees.BST;
import org.w3c.dom.Node;

import java.awt.geom.Point2D;
import java.util.Comparator;

public class KDTREE<E  extends Comparable<E>> extends BST<E> {

    protected TwoDNode<E> root;

    // Nested static class for a 2DTree node.
    protected class TwoDNode<E> extends Node<E>  {
        protected E info;
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

        public void setObject(TwoDNode<E> node) {
            this.info = node.info;
            this.coords = node.coords;
            this.left = node.left;
            this.right = node.right;
        }

    }
        public KDTREE() {
            root= new TwoDNode<E>(null,null,null,null);
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
/*
    @Override
    public void insert(E element) {
        if (element == null) return;
        Point2D.Double coords = element.getCoords();
        root = insert( root, new TwoDNode<>(element,coords,null,null), true);
    }

    private TwoDNode<E> insert(TwoDNode<E> currentNode, TwoDNode<E> node,
                               boolean divX){
        if (currentNode == null) {
            return node;
        }
        if (divX) {
            if (cmpX.compare(node, currentNode) < 0) {
                currentNode.setLeft(insert(currentNode.getLeft(), node, !divX));
            } else {
                currentNode.setRight(insert(currentNode.getRight(), node, !divX));
            }
        } else {
            if (cmpY.compare(node, currentNode) < 0) {
                currentNode.setLeft(insert(currentNode.getLeft(), node, !divX));
            } else {
                currentNode.setRight(insert(currentNode.getRight(), node, !divX));
            }
        }




    }

    public E findNearestNeighbour(TwoDNode<E> node, double x, double y,
                                   TwoDNode<E> closestNode, boolean divX){
        if (node == null)
            return null;
        double d = Point2D.distanceSq(node.coords.x, node.coords.y, x, y);
        double closestDist = Point2D.distanceSq(closestNode.coords.x,
                closestNode.coords.y, x, y);
        if (closestDist > d) {
            closestNode.setObject(node);
            double delta = divX ? x - node.coords.x : y - node.coords.y;
            double delta2 = delta * delta;
            TwoDNode<E> node1 = delta < 0 ? node.left : node.right;
            TwoDNode<E> node2 = delta < 0 ? node.right : node.left;
            findNearestNeighbour(node1, x, y, closestNode, !divX);
            if (delta2 < closestDist) {
                findNearestNeighbour(node2, x, y, closestNode, !divX);
                return closestNode.info;
            }
        }
*/
    }

