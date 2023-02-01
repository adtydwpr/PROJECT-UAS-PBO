package tokosepatu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class transaksi {
    
    static final String JDBC = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/toko";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
//    static Statement state;
    
     public static String getEiger() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='001 BGS'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getArai() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='002 BGS'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getLowa() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='003 LMY'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getConsina() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='004 LMY'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getLeague() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='001 RN'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getPiero() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='002 RN'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getSpecs() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='003 RN'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getEagle() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='004 RN'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getConverse() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='001 CSL'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getVans() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='002 CSL'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     public static String getCompas() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='003 CSL'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String getDiadora() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_transaksi,kode_sepatu,nama_sepatu,id_pembeli,tanggal FROM tbl_transaksi WHERE kode_sepatu ='004 CSL'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("ID Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getDate("tanggal"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
}   

