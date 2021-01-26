//classe de modelo
public class Carro {
	// atributos da classe (como se fosse variáveis da classe)
	private int qtdPortas;
	private String cor;
	private String montadora;
	private String tipoCombustivel;
	private String modelo;
	private boolean ligado;
	private double velocidade;
	private int marcha;

	// objeto: 4, preta, volsk, gasolina, gol
	// objeto: 2, preta, ford, diesel, ranger

	// metodo construtor
	public Carro(int qtdPortas, String cor, String montadora, String tipoCombustivel, String modelo) {
		// associacao dos atributos aos valores no construtor
		this.qtdPortas = qtdPortas;
		this.cor = cor;
		this.montadora = montadora;
		this.tipoCombustivel = tipoCombustivel;
		this.modelo = modelo;
		this.ligado = false;
	}

	public Carro(String montadora, String modelo) {
		// associacao dos atributos aos valores no construtor
		this.qtdPortas = 2;
		this.cor = "preta";
		this.montadora = montadora;
		this.tipoCombustivel = "gasolina";
		this.modelo = modelo;
		this.ligado = false;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void anda() {
		if (carroEstaLigado()) {
			velocidade = 20.0;
			System.out.println("Carro está em 20 Km/h");
		} else {
			System.out.println("Carro está desligado, por isso não anda");

		}
	}

	public void passaMarchaPraFrente() {
		if (this.marcha <= 5 && this.carroEstaLigado()) {
			System.out.println("Subindo marcha...");
			this.marcha++;
			this.velocidade += 40.0;
			System.out.println("Carro na marcha " + this.marcha);
		}
		if (this.marcha == 6)
			System.out.println("Carro na última marcha ");

	}

	public void passaMarchaPraTras() {
		if (this.marcha >= 1 && this.carroEstaLigado()) {
			System.out.println("Descendo marcha...");
			this.marcha--;
			this.velocidade -= 40.0;
			System.out.println("Carro na marcha " + this.marcha);
		}
		if (this.marcha == 0 && this.carroEstaLigado()) {
			System.out.println("Descendo para marcha ré...");

			this.marcha = -1;
			this.velocidade = -20.0;
			System.out.println("Carro na marcha " + this.marcha);
		}
	}

	public void liga() {
		System.out.println("Ligando o carro...");
		this.ligado = true;
		this.marcha = 1;
		pane();
	}

	public void desliga() {
		System.out.println("Desligando o carro...");
		this.marcha = 0;
		this.ligado = false;
	}

	public void pane() {
		// 30 % de chances de pane
		if (Math.random() <= 0.3) {
			System.out.println("O carro entrou em pane. Desligando o carro...");
			desliga();
		}
	}

	public boolean carroEstaLigado() {
		if (ligado) {
			System.out.println("Carro está ligado sim.");
			return true;
		} else {
			System.out.println("Carro está desligado.");
			return false;
		}
	}

//set = responsável por alterar o valor do atributo
	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	// metodo não estatico, pois é acessado pelo objeto
	public int getQtdPortas() {
		return qtdPortas;
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
}
