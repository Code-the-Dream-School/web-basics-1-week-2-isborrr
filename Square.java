//Boro Ismael
//Mac 190
//07/12/2020
import java.util.Scanner;
public class Square {
	//int Ssize =0;
int[][] square;

//create new square of given size
	public Square(int size) {
	square = new int[size][size];
	
}

//return the sum of the values in the given row
	public int sumRow(int row) {
		int sumR= 0;
		for(int i =0;i< square.length;i++) {
			sumR+= square[row][i];
		}
		return sumR;
	}
	
//return the sum of the values in the given column
	public int sumCol(int col) {
		int sumC=0;
		for(int i=0;i<square.length;i++) {
			sumC+= square[i][col];
		}
		return sumC;
	}
	 
//return the sum of the values in the main diagonal
	public int sumMainDiag() {
		int sumD=0;
		int j=0;
		for(int i=0;i<square.length;i++) {
				sumD+= square[j][j];
			j++;
		}
		return sumD;
	}
	
//return true if the square is magic (all rows, cols, and diags have
 //same sum), false otherwise
//	public boolean magic(int a) {
//		if(sumRow( a )==sumCol( a) && sumCol(a)==sumMainDiag()) {
//		 return true;
//	 }else {
//		 return false;
//	 } }
	
	// 
	public boolean magic() {
	 int trueTester=0;
		for(int i=0;i<square.length;i++) {
			if(sumRow( i)==sumCol( i) && sumCol( i)==sumMainDiag()) {
				trueTester++;
				}
			}if(trueTester>0 && trueTester==square.length) {
				return true;
			}else {
				 return false;
			}
		}
//the above boolean function will compare the sum in  each row to the sum in  each column  and to the sum of the main  diagonal 		
	//since the main diagonal in enchanted , the loop will work. 
	
	
 //read info into the square from the standard input.
	public void readSquare(Scanner scan) {
		for (int row = 0; row < square.length; row++)
			 for (int col = 0; col < square.length; col ++){
				 System.out.print("Enter Element["+(row+1)+"]["+(col+1)+"]:");
				 square[row][col] = scan.nextInt();	 
				 }
	}
	
	
//print the contents of the square, neatly formatted
	
	public void printSquare()
	 {
		 for (int row = 0; row < square.length; row++){
			 for (int col = 0; col < square.length; col ++){
				 System.out.print(square[row][col]+"  ");	 
				 }
		    System.out.print("\n");	
		 }
	
	

	 }
}
