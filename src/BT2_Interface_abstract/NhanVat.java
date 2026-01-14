package BT2_Interface_abstract;

public abstract class NhanVat {
    private String ten;
    private Long HP;
    public NhanVat(String ten, long HP) {
        this.ten = ten;
        this.HP = HP;
    }
    public String getTen() {
        return this.ten;
    }
    public Long getHP() {
        return this.HP;
    }
    public abstract void tanCong();
}
