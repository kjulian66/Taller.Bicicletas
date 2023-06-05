package domain;

import java.util.ArrayList;
import java.util.List;

public class Taller {
	
	//Atributos
	private String nombre;
	private List <Bicicleta> bicicletas;
		
	//Constructor
	public Taller(String nombre) {
		this.nombre = nombre;
		this.bicicletas = new ArrayList<>();
	}

	//Getters & Stters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Bicicleta> getBicicletas() {
		return bicicletas;
	}

	//Metodos
	public void addBicicletas(Bicicleta bicicleta) {
		bicicletas.add(bicicleta);
	}
	
	public Integer cantBicisMenosKm () {
		int cont = 0;
		for (Bicicleta bici : bicicletas) {
			if (bici instanceof BicicletaElectrica == false) {
				if (bici.getCantKm() < 2000) {
					cont += 1;
				}
			}
		}
		return cont;
	}
	
	public Integer cantBicisMenosWtts () {
		int cont = 0;
		for (Bicicleta bici : bicicletas) {
			if (bici instanceof BicicletaElectrica) {
				if (((BicicletaElectrica) bici).getCantWtts() < 250 && bici.getCantKm() < 2000) {
					cont += 1;
				}
			}
		}
		return cont;
	}
	
	public void cantServiciosPosibles () {
		System.out.println("Se prestara servicios a " + (cantBicisMenosKm() + cantBicisMenosWtts()) + " bicicletas");
	}
	
	
}
