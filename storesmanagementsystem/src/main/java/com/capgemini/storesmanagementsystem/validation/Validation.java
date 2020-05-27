package com.capgemini.storesmanagementsystem.validation;

import java.util.regex.Pattern;

public class Validation {
   public boolean isNumber(String s) {
   try {
	   Long t=Long.parseLong(s);
	   if(t<0) {
		   return true;
	   }
   }catch(Exception e) {
	   return false;
   }
   return false;
}
   public static int calculatePasswordStrength(String password) {
	   int inputPassword=0;
	   if(password.length()<8) {
		   return 0;
	   }else if(password.length()>=10) {
		   inputPassword+=2;
	   }else {
		   inputPassword+=1;
	   }
	   if(password.matches("(?=.*[A-Z].*")) {
		   inputPassword+=2;
	   }
	   if(password.matches("(?.*[~@#$%&*()_*]),")) {
		   inputPassword+=2;
	   }
	   return inputPassword;
   }
   public static boolean IsValidEmail(String email) {
	   String emailRegex="*[a-zA-Z0-9_+&-]+(?:\\." + "[a-zA-z0-9_+&*-]+\\.)+[a-z"+"A-Z]{2,7}$";
	   
      return false;
}

}


