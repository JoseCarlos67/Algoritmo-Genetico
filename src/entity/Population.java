package entity;

import java.util.Random;

public class Population {
    
    private int k, ind = 3;
    private int[][] population = new int[ind][k];
    private int[] aux = new int[k];
    private int[][] matGrafo = new int[k][k];
    Graph gph = new Graph(k, matGrafo);
    
    Random rand = new Random();

    public void setK(int k, int[][] mat, int[] aux) {
        this.k = k;
        this.population = mat;
        this.aux = aux;
    }
    
    //Zera a minha matriz de população.    
    public void resetMatc() {
	for (int i = 0; i < ind; i++) 
	    for (int j = 0; j < k; j++)
		population[i][j] = 0;
    }
    
    //Inicia minha matriz de população com os resultados.
    public void startPopulation() {
	int first = rand.nextInt(k)-1;
	
	for (int i = 0; i < ind; i++) {
	    reset(aux,k);
	    population[i][0] = first;
	    aux[first] = 1;
	    
	    for (int j = 1; j < k; j++) {
	    	int value = rand.nextInt(k);
		
	    	while (aux[value] == 1) {
	    		value = rand.nextInt(k);
	    	}  
	    	population[i][j] = value;
	    	aux[value] = 1;    
	    	}	
		}    
    }
    
    public void fitness() {
    	int i = 0, j = 0, soma = 0;
    	i = population[0][0];
    	System.out.println(i);
    	j = population[0][1];
    	System.out.println(j);
    	soma = gph.matGraph[i][j];
    	System.out.println(soma);
    }
    
    public void printPopulation() {
    	for (int i = 0; i < ind; i++) {
    	    for (int j = 0; j < k; j++) {
    	    	System.out.print(population[i][j] + " ");
    	    }
    	    System.out.println();
    	}
    }
    
    //Função que zera meu vetor auxiliar.
    private static void reset(int[] mat, int k) {
    	for (int i = 0; i < k; i++) {
    		mat[i] = 0;	    
		}
    }
    
}
