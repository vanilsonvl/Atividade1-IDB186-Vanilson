package br.gov.sp.fatec;

public class Terrestre implements Veiculo {
	
	private String locomocao;
	
	public Terrestre(){
		
	}
	
	
	public void setLocomocao(String locomocao){
		this.locomocao = locomocao;
	}
	
	@Override
	public String getLocomocao(){
		return "se desloca " + locomocao + ";";
	}
	
}
