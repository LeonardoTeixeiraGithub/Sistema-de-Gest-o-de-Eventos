package Entities;

import java.util.Date;

public class EventoPeriodico extends Evento {
    private int intervalo;

    public EventoPeriodico(String titulo, String descricao, Date dataInicio, Date dataFim, String localizacao, int intervalo) {
        super(titulo, descricao, dataInicio, dataFim, localizacao);
        this.intervalo = intervalo;
    }

    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    public int getIntervalo() {
        return intervalo;
    }

    
}

