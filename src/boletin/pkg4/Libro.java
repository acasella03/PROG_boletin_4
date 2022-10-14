package boletin.pkg4;

public class Libro {

    private String titulo;
    private String autor;
    private int año;
    private short numPaginas;
    private float valoracion;

    public Libro() {

    }

    public Libro(String tit, String aut, int year, short numPag) {
        titulo = tit;
        autor = aut;
        año = year;
        numPaginas = numPag;
    }

    public void setTitulo(String tit) {
        titulo = tit;
    }

    public String getTitulo(String tit) {
        return titulo;
    }

    public void setAutor (String aut){
        autor=aut;
    }
    
    public String getAutor (String aut){
        return autor;
    }
    
    public void setAño (int year){
        año= year;
    }
    
    public int getAño (int year){
        return año;
    }
    
    public void setNumPaginas (short numPag){
        numPaginas=numPag;
    }
    
    public short getNumPaginas (short numPag){
        return numPaginas;
    }
    
    public void setValoracion (float valor){
        valoracion=valor;
    }
    
    public float getValoracion (float valor){
        return valoracion;
    }
    
    public void mostrar(){
    System.out.println("El título es : "+titulo+"\nEl autor es: "+autor+"\nAño : "+año+"\nNúmero de Páginas : "+numPaginas+"\nLa valoración es : "+valoracion);
    }
    
}




