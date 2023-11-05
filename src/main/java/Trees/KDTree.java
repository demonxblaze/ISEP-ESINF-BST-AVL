package Trees;

import com.sun.source.tree.IfTree;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        if (node.coords.equals(currentNode.coords)) {
            return currentNode;
        }
        int cmpResult = divX ? cmpX.compare(node, currentNode) : cmpY.compare(node, currentNode);

        if (cmpResult < 0) {
            if (currentNode.left == null) {
                currentNode.left = node;
            } else {
                insert(currentNode.left, node, !divX);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = node;
            } else {
                insert(currentNode.right, node, !divX);
            }
        }
        return currentNode;
    }

    public E findNearestNeighbour(double x, double y){
        KDNode<E> result = findNearestNeighbour(root, x, y, root, true );
        if (result == null) return null;
        return result.getInfo();
    }
    private KDNode<E> findNearestNeighbour(KDNode<E> node, double x, double y, KDNode<E> closestNode, boolean divX) {
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
    public List<E> findInRange(double minX, double maxX, double minY, double maxY){
        List<E> result = new ArrayList<>();
        findInRange(root, minX, maxX, minY, maxY,result,true);

        return result;
    }

    private void findInRange (KDNode<E> node,double minX,double maxX, double minY, double maxY, List<E> result, boolean divX){
        if (node == null) return;
        if (node.coords.x >= minX && node.coords.x <= maxX && node.coords.y >= minY && node.coords.y <= maxY){
            result.add(node.getInfo());
        }
        if (divX){
            if (node.coords.x >= minX){
                findInRange(node.left, minX, maxX, minY, maxY, result, !divX);
            }
            if (node.coords.x <= maxX){
                findInRange(node.right, minX, maxX, minY, maxY, result, !divX);
            }
        }else{
            if (node.coords.y >= minY){
                findInRange(node.left, minX, maxX, minY, maxY, result, !divX);
            }
            if (node.coords.y <= maxY){
                findInRange(node.right, minX, maxX, minY, maxY, result, !divX);
            }
        }
    }

    /*
    * public List<E> rangeSearch(double minLatitude, double maxLatitude, double minLongitude, double maxLongitude) {
        List<E> pointsInRange = new ArrayList<>();
        rangeSearch(root, minLatitude, maxLatitude, minLongitude, maxLongitude, pointsInRange, true);
        return pointsInRange;
    }

    private void rangeSearch(KDNode<E> node, double minLat, double maxLat, double minLon, double maxLon, List<E> pointsInRange, boolean divX) {
        if (minLat > maxLat) {
            double temp = minLat;
            minLat = maxLat;
            maxLat = temp;
        }
        else if (minLon > maxLon) {
            double temp = minLon;
            minLon = maxLon;
            maxLon = temp;
        }

        if (node == null) {
            return;
        }

        double nodeLat = node.coords.getY();
        double nodeLon = node.coords.getX();

        if (nodeLat >= minLat && nodeLat <= maxLat && nodeLon >= minLon && nodeLon <= maxLon) {
            pointsInRange.add(node.getInfo());
        }


        if (divX) {
            // Check the X-axis (longitude) to decide which sub-tree to explore
            if (nodeLon >= minLon) {
                rangeSearch(node.getLeft(), minLat, maxLat, minLon, maxLon, pointsInRange, !divX);
            }
            if (nodeLon <= maxLon) {
                rangeSearch(node.getRight(), minLat, maxLat, minLon, maxLon, pointsInRange, !divX);
            }
        } else {
            // Check the Y-axis (latitude) to decide which sub-tree to explore
            if (nodeLat >= minLat) {
                rangeSearch(node.getLeft(), minLat, maxLat, minLon, maxLon, pointsInRange, !divX);
            }
            if (nodeLat <= maxLat) {
                rangeSearch(node.getRight(), minLat, maxLat, minLon, maxLon, pointsInRange, !divX);
            }
        }

    }*/
}

