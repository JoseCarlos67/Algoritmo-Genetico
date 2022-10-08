package application;

import java.util.Scanner;

import entity.Graph;
import entity.Population;

public class Program {

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o valor de K: ");
	int k = sc.nextInt();
	int[][]mat = new int[k][k];
	int[] aux = new int[k];
	
	Graph grp = new Graph(k, mat);
	grp.starMat();
	//grp.printMat();

	Population population = new Population();
	population.setK(k, mat, aux);
	population.resetMatc();
	population.startPopulation();
	population.printPopulation();
	System.out.println();

	sc.close();
	
	}
}
