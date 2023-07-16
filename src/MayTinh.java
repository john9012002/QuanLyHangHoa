import java.util.ArrayList;
import java.util.Scanner;

public class MayTinh extends HangHoa {
    private String nhaSanXuat;
    private int namSanXuat;
    private float giaBanNiemYet;
    private static float tyLeKhuyenMai = 0.1f;

    public MayTinh() {
    }

    public MayTinh(String maHang, String tenHang, String nhaSanXuat, int namSanXuat, float giaBanNiemYet) {
        super(maHang, tenHang);
        this.nhaSanXuat = nhaSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBanNiemYet = giaBanNiemYet;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nhà sản xuất: ");
        nhaSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        namSanXuat = scanner.nextInt();
        System.out.print("Nhập giá bán niêm yết: ");
        giaBanNiemYet = scanner.nextFloat();
    }

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Giá bán niêm yết: " + giaBanNiemYet);
    }

    public float tinhGiaBanThucTe() {
        return giaBanNiemYet - giaBanNiemYet * tyLeKhuyenMai;
    }

    public static void hienThiMayTinhTheoNhaSanXuat(ArrayList<MayTinh> danhSachMayTinh, String nhaSanXuat) {
        System.out.println("Các máy tính của nhà sản xuất " + nhaSanXuat + ":");
        for (MayTinh mayTinh : danhSachMayTinh) {
            if (mayTinh.nhaSanXuat.equals(nhaSanXuat)) {
                mayTinh.xuatThongTin();
                System.out.println("Giá bán thực tế: " + mayTinh.tinhGiaBanThucTe());
                System.out.println();
            }
        }
    }

    public static void hienThiMayTinhCoGiaBanThapNhat(ArrayList<MayTinh> danhSachMayTinh) {
        float giaBanThapNhat = Float.MAX_VALUE;
        System.out.println("Các máy tính có giá bán thực tế thấp nhất:");
        for (MayTinh mayTinh : danhSachMayTinh) {
            float giaBanThucTe = mayTinh.tinhGiaBanThucTe();
            if (giaBanThucTe < giaBanThapNhat) {
                giaBanThapNhat = giaBanThucTe;
            }
        }
        for (MayTinh mayTinh : danhSachMayTinh) {
            float giaBanThucTe = mayTinh.tinhGiaBanThucTe();
            if (giaBanThucTe == giaBanThapNhat) {
                System.out.println(mayTinh.tenHang);
            }
        }
    }
}
