
public class OverloadingEx {
	int Sum (int a,int  b) {
		int sum=a+b;
		return sum;
	}
	int Sum (int a,int b,int c){
		int sum=a+b+c;
		return sum;
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingEx overloadingEx=new OverloadingEx();
		System.out.println(overloadingEx.Sum(0,5));
		System.out.println(overloadingEx.Sum(5, 10, 15));

	}

}
