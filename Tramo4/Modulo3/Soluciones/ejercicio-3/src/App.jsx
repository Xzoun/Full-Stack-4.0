import './App.css';
import Ejercicio3 from './Imagenes/Ejercicio3.png'
import Nombres from './componentes/hijo';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <div className="general">
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
          <img src={Ejercicio3} alt="Enunciado Ejercicio 3" />
          <div className="general">
            <Nombres nombre="Chiquito" nombre2="Filomena"></Nombres>
          </div>
        </div>
      </header>
    </div >
  );
}

export default App;
