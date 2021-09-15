package utils;

import java.util.Random;

public class Utils {
	
	public static Random rnd = new Random();
	
	public static String numToLetra (int i) {
		char[] alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		return Character.toString(alfabeto[i]);
	}

	public static int letraToNum (String s){
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		s = s.toLowerCase();
		return alfabeto.indexOf(s.charAt(0));

	}
	

}
