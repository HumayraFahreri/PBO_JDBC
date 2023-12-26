import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update {
    private static final String URL = "jdbc:mysql://localhost:3306/pegawai";
    private static final String user = "root";
    private static final String password = "";

    public update() {
    }

    public static void updateEmployeeCredentials(Scanner scanner) throws Throwable {
        try {
            Throwable var1 = null;
            Object var2 = null;

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pegawai", "root", "");

                try {
                String sql = "UPDATE anggota SET username = ?, password = ? WHERE Id_Pegawai = ?";
                Throwable var5 = null;
                Object var6 = null;

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    try {
                        System.out.println("UPDATE DATA PEGAWAI");
                        System.out.println("===================================================");
                        System.out.print("ID Pegawai        : ");
                        int employeeId = scanner.nextInt();
                        System.out.print("Username baru     : ");
                        String newUsername = scanner.next();
                        System.out.print("Password Baru     : ");
                        String newPassword = scanner.next();
                        preparedStatement.setString(1, newUsername);
                        preparedStatement.setString(2, newPassword);
                        preparedStatement.setInt(3, employeeId);
                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                            System.out.println("Data Berhasil Diupdate!");
                        } else {
                            System.out.println("Data Tidak Ditemukan, Coba Lagi!");
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

