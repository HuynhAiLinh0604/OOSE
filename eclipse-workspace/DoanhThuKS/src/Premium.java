
public class Premium extends PhongKS{
	public Premium(int soPhong, int soDem, int PhiDichVu) {
        super(soPhong, soDem, PhiDichVu);
    }

    @Override
    public double doanhThu() {
        return (soDem * 500000 + PhiDichVu) * 1.05;
    }

    @Override
    public String loaiPhong() {
        return "Premium";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
