import java.util.List;

public class SequenciaFibMain {

	public static void main(String[] args) {
		SequenciaFibbonaci seqFib = new SequenciaFibbonaci();
		
		List<Integer> retorno = seqFib.criaSequencia();

		System.out.println(retorno);
		
	}

}
