package Tugas;

public class Film {
    String idFilm, judulFilm, tahunTayang, director;

    Film(String id, String judul, String tahun, String director){
        this.idFilm = id;
        this.judulFilm = judul;
        this.tahunTayang = tahun;
        this.director = director;
    }

    @Override
    public String toString(){
        return "Film{" + "ID Film =" + idFilm + ", Judul Film =" +judulFilm+", Tahun Tayang ="+tahunTayang+", Director =" +director+'}';
    }
}
