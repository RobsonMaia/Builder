package application;

import entities.Nike;


public class Main {

	public static void main(String[] args) {

		Nike.Builder builder = new Nike.Builder();

		//builder.name("Mikasa").color("yellow/blue").size(67);
		builder.name("PlayOFF").color("Brown").size(78);
		//builder.name("Mercurial Fade").color("White/Red").size(70);
		
		Nike nike = builder.build();

		System.out.println("NAME: " + nike.getName());
		System.out.println("COLOR: " + nike.getColor());
		System.out.println("SIZE: " + nike.getSize() + "cm");
		

	}

}
