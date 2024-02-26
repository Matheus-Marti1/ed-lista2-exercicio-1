package controller;

public class MultiplicacaoController {

	public MultiplicacaoController() {
		super();
	}

	public int multiplicarComSomas(int A, int B) {
		if (B == 1) {
			return A;
		} else {
			return A + multiplicarComSomas(A, B - 1);
		}
	}

}
