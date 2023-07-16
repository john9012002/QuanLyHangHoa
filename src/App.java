import java.util.ArrayList;
import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin hàng hóa:");
        HangHoa hangHoa = new HangHoa();
        hangHoa.nhapThongTin();
        System.out.println("Thông tin hàng hóa:");
        hangHoa.xuatThongTin();

        System.out.print("Nhập số lượng máy tính: ");
        int n = scanner.nextInt();
        ArrayList<MayTinh> danhSachMayTinh = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin máy tính thứ " + (i + 1) + ":");
            MayTinh mayTinh = new MayTinh();
            mayTinh.nhapThongTin();
            danhSachMayTinh.add(mayTinh);
        }

        System.out.println("Thông tin các máy tính:");
        for (int i = 0; i < n; i++) {
            System.out.println("Máy tính thứ " + (i + 1) + ":");
            danhSachMayTinh.get(i).xuatThongTin();
            System.out.println("Giá bán thực tế: " + danhSachMayTinh.get(i).tinhGiaBanThucTe());
            System.out.println();
        }

        MayTinh.hienThiMayTinhTheoNhaSanXuat(danhSachMayTinh, "SAMSUNG");

        MayTinh.hienThiMayTinhCoGiaBanThapNhat(danhSachMayTinh);
    }
}
