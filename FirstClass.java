
public class FirstClass {

	public static void main(String[] args) {
//				 int a=10;
//				 int b=20;
//				 int c=a+b;
//				 System.out.println("sum is "+c);
		for(int i=1;i<10;i++) {
			for(int j=1;j<i;j++) {
				if(i==j) {
					continue;
				}
				System.out.println("i is "+i+",   j is "+j);
			}
		}
				}
}
