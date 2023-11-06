package ar.edu.unlam.pb2;

public class Bicicleta extends MedioTransporte{

	public Bicicleta(Double latitud, Double longitud) {
		super(latitud, longitud);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void actualizarCoordenadas(double d, double e) {
		// TODO Auto-generated method stub
		setLatitud(d);
		setLongitud(e);
	}

}
