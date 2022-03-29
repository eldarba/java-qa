package c.blocks;

public class Demo1 {
	
	public static void main(String[] args) {
		// block
		// statement
		// expression - something that needs to be calculated
		
		// this is a block - a group of statements
		// a block creates a scope - life cycle of variables
		{ 
			int x = 6; // statement
			int y = 9 + 11;
			System.out.println(x);
			System.out.println(y);
		}
		
		{
			int x = 22;
			System.out.println(x);
		}
		
	}

}
