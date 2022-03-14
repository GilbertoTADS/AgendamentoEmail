package br.com.app.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AgendamentoEmail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String email;
	
	private String mensagem;
	
	private String assuntos;
	
	private Boolean agendado;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Boolean getAgendado() {
		return agendado;
	}

	public void setAgendado(Boolean agendado) {
		this.agendado = agendado;
	}

	public String getAssuntos() {
		return assuntos;
	}

	public void setAssunto(String assunto) {
		this.assuntos = assunto;
		
	}
	
	
}
