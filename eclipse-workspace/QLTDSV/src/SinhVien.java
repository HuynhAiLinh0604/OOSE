
public abstract class SinhVien {
	protected String hoTen;
    protected int namSinh;
    protected boolean gioiTinh;
    protected double dtb;

    public SinhVien(String hoTen, int namSinh, boolean gioiTinh, double dtb) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.dtb = dtb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    
    public abstract boolean trungTuyen();

    public abstract String layLoaiSV();

    @Override
    public String toString() {
        return "Họ và tên: " + hoTen + "\n" +
                "Năm sinh: " + namSinh + "\n" +
                "Giới tính: " + (gioiTinh ? "Nam" : "Nữ") + "\n" +
                "Điểm trung bình: " + dtb + "\n" +
                "Trúng tuyển: " + (trungTuyen() ? "Có" : "Không") + "\n";
    }
}
    



