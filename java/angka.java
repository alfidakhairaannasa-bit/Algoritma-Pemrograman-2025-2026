public class Main{
    public static void main(Sting[]args){
        Scanner sc = new Scanner(System.in);
        System.out.prin("masukkan angka pertama:");
        int a = sc.nextlnt();
        System.out.prin("Masukkan angka kedua:");
        int b = sc.nextlnt();

        if(a>b)
          System.out.println(a+"lebih besar dari" + b);
        else if(a>b)
          System.out.println(a+"lebih kecil dari" +b);
        else
          System.out.printl("keduanya sama besar");

        System.out.println("Apakah keduanya sama?" +(a==b));
        }
}
