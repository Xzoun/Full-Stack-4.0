import Volver from '../components/flechaAtras'
import Ejercicio4A from '../Imagenes/Ejercicio4A.png'
import Ejercicio4B from '../Imagenes/Ejercicio4B.png'
import FooterEjercicio from '../components/ejercicioFooter'
import EjercicioNavBar from '../components/ejercicioNavBar';
export default function Ejercicio4() {

    return (
        <div className="marginBot marginTop">
            <Volver></Volver>
            <EjercicioNavBar link="/ejercicio4" nombre="Ejercicio 4" link1="/ejercicio4/Main1" nombre1="Main 1"
                link2="/ejercicio4/Main2" nombre2="Main 2"></EjercicioNavBar>
            <div className="background padding paddingNavFixed">
                <div className="padding">
                    <h1>Ejercicio 4</h1>
                    <p>Crear un proyecto compuesto por 4 componentes bajo la siguiente jerarquía.</p>
                    <ul>
                        <li>Index.js </li>
                        <ul>
                            <li>App</li>
                            <ul>
                                <li>Navbar</li>
                                <li>Main1 o Main2</li>
                                <li>Footer</li>
                            </ul>
                        </ul>
                    </ul>
                    <p>Al hacer click sobre las dos posibles opciones en el NavBar, se deberá cambiar entre
                        Main1 y Main2 dependiendo de la navegación. Para lograrlo se deberá instalar y usar
                        React Router Dom.</p>
                    <p>A continuación, se propone como será la jerarquía de los componentes</p>
                    <img src={Ejercicio4A} alt="Descripcion Ejercicio 4-Imagen1" />
                    <p></p>
                    <p>En la siguiente imagen se vera como establecer la navegación. Se sugiere ver los videos
                        explicativos que encontrarán en el canal de Youtube de Egg.</p>
                    <img src={Ejercicio4B} alt="Descripcion Ejercicio 4-Imagen2" />
                    <p></p>
                </div>
                <FooterEjercicio></FooterEjercicio>
            </div>
        </div>
    );
}