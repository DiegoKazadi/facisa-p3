package br.cesed.si.p3.arrays.atividade;
import java.util.Arrays;
/**
 * Class for my own implementation of ArrayList
 * 
 * @author diego
 *
 */
public class ArrayListFacisa {

	private int tamanho;
	private Object [] ArrayListFacisa ;
	 

	/**
	 * Constructor 
	 * 
	 * @param tamanho the initial size of ArrayList
	 */
	public ArrayListFacisa(int tamanho) {
		this.tamanho = tamanho;
		this.ArrayListFacisa = new Object [tamanho];
	}
	
	/**
	 * Return the size of ArrayList.
	 * 
	 * @return
	 */
	public int size() {
		int contador = 0;
		for (int i = 0; i < ArrayListFacisa.length ; i++) {
			
			if(ArrayListFacisa[i] != null){
				contador += 1;
			}
		}
		return contador;
	}
	
	/**
	 * Add an object
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		for (int i = 0; i < ArrayListFacisa.length ; i++) {
			if (ArrayListFacisa[i] == null){
				ArrayListFacisa[i] = obj;
			}

		}
	}
	
	/**
	 * Remove an object
	 * 
	 * @param obj
	 */
	public void remove(Object obj) {
		Object [] ArrayListFacisa2 = new Object [size()];
		int contador = 0;
		int contador2 = 0;
		for (int i = 0; i < ArrayListFacisa.length; i++) {
			if(ArrayListFacisa.equals(obj)){
				contador2 += 1;
			}
			
		}
		ArrayListFacisa2[contador2] = null;
		
		
		for (int i = 0; i < ArrayListFacisa.length; i++){
			Object ob = ArrayListFacisa[i];
			
			if(! ob.equals(null)){ //encotrar elemento null no Array
				ArrayListFacisa2[contador] = ob;
				contador +=1;
								
			}
			ArrayListFacisa = ArrayListFacisa2;		
		}
		
	}
	
	/**
	 * Get the object by index.
	 * 
	 * For example, if I pass index as 0, this method will return the persisted value at first position of Array.
	 *  
	 * @param index index in Array
	 */
	public Object getByIndex(int index) {
		
		return null;
	}

	/**
	 * Check the position of the informed object.
	 * 
	 * @param obj
	 * @return
	 */
	public int findPosition(Object obj) {
		
		return 0;
	}
	
	public void printAllElements() {
		
	}
	
	
	
}
