package Trees;

import java.awt.geom.Point2D;
import java.util.Comparator;

public class KDTree<E extends Comparable<E>> extends BST<E> implements KDTreeNodeInterface {

    // Nested static class for a 2DTree node.
    private static class KDNode<E> {

        private Point2D.Double coords;
        private E info;
        private KDNode<E> left;
        private KDNode<E> right;

        public KDNode(Point2D.Double coords, E info) {
            this.coords = coords;
            this.info = info;
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

