//**********************************************
//
//	@author Max Hubenthal
//
//	Problem 117 -- projecteuler.net
//	A row of five black square tiles is to have a number of its tiles
//	replaced with coloured oblong tiles chosen from red (length two),
//	green (length three), or blue (length four). 
//	
//	How many different ways can the black tiles in a row measuring fifty units
//	in length be replaced if colours cannot be mixed and at least one 
// 	coloured tile must be used?
//
//**********************************************

/*

1. Smallest case: a single colored tile is used.
	
	rowSize - tileSize = diff
	diff + 1 = numPositions

	ex: 5 - 2 = 3
	3 + 1 = 4 possible positions for a red tile
	on a row measuring 5 tiles

2. Largest case: maximum number of tiles are used.

	rowSize = (tileSize * dividend) + remainder
	dividend + remainder = numPositions

	ex: 5 = (3 * 1) + 2
	1 + 2 = 3 possible positions

3.  

*/

public class Euler117{
	public static void main(String args[]){
		
	}
} 
