package cau_truc_vong_lap_for;

public class Cau1 {
 public static double Tong(int[] n) {
	 double sum = 0;
	 for (int i = 1; i < n.length; i++) {
		 sum += i;
		
	}
	 return sum;
 }
 public static double trungbinh (int[] n ) {
	 double count =0;
	 double sum =0 ;
	 for (int i = 0; i < n.length; i++) {
		count++;
		sum+=i;
	}
	 return sum/count;
 }
 public static double SoLonNhat( int[] n) {
	 double Max = Double.MIN_VALUE;
	for (int i = 0; i < n.length; i++) {
		if(n[i] > Max) {
			Max = n[i];
		}
	}
	return Max;
 }
    public static void main(String[] args) {
	int[] n = {1,2,3,4,5,6,7,8,9,0};
	System.out.println(trungbinh(n));
	System.out.println(Tong(n));
	System.out.println(SoLonNhat(n));
}
 
}
