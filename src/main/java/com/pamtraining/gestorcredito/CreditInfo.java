package com.pamtraining.gestorcredito;

import java.io.Serializable;

public class CreditInfo implements Serializable {
	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Identificador")
	private java.lang.Integer id;
	@org.kie.api.definition.type.Label(value = "Nombre del cliente")
	private java.lang.String cliente;
	@org.kie.api.definition.type.Label(value = "Monto solicitado")
	private java.lang.Double monto;
	@org.kie.api.definition.type.Label(value = "Aprobado")
	private java.lang.Boolean aprobado;

	public CreditInfo() {
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getCliente() {
		return this.cliente;
	}

	public void setCliente(java.lang.String cliente) {
		this.cliente = cliente;
	}

	public java.lang.Double getMonto() {
		return this.monto;
	}

	public void setMonto(java.lang.Double monto) {
		this.monto = monto;
	}

	public java.lang.Boolean getAprobado() {
		return this.aprobado;
	}

	public void setAprobado(java.lang.Boolean aprobado) {
		this.aprobado = aprobado;
	}

	public CreditInfo(java.lang.Integer id, java.lang.String cliente,
			java.lang.Double monto, java.lang.Boolean aprobado) {
		this.id = id;
		this.cliente = cliente;
		this.monto = monto;
		this.aprobado = aprobado;
	}
}
