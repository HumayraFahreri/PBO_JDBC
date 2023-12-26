import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete {
    private static final String URL = "jdbc:mysql://localhost:3306/pegawai";
    private static final String user = "root";
    private static final String password = "";

    public delete() {
    }

    public static void deleteEmployeeById() throws Throwable {
        try {
            Throwable var0 = null;
            Object var1 = null;

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pegawai", "root", "");

            try {
                String sql = "DELETE FROM anggota WHERE Id_Pegawai = ?";
                Throwable var4 = null;
                Object var5 = null;

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    try {
                        Scanner del = new Scanner(System.in);
                        System.out.println("MENGHAPUS DATA PEGAWAI");
                        System.out.println("===================================================");
                        System.out.print("Masukkan Id : ");
                        int employeeId = del.nextInt();
                        preparedStatement.setInt(1, employeeId);
                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                        System.out.println("Data Berhasil Dihapus!");
                        } else {
                            System.out.println("Data Tidak Ditemukan");
                        }
                        } finally {
                        if (preparedStatement != null) {
                            preparedStatement.close();
                        }

                        }
                } catch (Throwable var31) {
                    if (var4 == null) {
                        var4 = var31;
                    } else if (var4 != var31) {
                        var4.addSuppressed(var31);
                    }

                    throw var4;
                }
            } finally {
                if (connection != null) {
                    connection.close();
                }

            }
        } catch (Throwable var33) {
            if (var0 == null) {
                var0 = var33;
            } else if (var0 != var33) {
                var0.addSuppressed(var33);
            }

            throw var0;
            }
        } catch (SQLException var34) {
            var34.printStackTrace();
        }

    }
}

