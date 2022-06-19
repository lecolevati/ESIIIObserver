package controller;

public class CarroPolicia implements IObservador, IMovimentacaoCarro {

	@Override
	public void frente() {
		System.out.println("Viatura em frente");
	}

	@Override
	public void direita() {
		System.out.println("Viatura vira à direita");		
	}

	@Override
	public void esquerda() {
		System.out.println("Viatura vira à esquerda");		
	}

	@Override
	public void para() {
		System.out.println("Viatura prendeu o suspeito");		
	}

	@Override
	public void update(String acao) {
		if (acao.equals("frente")) {
			frente();
		}
		if (acao.equals("direita")) {
			direita();
		}
		if (acao.equals("esquerda")) {
			esquerda();
		}
		if (acao.equals("parou")) {
			para();
			
		}
	}
}
