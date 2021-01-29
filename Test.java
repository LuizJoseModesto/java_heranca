package Atividade_Herança;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Felipe");
		Aluno a4 = new Aluno("Fuad");
		Aluno a5 = new Aluno("Madagal");
		Aluno a6 = new Aluno("Cabecinha");

		
		Professor p1 = new Professor("Luciano");
		
		Disciplina portugues = new Disciplina("Português");
		
		portugues.setProfessor(p1);
		double[][] matriz = {
			      { 3, 1},
			      { 5, 9},
			      { 8, 2},
			      { 2, 4},
			      { 7, 10},
			      { 5, 6}
		       };
		portugues.setMatriz(matriz);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		alunos.add(a6);
		
		portugues.setAlunos(alunos);
		
		portugues.imprimeMedias();
		portugues.imprimeMelhorNota();
		System.out.print(portugues.toString());
		
	}
}
