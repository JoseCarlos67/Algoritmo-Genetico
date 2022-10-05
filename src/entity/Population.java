package entity;

import java.util.Random;

public class Population {
    
    private int k;
    private int[][] population = new int[10][k];
    private int[] aux = new int[k];
    
    Random rand = new Random();

    public void setK(int k, int[][] mat) {
        this.k = k;
        this.population = mat;
    }

    public void startPopulation() {
	for (int i= 0; i < k; i++) {
	    for (int j = 0; j < 10; j++) {
		population[i][j] = rand.nextInt(k);
	    }
	}
    }
    
    public void printPopulation() {
	for (int i = 0; i < k; i++) {
	    for (int j = 0; j < 10; j++) {
		System.out.print(population[i][j] + " ");
	    }
	    System.out.println();
	}
    }
    
}