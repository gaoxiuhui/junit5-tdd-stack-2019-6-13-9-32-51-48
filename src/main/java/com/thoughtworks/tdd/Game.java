package com.thoughtworks.tdd;

public class Game {
	public static String FIZZ="Fizz";
	public static String BUZZ="Buzz";
	public static String WHIZZ="Whizz";
	
   public String getGame(int i) {
	   if(i<1 ||i>200) {
		 return "unvalid";  
	   }
	   String result="";
	   if(i%3==0) {
		   result+=FIZZ;
	   }
	   if(i%5==0) {
		   result+=BUZZ;
	   }
	   if(i%7==0) {
		   result+=WHIZZ;
	   }
	   if(result.equals("")) {
		   return String.valueOf(i);
	   }
	   return result;
   }
}
