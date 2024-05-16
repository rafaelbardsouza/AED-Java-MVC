package Models;

public class Fila {
    NoAviao inicio;
    NoAviao fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public void enfileirar(Aviao aviao) {
        NoAviao novo = new NoAviao(aviao);
        if (fim == null) {
            inicio = novo;
        } else {
            fim.proximo = novo;
        }
        fim = novo;
    }

    public Aviao desenfileirar() {
        if (inicio == null) {
            return null;
        }
        Aviao aviao = inicio.aviao;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return aviao;
    }

    public void listar() {
        NoAviao atual = inicio;
        while (atual != null) {
            System.out.println(atual.aviao);
            atual = atual.proximo;
        }
    }
}