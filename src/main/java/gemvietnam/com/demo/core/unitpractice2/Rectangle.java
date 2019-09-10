package gemvietnam.com.demo.core.unitpractice2;

public class Rectangle implements RectangleInteface {
    private int chieuDai;
    private int chieuRong;

    @Override
    public int area() {
        int s = (chieuDai * chieuRong) / 2;
        return s;
    }

    @Override
    public int getChieuDai() {
        return chieuDai;
    }

    @Override
    public int getCHieuRong() {
        return chieuRong;
    }

    @Override
    public void setDaiRong(int cd, int cr) {
        this.chieuRong = cr;
        this.chieuDai = cd;
    }

}
