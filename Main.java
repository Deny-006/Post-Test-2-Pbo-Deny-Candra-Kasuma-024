/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Model.Reservasi;
import Service.Service;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Service service = new Service();
            
            int pilihan;
            do {
                System.out.println("\n=== Sistem Manajemen Reservasi Lapangan Mini Soccer ===");
                System.out.println("1. Tambah Reservasi");
                System.out.println("2. Lihat Semua Reservasi");
                System.out.println("3. Ubah Reservasi");
                System.out.println("4. Hapus Reservasi");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();
                sc.nextLine();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Nama Pemesan : ");
                        String nama = sc.nextLine();
                        System.out.print("Tanggal (dd-mm-yyyy): ");
                        String tanggal = sc.nextLine();
                        System.out.print("Jam (HH:MM): ");
                        String jam = sc.nextLine();
                        System.out.print("Lapangan : ");
                        String lapangan = sc.nextLine();
                        
                        Reservasi r = new Reservasi(nama, tanggal, jam, lapangan);
                        service.tambahReservasi(r);
                    }
                    
                    case 2 -> service.lihatReservasi();
                    
                    case 3 -> {
                        service.lihatReservasi();
                        if (service.getJumlahReservasi() > 0) {
                            System.out.print("Nomor reservasi yang ingin diubah: ");
                            int idx = sc.nextInt() - 1;
                            sc.nextLine();
                            
                            System.out.print("Nama Pemesan baru : ");
                            String nama = sc.nextLine();
                            System.out.print("Tanggal baru : ");
                            String tanggal = sc.nextLine();
                            System.out.print("Jam baru : ");
                            String jam = sc.nextLine();
                            System.out.print("Lapangan baru : ");
                            String lapangan = sc.nextLine();
                            
                            Reservasi newData = new Reservasi(nama, tanggal, jam, lapangan);
                            service.ubahReservasi(idx, newData);
                        }
                    }
                    
                    case 4 -> {
                        service.lihatReservasi();
                        if (service.getJumlahReservasi() > 0) {
                            System.out.print("Nomor reservasi yang ingin dihapus: ");
                            int idx = sc.nextInt() - 1;
                            service.hapusReservasi(idx);
                        }
                    }
                    
                    case 5 -> System.out.println("Terima kasih! Program selesai.");
                    
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 5);
        }
    }
}