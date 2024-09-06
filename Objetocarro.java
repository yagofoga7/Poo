package poo;

public class Objetocarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		carro1.setCor("Branco");
		carro1.setPorta(4);
		carro1.setRodas(4);
		carro1.setTipo("Caminhonete");
		
		carro2.setCor("Branco");
		carro2.setPorta(4);
		carro2.setRodas(4);
		carro2.setTipo("Civic");
		
		carro3.setCor("Vermelho");
		carro3.setPorta(2);
		carro3.setRodas(4);
		carro3.setTipo("Ferrari");
		
		carro4.setCor("preto");
		carro4.setPorta(4);
		carro4.setRodas(4);
		carro4.setTipo("Jeep");
		
		System.out.println();
	}

}
