package Service;
/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos,
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad de jugadas máximas
que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario,
pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector,
letra por letra, quedando cada letra de la palabra en un índice del vector. Y también,
guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
 */
public class Ahorcado {

    private String[] palabraWin;
    private int letrasEncontradas;
    private int errores;

    public Ahorcado(String[] palabraWin, int letrasEncontradas, int errores) {
        this.palabraWin = palabraWin;
        this.letrasEncontradas = letrasEncontradas;
        this.errores = errores;
    }

    public Ahorcado() {
    }

    public String[] getPalabraWin() {
        return palabraWin;
    }

    public Ahorcado(int dimension) {
        this.palabraWin = new String[dimension];
    }

    public void setPalabraWin(String[] palabraWin) {
        this.palabraWin = palabraWin;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getErrores() {
        return errores;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

}
