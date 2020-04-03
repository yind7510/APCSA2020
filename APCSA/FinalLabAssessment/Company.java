package FinalLabAssessment;



import java.io.*;

import java.util.*;



public class Company {

	private String name;

	private ArrayList<Info> info;



	public Company() {

		setName("");

		info = new ArrayList<Info>();

	}



	public Company(String nam) {

		setName(nam);

		info = new ArrayList<Info>();

	}



	public void setName(String name) {

		this.name = name;

	}



	public void addCompany(Info Info) {

		info.add(Info);

	}



	public String getCompanyName() {

		return name;

	}



	public double getAverageCompensation() {

		int totalComp = 0;

		for (Info company : info) {

			totalComp += company.totalCompensation();

		}

		return totalComp / (info.size());

	}



	public double getTotalCompensation() {

		int totalComp = 0;

		for (Info company : info) {

			totalComp += company.totalCompensation();

		}

		return totalComp;

	}



	public Info getCompany(String nam) {

		for (Info invBa : info) {

			if (invBa.getName().equals(nam)) {

				return invBa;

			}

		}

		return null;

	}



	public String getCompanyWithHighestCompensation() {

		return info.get(info.size() - 1).getName();

	}



	public String getCompanyWithLowestCompensation() {

		return info.get(0).getName();

	}



	public String toString() {

		String output = this.name + "\n";

		for (Info invba : info) {

			output += invba.toString() + "\n";

		}

		output += "The average amount of money earned by the companies is " + getAverageCompensation()+"\n";

		output += "The total amount of money earned by the companies is " + getTotalCompensation();

		return output;

	}

}