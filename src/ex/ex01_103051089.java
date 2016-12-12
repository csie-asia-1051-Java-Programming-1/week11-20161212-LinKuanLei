package ex;
/*
 * Date: 2016/12/12
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex01_103051089 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=1&&n<=10){
			int[] t = new int[n];
			int m;
			int k;
			int[] count = new int[n];
			for(int i = 0;i<n;i++){
				t[i] = sc.nextInt();
				m = sc.nextInt();
				k = sc.nextInt();
				int ke[] = new int[k];
				for(int j = 0 ; j<ke.length;j++){
					ke[j]=sc.nextInt();
				}
				int temp = 0;
				for(int j = 0 ; j<ke.length;j++){
					for(int l = 0 ; l<ke.length;l++){
						if(ke[j]<ke[l]){
							temp=ke[j];
							ke[j]=ke[l];
							ke[l]=temp;
						}
					}
				}
				count[i]= 0;
				for(int j = 0 ; j<m ; j++){
					count[i] += ke[j];
				}				
//				for(int j = 0 ; j<ke.length;j++){
//					System.out.print(ke[j]+"\t");
//				}
			}
			for(int i = 0 ; i <count.length;i++){
				if(count[i] <=t[i]){
					System.out.println(count[i]);
				}else if(count[i] >t[i]){
					System.out.println("No way");
				}
			}
			
		}else{
			System.out.println("Error");
		}
		
	}

}
