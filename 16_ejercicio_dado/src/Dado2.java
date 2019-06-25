
public class Dado2 {

	public static void main(String[] args) {
		int contador[] = new int [6];
		int res=0;
		
		for(int i=1;i<=50000;i++) {
			res=(int)Math.random()*6+1; 			 
			contador[res-1]++;   //ahorra todo !!!!
		}
		
		for(int i=0;i<contador.length;i++) {
			System.out.println("El porcenteje de "+(i+1)+" es "+contador[i]/500.0+"%");
		}
	}
}


