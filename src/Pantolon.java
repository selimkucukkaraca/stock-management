public class Pantolon extends  Clothes{

    private double boy;


    public Pantolon(int fiyat, int adet,String beden, double boy) {
        super(fiyat, adet,beden);
        this.boy = boy;

    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

}
