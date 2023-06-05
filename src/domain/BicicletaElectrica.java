package domain;

public class BicicletaElectrica extends Bicicleta {
	 
	//Atributos
	private Integer cantWtts;
	
	//Constructores
	
	public BicicletaElectrica(String marca, String modelo, Integer cantWtts) {
		super(marca, modelo);
		this.cantWtts = cantWtts;
	}

	//Getters & Setters
	public Integer getCantWtts() {
		return cantWtts;
	}

	public void setCantWtts(Integer cantWtts) {
		this.cantWtts = cantWtts;
	}
}
