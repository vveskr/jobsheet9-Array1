import java.util.Scanner;
public class ArrayNilai17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        //perulangan
        for(int i = 0; i<10; i++){
            System.out.print("Masukkan nilai akhir ke-"+i+ " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for(int i = 0; i<10; i++){
            System.out.println("nilai akhir ke-" +i+ " adalah "+nilaiAkhir[i]);
        }
    }
    
}
