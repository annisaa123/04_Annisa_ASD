public class ScavengerMain04 {
    public static void main(String[] args) {
        ScavengerHunt04 hunt = new ScavengerHunt04();
        hunt.addNode("Berapa Jumlah prodi jurusan Teknologi Informasi Polinema?", "2");
        hunt.addNode("Apa jargon Polinema?", "Josss");
        hunt.addNode("Apa jargon jurusan TI Polinema", "TI Fast! TI Fast! TI Bravo! Bravo!");
        hunt.play();
    }
}