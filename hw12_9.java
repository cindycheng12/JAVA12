package pack9;
import sub1.CSphere;   // 載入sub1裡的CSphere類別
import sub2.CTrapezoid;   // 載入sub2裡的CTrapezoid類別


public class hw12_9 {
	   public static void main(String args[])
	   {
		  CSphere sph=new CSphere(2);
		  CTrapezoid trap=new CTrapezoid(7,8,9);
	      sph.show();
	      trap.show();
	   }

}
