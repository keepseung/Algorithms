package bs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P135 {

    @Test
    void test_p135_1(){
        Node node = new Node(10);
        assertEquals(getMinPathSum(node), 10);
    }
    @Test
    void test_p135_2(){
        Node node = new Node(10, new Node(5), new Node(5));
        assertEquals(getMinPathSum(node), 15);
    }
    @Test
    void test_p135_3(){
        Node node = new Node(10, new Node(5, null, new Node(2)), new Node(5));
        assertEquals(getMinPathSum(node), 15);
    }
    @Test
    void test_p135_4(){
        Node node = new Node(10, new Node(5, null, new Node(2)), new Node(5, null, new Node(1)));
        assertEquals(getMinPathSum(node), 16);
    }

    @Test
    void test_p135_5(){
        Node node = new Node(10, new Node(5, null, new Node(2)), new Node(5, null, new Node(1, new Node(-1), null)));
        assertEquals(getMinPathSum(node), 15);
    }
    public int getMinPathSum(Node node) {
        if (node.getLeft() == null && node.getRight() == null){
            return node.getValue();
        }else if (node.getLeft() == null){
            return node.getValue()+getMinPathSum(node.getRight());
        }else if (node.getRight() == null){
            return node.getValue()+getMinPathSum(node.getLeft());
        }else{
            return node.getValue()+Math.min(getMinPathSum(node.getLeft()), getMinPathSum(node.getRight()));
        }
    }
}

class Node{
    private int value;
    private Node left;
    private Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
