import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int day,month;
        String burc="";
        boolean isError=false;

        System.out.print("Aya Giriniz  : ");
        month = input.nextInt();

        System.out.print("Gün Giriniz : ");
        day = input.nextInt();

        // Switch işlemi
       /*switch (month){
           case 1:
               if (day >=1 && day <= 31){
                   if (day < 22){
                       burc="Oğlak";
                   }else{
                       burc="Kova";
                   }
               }else{
                   isError=true;
               }
               break;
           case 2:
               if (day >=1 && day <= 28){
                   if (day < 20){
                       burc ="Kova";
                   }else{
                       burc="Balık";
                   }
               }else{
                   isError =true;
               }
               break;
           case 3:
               if (day >=1 && day <= 31){
                   if (day < 21){
                       burc="balık";
                   }else{
                       burc="Koç";
                   }
               }else{
                   isError=true;
               }
               break;
           case 4:
               if (day >=1 && day <= 31){
                   if (day < 21){
                       burc="Koç";
                   }else{
                       burc="Boğa";
                   }
               }else{
                   isError=true;
               }
               break;
           case 5:
               if (day >=1 && day <= 31){
                   if (day < 22){
                       burc="boğa";
                   }else{
                       burc="İkizler";
                   }
               }else{
                   isError=true;
               }
               break;
           case 6:
               if (day >=1 && day <= 31){
                   if (day < 22){
                       burc="İkizler";
                   }else{
                       burc="Yengeç";
                   }
               }else{
                   isError=true;
               }
               break;
           case 7:
               if (day >=1 && day <= 31){
                   if (day < 23){
                       burc="Yengeç";
                   }else{
                       burc="Aslan";
                   }
               }else{
                   isError=true;
               }
               break;
           case 8:
               if (day >=1 && day <= 31){
                   if (day < 23){
                       burc="Aslan";
                   }else{
                       burc="Başak";
                   }
               }else{
                   isError=true;
               }
               break;
           case 9:
               if (day >=1 && day <= 31){
                   if (day < 23){
                       burc="Başak";
                   }else{
                       burc="Terazi";
                   }
               }else{
                   isError=true;
               }
               break;
           case 10:
               if (day >=1 && day <= 31){
                   if (day < 23){
                       burc="Terazi";
                   }else{
                       burc="AKrep";
                   }
               }else{
                   isError=true;
               }
               break;
           case 11:
               if (day >=1 && day <= 31){
                   if (day < 23){
                       burc="Akrep";
                   }else{
                       burc="Yay";
                   }
               }else{
                   isError=true;
               }
               break;
           case 12:
               if (day >=1 && day <= 31){
                   if (day < 22){
                       burc="Yay";
                   }else{
                       burc="Oğlak";
                   }
               }else{
                   isError=true;
               }
               break;
               default:
                System.out.println("Hata");
       }*/

        if (month==1){
            if (day >=1 && day <= 31){
                if (day < 22){
                    burc="Oğlak";
                }else{
                    burc="Kova";
                }
            }else{
                isError=true;
            }
        } else if (month==2) {
            if (day >=1 && day <= 28){
                if (day < 20){
                    burc ="Kova";
                }else{
                    burc="Balık";
                }
            }else{
                isError =true;
            }
        } else if (month == 3) {
            if (day >=1 && day <= 31){
                if (day < 21){
                    burc="balık";
                }else{
                    burc="Koç";
                }
            }else{
                isError=true;
            }
        } else if (month == 4) {
            if (day >=1 && day <= 31){
                if (day < 21){
                    burc="Koç";
                }else{
                    burc="Boğa";
                }
            }else{
                isError=true;
            }
        } else if (month==5) {
            if (day >=1 && day <= 31){
                if (day < 22){
                    burc="boğa";
                }else{
                    burc="İkizler";
                }
            }else{
                isError=true;
            }
        } else if (month==6) {
            if (day >=1 && day <= 31){
                if (day < 22){
                    burc="İkizler";
                }else{
                    burc="Yengeç";
                }
            }else{
                isError=true;
            }
        } else if (month==7) {
            if (day >=1 && day <= 31){
                if (day < 23){
                    burc="Yengeç";
                }else{
                    burc="Aslan";
                }
            }else{
                isError=true;
            }
        } else if (month==8) {
            if (day >=1 && day <= 31){
                if (day < 23){
                    burc="Aslan";
                }else{
                    burc="Başak";
                }
            }else{
                isError=true;
            }
        } else if (month==9) {
            if (day >=1 && day <= 31){
                if (day < 23){
                    burc="Başak";
                }else{
                    burc="Terazi";
                }
            }else{
                isError=true;
            }
        } else if (month==10) {
            if (day >=1 && day <= 31){
                if (day < 23){
                    burc="Terazi";
                }else{
                    burc="AKrep";
                }
            }else{
                isError=true;
            }
        } else if (month==11) {
            if (day >=1 && day <= 31){
                if (day < 23){
                    burc="Akrep";
                }else{
                    burc="Yay";
                }
            }else{
                isError=true;
            }
        } else if (month==12) {
            if (day >=1 && day <= 31){
                if (day < 22){
                    burc="Yay";
                }else{
                    burc="Oğlak";
                }
            }else{
                isError=true;
            }
        }


        if (isError){
           System.out.println("Hata");
       }else{
            System.out.println(burc);

        }


    }
}
