package Algos;import java.lang.reflect.Array;
import java.util.Arrays;

public class NextGreaterElementInAnArray {
public static void main(String[] args) {
	int[]  arr = {4,7,5,11,8,10};
	for (int i = 0; i < arr.length; i++) {
		boolean found =false;
		int insert = Integer.MAX_VALUE;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i] < arr[j]){
				insert =  Math.min(insert, arr[j]);
				found = true;
			}
		}
		if(found == false) {
			arr[i] = -1;
		}else {
			arr[i] = insert;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
