
public abstract class PhongKS {
	protected int soPhong;
    protected int soDem;
    protected int PhiDichVu;

    public PhongKS(int soPhong, int soDem, int PhiDichVu) {
        this.soPhong = soPhong;
        this.soDem = soDem;
        this.PhiDichVu = PhiDichVu;
    }

    public int getSoPhong() {
		return soPhong;
	}

	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}

	public int getSoDem() {
		return soDem;
	}

	public void setSoDem(int soDem) {
		this.soDem = soDem;
	}

	public int getPhiDichVu() {
		return PhiDichVu;
	}

	public void setPhiDichVu(int phiDichVu) {
		PhiDichVu = phiDichVu;
	}

	public abstract double doanhThu();

    public abstract String loaiPhong();

    @Override
    public String toString() {
        return "Số phòng: " + soPhong + ", Loại phòng: " + loaiPhong() + ", Doanh thu: " + doanhThu();
    }

}
