package Models;

import java.time.LocalDateTime;

public class AeroportoEDAero {
    ListaAvioes ldisp;
    Fila fdec;
    Fila fate;
    Relatorio relatorio;

    public AeroportoEDAero() {
        this.ldisp = new ListaAvioes();
        this.fdec = new Fila();
        this.fate = new Fila();
        this.relatorio = new Relatorio();
    }

    public void cadastraAviao(String idAviao) {
        Aviao aviao = new Aviao(idAviao);
        ldisp.inserir(aviao);
    }

    public void avioesCadastrados() {
        ldisp.listarTodos();
    }

    public void avioesCadastradosPorLetra(char letra) {
        ldisp.listarPorLetra(letra);
    }

    public void autorizaDecolar(String idAviao) {
        Aviao aviao = ldisp.buscar(idAviao);
        if (aviao != null) {
            fdec.enfileirar(aviao);
        } else {
            System.out.println("Avião não encontrado.");
        }
    }

    public void decolar() {
        Aviao aviao = fdec.desenfileirar();
        if (aviao != null) {
            aviao.decolagens++;
            relatorio.adicionarRegistro(aviao.id, "decolagem", LocalDateTime.now());
        } else {
            System.out.println("Nenhum avião na fila de decolagem.");
        }
    }

    public void autorizaAterrissar(String idAviao) {
        Aviao aviao = ldisp.buscar(idAviao);
        if (aviao != null) {
            fate.enfileirar(aviao);
        } else {
            System.out.println("Avião não encontrado.");
        }
    }

    public void aterrissar() {
        Aviao aviao = fate.desenfileirar();
        if (aviao != null) {
            aviao.aterrissagens++;
            relatorio.adicionarRegistro(aviao.id, "aterrissagem", LocalDateTime.now());
        } else {
            System.out.println("Nenhum avião na fila de aterrissagem.");
        }
    }
public void proximasDecolagens() {
        fdec.listar();
    }

    public void proximasAterrissagens() {
        fate.listar();
    }

    public void relatorioAeroporto() {
        relatorio.listar();
    }

    // Outras consultas
    public void buscaAviao(String idAviao) {
        Aviao aviao = ldisp.buscar(idAviao);
        if (aviao != null) {
            System.out.println(aviao);
        } else {
            System.out.println("Avião não encontrado.");
        }
    }

    public void totalOperacoes() {
        System.out.println("Total de operações de decolagem e aterrissagem:");
        relatorio.listar();
    }
}