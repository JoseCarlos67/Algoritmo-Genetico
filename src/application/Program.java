package application;

import java.util.Scanner;

import entity.Graph;

public class Program {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o valor de K: ");
	int k = sc.nextInt();
	int[][]mat = new int[k][k];
	
	Graph grp = new Graph(k, mat);
	
	grp.starMat();
	grp.printMat();

	
	sc.close();
	
	}
}
