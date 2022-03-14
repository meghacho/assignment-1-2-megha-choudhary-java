package q3;

import java.util.Arrays;

public class AssignQ3 {

	public static void main(String[] args) {

		int oldarray[]= {4,5,6,7,67};
		int newarray[]=Arrays.copyOf(oldarray,oldarray.length);
		
		for(int i=0;i<newarray.length;i++){
			System.out.print(newarray[i]+ " ");
			
		}
	}
}




