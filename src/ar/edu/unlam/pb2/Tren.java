package ar.edu.unlam.pb2;

public class Tren extends MedioTransporte implements IVelocidad {

	private Integer velocidad;
	private Integer cantidadVagones;
	private Integer cantidadPasajerosPorVagon;

	public Tren(Integer cantidadVagones, Integer cantidadPasajerosPorVagon, Integer velocidad, Double latitud,
			Double longitud) {
		super(latitud, longitud);
		// TODO Auto-generated constructor stub
		this.velocidad=velocidad;
		this.cantidadPasajerosPorVagon=cantidadPasajerosPorVagon;
		this.cantidadVagones=cantidadVagones;
	}

	@Override
	public Integer getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return velocidad;
	}


	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getCantidadDeVagones() {
		return cantidadVagones;
	}

	public void setCantidadVagones(Integer cantidadVagones) {
		this.cantidadVagones = cantidadVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadPasajerosPorVagon;
	}

	public void setCantidadPasajerosPorVagon(Integer cantidadPasajerosPorVagon) {
		this.cantidadPasajerosPorVagon = cantidadPasajerosPorVagon;
	}

	@Override
	protected void actualizarCoordenadas(double d, double e) {
		// TODO Auto-generated method stub
		setLatitud(d);
		setLongitud(e);
	}

}
