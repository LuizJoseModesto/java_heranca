package Atividade_Herança;

public class Aluno extends Pessoa{

	public Aluno(String nome) {
		super(nome);
	}
	
	private String RGA;
	
	public String getRGA() {
		return RGA;
	}
	public void setRGA(String rGA) {
		RGA = rGA;
	}

	public Aluno(){
		
	}
	@Override
	public void imprimir() {
		String out= "Aluno [RGA=" + getRGA() + "],";
		out+= "\nNome="+ getNome();
		System.out.println(out);
	}
	
	
}
