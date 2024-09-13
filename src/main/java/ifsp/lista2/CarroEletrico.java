package ifsp.lista2;

public class CarroEletrico extends Carro {

	// atributos especificos
	private String tipoBateria;
	private double autonomiaBateria;
	
	// construtor
	public CarroEletrico() {
	}
	public CarroEletrico(String tipoBateria, double autonomiaBateria) {
		super();
		this.tipoBateria = tipoBateria;
		this.autonomiaBateria = autonomiaBateria;
	}
	// getters and setters
	public String getTipoBateria() {
		return tipoBateria;
	}
	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}
	public double getAutonomiaBateria() {
		return autonomiaBateria;
	}
	public void setAutonomiaBateria(double autonomiaBateria) {
		this.autonomiaBateria = autonomiaBateria;
	}
	
}
