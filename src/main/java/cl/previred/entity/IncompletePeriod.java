package cl.previred.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import cl.previred.handlers.DateHandler;
import cl.previred.handlers.DateListHandler;

public class IncompletePeriod {

	Long id;
	@JsonDeserialize(using = DateHandler.class)
	Date fechaCreacion;
	@JsonDeserialize(using = DateHandler.class)
	Date fechaFin;
	@JsonDeserialize(using = DateListHandler.class)
	List<Date> fechas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<Date> getFechas() {
		return fechas;
	}

	public void setFechas(List<Date> fechas) {
		this.fechas = fechas;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PeriodoGenerado [id=");
		builder.append(id);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", fechaFin=");
		builder.append(fechaFin);
		builder.append(", fechas=");
		builder.append(fechas);
		builder.append("]");
		return builder.toString();
	}



}