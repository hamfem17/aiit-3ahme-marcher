package Kap6;

public class Kap6 {

	private int x;

	public void setX(int x) {
		this.x = x;
	}
	
	public void f() {
		
		if(1 == 1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		switch(this.x) {
			
			case 1:
				System.out.println("1");
			case 2	:
				System.out.println("2");
			default:
				System.out.println("Nicht 1 und 2");
		}
		
		while(this.x < 10) {
			this.x++;
		}
		
		do {
			this.x--;
		} while(this.x > 0);
		
		for(int i = 0; i < 10; i++) {
			this.x++;
		}
		
		
	}
	
	
	
	
}
