package br.com.cervejaria.venda;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.cervejaria.cliente.Cliente;
import br.com.cervejaria.estilo.Cerveja;

@Entity
@Table(name = "venda")
public class Venda implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private double valor;
	
	
	
	@Column
	private double frete;
	
	@Column
	private double quantidade;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cerveja")
	private Cerveja cerveja;
	
public Venda() {
		
	}
	
	

	

	public Venda(Long id, double valor, double frete, double quantidade, Date data) {
	super();
	this.id = id;
	this.valor = valor;
	this.frete = frete;
	this.quantidade = quantidade;
	this.data = data;
}





	public double getQuantidade() {
	return quantidade;
}





public void setQuantidade(double quantidade) {
	this.quantidade = quantidade;
}





public Date getData() {
	return data;
}





public void setData(Date data) {
	this.data = data;
}





public Cerveja getCerveja() {
	return cerveja;
}





public void setCerveja(Cerveja cerveja) {
	this.cerveja = cerveja;
}





	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}




	
	
}
