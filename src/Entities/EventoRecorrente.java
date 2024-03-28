package Entities;

import java.util.Date;
import java.util.Set;

public class EventoRecorrente extends Evento {
    private Set<DiaSemana> diasSemana;

    public EventoRecorrente(String titulo, String descricao, Date dataInicio, Date dataFim, String localizacao, Set<DiaSemana> diasSemana) {
        super(titulo, descricao, dataInicio, dataFim, localizacao);
        this.diasSemana = diasSemana;
    }

    public void adicionarDiaSemana(DiaSemana dia) {
        diasSemana.add(dia);
    }

    public void removerDiaSemana(DiaSemana dia) {
        diasSemana.remove(dia);
    }

    public Set<DiaSemana> getDiasSemana() {
        return diasSemana;
    }
}

