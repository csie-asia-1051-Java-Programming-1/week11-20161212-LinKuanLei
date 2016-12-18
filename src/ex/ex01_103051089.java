package ex;
/*
 * 公司尾牙預定購買一批獎品給員工抽獎，而且人人有獎。在有限的經費、固定員工數、每份獎品均不相同的限制下，該如何選購獎品，使得總花費最少且不超過預算?

說明: 程式輸入的第一行包含一個正整數 n ， 1 ≤ n ≤ 10 ，代表接下來有 n 筆測試資料。 每筆測試資料包含兩行數據，第一行包含三個正整數 T, m 和 k ， m ≤ k ≤ 100 ; T 代表總預算， m 代表員工數(禮物數量)， k 代表有 k 件物品可供選購。第二 行包含 k 個正整數，分別代表 k 種物品的售價，正整數間以空白隔開。
對於每一筆測試資料，輸出一行結果，該行結果列印禮品總花費。倘若預算內無法購 買足夠量的禮物，則列印 “Impossible”，最後必須有換行字元
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
