package test;

import domain.Bicicleta;
import domain.BicicletaElectrica;
import domain.Taller;

public class TestTaller {

	public static void main(String[] args) {

		//Instancio Taller
		Taller taller = new Taller("Julian");
		
		//Instancio bicicletas
		Bicicleta bici1 = new Bicicleta("Battle", "Mountain Bike");
		bici1.setCantKm(7820);
		Bicicleta bici2 = new Bicicleta("Bianchi", "Playera");
		bici2.setCantKm(1430);
		BicicletaElectrica bici3 = new BicicletaElectrica("Shimano", "Deportiva", 200);
		bici3.setCantKm(340);
		BicicletaElectrica bici4 = new BicicletaElectrica("GT", "Mountain Bike", 470);
		bici4.setCantKm(1340);
		
		//Agrego bicicletas a lista
		taller.addBicicletas(bici1);
		taller.addBicicletas(bici2);
		taller.addBicicletas(bici3);
		taller.addBicicletas(bici4);
		
		//Muestro por pantalla resultado
		taller.cantServiciosPosibles();

	}

}
