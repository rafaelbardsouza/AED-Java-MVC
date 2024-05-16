package Models;

public class Aviao {
    String id;
    int aterrissagens;
    int decolagens;

    public Aviao(String id) {
        this.id = id;
        this.aterrissagens = 0;
        this.decolagens = 0;
    }

    @Override
    public String toString() {
        return id + " (Aterrissagens: " + aterrissagens + ", Decolagens: " + decolagens + ")";
    }
}