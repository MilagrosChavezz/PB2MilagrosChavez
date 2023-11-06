package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Mapa {

	private String nombre;
	private Set<MedioTransporte> vehiculos;

	public Mapa(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.vehiculos = new HashSet<>();
	}

	public void agregarVehiculo(MedioTransporte auto) {
		// TODO Auto-generated method stub
		
		this.vehiculos.add(auto);
		
	}

	public Integer getCantidadDeVehiculos() {
		// TODO Auto-generated method stub
		return vehiculos.size();
	}

	public Boolean hayCoalicion() throws ColitionException {
		// TODO Auto-generated method stub
		for (MedioTransporte medioTransporte : vehiculos) {
			for (MedioTransporte medioTransporte2 : vehiculos) {
				if (medioTransporte.getLatitud().equals(medioTransporte2.getLatitud())
						&& medioTransporte.getLongitud().equals(medioTransporte2.getLongitud())
						&& medioTransporte != medioTransporte2) {
              throw new ColitionException();
				}
			}
		}
		return false;
	}

}
