package Models;
import java.time.LocalDateTime;

public class RegistroOperacao {
    String idAviao;
    String operacao; // "aterrissagem" ou "decolagem"
    LocalDateTime dataHora;
    RegistroOperacao proximo;
    RegistroOperacao anterior;

    public RegistroOperacao(String idAviao, String operacao, LocalDateTime dataHora) {
        this.idAviao = idAviao;
        this.operacao = operacao;
        this.dataHora = dataHora;
        this.proximo = null;
        this.anterior = null;
    }

    @Override
    public String toString() {
        return idAviao + " - " + operacao + " em " + dataHora;
    }
}

