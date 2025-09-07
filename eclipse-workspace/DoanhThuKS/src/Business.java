
public class Business extends PhongKS {
	public Business(int soPhong, int soDem, int PhiDichVu) {
        super(soPhong, soDem, PhiDichVu);
    }

    @Override
    public double doanhThu() {
        return soDem * 300000 + PhiDichVu;
    }

    @Override
    public String loaiPhong() {
        return "Business";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
