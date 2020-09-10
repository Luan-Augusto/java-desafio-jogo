package david.august.luan.service;

import david.august.luan.entidades.*;

public class Jogo {

	public static void main(String[] args) {

		Monstro j1 = new Monstro();
		j1.x = 10;
		j1.y = 10;

		Heroi j2 = new Heroi();
		j2.x = 10;
		j2.y = 11;

		System.out.println(j1.vida);
		System.out.println(j2.vida);

		try {
			j1.atacar(j2);
			j2.atacar(j1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(j1.vida);
		System.out.println(j2.vida);

	}

}
