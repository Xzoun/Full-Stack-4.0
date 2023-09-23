import Volver from '../components/flechaAtras'
import Ejercicio1Img from '../Imagenes/Ejercicio1.png'

export default function Ejercicio1() {
  const titulo = "Hello Dog";
  const subTitulo = "Sub titulo";
  return (    
      <div className="background padding marginBot">
        <Volver> </Volver>
        <h1>Ejercicio 1</h1>
        <p>Crear un proyecto compuesto de un solo Functional Component. En dicho componente
          mostrar al menos dos datos, como por ejemplo titulo y subtitulo.</p>
        <p> El componente debe ser llamado desde App, a continuación, se propondrá la jerarquía
          del árbol de componentes y de como es el llamado desde index.js</p>
        <ul>
          <li>Index.js </li>
          <ul>
            <li>App</li>
            <ul>
              <li>Ejemplo</li>
            </ul>
          </ul>
        </ul>
        <img src={Ejercicio1Img} alt="Enunciado Ejercicio 1" />
        <div className="padding">
          <div className="padding">
            <h2>{titulo}</h2>
            <h3>{subTitulo}</h3>
          </div>
        </div>
      </div>   
  );
}