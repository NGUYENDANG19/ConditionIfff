package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**9.1.Viết chương trình nhập vào một sốnguyên. 
		 * Kiểm tra sốđónguyên dươnghay nguyên âm. In ra màn hình kết quả
		 * 
		 */
		

		Scanner sc = new Scanner(System.in);

			// kiem tra so nguyen am hay nguyen duong

		int n ;
		System.out.println("n==");
		n = sc.nextInt();

		if (n>0)	{
			System.out.println("n la so nguyen duong");
		}else if (n<0)  {
			System.out.println("n la so nguyen am");
		}else	{
			System.out.println("n la so 0 ");
		}
	



		
/**9.2.Viết chương trình nhập vào một sốnguyên n.
 *  Kiểm tra n chia hết cho 3hay 5. In kết quảra màn hình
 * 
 */

if (x%3 == 0 )	{
	System.out.println("x la so chia het cho 3");

}else if(x%5 == 0)	{
	System.out.println("x la so chia het cho 5");
}else	{
	System.out.println("x la so khong chia het cho 3 va 5");

}



/**9.3.Viết chương trình nhập vào tháng trong năm.In ra sốngày của tháng đó
 * 
 */

if (n == 1 || n == 3 || n ==5 || n == 7 || n == 8 || n == 10  || n == 12 )	{
	System.out.println(" thang co 31 ngay");
}
	if (n == 4 || n == 6 || n == 9 || n == 11)	{
		System.out.println("thang co 30 ngay");
	}
if (n == 2)	{
	System.out.println("thang co 28 ngay");
}

/** 9.4.Viết chương trình giải phương trình bậc 2
 * 
 */
	



			double a,b,c,x1,x2,delta;
			
			System.out.println("a==");
			a = sc.nextDouble();
			System.out.println("b==");
			b = sc.nextDouble();
			System.out.println("c==");
			c = sc.nextDouble();
			
			delta = Math.pow(b, 2)-4*a*c;
			
			if(delta<0)	{
				System.out.println("py vo nghiem");
			}else if(delta==0)	{
				x1 = b/2*a ;
				System.out.println("py co nghiem kep x1= x2=" + x1);
			
			}else	{
			x1 = (-b-Math.sqrt(delta))/(2*a);
			x2 = (-b+Math.sqrt(delta))/(2*a);
			System.out.println("pt co nghiem");
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
			
			
/**9.5.Viết chương trình nhập vào 3 sốa, b, c. 
 * Kiểm tra cóphải là3 cạnh của một tam giác không?
 * 
 */
			if (a<=0 || b<=0 || c<=0 )	{
				System.out.println("khong");
			}else if	((a+b>c) || (a+c>b) && (b+c>a))	{
				System.out.println("co");
			}else {
				System.out.println("khong");
			}


			}
	}
}

	