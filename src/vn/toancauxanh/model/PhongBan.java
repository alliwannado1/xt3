package vn.toancauxanh.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "phongban")
public class PhongBan extends Model<PhongBan> {
	private String ten = "";
	private String moTa = "";

	public PhongBan() {
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
}
