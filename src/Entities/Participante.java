package Entities;

import java.util.Objects;

public class Participante {
	
	private String nome;

	public Participante(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Participante [nome=" + nome + "]";
	}
	
	

}
