package leetcode;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 路径错误。
 * @author navigatezll
 * @date 2022/3/3 5:22 下午
 */
public class TreeSearchPlus10 {
    public static class Tree {
        private Node rootNode;
    }

    public static class Node {
        private Integer value;
        private Node leftNode;
        private Node rightNode;
        private String id;
        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", id='" + id + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.setId("0");
        node.setValue(2);

        Node leftNode = new Node();
        leftNode.setId("1");
        leftNode.setValue(3);

        Node rightNode = new Node();
        rightNode.setId("1.1");
        rightNode.setValue(8);

        node.setRightNode(rightNode);

        node.setLeftNode(leftNode);

        Node leftNode2 = new Node();
        leftNode2.setId("2");
        leftNode2.setValue(3);
        leftNode.setLeftNode(leftNode2);

        Node leftNode3 = new Node();
        leftNode3.setId("3");
        leftNode3.setValue(2);
        leftNode2.setLeftNode(leftNode3);


        Node leftNode4 = new Node();
        leftNode4.setId("4");
        leftNode4.setValue(2);
        leftNode3.setLeftNode(leftNode4);

        deepSearchNodeAndPrint2(node);
    }

    private static void deepSearchNodeAndPrint2(Node node) {
        deepSearchNodeAndPrint(node, node.value, Lists.newArrayList(node));
    }

    private static int deep = 0;

    /**
     *
     * @param node 当前节点 ndoe
     * @param preSum  当前节点 + 之前路径上的与编制
     * @param preList
     * @return
     */
    private static void deepSearchNodeAndPrint(Node node, Integer preSum, List<Node> preList) {

        if (node.leftNode != null) {
            List<Node> leftNodes = Lists.newArrayList(preList);
            leftNodes.add(node.leftNode);
            int leftSum = preSum + node.leftNode.getValue();
            if (leftSum == 10) {
                System.out.println(leftNodes);
            }
            deepSearchNodeAndPrint(node.leftNode, leftSum, leftNodes);
        }

        if (node.rightNode != null) {
            List<Node> rightNodes = Lists.newArrayList(preList);
            rightNodes.add(node.rightNode);
            int rightSum = preSum + node.rightNode.getValue();
            if (rightSum == 10) {
                System.out.println(rightNodes);
            }
            deepSearchNodeAndPrint(node.rightNode, rightSum, rightNodes);
        }
    }
}
