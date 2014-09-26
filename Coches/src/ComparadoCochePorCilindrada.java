import java.util.Comparator;


public class ComparadoCochePorCilindrada implements Comparator<Coche> {

	@Override
	public int compare(Coche c1, Coche c2) {
		
		return c1.getCilindrada()-c2.getCilindrada();
	}

}
