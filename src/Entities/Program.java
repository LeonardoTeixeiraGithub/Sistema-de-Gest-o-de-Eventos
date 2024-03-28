package Entities;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Program {
    public static void main(String[] args) {
      
            
            Evento eventoUnico = new EventoUnico("Aniversário", "Festa de aniversário", new Date(10/02/2023), new Date(12/02/2023), "Casa");

            
            eventoUnico.adicionarParticipante(new Participante("Dory"));
            eventoUnico.adicionarParticipante(new Participante("Leo"));

            System.out.println("Participantes do evento único:");
            eventoUnico.imprimirParticipantes();

            
            System.out.println(eventoUnico.toString());
            
            Set<DiaSemana> diasSemana = new HashSet<>();
            diasSemana.add(DiaSemana.SÁBADO);
            diasSemana.add(DiaSemana.DOMINGO);
            Evento eventoRecorrente = new EventoRecorrente("Aula de yoga", "Aula de yoga final de semana", new Date(10/02/2023), new Date(12/02/2023), "Casa", diasSemana);
            
            System.out.println(eventoRecorrente.toString());

            		
            		
    }
}
