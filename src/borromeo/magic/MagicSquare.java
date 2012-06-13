package borromeo.magic;

public class MagicSquare {
	
	public static final int MAX = 4;
	public static final int DMAX = MAX * MAX;
	
	public int[] createArithmeticSeq(int first, int diff) {
		
		int[] arithmeticSeq = new int[DMAX];
		
		arithmeticSeq[0] = first;
		for (int i=1; i<DMAX; i++)
			arithmeticSeq[i] = arithmeticSeq[i-1] + diff;
			
		return arithmeticSeq;
	}
		  
  	public void displayArray(int[] arithmeticSeq) {
  		
  		for (int i=0; i<DMAX; i++)
  			System.out.print(arithmeticSeq[i] + " ");
  		
  		System.out.println("\n");
  	
  	}//end-displayArray
		
	public void printMatrix(int[][] matrix) {
		
		for (int row=0; row<MAX; row++) {
			for (int column=0; column<MAX; column++){
				if (matrix[row][column]<10) 
					System.out.print(matrix[row][column] + "   ");
				else 
					System.out.print(matrix[row][column] + "  ");
			}//end-for column
			System.out.println();
		} //end-for-row
		//System.out.println();
	
	}//end-printMatrix
		
	public void matricize(int[] arithmeticSeq, int[][] matrix) {
		
		for (int row=0,i=0; row<MAX; row++)
			for (int column=0; column<MAX; column++) {
				matrix[row][column] = arithmeticSeq[i];
				i++;
			}	
			
	}// end-matricize
        
    public int[][] reverseDiagonal(int[][] matrix){
    	
    	
    	for(int i=0; i<(MAX/2); i++) {		
    		
    		int pos = (MAX-i)-1;   //index of equivalent matrix position 
    		
    		int temp = matrix[i][i];  // diagonals have equal row and column positions
    		matrix[i][i] = matrix[pos][pos];
    		matrix[pos][pos] = temp;
    		
    		temp = matrix[i][pos];
    		matrix[i][pos] = matrix[pos][i];
    		matrix[pos][i] = temp;
    	
    	}//end-for
    	
    	return matrix;
    	
    }//end-reverseDiagonal
    
    public int magicNumber(int [] arithmeticSeq){
    	
    	int magicNum = 0;
    	for(int i=0; i<arithmeticSeq.length; i++)	
    		magicNum += arithmeticSeq[i];			//computes and returns the magic
    												//number
    	return magicNum/MAX;
    }//end magicNumber
    
    public void printMagicNumber(int magicNumber){
    		
    	System.out.println("magic number : "+magicNumber+"\n");
    	
    }//end printMagicNumber
    
    public int addCol(int [][] matrix){
    	
    	int [] colAdd = new int [MAX];
    	
    	for (int col=0; col<MAX; col++) {
       		colAdd[col] = 0;						//this loop returns the sum of
      		for (int row=0; row<MAX; row++){		//ever column
      			colAdd[col] += matrix [col][row];
      		}
      		return colAdd[col];   
       	}

 		return 0;
    }//end addCol
    
    public int addRow(int [][] matrix){
    	
    	int [] rowAdd = new int [MAX]; 
    	
   			for (int row=0; row<MAX; row++) {
   				rowAdd[row] = 0;						//this loop returns the sum
      			for (int col=0; col<MAX; col++){		//of every row
      				rowAdd[row] += matrix [row][col];
   				}
   				return rowAdd[row];    
       		}
    	     
 		return 0;
    }//end addCol
    
    public int addDiagonal(int [][] matrix){
    	
    	int total=0,firstDiagonal=0,secondDiagonal=0;
    	for(int i=0; i<MAX; i++){
    		int pos = (MAX-i)-1;
    		
    		firstDiagonal += matrix[i][i];		//sum of the diagonal with equal i's
    		secondDiagonal += matrix[i][pos];	//sum of the other diagonal
    	}
    	total = (firstDiagonal+secondDiagonal);	//total of both diagonals 	 
    		 
    	return total;
    }//end addDiagonal
    
    public boolean magicCheck(int [][] matrix, int magicNum){
    	
    	int [] totalRow = new int [MAX];
    	int [] totalCol = new int [MAX];
    	int rowTotal = 0, colTotal = 0;
    	
    	for(int i=0; i<MAX; i++){
    		totalRow[i] = addRow(matrix);
    		rowTotal += totalRow[i];		//this loop gets the sum of all the 
    		totalCol[i] = addCol(matrix);	//row and column totals
    		colTotal += totalCol[i];
    	}
    	int totalDiagonal = (addDiagonal(matrix)/2);//constant 2 because there are
    	int ROW = rowTotal/MAX;						//only 2 diagonals
    	int COL = colTotal/MAX;
    		
    	if((ROW & COL & totalDiagonal) == magicNum)
    		return true;
    	
    	return false;	
    }//end magicCheck
    
    public void showMagic(boolean checker){
    	
    	if(checker)
    		System.out.println("A MAGIC SQUARE\n");
    	else
    		System.out.println("NOT A MAGIC SQUARE\n");
    	
    }//end showMagic
}
