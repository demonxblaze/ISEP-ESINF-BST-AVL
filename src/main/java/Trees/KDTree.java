package Trees;

import java.awt.geom.Point2D;
import java.util.Comparator;

public class KDTree<E  extends Comparable<E>> extends BST<E> implements KDTreeNodeInterface{

    // Nested static class for a 2DTree node.
    private static class KDNode<E> {

        private Point2D.Double coords;
        private E info;
        private KDNode<E> left;
        private KDNode<E> right;

        public KDNode(double x, double y, E info) {
            this.coords = new Point2D.Double(x, y);
            this.info = info;
            this.left = null;
            this.right = null;


        }
        public void setObject(KDNode<E> node){
            this.coords = node.coords;
            this.info = node.info;
            this.left = node.left;
            this.right = node.right;
        }
        public double getX() {
            return coords.getX();
        }

        public double getY() {
            return coords.getY();
        }

        public KDNode<E> getLeft() {
            return left;
        }

        public KDNode<E> getRight() {
            return right;
        }

        public void setLeft(KDNode<E> left) {
            this.left = left;
        }

        public void setRight(KDNode<E> right) {
            this.right = right;
        }

        public E getInfo() {
            return info;
        }

        public void setInfo(E info) {
            this.info = info;
        }

    }

    protected KDNode<E> root;

    public KDTree() {
        root = null;
    }

    private final Comparator<KDNode<E>> cmpX = new Comparator<KDNode<E>>() {
        @Override
        public int compare(KDNode<E> p1, KDNode<E> p2) {
            return Double.compare(p1.getX(), p2.getX());
        }
    };
    private final Comparator<KDNode<E>> cmpY = new Comparator<KDNode<E>>() {
        @Override
        public int compare(KDNode<E> p1, KDNode<E> p2) {
            return Double.compare(p1.getY(), p2.getY());
        }
    };



    public void insertInKD(E element, double x, double y ) {
        if (element == null) return;

        root = insert( root, new KDNode<>(x, y ,element), true);
    }
    private KDNode<E> insert(KDNode<E> currentNode, KDNode<E> node,
                               boolean divX){

        if (currentNode == null) {
            return node;
        }
        if (divX) {
            if (cmpX.compare(node, currentNode) < 0) {
                currentNode.setLeft(insert(currentNode.getLeft(), node, false));
            } else {
                currentNode.setRight(insert(currentNode.getRight(), node, false));
            }
        } else {
            if (cmpY.compare(node, currentNode) < 0) {
                currentNode.setLeft(insert(currentNode.getLeft(), node, true));
            } else {
                currentNode.setRight(insert(currentNode.getRight(), node, true));
            }
        }

        return node;


    }

    public E findNearestNeighbour(double x, double y){
        KDNode<E> result = findNearestNeighbour(root, x, y, root, true );
        return result.getInfo();
    }
    private KDNode<E> findNearestNeighbour(KDNode<E> node, double x, double y,
                                  KDNode<E> closestNode, boolean divX) {
        if (node == null)
            return null;

        double d = Point2D.distanceSq(node.coords.x, node.coords.y, x, y);
        double closestDist = Point2D.distanceSq(closestNode.coords.x, closestNode.coords.y, x, y);

        if (closestDist > d) {
            closestNode.setObject(node);
        }

        double delta = divX ? x - node.coords.x : y - node.coords.y;
        double delta2 = delta * delta;
        KDNode<E> node1 = delta < 0 ? node.left : node.right;
        KDNode<E> node2 = delta < 0 ? node.right : node.left;
        findNearestNeighbour(node1, x, y, closestNode, !divX);

        if (delta2 < closestDist) {
            findNearestNeighbour(node2, x, y, closestNode, !divX);
        }

        return closestNode;
    }
}

