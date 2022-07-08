public class ClothesManager {
    public String clothesSave(Clothes clothes) {
        if (clothes.getAdet()!= 0) {
            return String.valueOf(clothes.getAdet()) + " adet ürün kaydedildi.";
        }
        else if (!clothes.getBeden().isEmpty()){
            return clothes.getBeden() + " bedenine sahip ürün kaydedildi.";
        }
        else if (clothes.getFiyat()!= 0) {
            return String.valueOf(clothes.getFiyat()) + "fiyatına sahip ürün kaydedildi.";
        }
       else {
           return "hiçbir kaydetme işlemi olmalı";
        }
    }
}





