package domain;

public class Bicicleta {
	
	//Atributos
	private String marca;
	private String modelo;
	private Integer cantKm;
	
	//Constructor
	public Bicicleta(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.cantKm = 0;
	}
	
	//Getters & Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getCantKm() {
		return cantKm;
	}

	public void setCantKm(Integer cantKm) {
		this.cantKm = cantKm;
	}
	
	
}
