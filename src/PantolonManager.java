public class PantolonManager {
    public String pantolonSave(Pantolon pantolon){
        if (!String.valueOf(pantolon.getBoy()).isEmpty()){
            return pantolon.getBoy() + "boyun sahip pantolon eklendi\n" +
                    "--------------------------------------";
        }
        else {
            return "pantolon eklenmedi";
        }
    }
}
