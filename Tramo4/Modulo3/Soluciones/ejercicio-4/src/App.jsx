import './App.css';
import img1 from './Imagenes/Ejercicio4A.png';
import img2 from './Imagenes/Ejercicio4B.png';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <div className="general">
          <h1>Ejercicio 4</h1>
          <p>Crear un proyecto compuesto por 4 componentes bajo la siguiente jerarquía.</p>
          <ul>
            <li>Index.js</li>
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
          <img src={img1} alt="Ejercicio 4 - Imagen 1" />
          <p>En la siguiente imagen se vera como establecer la navegación. Se sugiere ver los videos
            explicativos que encontrarán en el canal de Youtube de Egg.</p>
          <img src={img2} alt="Ejercicio 4 - Imagen 2" />
          
        </div>
      </header>
    </div>
  );
}

export default App;
