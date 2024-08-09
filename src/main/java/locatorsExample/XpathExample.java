package locatorsExample;

public class XpathExample {

	public static void main(String[] args) {
		
		//Taken website -  https://letcode.in/signin
		// TODO Auto-generated method stub

		
		//Locating element with known attributes
		//*[@name='email']
		
		
		//locating elements with known element and attributes 
		//input[@name='email']
		
		//locating elements with known visible text 
		//button[text()='Forgotten password?']
		
		//locating elements with part of the visible test is known(partial match)
		//button[contains(text(),'password?')]
		
		//Locating elements with multiple attributes
		//button[contains(text(),'password?')][@class='button is-link is-light']
		
		
		//Locating elements with partial visible text known - starts with 
		//button[starts-with(text(),'Forgotten')][@class='button is-link is-light']
		
		
		
		//Locating element wuith dynamic attibute values, part of the attribute value 
		//input[contains(@name,'email')]
		//input[starts-with(@name,'em')]
		
		//Using parent 
		//input[starts-with(@name,'em')]/parent::div
		
		
		//Using ancestor
		//input[starts-with(@name,'em')]/ancestor::div
		
		//Using ancestor
		//  (//div[starts-with(@class,'field')]/ancestor::div)[1]
		
		
		//using child 
		(//div[starts-with(@class,'field')]/child::div)[1]
				
				
		//following-sibling
				//(//input[@name='email']/parent::*/parent::*/following-sibling::div)[1]
				
				
		//preceding-sibling
			//	(//input[@name='email']/parent::*/parent::*/following-sibling::div)[1]/preceding-sibling::*
				
				
		//precding element
				//(//input[@name='email']/parent::*/parent::*/following-sibling::div)[1]/preceding-sibling::*/preceding::div
				
				
		//following element
				((//input[@name='email']/parent::*/parent::*/following-sibling::div)[1]/preceding-sibling::*/preceding::div)[1]/following::div
						
						
		
				
			
						
						
				
				
				
				
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 
		  
	}

}
