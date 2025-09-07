import java.io.FileOutputStream;
import java.util.Vector;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
        // Tạo một Vector chứa 5 phòng
        Vector<PhongKS> danhSachPhong = new Vector<>();
        danhSachPhong.add(new Deluxe(1, 3, 50000, 0.1));
        danhSachPhong.add(new Premium(2, 2, 30000));
        danhSachPhong.add(new Deluxe(3, 4, 40000, 0.2));
        danhSachPhong.add(new Business(4, 5, 20000));
        danhSachPhong.add(new Deluxe(5, 1, 10000, 0.05));

        // Hiển thị thông tin của 5 phòng
        System.out.println("Thông tin các phòng:");
        for (PhongKS phong : danhSachPhong) {
            System.out.println(phong.toString());
        }

        // Liệt kê phòng có doanh thu cao nhất
        double maxDoanhThu = 0;
        PhongKS phongCaoNhat = null;
        for (PhongKS phong : danhSachPhong) {
            if (phong.doanhThu() > maxDoanhThu) {
                maxDoanhThu = phong.doanhThu();
                phongCaoNhat = phong;
            }
        }
        System.out.println("Phòng có doanh thu cao nhất: " + phongCaoNhat.toString());

        // Lưu 5 phòng vào tệp KhachSan.dat
        try {
            FileOutputStream fos = new FileOutputStream("KhachSan.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(danhSachPhong);
           oos.close();
            fos.close();
            System.out.println("Lưu thông tin phòng vào tệp KhachSan.dat thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

}
