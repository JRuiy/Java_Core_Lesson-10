package ua.lviv.lgs;

import java.util.Scanner;

import ua.lviv.lgs.WrongInputConsoleParametersException;

public class Aplication {
	
	public static void main(String[] args) throws ua.lviv.lgs.WrongInputConsoleParametersException{
		
		System.out.println("Введіть слово паліндром:");
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String pal = sc.next().toLowerCase();
			
			if (pal.length() == 5) {
				if (pal.charAt(0)==pal.charAt(4) && pal.charAt(1)==pal.charAt(3)) {
					System.out.println("Ви ввели паліндром");
				}else {
					System.out.println("Ви ввели не паліндром");
				}
			}else {
				String massege = "Введіть паліндром з 5 літер";
				throw new WrongInputConsoleParametersException(massege);
			}
		}
	}
	
}
