import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequenciaFibbonaci {

	public List<Integer> criaSequencia() {
		int a = 0;
		int b = 1;
		int c = 1;
		List<Integer> listaSequencia = new ArrayList<Integer>();

		while (a <= 100) {
			int auxiliar;
			a = b + c;
			auxiliar = c;
			c = a;
			b = auxiliar;
			if (a >= 100) {
				break;
			}
			listaSequencia.add(a);
		}
		Collections.reverse(listaSequencia);
		return listaSequencia;
	}
}
