package Entidad.Funcionalidades;

public class Objeto {

    private Boolean movil,
            hostil,
            destruido;
    private String tipo;
    private Integer resistencia;
    private Integer[] coordenadas = new Integer[3];

    public Objeto() {
    }

    public Objeto(Boolean movil, Boolean hostil, Boolean destruido, String tipo, Integer resistencia) {
        this.movil = movil;
        this.hostil = hostil;
        this.destruido = destruido;
        this.tipo = tipo;
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        String objMovil;
        String objHostil;

        String coordenadasX = "Ubicacion: (";
        for (int i = 0; i < 3; i++) {
            coordenadasX += coordenadas[i];
            if (i < 2) {
                coordenadasX += ",";
            }
        }
        coordenadasX += ")";

        if (tipo.equals("Formación metereológica")) {
            return "Se detectó una Formación metereológica inusual. " + coordenadasX;
        }

        if (movil) {
            objMovil = "Si";
        } else {
            objMovil = "No";
        }

        if (hostil) {
            objHostil = "Si | Resistencia: " + resistencia;
        } else {
            objHostil = "No";
        }

        return "|------|" + tipo + " |------| Hostil: " + objHostil + " |------| "
                + coordenadasX + " | Movil: " + objMovil;

    }

    public Boolean getMovil() {
        return movil;
    }

    public void setMovil(Boolean movil) {
        this.movil = movil;
    }

    public Boolean getHostil() {
        return hostil;
    }

    public void setHostil(Boolean hostil) {
        this.hostil = hostil;
    }

    public Boolean getDestruido() {
        return destruido;
    }

    public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Integer[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Integer[] coordenadas) {
        this.coordenadas = coordenadas;
    }

}
