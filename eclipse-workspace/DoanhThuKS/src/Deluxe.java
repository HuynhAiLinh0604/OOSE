
public class Deluxe extends PhongKS {
	private double phiPhucVu;

    public Deluxe(int soPhong, int soDem, int PhiDichVu, double phiPhucVu) {
        super(soPhong, soDem, PhiDichVu);
        this.phiPhucVu = phiPhucVu;
    }

    @Override
    public double doanhThu() {
        double doanhThu = (soDem * 750000 + PhiDichVu) * (1 + phiPhucVu);

        if (doanhThu >= 20000000) {
            doanhThu -= doanhThu * 0.2;
        } else if (doanhThu >= 10000000) {
            doanhThu -= doanhThu * 0.1;
        }

        return doanhThu;
    }

    @Override
    public String loaiPhong() {
        return "Deluxe";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
