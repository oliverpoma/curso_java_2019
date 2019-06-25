
public class PorcentajesDado {

	public static void main(String[] args) {
		double cont[] = new double [6];
		//double resultados[] = new double [50000];  //Array para guardar los resultados
		for(int i=1;i<=50000;i++) {
			double res=Math.rint(Math.random()*6+0.5); //funciona tb con Math.round
			//resultados[i-1]=res;  
			if(res==1) {
				cont[0]++;
			}
			if(res==2) {
				cont[1]++;
			}
			if(res==3) {
				cont[2]++;
			}
			if(res==4) {
				cont[3]++;
			}
			if(res==5) {
				cont[4]++;
			}
			if(res==6) {
				cont[5]++;
			}
		}
//		Para mostrar los 50000 resultados
//		for(double n:resultados) {  
//			System.out.print(n+" ");
//		}
		for(int i=0;i<cont.length;i++) {
			int d=i+1;
			System.out.println("El porcenteje de "+d+" es "+cont[i]/500+"%");
		}

	}

}
