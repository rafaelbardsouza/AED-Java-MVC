package Models;

import java.time.LocalDateTime;

public class Relatorio {
    RegistroOperacao inicio;
    RegistroOperacao fim;

    public Relatorio() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarRegistro(String idAviao, String operacao, LocalDateTime dataHora) {
        RegistroOperacao novo = new RegistroOperacao(idAviao, operacao, dataHora);
        if (fim == null) {
            inicio = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
        }
        fim = novo;
    }

    public void listar() {
        RegistroOperacao atual = inicio;
        while (atual != null) {
            System.out.println(atual);
            atual = atual.proximo;
        }
    }
}
