import Volver from '../components/flechaAtras';
import FooterEjercicio from '../components/ejercicioFooter';
import MainEjercicio2 from '../components/ejercicio2Main';
import EjercicioNavBar from '../components/ejercicioNavBar';

export default function Ejercicio2() {
    return (
        <div className="background marginBot marginTop">
            <Volver></Volver>
            <EjercicioNavBar link1="/ejercicio1" nombre1="Anterior" link2="/ejercicio3" nombre2="Siguiente"></EjercicioNavBar>
            <div className="padding paddingNavFixed">
                <div className='padding'>
                    <h1>Ejercicio 2</h1>
                    <p>Crear un proyecto compuesto por tres componentes bajo la misma jerarquía. Crear un
                        Navbar, Main y Footer.</p>
                    <ul>
                        <li>Index.js </li>
                        <ul>
                            <li>App</li>
                            <ul>
                                <li>Navbar</li>
                                <li>Main</li>
                                <li>Footer</li>
                            </ul>
                        </ul>
                    </ul>
                    <p>Necesitamos hacer que Footer, Main y Navbar muestren al menos un dato, de la misma
                        manera que el ejercicio anterior.</p>
                </div>
                <MainEjercicio2></MainEjercicio2>
                <FooterEjercicio></FooterEjercicio>
            </div>
        </div>
    );
}