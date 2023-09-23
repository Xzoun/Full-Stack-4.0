import Volver from '../components/flechaAtras';
import Ejercicio5UseState from '../components/ejercicio5UseState';

export default function Ejercicio5() {

  return (
    <div className="background padding marginBot">
      <Volver></Volver>
      <h1>Ejercicio 5</h1>
      <p>Crear un proyecto compuesto de un solo componente y hacer uso de useState y mostrar
        el state del componente.</p>
      <p>Se podrá crear un contador de clicks o crear un input que mediante onChange cambie
        el valor del state. Cualquiera de las dos opciones, son validas para este ejercicio.</p>
      <div className="padding">
        <Ejercicio5UseState></Ejercicio5UseState>
      </div>
    </div>
  );
}