public class TshirtManager {
    public String tshirtSave(Tshirt tshirt){
        if (tshirt.getKesim().isEmpty()){
            return tshirt.getKesim() + "kesime sahip Tshirt eklendi\n" +
                    "--------------------------------------";
        }
        else {
            return "Tshirt eklenmedi";
        }
    }
}
