import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ilosc = 0;
    while(ilosc==0||ilosc<0){
      System.out.print("Wprowadz dlugosc hasla:");
      ilosc = sc.nextInt();
    }
    System.out.print("\n\rtwoje chaslo to: ");
    for(int i=0;i<ilosc;i++){
      char charakter = (char)ThreadLocalRandom.current().nextInt(33, 126);
      System.out.print(charakter);
    }
    System.out.println("");
  }
}