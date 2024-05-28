package tugasdoublelinkedlists;

/**
 * NodeFilm04
 */
public class NodeFilm04 {

    int id;
    String judulFilm;
    double rating;

    NodeFilm04 prev, next;

    NodeFilm04(NodeFilm04 prev, int id, String judulFilm, double rating, NodeFilm04 next){
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }
}