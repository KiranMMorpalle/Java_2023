package Day24;

import java.util.Arrays;

public class StringContainExample {

	public static void main(String[] args) {


		String stringList[]= {"ab","ab","abc","cb"};
		String queryList[]= {"ab","abc","bc","cb"};
		
		int arr[]=new int[queryList.length];
		
		//2,1,0,1     => o/p[] size depend on i/p[] size
		
		for(int i=0; i<queryList.length; i++) {
			int cnt=0;
			for(int j=0; j<stringList.length; j++) {
				if(stringList[j].equals(queryList[i]))
					cnt++;		
			}
			arr[i]=cnt;
		}
		
		System.out.print(Arrays.toString(arr));
		
//		for(int k=0; k<arr.length; k++) {
//			System.out.print(arr[k]);
//		}

	}

}
