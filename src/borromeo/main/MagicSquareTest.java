// Nicholas Borromeo

package borromeo.main;

import java.io.*;
import borromeo.magic.MagicSquare;

public class MagicSquareTest {
		
	public static void main (String[] args) throws IOException {
		
		BufferedReader fin = new BufferedReader (new FileReader("magic.in"));
	
		while(fin.ready()) {
			
			MagicSquare ms = new MagicSquare();
				
  			int[] orig = new int [ms.DMAX];  //original sequence
			int[][] matrix = new int[ms.MAX][ms.MAX];  //matrix
			int[][] newMatrix = new int[ms.MAX][ms.MAX];  //matrix
  			
			String input = fin.readLine();
  			String[] tokens = input.trim().split(" ");
  			
  			int first = Integer.parseInt(tokens[0]);
  			int diff = Integer.parseInt(tokens[1]);
  			
  			orig = ms.createArithmeticSeq(first,diff);
  			int magicNum = ms.magicNumber(orig);
  			ms.printMagicNumber(magicNum);
  			
  			ms.matricize(orig,matrix);
  			ms.printMatrix(matrix);
  			
  			boolean checker = ms.magicCheck(matrix,magicNum);
  			ms.showMagic(checker);
  			
  			newMatrix = ms.reverseDiagonal(matrix);
  			ms.printMatrix(newMatrix);
  			
  			checker = ms.magicCheck(newMatrix,magicNum);
  			ms.showMagic(checker);
  			
  			System.out.println("********************");
  			
  		}//end-while
  			
	}  //end-main

}// end-class
