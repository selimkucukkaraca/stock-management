public class Tshirt extends Clothes {
    private String kesim;

    public Tshirt(int fiyat, int adet, String beden, String kesim) {
        super(fiyat, adet, beden);
        this.kesim = kesim;
    }

    public String getKesim() {
        return kesim;
    }

    public void setKesim(String kesim) {
        this.kesim = kesim;
    }
}
