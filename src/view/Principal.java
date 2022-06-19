package view;

import controller.CarroPolicia;
import controller.CarroRoubado;

public class Principal {

	public static void main(String[] args) {
		CarroPolicia carroPolicia = new CarroPolicia();
		CarroRoubado carroRoubado = new CarroRoubado(carroPolicia);
		
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.frente();
		carroRoubado.esquerda();
		carroRoubado.frente();
		carroRoubado.para();
	}
	
}
