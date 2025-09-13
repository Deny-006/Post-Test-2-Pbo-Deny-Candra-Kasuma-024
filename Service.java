/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Reservasi;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class Service {
    private final ArrayList<Reservasi> daftarReservasi = new ArrayList<>();

    // TAMBAH
    public void tambahReservasi(Reservasi r) {
        daftarReservasi.add(r);
        System.out.println("Reservasi berhasil ditambahkan!");
    }

    // LIHAT
    public void lihatReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Belum ada data reservasi.");
        } else {
            System.out.println("\n--- Daftar Reservasi ---");
            for (int i = 0; i < daftarReservasi.size(); i++) {
                System.out.println((i + 1) + ". " + daftarReservasi.get(i));
            }
        }
    }

    // UBAH
    public void ubahReservasi(int index, Reservasi newData) {
        if (index >= 0 && index < daftarReservasi.size()) {
            daftarReservasi.set(index, newData);
            System.out.println("Reservasi berhasil diperbarui!");
        } else {
            System.out.println("Nomor reservasi tidak valid.");
        }
    }

    // HAPUS
    public void hapusReservasi(int index) {
        if (index >= 0 && index < daftarReservasi.size()) {
            daftarReservasi.remove(index);
            System.out.println("Reservasi berhasil dihapus!");
        } else {
            System.out.println("Nomor reservasi tidak valid.");
        }
    }

    public int getJumlahReservasi() {
        return daftarReservasi.size();
    }

    public Reservasi getReservasi(int index) {
        if (index >= 0 && index < daftarReservasi.size()) {
            return daftarReservasi.get(index);
        }
        return null;
    }
}
