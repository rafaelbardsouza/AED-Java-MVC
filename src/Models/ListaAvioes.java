package Models;

public class ListaAvioes {
    NoAviao inicio;

    public ListaAvioes() {
        this.inicio = null;
    }

    public void inserir(Aviao aviao) {
        NoAviao novo = new NoAviao(aviao);
        if (inicio == null || inicio.aviao.id.compareTo(novo.aviao.id) > 0) {
            novo.proximo = inicio;
            inicio = novo;
        } else {
            NoAviao atual = inicio;
            while (atual.proximo != null && atual.proximo.aviao.id.compareTo(novo.aviao.id) < 0) {
                atual = atual.proximo;
            }
            novo.proximo = atual.proximo;
            atual.proximo = novo;
        }
    }

    public Aviao buscar(String id) {
        NoAviao atual = inicio;
        while (atual != null) {
            if (atual.aviao.id.equals(id)) {
                return atual.aviao;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void listarTodos() {
        NoAviao atual = inicio;
        while (atual != null) {
            System.out.println(atual.aviao);
            atual = atual.proximo;
        }
    }

    public void listarPorLetra(char letra) {
        NoAviao atual = inicio;
        while (atual != null) {
            if (atual.aviao.id.charAt(0) == letra) {
                System.out.println(atual.aviao);
            }
            atual = atual.proximo;
        }
    }
}