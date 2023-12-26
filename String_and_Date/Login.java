import java.util.*;
public class Login{

    public Login(){
       // public static void main (String[] args){
        boolean id = true;
        boolean kapca = true;

        while(id && kapca){
                    
                Scanner input = new Scanner (System.in);
                System.out.print("Username : ");
                String un = input.next();

                Scanner in = new Scanner (System.in);
                System.out.print("Password : ");
                String pw = in.next();

                Scanner Ca = new Scanner (System.in);
                System.out.println("Kode Captcha: 2506"); 
                System.out.print("Entry Captcha: ");
                String capt= Ca.next();

            // if (capt.equalsIgnoreCase("2506")){
            //     System.out.println("captcha terverifikasi!");
            //     kapca = false;
            // }
            // else{
            //     System.out.println("captcha tidak terverifikasi!");
            //     kapca = true;
            // }

            if (un.equalsIgnoreCase("humayrafahreri") && pw.equals ("yuma123") && capt.equalsIgnoreCase("2506")){
                id = false;
                kapca = false;
                System.out.println( );
                System.out.println( "Login berhasil..!");
            }
            else{
                id = true;
                kapca = true;
                System.out.println("username atau password salah");
            }
        }
    }
}