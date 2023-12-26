// Source code is decompiled from a .class file using FernFlower decompiler.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

    public class LoginHumayra {
    public String[] Code = new String[]{"yuma123", "humayra456", "aqctk", "awe123", "yy345"};
    public String Captcha;
    public int hitung = -1;

    public LoginHumayra() throws Throwable {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pegawai";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner cin = new Scanner(System.in);
            System.out.println("SELAMAT DATANG DI SUPERMARKET UBI TARO ");
            System.out.println("===================================================");
            System.out.println("Log in  ");

            while(true) {
                System.out.print("Username         : ");
                String id = cin.next();
                System.out.print("Password         : ");
                String passwordInput = cin.next();
                if (this.validateUser(connection, id, passwordInput)) {
                int random = 0;

                do {
                    if (random > 0) {
                        System.out.println("Captcha salah, Coba Lagi!");
                    }

                    ++random;
                    ++this.hitung;
                    this.hitung %= 3;
                    String var10001 = this.Code[this.hitung];
                    System.out.println("Kode Captcha     : " + var10001);
                    System.out.print("Entry Captcha    : ");
                    Scanner input = new Scanner(System.in);
                    this.Captcha = input.next();
                } while(!this.Captcha.equals(this.Code[this.hitung]));

                System.out.println("Akun Terverifikasi");
                connection.close();
                break;
                }

                System.out.println("Coba Lagi!");
            }
        } catch (SQLException | ClassNotFoundException var10) {
            var10.printStackTrace();
        }

    }

    private boolean validateUser(Connection connection, String username, String password) throws Throwable {
        String query = "SELECT * FROM anggota WHERE username=? AND password=?";
        Throwable var5 = null;
        Object var6 = null;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            boolean var10000;
            try {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                var10000 = resultSet.next();
            } finally {
                if (preparedStatement != null) {
                preparedStatement.close();
                }

            }

            return var10000;
        } catch (Throwable var14) {
            if (var5 == null) {
                var5 = var14;
            } else if (var5 != var14) {
                var5.addSuppressed(var14);
            }

            throw var5;
        }
    }
    }

