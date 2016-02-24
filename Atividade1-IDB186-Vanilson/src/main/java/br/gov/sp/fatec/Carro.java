package br.gov.sp.fatec;

public class Carro {

	private Veiculo veiculo;
	
	public Carro(){
		
	}
	
	public String tipoLocomocao(){
		return "O carro " + veiculo.getLocomocao();
	}
	
	public void setVeiculo(Veiculo veiculo){
		this.veiculo = veiculo;
	}
}
