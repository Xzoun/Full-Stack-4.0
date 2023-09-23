import Volver from '../components/flechaAtras';
import RickAndMorty from '../components/personajes';

export default function Ejercicio6() {

  return (
    <div className="background padding marginBot">
      <Volver></Volver>
      <h1>Ejercicio 6</h1>
      <p>Crear un proyecto compuesto de un solo componente y un servicio, quien deberá ser
        capaz de llamar desde el servicio, mediante la funcionalidad Fetch, a la API de Rick and
        Morty <a href="https://rickandmortyapi.com/api/character">https://rickandmortyapi.com/api/character</a>.</p>
      <p> Una vez llamado los datos desde el servicio, hacer uso de useEffect en el componente
        creado, deberá mostrar una lista compuesta de los nombres de los 20 primeros
        personajes.</p>
      <div className="padding">
        <RickAndMorty></RickAndMorty>
      </div>
    </div>
  );
}