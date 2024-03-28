package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Evento {

	private String titulo;
	private String descricao;
	private Date dataInicio;
	private Date dataFinal;
	private String localizacao;
	private List<Participante> listaParticipantes = new ArrayList<>();
	
	public Evento(String titulo, String descricao, Date dataInicio, Date dataFinal, String localizacao) {
		try {
			validarDatas(dataInicio, dataFinal);
		} catch (DataInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.localizacao = localizacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataFinal, dataInicio, descricao, localizacao, titulo);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(dataFinal, other.dataFinal) && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(localizacao, other.localizacao)
				&& Objects.equals(titulo, other.titulo);
	}
	

	@Override
	public String toString() {
		return "Evento [titulo=" + titulo + ", descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataFinal="
				+ dataFinal + ", localizacao=" + localizacao + "]";
	}
	
	private void validarDatas(Date dataInicio, Date dataFim) throws DataInvalidaException {
        if (dataInicio == null || dataFim == null) {
            throw new DataInvalidaException("Data de início ou fim não podem ser nulas.");
        }
        if (dataInicio.after(dataFim)) {
            throw new DataInvalidaException("Data de início não pode ser posterior à data de fim.");
        }
    }
	
	public void adicionarParticipante(Participante participante) {
		listaParticipantes.add(participante);
    }

    public void removerParticipante(Participante participante) {
    	listaParticipantes.remove(participante);
    }

    public void imprimirParticipantes() {
        for (Participante participante : listaParticipantes) {
            System.out.println(participante.getNome());
        }
    }
	
	
}
