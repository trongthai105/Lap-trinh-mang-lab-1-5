import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập chiều dài cạnh: ");
		int canh = nhap.nextInt();
		System.out.println("Thể tích là: " + (Math.pow(canh, 3)));
	}

}
