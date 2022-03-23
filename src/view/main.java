package view;

import java.util.concurrent.Semaphore;

import controller.ThreadShow;

public class main {

	public static void main(String[] args) {
	int permissoes = 1;
	Semaphore semaforo = new Semaphore(permissoes);



	for (int idPessoa = 1; idPessoa <= 300; idPessoa++) {
	Thread pessoa = new ThreadShow(idPessoa, semaforo);
	pessoa.start();
}
}
	
	
}