package ar.edu.unlam.pb2;

public class Auto extends MedioTransporte implements IPatente,IVelocidad{

	private Integer velocidad;
	private String patente;
	private Integer cantidadMaximaDePasajeros;
	
	public Auto(String patente,Integer c, Integer velocidad,Double latitud, Double longitud) {
		super(latitud, longitud);
		// TODO Auto-generated constructor stub
		this.velocidad=velocidad;
		this.patente=patente;
		this.cantidadMaximaDePasajeros=c;
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

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}

	@Override
	protected void actualizarCoordenadas(double d, double e) {
		// TODO Auto-generated method stub
		setLatitud(d);
		setLongitud(e);
		
	}

	
}
