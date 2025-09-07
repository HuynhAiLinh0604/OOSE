
public class SVXetTuyen extends SinhVien {
	private String thanhTich;

    public SVXetTuyen(String hoTen, int namSinh, boolean gioiTinh, double dtb, String thanhTich) {
        super(hoTen, namSinh, gioiTinh, dtb);
        this.thanhTich = thanhTich;
    }

    @Override
    public boolean trungTuyen() {
        return dtb >= 8.0 || (dtb >= 7.0 && !thanhTich.isEmpty());
    }

    @Override
    public String layLoaiSV() {
        return "XetTuyen";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Thành tích: " + thanhTich + "\n";
    }

}
