package cl.previred.rest.response;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import cl.previred.utils.AppUtils;

@JsonPropertyOrder({ "id", "fechaCreacion", "fechaFin", "fechas", "fechasFaltantes","status"})
public class CompletePeriodResponse extends DetailStatus{

	Long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	Date fechaCreacion;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	Date fechaFin;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	List<Date> fechas;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	List<Date> fechasFaltantes;

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

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

	public List<Date> getFechasFaltantes() {
		return fechasFaltantes;
	}

	public void setFechasFaltantes(List<Date> fechasFaltantes) {
		this.fechasFaltantes = fechasFaltantes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Periodo [id=");
		builder.append(id);
		builder.append(", fechaCreacion=");
		builder.append(AppUtils.getDatesString(fechaCreacion));
		builder.append(", fechaFin=");
		builder.append(AppUtils.getDatesString(fechaFin));
		builder.append(", fechasGeneradas=\n");

		List<String> fecSts = AppUtils.getDatesString(fechas);

		for (String fecSt : fecSts) {
			builder.append(fecSt);
			builder.append("\n");
		}
		builder.append(", fechasFaltantes=\n");

		List<String> fecFts = AppUtils.getDatesString(fechasFaltantes);

		for (String fecFt : fecFts) {
			builder.append(fecFt);
			builder.append("\n");
		}

		builder.append("]");
		return builder.toString();
	}

}