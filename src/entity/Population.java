package entity;

import java.util.Random;

public class Population {
    
    private int k, ind = 5;
    private int[][] population = new int[ind][k];
    private int[] aux = new int[k];
    
    Random rand = new Random();

    public void setK(int k, int[][] mat, int[] aux) {
        this.k = k;
        this.population = mat;
        this.aux = aux;
    }
    
    public void zera() {
    	for (int i = 0; i < ind; i++) {
    		for (int j = 0; j < k; j++) {
    			population[i][j] = 0;
    		}
    	}
    }
    
    public void startPopulation() {
 
    	int first = rand.nextInt(k-1);
    	//Quantidade de indivíduo
    	for (int i = 0; i < ind; i++) {
    		population[i][0] = first;
    		aux[first] = 1;
    		
    		for (int j = 1; j < k; j++) {
    			int cont = 0;
    			while (cont < k) {
    				int auxValue = rand.nextInt(k);
    				if (aux[auxValue] == 0) {
    					population[i][j] = auxValue;
    					aux[auxValue] = 1;
//    					System.out.println(auxValue);
//    					System.out.println(population[i][j]);
//    					System.out.println(aux[auxValue]);
        				cont ++;
    				}

    			}
    		}
    	}
    }
    
    public void printPopulation() {
    	for (int i = 0; i < ind; i++) {
    		for (int j = 0; j < k; j++) {
    			System.out.print(population[i][j]);
    		}
    		System.out.println();
    	}
    }
    
}
