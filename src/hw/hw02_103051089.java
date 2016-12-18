package hw;

import java.util.Scanner;

/*
 * 一個含 N 個整數的序列中，出現頻率超過 N/2 的整數稱為『過半元素』。寫一個程式求一整數序列是否有過半元素(一整數序列以空白鍵隔開數字;0 < N < 11; 序列中的數字都是 integer; 輸入包含多 行，一行為一筆測資。若有 過半元素， 輸出該數; 否則輸出 NO)
 * Date: 2016/12/12
 * Author: 103051089 林冠磊
 */
public class hw02_103051089 {
	public static void main(String[] args) {
		char check = 'y';
		while(check=='Y'||check=='y'){
			Scanner sc = new Scanner(System.in);
			String inputStr = sc.nextLine();
			String[] str = inputStr.split(" ");
			int[] count = new int[str.length];
			for(int i = 0;i<str.length;i++){
				for(int j = 0;j<str.length;j++){
					if( i!=j ){
						if(str[i].equals(str[j])){
							count[i]++;
						}
					}
				}
			}
			int maxNum = 0,maxIndex=0;
			for(int i = 0;i<count.length;i++){
	//			System.out.print(count[i]+"\t");
				if(count[i]>maxNum){
					maxNum= count[i];
					maxIndex=i;
				}
			}
	//		System.out.println(maxNum+"\t"+str[maxIndex]);
			int numCount=0;
			for(int i = 0;i<str.length;i++){
				if(str[i].equals(str[maxIndex])){
					numCount++;
				}
			}
			if(numCount>str.length/2){
				System.out.println(str[maxIndex]);
			}else{
				System.out.println("No");
			}
			check = sc.nextLine().charAt(0);
		}
	}
}
