import Volver from '../components/flechaAtras'
import Nombres from '../components/ejercicio3Props'
import Ejercicio3Img from '../Imagenes/Ejercicio3.png'

export default function Ejercicio3() {

  return (
    <div className="background padding marginBot">
      <Volver></Volver>
      <h1>Ejercicio 3</h1>
      <p> Crear un Componente Main el cual llame dos veces a un mismo componente, es decir,
        que Main anide a Hijo e Hijo.</p>
      <ul>
        <li>Index.js </li>
        <ul>
          <li>App</li>
          <ul>
            <li>Main</li>
            <ul>
              <li>Hijo</li>
              <li>Hijo</li>
            </ul>
          </ul>
        </ul>
      </ul>
      <p> Al primer Componente anidado pasarle como props el nombre Chiquito y al segundo el
        nombre Filomena. Desde los componentes Hijos atrapar los valores mediante las props.</p>
      <img src={Ejercicio3Img} alt="Enunciado Ejercicio 3" />
      <div className="padding">
        <Nombres nombre="Chiquito" nombre2="Filomena"></Nombres>
      </div>
      <div className="padding">
        <Nombres nombre="Francisco"></Nombres>
      </div>
    </div>
  );
}