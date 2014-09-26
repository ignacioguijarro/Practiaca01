import java.util.ArrayList;
import java.util.Collections;


public class Comparador {

	public static void main(String[] args) {
		Coche c1 = new Coche ("5763-CSE", 1900, 100, "fiat", "stilo", "Hermenegildo");
		Coche c2 = new Coche ("3218-UDE", 1500, 50, "seat", "panda", "Skander");
		Coche c3 = new Coche ("8675-OIF", 900, 90, "ford", "mustang", "Socorro");

		ArrayList<Coche> list = new ArrayList<Coche>();
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		Collections.shuffle(list);
		
		System.out.println("Vamos a mostrar la lista desordenada");
		System.out.println(list);
		
		Collections.sort(list, new ComparadoCochePorCilindrada());
		System.out.println("Mostramos ordenado por cilindrada");
		System.out.println(list);
		
		Collections.sort(list, new ComparadorCochePorCaballos());
		System.out.println("Mostramos ordenado por Caballos");
		System.out.println(list);
	}

}
