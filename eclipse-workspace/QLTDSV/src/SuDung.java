import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class SuDung {
	public static void main(String[] args) {
        List<SinhVien> danhSachSinhVien = new ArrayList<>();

        // Thêm danh sách sinh viên
        danhSachSinhVien.add(new SVXetTuyen("Nguyễn Văn A", 1997, true, 8.5, "Học bổng A"));
        danhSachSinhVien.add(new SVXetTuyen("Trần Thị B", 1998, false, 7.8, "Học bổng B"));
        danhSachSinhVien.add(new SVThiTuyen("Lê Văn C", 1999, true, 7.2, 6.5, 7.0));
        danhSachSinhVien.add(new SVThiTuyen("Phạm Thị D", 2000, false, 6.8, 6.0, 5.5));
        danhSachSinhVien.add(new SVXetTuyen("Hoàng Văn E", 2001, true, 9.2, "Học bổng C"));

        // Hiển thị danh sách sinh viên
        System.out.println("Danh sách sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }

        // Đếm và hiển thị số lượng sinh viên trúng tuyển
        int count = 0;
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.trungTuyen()) {
                count++;
            }
        }
        System.out.println("Số lượng sinh viên trúng tuyển: " + count);

        // Lưu danh sách sinh viên nữ thuộc diện xét tuyển trúng tuyển vào tệp SVNUTRUNGTUYEN.txt
        try (FileWriter writer = new FileWriter("SVNUTRUNGTUYEN.txt")) {
            for (SinhVien sv : danhSachSinhVien) {
                if (sv.layLoaiSV().equals("XetTuyen") && !sv.gioiTinh) {
                    writer.write(sv.toString() + "\n");
                }
            }
            System.out.println("Đã lưu danh sách sinh viên nữ xét tuyển trúng tuyển vào tệp SVNUTRUNGTUYEN.txt");
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu danh sách sinh viên");
        }
    }

}
