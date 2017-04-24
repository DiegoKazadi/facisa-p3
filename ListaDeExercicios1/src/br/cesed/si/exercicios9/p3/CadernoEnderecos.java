/**
 * 
 */
package br.cesed.si.exercicios9.p3;

import java.util.Date;
import java.util.*;
/**
 * @author Diego Kazadi
 *
 */
public class CadernoEnderecos {
	private static final int inicio = 5;
	public String nome;
	public String telefone;
	public String email;
	public Date dataAniversario;
	public String endereco;
	private String Vector[] listas = new Vector[inicio];
		
	/**
	 * @param nome
	 * @param telefone
	 * @param email
	 * @param dataAniversario
	 * @param endereco
	 */
	public CadernoEnderecos(String nome, String telefone, String email, Date dataAniversario, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataAniversario = dataAniversario;
		this.endereco = endereco;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dataAniversario
	 */
	public Date getDataAniversario() {
		return dataAniversario;
	}

	/**
	 * @param dataAniversario the dataAniversario to set
	 */
	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Caderno Enderecos de :" + nome + ", telefone=" + telefone + ", email=" + email + ", dataAniversario="
				+ dataAniversario + ", endereco=" + endereco + "/n";
	}

}
