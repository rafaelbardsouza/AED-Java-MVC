package Models;

public class NoAviao {
    Aviao aviao;
    NoAviao proximo;

    public NoAviao(Aviao aviao) {
        this.aviao = aviao;
        this.proximo = null;
    }
}