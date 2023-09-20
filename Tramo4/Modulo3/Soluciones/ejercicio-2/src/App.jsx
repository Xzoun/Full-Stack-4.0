import './App.css';
import { Main } from './componentes/main';
import { NavBarEjercicio2 } from './componentes/navbar';
import { Footer } from './componentes/footer';

function App() {
  return (
    <div className="App">
      <NavBarEjercicio2 />
      <header className="App-header">
        <div className="general navbarMargin">
          <h1>Ejercicio 2</h1>
          <p>Crear un proyecto compuesto por tres componentes bajo la misma jerarquía. Crear un
            Navbar, Main y Footer.</p>
          <ul>
            <li>Index.js</li>
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
          <div className="general">
            <Main />
            <Footer />
          </div>
        </div>
      </header>
    </div>
  );
}

export default App;
