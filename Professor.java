package Atividade_Herança;

public class Professor extends Pessoa{

	public Professor(String nome) {
		super(nome);
	}
	
	private String Matricula;
	
	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public Professor() {
		
	}

	@Override
	public void imprimir() {
		String out= "Professor [Matricula=" + getMatricula() + "],";
		out+= "\n[Nome="+ getNome()+"]";
		System.out.println(out);
	}
	
	
	
}
