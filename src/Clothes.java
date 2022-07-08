public class Clothes {

    private int fiyat;
    private int adet;
    private String  beden;


    public Clothes(int fiyat, int adet, String beden) {
        this.fiyat = fiyat;
        this.adet = adet;
        this.beden = beden;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public String getBeden() {
        return beden;
    }

    public void setBeden(String beden) {
        this.beden = beden;
    }

}
