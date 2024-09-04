package NguyenHuuDuc_23699411;

import java.util.Scanner;

public class PhanSo {

	private int tu;
	private int mau;
	
	
	public int getTu() {
		return tu;
	}


	public void setTu(int tu) {
		this.tu = tu;
	}


	public int getMau() {
		return mau;
	}


	public void setMau(int mau) {
		this.mau = mau;
	}
	
	


	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}

	public int UCLN(int tu, int mau) {
		if(mau == 0)
			return tu;
		if(tu % mau == 0) {
			return mau;
		}
		return UCLN(mau, tu%mau); 
	}

	
	public void toiGianPS() {
		int temp = UCLN(getTu(), getMau());
		this.setTu(this.getTu() / temp);
		this.setMau(this.getMau() / temp);  
	}
	
	public void toiGianPS1() {
		PhanSo ps1 = new PhanSo(this.getTu(),this.getMau());
		ps1.toiGianPS();
		System.out.println("Toi gian phan so 1 : " + ps1.getTu() + "/" + ps1.getMau());
	}
	
	public void toiGianPS2(PhanSo ps) {
		PhanSo ps2 = new PhanSo(ps.getTu(), ps.getMau());
		ps2.toiGianPS();
		System.out.println("Toi gian phan so 2 : " + ps2.getTu() + "/" + ps2.getMau());
	}
	
	public void congPhanSo(PhanSo ps) {
		
		int tu = (this.getTu() * ps.getMau()) + (this.getMau() * ps.getTu());
		int mau = this.getMau() * ps.getMau();
		PhanSo tongPhanSo = new PhanSo(tu,mau);
		tongPhanSo.toiGianPS();
		System.out.println("Tong hai phan so : " + tongPhanSo.getTu() + "/" + tongPhanSo.getMau() );
	}
	
	
	public void hieuPhanSo(PhanSo ps) {
		int tu = (this.getTu() * ps.getMau()) - (this.getMau() * ps.getTu());
		int mau = this.getMau() * ps.getMau();
		PhanSo truPhanSo = new PhanSo(tu,mau);
		truPhanSo.toiGianPS();
		System.out.println("Hieu hai phan so : " + truPhanSo.getTu() + "/" + truPhanSo.getMau());
		
	}
	
	public void tichPhanSo(PhanSo ps) {
		int tu = this.getTu() * ps.getTu();
		int mau = this.getMau() * ps.getMau();	
		PhanSo nhanPhanSo = new PhanSo(tu,mau);
		nhanPhanSo.toiGianPS();
		System.out.println("Tich hai phan so : " + nhanPhanSo.getTu() + "/" + nhanPhanSo.getMau());
	}
	
	public void thuongPhanSo(PhanSo ps) {
		int tu = this.getTu() * ps.getMau();
		int mau = this.getMau() * ps.getTu();	
		PhanSo chiaPhanSo = new PhanSo(tu,mau);
		chiaPhanSo.toiGianPS();
		System.out.println("Tich hai phan so : " + chiaPhanSo.getTu() + "/" + chiaPhanSo.getMau());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu va mau cho ps 1: ");
		PhanSo ps1 = new PhanSo(sc.nextInt(), sc.nextInt());
		
		System.out.println("Nhao tu va mau cho ps 2: ");
		PhanSo ps2 = new PhanSo(sc.nextInt(),sc.nextInt());
		
		ps1.toiGianPS1();
		ps2.toiGianPS2(ps2);
		
		ps1.congPhanSo(ps2);
		ps1.hieuPhanSo(ps2);
		ps1.tichPhanSo(ps2);
		ps1.thuongPhanSo(ps2);
		
	}

}
