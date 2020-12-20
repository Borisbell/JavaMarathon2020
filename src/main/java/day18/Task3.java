package day18;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        Node node1 = new Node(14);
        Node node2 = new Node(23);
        Node node3 = new Node(22);
        Node node4 = new Node(11);
        Node node5 = new Node(16);
        Node node6 = new Node(27);
        Node node7 = new Node(5);
        Node node8 = new Node(8);
        Node node9 = new Node(150);

        addNode(root, node1);
        addNode(root, node2);
        addNode(root, node3);
        addNode(root, node4);
        addNode(root, node5);
        addNode(root, node6);
        addNode(root, node7);
        addNode(root, node8);
        addNode(root, node9);

        //через sortedList
        //SortedSet<Integer> list = new TreeSet<>();
        //dfs(root, list);

        //InOrder traversal
        dfs(root);
    }


    public static void addNode(Node root, Node newNode) {
        if (root.getValue() >= newNode.getValue()) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(newNode);
            } else {
                addNode(root.getLeftNode(), newNode);
            }
        } else if (root.getValue() < newNode.getValue()) {
            if (root.getRightNode() == null) {
                root.setRightNode(newNode);
            } else {
                addNode(root.getRightNode(), newNode);
            }
        }
    }

//через sortedList
//    public static void dfs(Node node, SortedSet<Integer> list) {
//        list.add(node.getValue());
//        if (node.getLeftNode() != null) {
//            list.add(node.getLeftNode().getValue());
//            dfs(node.getLeftNode(), list);
//        }
//        if (node.getRightNode() != null) {
//            list.add(node.getRightNode().getValue());
//            dfs(node.getRightNode(), list);
//        } else
//            System.out.println(list);
//    }

    //InOrder traversal
    private static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeftNode());
        System.out.printf("%s ", node.getValue());
        dfs(node.getRightNode());
    }
}