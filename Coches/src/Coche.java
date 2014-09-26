
public class Coche {

	private String matricula;
	private int cilindrada;
	private int caballos;
	
	public Coche(String matricula, int cilindrada, int caballos) {
		super();
		this.matricula = matricula;
		this.cilindrada = cilindrada;
		this.caballos = caballos;
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

	@Override
	public String toString() {
		return "\nCoche [matricula=" + matricula + ", cilindrada=" + cilindrada
				+ ", caballos=" + caballos + "]\n";
	}
	
	
	
	
	
}
