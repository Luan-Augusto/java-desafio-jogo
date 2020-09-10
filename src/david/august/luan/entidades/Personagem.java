package david.august.luan.entidades;

public class Personagem {

	public int vida = 100;
	public int x;
	public int y;

	/*
	 * Aqui e responsavel por fazer um ataque case os elementos X e Y fiquem um ao
	 * lado do outro
	 * 
	 * @params Enum(Direcao)
	 */
	public boolean atacar(Personagem oponente) throws Exception {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltaY == 1 && deltaX == 0) {
			oponente.vida -= 10;
			return true;
		}
		throw new Exception("Jogada invalida");
	}

	/*
	 * Método responsavel por fazer o boneco andar incrementando
	 * 
	 * @params Enum(Direcao)
	 */
	public boolean andar(Direcao direcao) {
		/*
		 * Aqui estou fazendo a simulação de um tabuleiro mexendo as pecas a partir de
		 * pontos cardiais
		 * 
		 * @params Enum(direcao)
		 */
		switch (direcao) {
		case NORTE:
			y--;
			break;

		case SUL:
			y++;
			break;

		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		}

		return true;
	}
}
