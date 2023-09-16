import './App.css';
import { Ejercicio1 } from "./componentes/ejercicio-1"
import Ejercicio1Enunciado from './img/Ejercicio1.png';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <div className="general">
          <h1>Ejercicio 1</h1>
          <p>Crear un proyecto compuesto de un solo Functional Component. En dicho componente
            mostrar al menos dos datos, como por ejemplo titulo y subtitulo.</p>
          <p>El componente debe ser llamado desde App, a continuación, se propondrá la jerarquía
            del árbol de componentes y de como es el llamado desde index.js</p>
          <ul>
            <li>Index.js</li>
            <ul>
              <li>App</li>
              <ul>
                <li>Ejemplo</li>
              </ul>
            </ul>
          </ul>
          <img src={Ejercicio1Enunciado} alt="Enunciado Ejercicio 1" />
          <div className="general">
            <Ejercicio1 />
          </div>
        </div>
      </header>
    </div>
  );
}

export default App;
