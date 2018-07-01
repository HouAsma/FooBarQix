package testWemanity;
import javax.swing.JOptionPane;
	/**
	 * @author Asma Houchati developpeuse JAVA/JEE
	 * Step 1
	 *
	 */
	
	public class FooBarQixStep1 {
		
		public static void main (String[] args)
		{ 	
			boolean divisible = false;
			boolean existe = false;
			// dialogue box pour enter le nombre a verifier
			 String number = JOptionPane.showInputDialog(null, "Veuillez vous enter un nombre :", "FooBarQix",
				        JOptionPane.WARNING_MESSAGE);
				    
	   	int nomberVerifier = Integer.parseInt(number);	// convertir le nombre entrer de type string to type integer
		int[] tableauEntier = new int[number.length()]; // creation de table des entiers de la meme longueur que le nombre 

				 for (int i = 0; i < number.length(); i++)
				 {
					 tableauEntier[i] = number.charAt(i) - '0'; // remplissage de table 'tableau entier' par le nombre (chaque case contain un chiffre)		
				 }
	    if(nomberVerifier % 3 == 0 || nomberVerifier % 5 == 0 || nomberVerifier % 7 == 0)
	    	
	       {   divisible = true;
	    	// verification si le nombre est divisivle par 3
	             if(nomberVerifier % 3 == 0) 
				 {
						System.out.print("Foo");
				 }
				 // verification si le nombre est divisible par 5
				 if(nomberVerifier % 5 == 0) 
				 {
						System.out.print("Bar");
				 } 
				 // verification si le nombre est divisible par 7
				 if(nomberVerifier % 7 == 0) 
				 {
						System.out.print("Qix");
				 } 
			}
				 else if (divisible == false)
				 {    						
					 String tableauString[] = new String[number.length()];

					 for (int i = 0; i <= number.length()-1 ; i++)
					 {
						tableauString[i] = number.valueOf(tableauEntier[i]);
						 
					    if(tableauString[i].equals("3"))
					    { existe = true;
						 tableauString[i] = "Foo";	
						 System.out.print(tableauString[i]);

					    }
				    	 if(tableauString[i].equals("5"))
	                     { 
				    		 existe = true;
						 tableauString[i] = "Bar";
						 System.out.print(tableauString[i]);

				    	 }
					    if(tableauString[i].equals("7"))
					    {
					    	existe = true;
					  	 tableauString[i] = "Qix";	
						 System.out.print(tableauString[i]);

					    }
					  
					
					 }
					 for (int j = 0; j <= number.length()-1 ; j++)
					 {
						tableauString[j] = number.valueOf(tableauEntier[j]);
					 	if (existe == false)
						 { 
						 System.out.print(tableauString[j]);
						 }
					 }
			     }
				
			 if( divisible == true)
			 {
	             divisible = false; // initilisation de variable boolean 	
		    // verification si le nombre contain une 3,5 ou  7 
			 for (int i = 0 ;i <= tableauEntier.length-1; i++)
			 {
				 if( tableauEntier[i] == 3) 
				 {
					System.out.print("Foo");
				 }
				 if(tableauEntier[i] == 5)
				 {
				    System.out.print("Bar");

				 }
				 if(tableauEntier[i] == 7)
				 {
			        System.out.print("Qix");

				 }
				 
			 }	
			 }	
		}

		
		}
		



