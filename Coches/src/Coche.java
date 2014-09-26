
public class Coche {

	private String matricula;
	private int cilindrada;
	private int caballos;
	private String marca;
	private String modelo;
	private String popietario;
	
	public Coche(String matricula, int cilindrada, int caballos, String marca,
			String modelo, String popietario) {
		super();
		this.matricula = matricula;
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.marca = marca;
		this.modelo = modelo;
		this.popietario = popietario;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public int getCaballos() {
		return caballos;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPopietario() {
		return popietario;
	}
	
	@Override
	public String toString() {
		return "\nCoche [matricula=" + matricula + ", cilindrada=" + cilindrada
				+ ", caballos=" + caballos + ", marca=" + marca + ", modelo="
				+ modelo + ", popietario=" + popietario + "]\n";
	}
	//voy a añadir un conflicto ignacio
	
	
	
	
	
	
}
