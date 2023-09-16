import './App.css';
import CharacterList from './componentes/personajes'; // Asegúrate de tener la ruta correcta

const App = () => {
  return (
    <div className="App">
      <header className="App-header">
        <div className="general">
          <h1>Ejercicio 6</h1>
          <p> Crear un proyecto compuesto de un solo componente y un servicio, quien deberá ser
            capaz de llamar desde el servicio, mediante la funcionalidad Fetch, a la API de Rick and
            Morty ( https://rickandmortyapi.com/api/character ) .
            Una vez llamado los datos desde el servicio, hacer uso de useEffect en el componente
            creado, deberá mostrar una lista compuesta de los nombres de los 20 primeros
            personajes.</p>
          <CharacterList />
        </div>
      </header>
    </div>
  );
};

export default App;
