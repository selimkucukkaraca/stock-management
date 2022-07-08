import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserEntry userEntry = new UserEntry("selim",123);
        TshirtManager tshirtManager = new TshirtManager();
        PantolonManager pantolonManager = new PantolonManager();

        String islemler = "1. T-shirt işlemleri\n" +
                "2. Pantolon işlemleri\n" +
                "3. Çıkış için 'q' ya basınız.\n";

        while (true){
            System.out.println("kullanıcı adını giriniz : ");
            String name = scanner.nextLine();
            System.out.println("şifre giriniz : ");
            int password = scanner.nextInt();



            if (userEntry.login(new User(name,password))){
                while (true){
                    System.out.println(islemler);
                    System.out.println("yapmak istediğiniz işlemi seçiniz : ");
                    int inputIslemler = scanner.nextInt();

                    if (inputIslemler == 1){
                        System.out.println("-----T-shirt işlemlerine girildi.-----");

                        int fiyat = 100;
                        String beden = "L";
                        int adet = 1;
                        String kesim = "oversize";

                        System.out.println("İşlem seçiniz :\n" +
                                "1. T-shirt kesimi kaydet");
                        int kesimIslemi = scanner.nextInt();

                        if (kesimIslemi == 1){
                            System.out.println(kesim);
                            kesim = scanner.nextLine();
                            System.out.println(tshirtManager.tshirtSave(new Tshirt(fiyat,adet, beden,kesim)));
                        }
                    }
                    else if (inputIslemler == 2) {
                        System.out.println("-----Pantolon işlemlerine girildi.-----");

                        int fiyat = 100;
                        String beden = "L";
                        int adet = 1;
                        double boy = 1.10;

                        System.out.println("İşlem seçiniz : \n" +
                                "1. Pantolon boyu kaydet");
                        double boyIslemi = scanner.nextDouble();

                        if (boyIslemi == 1){
                            System.out.println(boyIslemi);
                            boyIslemi = scanner.nextDouble();
                            System.out.println(pantolonManager.pantolonSave(new Pantolon(fiyat,adet, beden,boy)));
                        }
                    } else if (inputIslemler == 3) {
                        System.out.println("çıkış yapılıyor");
                        break;

                    }
                }
            }
        }
    }
}

