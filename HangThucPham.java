import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private final String maHang;
    private String tenHang = "xx";
    private double donGia = 0;
    private LocalDate ngaysanxuat = LocalDate.now();
    private LocalDate ngayhethan = LocalDate.now();
    
    public HangThucPham(String maHang) throws Exception{
    	if (maHang.isEmpty()) {
    		throw new Exception("Ma hang khong duoc de rong");
    		
    	}
    	this.maHang = maHang;
    	
    }
    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaysanxuat, LocalDate ngayhethan ) throw Exception{
    	if(maHang.isEmpty()) {
    		throw new Exception("ma hang khong duoc de rong");
    		
    	}
    	this.donGia = donGia;
    	this.maHang = maHang;
    	this.ngayhethan = ngayhethan;
    	this.tenHang = tenHang;
    	this.ngaysanxuat = ngaysanxuat;}
    	
    }

	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia >=0)
		this.donGia = donGia;
	}
	public LocalDate getNgaysanxuat() {
		return ngaysanxuat;
	}
	public void setNgaysanxuat(LocalDate ngaysanxuat) {
		if(ngaysanxuat.isBefore(LocalDate.now())) {
		this.ngaysanxuat = ngaysanxuat;
	}
	}
	public LocalDate getNgayhethan() {
		return ngayhethan;
	}
	public void setNgayhethan(LocalDate ngayhethan) {
		if(ngayhethan.isAfter(ngayhethan)) {
		this.ngayhethan = ngayhethan;
	}}
	public boolean dahethan() {
		return LocalDate.now().isAfter(ngayhethan)
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang)
	{
		this.maHang =maHang;
	}
	@override 
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		return ("ma hang:" +maHang+ "\n"+"ten hang"+tenHang+"\n"+"don gia"+donGia+"\n"+"ngay san xuat"+ngaysanxuat+"\n"+"ngayhethan"+ngayhethan+"\n"+"da het han"+(dahethan()? "da":"chua");
	}
	}
	
	
	
