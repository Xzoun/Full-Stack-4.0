import EjercicioNavBar from './ejercicioNavBar'
import FooterEjercicio from './ejercicioFooter'
import Volver from '../components/flechaAtras'

const Main1Ejercicio4 = () => {
    return (
        <div className="marginTop">
            <Volver></Volver>
            <EjercicioNavBar link="/ejercicio4" nombre="Ejercicio 4" link1="/ejercicio4/Main1" nombre1="Main 1"
                link2="/ejercicio4/Main2" nombre2="Main 2"></EjercicioNavBar>
            <div className="background padding paddingNavFixed">
                <div className="padding">
                    <h2>Bienvenido al main</h2>
                    <p>Este es un texto de prueba para el ejercicio 4 de React!</p>
                </div>
                <FooterEjercicio></FooterEjercicio>
            </div>
        </div>
    );
};

export default Main1Ejercicio4;