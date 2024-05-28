public class NodeScv04 {
    private String question;
    private String answer;
    private NodeScv04 next;

    public NodeScv04(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public NodeScv04 getNext() {
        return next;
    }

    public void setNext(NodeScv04 next) {
        this.next = next;
    }
}