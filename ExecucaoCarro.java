
public class ExecucaoCarro {
	public static void main(String[] args) {
		Carro gol = new Carro(4, "preta", "Volkswagen", "gasolina", "Gol");
//		gol.carroEstaLigado();
		gol.liga();
		gol.anda();
		System.out.println(gol.getVelocidade());
		gol.passaMarchaPraFrente();
		System.out.println(gol.getVelocidade());
		gol.passaMarchaPraTras();
		gol.passaMarchaPraTras();
		System.out.println(gol.getVelocidade());
		gol.passaMarchaPraTras();
		System.out.println(gol.getVelocidade());
		/*
		 * anda, liga, desliga, pane, troca de marcha
		 * 
		 * 
		 */
	}

}
