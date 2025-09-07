
public class SVThiTuyen extends SinhVien {
	private final double diemIELTS;
    private final double diemThiTuyen;

    public SVThiTuyen(String hoTen, int namSinh, boolean gioiTinh, double dtb, double diemIELTS, double diemThiTuyen) {
        super(hoTen, namSinh, gioiTinh, dtb);
        this.diemIELTS = diemIELTS;
        this.diemThiTuyen = diemThiTuyen;
    }

    @Override
    public boolean trungTuyen() {
        return diemIELTS > 5.0 && diemThiTuyen >= 6.0;
    }

    @Override
    public String layLoaiSV() {
        return "ThiTuyen";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Điểm IELTS: " + diemIELTS + "\n" +
                "Điểm thi tuyển: " + diemThiTuyen + "\n";
    }
}
