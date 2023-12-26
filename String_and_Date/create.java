import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class create {
    private static final String URL = "jdbc:mysql://localhost:3306/pegawai";
    private static final String user = "root";
    private static final String password = "";

    public create() {
    }

    public static void insertEmployeeData(Scanner scanNEW) throws Throwable {
        try {
            Throwable var1 = null;
            Object var2 = null;

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pegawai", "root", "");

            try {
                String sql = "INSERT INTO anggota (Id_Pegawai, username, password) VALUES (?, ?, ?)";
                Throwable var5 = null;
                Object var6 = null;

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    try {
                        System.out.println("CREATE DATA PEGAWAI BARU");
                        System.out.println("======================================");
                        System.out.print("Masukkan ID Baru      : ");
                        int idValue = scanNEW.nextInt();
                        System.out.print("Masukkan Nama Pegawai : ");
                        String usernameValue = scanNEW.next();
                        System.out.print("Masukkan Password     : ");
                        String passwordValue = scanNEW.next();
                        preparedStatement.setInt(1, idValue);
                        preparedStatement.setString(2, usernameValue);
                        preparedStatement.setString(3, passwordValue);
                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                        System.out.println("Data Berhasil Ditambahkan!");
                        } else {
                        System.out.println("Silahkan Inputkan Data Sekali Lagi");
                        }
                    } finally {
                        if (preparedStatement != null) {
                        preparedStatement.close();
                        }

                    }
                } catch (Throwable var33) {
                    if (var5 == null) {
                        var5 = var33;
                    } else if (var5 != var33) {
                        var5.addSuppressed(var33);
                    }

                    throw var5;
                }
            } finally {
                if (connection != null) {
                    connection.close();
                }

                }
            } catch (Throwable var35) {
            if (var1 == null) {
                var1 = var35;
            } else if (var1 != var35) {
                var1.addSuppressed(var35);
            }

                throw var1;
                    }
                } catch (SQLException var36) {
                var36.printStackTrace();
            }
        }
    }

