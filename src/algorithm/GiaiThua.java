package algorithm;

public class GiaiThua {
	
	// Tinh n!, return n!
	public static int GiaiThua(int n){
	  // Bai toan co so
	  if(n == 0)
	    return 1;
	  // Cong thuc quy nap
	  int t = n * GiaiThua(n-1);
	  return t;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GiaiThua(3));
	}

}
