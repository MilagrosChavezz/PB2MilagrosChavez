package ar.edu.unlam.pb2;

public class Moto extends MedioTransporte implements IPatente,IVelocidad{
private Integer velocidad;
	private String patente;
	private static final Integer CAPACIDAD_MAXIMA_PASAJEROS=2;
	
	
	public Moto(String patente, Integer velocidad,Double latitud, Double longitud) {
		super(latitud, longitud);
		// TODO Auto-generated constructor stub
		this.patente=patente;
		this.velocidad=velocidad;
	}


	@Override
	public Integer getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return velocidad;
	}


	@Override
	public String getPatente() {
		// TODO Auto-generated method stub
		return patente;
	}


	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDAD_MAXIMA_PASAJEROS;
	}


	@Override
	protected void actualizarCoordenadas(double d, double e) {
		// TODO Auto-generated method stub
		setLatitud(d);
		setLongitud(e);
	}

}
