import java.util.Scanner;

/**
 * ScavengerHuntGame14
 */
public class ScavengerHunt04 {
    private NodeScv04 head;

    public ScavengerHunt04() {
        head = null;
    }

    public void addNode(String question, String answer) {
        if (head == null) {
            head = new NodeScv04(question, answer);
        } else {
            NodeScv04 current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new NodeScv04(question, answer));
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        NodeScv04 current = head;
        while (current != null) {
            System.out.println(current.getQuestion());
            String answer = scanner.nextLine();
            if (current.getAnswer().equalsIgnoreCase(answer)) {
                System.out.println("Jawaban Anda Benar, Anda dapat melanjutkan ke poin selanjutnya");
                current = current.getNext();
            } else {
                System.out.println("Jawaban Anda Salah, Coba Lagi.");
                break;
            }
        }
        if (current == null) {
            System.out.println("Selamat Anda Menang!!!");
        }
        scanner.close();
    }
    
}