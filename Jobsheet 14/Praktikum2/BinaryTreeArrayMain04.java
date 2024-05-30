package Praktikum2;

/**
 * BinaryTreeArrayMain04
 */
public class BinaryTreeArrayMain04 {
    public static void main(String[] args) {
        BinaryTreeArray04 bta = new BinaryTreeArray04();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println();
        System.out.println("PreOrder Traversal: ");
        bta.traversePreOrder();
        System.out.println();
        System.out.println("PostOrder Traversal: ");
        bta.traversePostOrder();
    }
}