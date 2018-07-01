package testWemanity;
import javax.swing.JOptionPane;
/**
 * 
 * @author Asma Houchati developpeuse JAVA/JEE
 *Step2
 */
public class FooBarQixStep2 {
	
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
    if(nomberVerifier % 3 == 0 || nomberVerifier % 5 == 0 || nomberVerifier % 7 == 0) // verifier si le nombre est divisible par 5,3 ou 7
    	
    {  divisible = true;
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
			
			 // remplisage de tableau de string
			 String tableauString[] = new String[number.length()];
			 for (int i = 0; i <= number.length()-1 ; i++)
			 { 
				 tableauString[i] = number.valueOf(tableauEntier[i]);
			 if(tableauString[i].equals("0"))
			 {
				 tableauString[i] = "*";
				 System.out.print(tableauString[i]);

			 }
			 }
	      }
			 else if (divisible == false) // vérifier si le nombre n est pas divisible ni par 3, ni par 5 ni par 7
			 {    						
				 String tableauString[] = new String[number.length()];
                
				 for (int i = 0; i <= number.length()-1 ; i++)
				 {
					 tableauString[i] = number.valueOf(tableauEntier[i]);
				// etudier l'existance du zero
				 if(tableauString[i].equals("0"))
				 {  
					 tableauString[i] = "*";
				 }
					 // etudier l' existance de trois
				    if(tableauString[i].equals("3"))
				    {
				    	existe = true;
					 tableauString[i] = "Foo";
					 System.out.print(tableauString[i]); // afficher Foo si le nombre contain 3
				    }
				    // etudier l'existance du cinq
			    	 if(tableauString[i].equals("5"))
			    	 { 
			    		 existe = true;
					 tableauString[i] = "Bar";	
					 System.out.print(tableauString[i]); // afficher Bar si le nombre contain 5
			    	 }
			    	 // etudier l'existance du sept
				    if(tableauString[i].equals("7"))
				    {
				    	existe = true;
				  	 tableauString[i] = "Qix";	
					 System.out.print(tableauString[i]); // afficher Qix si le nombre contain 7
				    }
				
				 }
                
				 for (int j = 0; j <= number.length()-1 ; j++)
				 {
					 tableauString[j] = number.valueOf(tableauEntier[j]);
					// etudier l'existance du zero
					 if(tableauString[j].equals("0"))
					 {  
						 tableauString[j] = "*";// change le chifre zero par *			
					 }
					    // afficher le nombre telle qu il est
					  if (existe == false)
					 {
					 System.out.print(tableauString[j]);
					 }
					  
				 }
		     }
		 if( divisible == true) // les nombre est divisible par 3, 5 ou 7
		 {
                 divisible = false; // initilisation de variable boolean 
			 String tableauString[] = new String[number.length()]; // tableau de string de longueur du nombre

		 for (int j = 0; j <= number.length()-1 ; j++)
		 {
				 tableauString[j] = number.valueOf(tableauEntier[j]); // remplissage de tableau par les chifre de nombre
				 // verification si le nombre contain zero
			 if(tableauString[j].equals("0")) 
			 {
				 tableauString[j] = "*"; // remplacer le zero par *
			 }
		 }	
	    // verification si les cases de tableau contain une 3,5 ou  7 
		 for (int i = 0 ;i <= tableauEntier.length-1; i++)
		 {
			 if( tableauEntier[i] == 3) 
			{
				System.out.print("Foo"); // afficher Foo s'il contain 3
			}
			 if(tableauEntier[i] == 5)
			 {
			    System.out.print("Bar"); //afficher Bar s'il contain 5

			 }
			 if(tableauEntier[i] == 7)
			 {
		        System.out.print("Qix"); // afficher Qix s'il contain 7
			 }
		 }	
		 }	
	}
	}
	
