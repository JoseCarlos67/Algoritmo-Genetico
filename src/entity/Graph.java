package entity;

import java.util.Random;
import java.util.Scanner;

public class Graph {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    
    int k;
    int[][] matGraph = new int[k][k];
     
    public Graph(int k, int[][] mat) {
	super();
	this.k = k;
	this.matGraph = mat;
    }

    public void starMat() {
	for (int i = 0; i < k; i++) {
	    for (int j = i+1; j < k; j++) {
		this.matGraph[i][j] = rand.nextInt(10);
		this.matGraph[j][i] = this.matGraph[i][j];
	    }
	}
    }
    
    public void printMat() {
	for (int i = 0; i < k; i++) {
	    for (int j = 0; j < k; j++) {
		System.out.print(matGraph[i][j] + " ");
	    }
	    System.out.println();
	}
    }
    
    
    
}
