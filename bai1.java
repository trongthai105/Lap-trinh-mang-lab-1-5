import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = nhap.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = nhap.nextDouble();
		System.out.print(hoTen);
		System.out.print(diemTB);
		System.out.print(" Điểm");
	}

}
