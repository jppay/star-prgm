
// Replace the height of the Diamond you need with '5'

class PrintDiamond {
	
	// The triangle
	for(int i=0; i < 5; i++) {
		for(int j=0; j < (5-i); j++) {
			System.out.print(" ");
		}
		for(int k=0; k <= i; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	// The reverse triangle
	for(int i=5; i > 0; i--) {
		for(int j=0; j > (5-i); j++) {
			System.out.print(" ");
		}
		for(int k=5; k <= i; k--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}