/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku.buku.model;
import java.util.List;

/**
 *
 * @asus zaki
 */
public interface BukuDao {
    Buku save(Buku buku);
    Buku update(int index, Buku sbuku);
    void delete(int index);
    Buku getBuku (int index);
    List<Buku>getAllBuku();
}
