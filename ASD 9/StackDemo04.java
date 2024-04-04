/**
 * StackDemo04
 */
public class StackDemo04 {

    public static void main(String[] args) {
        Stack04 stack04 = new Stack04(10);
        stack04.push(8);
        stack04.push(12);
        stack04.push(18);
        stack04.print();
        stack04.pop();
        stack04.peek();
        stack04.pop();
        stack04.push(-5);
        stack04.print();
}
}