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
	
	Graph grp = new Graph(k, mat);
	grp.starMat();
	//grp.printMat();

	Population population = new Population();
	population.setK(k, mat);
	population.startPopulation();
	population.printPopulation();
	sc.close();
	
	}
}
