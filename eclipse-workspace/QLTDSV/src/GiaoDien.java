import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiaoDien extends JFrame implements ActionListener {
    private JTextField txtTenSV, txtNamSinh, txtDiemTB;
    private JRadioButton radNam, radNu;
    private JComboBox<String> cboLoaiSV;
    private JCheckBox chkTrungTuyen;
    private JButton btnLuu, btnThoat;

    public GiaoDien() {
        setTitle("Hệ thống quản lý sinh viên");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 2));

        JLabel lblTenSV = new JLabel("Tên sinh viên");
        txtTenSV = new JTextField();
        JLabel lblNamSinh = new JLabel("Năm sinh");
        txtNamSinh = new JTextField();
        JLabel lblDiemTB = new JLabel("Điểm trung bình");
        txtDiemTB = new JTextField();

        JLabel lblGioiTinh = new JLabel("Giới tính");
        radNam = new JRadioButton("Nam");
        radNu = new JRadioButton("Nữ");
        ButtonGroup gioiTinhGroup = new ButtonGroup();
        gioiTinhGroup.add(radNam);
        gioiTinhGroup.add(radNu);

        JLabel lblLoaiSV = new JLabel("Loại sinh viên");
        String[] loaiSV = {"Xét tuyển", "Thi tuyển"};
        cboLoaiSV = new JComboBox<>(loaiSV);

        chkTrungTuyen = new JCheckBox("Đã trúng tuyển");

        btnLuu = new JButton("Lưu");
        btnLuu.addActionListener(this);
        btnThoat = new JButton("Thoát");
        btnThoat.addActionListener(this);

        add(lblTenSV);
        add(txtTenSV);
        add(lblNamSinh);
        add(txtNamSinh);
        add(lblDiemTB);
        add(txtDiemTB);
        add(lblGioiTinh);
        add(radNam);
        add(new JLabel());
        add(radNu);
        add(lblLoaiSV);
        add(cboLoaiSV);
        add(new JLabel());
        add(chkTrungTuyen);
        add(btnLuu);
        add(btnThoat);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLuu) {
            String tenSV = txtTenSV.getText();
            int namSinh = Integer.parseInt(txtNamSinh.getText());
            double diemTB = Double.parseDouble(txtDiemTB.getText());
            boolean gioiTinh = radNam.isSelected();
            String loaiSV = cboLoaiSV.getSelectedItem().toString();
            boolean trungTuyen = chkTrungTuyen.isSelected();

            // Lưu thông tin sinh viên vào cơ sở dữ liệu hoặc thực hiện các thao tác khác tùy theo yêu cầu

            JOptionPane.showMessageDialog(this, "Thông tin sinh viên đã được lưu");
        } else if (e.getSource() == btnThoat) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GiaoDien();
            }
        });
    }
}