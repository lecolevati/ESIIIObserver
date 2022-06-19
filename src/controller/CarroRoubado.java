package controller;

public class CarroRoubado implements IMovimentacaoCarro, IObservavel {

	private CarroPolicia carroPolicia;
	private String acao;
	
	public CarroRoubado(CarroPolicia carroPolicia) {
		this.carroPolicia = carroPolicia;
	}


	@Override
	public void notificaMudanca(String acao) {
		carroPolicia.update(acao);
	}

	@Override
	public void frente() {
		acao = "frente";
		System.out.println("Carro roubado andando em frente");
		notificaMudanca(acao);
	}

	@Override
	public void direita() {
		acao = "direita";
		System.out.println("Carro roubado virou à direita");
		notificaMudanca(acao);
	}

	@Override
	public void esquerda() {
		acao = "esquerda";
		System.out.println("Carro roubado virou à esquerda");
		notificaMudanca(acao);
	}

	@Override
	public void para() {
		acao = "parou";
		System.out.println("Carro roubado parou");
		notificaMudanca(acao);
	}

}
