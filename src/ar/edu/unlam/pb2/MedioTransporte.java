package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class MedioTransporte {

	private Double latitud;
	private Double longitud;
	private Integer id;
	private static Integer idIncremental=0;

	public MedioTransporte(Double latitud, Double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.id = incrementar();
	}

	   public Integer incrementar() {
	        idIncremental++;
	        return idIncremental;
	    }
	   
	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Integer getIdIncremental() {
		return idIncremental;
	}

	public void setIdIncremental(Integer idIncremental) {
		this.idIncremental = idIncremental;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
	
		MedioTransporte other = (MedioTransporte) obj;
		return Objects.equals(id, other.id);
	}

	protected abstract void actualizarCoordenadas(double d, double e);

	
	
	

}
