/**
 * 
 */
package Atividade_Herança;

/**
 * @author luiz
 *
 */
public abstract class Pessoa {

	private String Nome;

	public Pessoa(String nome) {
		this.Nome = nome;
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	
	public abstract void imprimir();
	
	public Pessoa() {
			System.out.printf(Messages.getString("Pessoa.0")  + this.getNome()); //$NON-NLS-1$
	}

	@Override
	public String toString() {
		return Nome;
	}
	

}
