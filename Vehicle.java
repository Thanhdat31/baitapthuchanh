import java.util.Scanner;

public class Vehicle {
   private String ten;
   private String loaixe;
   private int dungtich;
   private double giatri;
  
   
  public Vehicle(String ten, String loaixe, int dungtich, double giatri) {
	   this.dungtich = dungtich;
	   this.giatri = giatri;
	   this.loaixe = loaixe;	  
   }

public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public String getLoaixe() {
	return loaixe;
}
public void setLoaixe(String loaixe) {
	this.loaixe = loaixe;
}
public int getDungtich() {
	return dungtich;
}
public void setDungtich(int dungtich) {
	this.dungtich = dungtich;
}
public double getGiatri() {
	return giatri;
}
public void setGiatri(double giatri) {
	this.giatri = giatri;
}
public double thuePhaiNop() {
    double thue;
	if(dungtich < 100)
	{ thue = giatri * 0.01;}
	else if (dungtich > 200 && dungtich <= 100) {
	 thue = giatri * 0.03;}
	else {
	thue = giatri * 0.05;
	}
	return thue;
}
void inthue() {
	System.out.printf("%s || %s || %f || %f || %f\n", "tên chủ xe", "loại xe","dung tích","giá trị");
}
Scanner sc = new Scanner(System.in);
void nhap (vehicle vc)
{
	System.out.println("Nhập tên chủ xe");
	vc.ten = sc.next();
	System.out.println("Nhập loại xe");
	vc.loaixe = sc.next();
	System.out.println("Nhập dung tích");
	vc.dungtich = sc.next();
	System.out.println("Nhập giá trị");
	vc.giatri = sc.next()
;}
   public static void main(String[] args) {
	Vehicle v[] =null;
	int n=0;
	boolean flag = true;
	do {
		System.out.println("1. Nhập thông tin");
		System.out.println("2. in bảng kê khai");
		System.out.println("3. thoát");
		switch(a)
		{
		case 1:
			System.out.println("Nhap so luong xe");
			n = sc.nextInt();
			v = new Vehicle[n];
			for(int i=0; i<n;i++)
			{
				System.out.println("xe so"+i);
				v[i]=new Vehicle();
				nhap(v[i]);
			}
			break;
		case 2:
			for(int i=0;i<n;i++)
			{
				v[i].inthue();
				
			}
		case 3:
			system{exit(0);
		}
	}
}
}
