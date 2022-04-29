package com.codecean.randomjavacodes;

class WebAddressValidator{
    public boolean isValidWebAddress(String webAddress){
        //code here
    	
    	// wrong regex, need to check
    	
        String checkRegex = "((http|https){1}[:][//])((www.)?)([A-Za-z0-9_][.])(com|org|net)";
        boolean isCheck = checkRegex.matches(webAddress);
        
        return isCheck;
    }
//}

//class Tester{
    public static void main (String[] args) {
        String webAddress = "http://www.infosys.com";
        WebAddressValidator wb = new WebAddressValidator();
        boolean check = wb.isValidWebAddress(webAddress);
        if(check==true){
            System.out.println("You have entered a valid web address");
        }else{
            System.out.println("You have entered an invalid web address");
        }
        //code here
    }
}