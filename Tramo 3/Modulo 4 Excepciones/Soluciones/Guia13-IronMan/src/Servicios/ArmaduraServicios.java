package Servicios;

public class ArmaduraServicios {

    public double consumo(Integer consumo, Integer tiempo) {
        double consumoX = 0.0;
        
        switch (consumo) {
            case 3:
                consumoX = tiempo * 0.05;
                break;
            case 2:
                consumoX = tiempo * 0.1;
                break;
            case 1:
                consumoX = tiempo * 0.15;
                break;
            default:
                consumoX = 0.0;
                break;
        }
        return consumoX;
    }
}
