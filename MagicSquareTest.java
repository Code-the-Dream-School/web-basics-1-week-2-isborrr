//Boro Ismael
//Mac 190
//07/12/2020
import java.util.Scanner;
public class MagicSquareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Scanner scan = new Scanner(System.in);
		 int count = 1; //count which square we're on
		 System.out.println("Enter the size of the square: (To stop type -1 )");
		 int size = scan.nextInt(); //size of next square
		 //Expecting -1 at bottom of input file
		 while (size != -1)
		 {
		 //create a new Square of the given size with name 
		     Square s=new Square(size);
			 
		 //call its read method to read the values of the square
		     //?? call readSquare(scan)
		     s.readSquare( scan);
		     
		  System.out.println("\n******** Square " + count + " ********");
	
		 //print the square
		 s.printSquare();
		  
		 //print the sums of its rows 
		 for(int i =0;i<size;i++) {
		 System.out.println("The sum of the row#"+(i+1)+" = "+s.sumRow(i));
		    
		 }
		 //print the sums of its columns
		 for(int i =0;i<size;i++) {
			 System.out.println("The sum of the column#"+(i+1)+" = "+ s.sumCol(i));
			    
			 }
		     
		  
		 //print the sum of the main diagonal
		 
			 System.out.println("The sum of the main diagonal = "+ s.sumMainDiag());
			    
			 
		    
		  
		 //determine and print whether it is a magic square
		     if( s.magic()) {
		     System.out.println("The square is magic ");
				    
		    	 
		     }else {
		    	 System.out.println("The square is not magic ");
		     }
		    
			  count++;
		 //get size of next square
			  System.out.println("");
		 System.out.println("Enter the size of the square: (To stop type -1 )");
		 size = scan.nextInt();
		 }if(size==-1) {
		 System.out.println("End of the program. bye!! )");
		 }
	}
} 