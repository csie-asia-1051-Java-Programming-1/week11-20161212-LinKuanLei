package ex;
/*
 * Date: 2016/12/12
 * Author: 103051089 林冠磊
 */

import java.util.Scanner;
import java.util.ArrayList;
public class ex02_103051089 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		double n = sc.nextDouble();
//		System.out.println("AVG:"+ (float)(Math.round((n*100)))/100);

		
		while(true){
			String input = sc.nextLine() ;
			String[] strArray =  input.split(" ");
			if(strArray[0].equals("0")){
				System.out.println("bye");
				break;
			}
			double total = 0;
			for(int i = 0 ; i < strArray.length ; i++){
				total += Double.valueOf(strArray[i]);
			}
			System.out.println("Size:"+strArray.length);
//			System.out.println("Total:"+ total);
			System.out.println("AVG:"+ (double)total/strArray.length);
			System.out.println("AVG:"+ (Math.round(((total/(double)strArray.length)*1000f)))/1000f);
		}
		
	}
}
