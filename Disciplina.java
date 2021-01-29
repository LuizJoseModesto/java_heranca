package Atividade_Herança;

import java.util.List;

public class Disciplina{
	
	public Disciplina(String descricao) {
		super();
		this.descricao = descricao;
	}
	private String descricao;
	private List<Aluno> alunos;
	private double[][] matriz = new double[20][2];
	public double[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(double[][] matriz) {
		this.matriz = matriz;
	}
	private Professor professor;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void imprimeMedias() {
		double media;
		String outAlunos = "";
		for(int i=0; i<alunos.size();i++) {
			media = 0;
			outAlunos += "Aluno = " + alunos.get(i).getNome();
			for(int j=0; j<2; j++) {
				media += getMatriz()[i][j];
			}
			outAlunos += " - media: " + (media/2) + "\n";
		}		
		System.out.println(outAlunos);
	}
	
	
	
	@Override
	public String toString() {
		String out= "Disciplina = [" + descricao + "]\nProfessor = [" + professor + "]\n";
		String outAlunos = "";
		for(int i=0; i<alunos.size();i++) {
			outAlunos += "Aluno = " + alunos.get(i).getNome();
			for(int j=0; j<2; j++) {
				outAlunos += "\nP" +  (j+1) + " -- nota: " + getMatriz()[i][j];
			}
			outAlunos += "\n\n";
		}
		out+=outAlunos;
		return out;
	}
	public void imprimeMelhorNota() {
		double maxNotaP1=0;
		int indiceP1=0;
		int indiceP2=0;
		double maxNotaP2=0;
		String outAlunos = "";
		
		for(int i=0; i<alunos.size();i++) {
			if(getMatriz()[i][0]>maxNotaP1) {
				maxNotaP1 = getMatriz()[i][0];
				indiceP1 = i;
			}

			if(getMatriz()[i][1]>maxNotaP2) {

				maxNotaP2 = getMatriz()[i][1];
				indiceP2 = i;

			}
		}
		outAlunos += "Aluno Maior nota P1 = " + alunos.get(indiceP1).getNome();
		outAlunos += " - maior notaP1: " + getMatriz()[indiceP1][0] + "\n";
		outAlunos += "Aluno Maior nota P2 = " + alunos.get(indiceP2).getNome();
		outAlunos += " - maior notaP2: " + getMatriz()[indiceP2][1] + "\n";		
		System.out.println(outAlunos);
	}
	
	
}
