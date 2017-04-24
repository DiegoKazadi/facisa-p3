/**
 * 
 */
package br.cesed.si.p3.ed.pilha;

import java.util.Arrays;

/**
 * @author Diego Kazadi
 *
 */
public class NovaPilha {
	public Object[] pilha;
    public int posicaoPilha;
    private int tamanho;
	
    
    
    /**Método constructor definido  os valores de 2 variaveis e enstanciando o array interno
     * 
	 *@param posicaoPilha
	 *@param tamanho
	 *@param pilha 
	 */
	public NovaPilha() {
		super();
		this.posicaoPilha = -1;
		this.tamanho = 5;
		this.pilha = new Object[tamanho];
		
	}
	/**
	 * Método boolean para verificar o estado da pilha se está vazio ou não 
	 * isEmpty
	 * @return true ou false 
	 */
    public boolean estadoPilha(){
    	if (this.posicaoPilha == -1){
    		return true;
    	}
    	return false;	
    }
    /**
     * Mérodo que vai retornar o tamanho da pilha
     * is      
     */
    public int tamanhoPilha() {
     
        if (this.estadoPilha()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }
    /**
     * Método para aoqual retorna o ultimo elemento da pilha 
     * top
     */
    public Object exibeUltimoElemento() {
        
        if (this.estadoPilha()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }
    /**
     * Método desempilhar retira o objeto no topo da pilha e 
     * o roetorna; ocorre erro se a pilha estiver vazia.
     * pop
     */
    public Object desempilhar() {
        
        if (estadoPilha()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }
    /**
     * Método  para adicionar elemento na pilha
     * @param elemento
     */
    public void empilhar(Object elemento) {
        // push
    	if (posicaoPilha == pilha.length ){
    		Object[] pilhaMaior = new Object[pilha.length * 2];
    		
    		for (int i = 0; i < pilha.length; i++) {
    			pilhaMaior[i] = pilha[i];
			}
    		pilha = pilhaMaior;
    	}
    	
    	pilha[posicaoPilha++] = elemento;
    	
    	
    	if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = elemento;
        }
    }
    
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NovaPilha tem " + Arrays.toString(pilha) + ",Seu tamanho eh " + tamanho + "]";
	}
}
