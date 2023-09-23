import Izquierda from '../Imagenes/Izquierda.png'
import { useNavigate } from 'react-router-dom';


const Volver = () => {
    const navigate = useNavigate();
    function handleVolver() {
        navigate("/");
    }
    
    return (
        <>
            <div className="enlaceAtras" onClick={handleVolver}> <button className="btn ejercicio btnAtras"><img className="imgAtras"
                src={Izquierda} alt="flechaAtras" />Volver</button></div>
        </>
    )
}

export default Volver;