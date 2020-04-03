package FinalLabAssessment;



import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.*;



public class CompanyRunner {



	public static void main(String[] args) throws IOException {

		File file = new File("src/FinalLabAssessment/Companies.dat");

		Scanner scanner = new Scanner(file);

		String CompanyName = scanner.nextLine();

		Company stuff= new Company(CompanyName);

		int totalCompanies = Integer.parseInt(scanner.nextLine());

		for(int i =0;i<totalCompanies;i++) {

			String nam = scanner.nextLine();

			String pos = scanner.nextLine();

			String sal = scanner.nextLine();

			stuff.addCompany(new Info(nam,sal,pos));

		}

		System.out.println(stuff);

	}



}