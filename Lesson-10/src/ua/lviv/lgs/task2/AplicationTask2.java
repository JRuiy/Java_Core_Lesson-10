package ua.lviv.lgs.task2;

public class AplicationTask2 {

	public static void main(String[] args) {

		String s = "Як умру, то поховайте Мене на могилі Серед степу широкого На Вкраїні милій";
		
		System.out.println(s.replaceAll("[уеїіаоєяиУЕЇІАОЄЯИ]", "-"));

	}
	
}
