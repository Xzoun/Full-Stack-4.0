import './App.css';
import { Link } from 'react-router-dom';
import Accordion from 'react-bootstrap/Accordion';
import Button from 'react-bootstrap/Button';

import Izquierda from './Imagenes/Izquierda.png'
import Ejercicio1 from './Imagenes/Ejercicio1.png'
import Ejercicio3 from './Imagenes/Ejercicio3.png'
import Ejercicio4A from './Imagenes/Ejercicio4A.png'
import Ejercicio4B from './Imagenes/Ejercicio4B.png'

export default function App() {
  return (
    <div>
      <Accordion className="Acordeon" defaultActiveKey="0">

        <Accordion.Item className="AcordeonItem" eventKey="1">
          <Accordion.Header>Ejercicio 1</Accordion.Header>
          <Accordion.Body className="AcordeonBody">
            <p>Crear un proyecto compuesto de un solo Functional Component. En dicho componente
              mostrar al menos dos datos, como por ejemplo titulo y subtitulo.
              El componente debe ser llamado desde App, a continuación, se propondrá la jerarquía
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
            <img src={Ejercicio1} alt="Enunciado Ejercicio 1" />
            <p></p>
            <Link className="linkBtn" to="/ejercicio1"> <Button variant="outline-info">Ver</Button></Link>
          </Accordion.Body>
        </Accordion.Item>

        <Accordion.Item className="AcordeonItem" eventKey="2">
          <Accordion.Header> Ejercicio 2</Accordion.Header>
          <Accordion.Body>
            <p>Crear un proyecto compuesto por tres componentes bajo la misma jerarquía. Crear un
              Navbar, Main y Footer.</p>
            <ul>
              <li>Index.js </li>
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
            <Link className="linkBtn" to="/ejercicio2"> <Button variant="outline-info">Ver</Button></Link>
          </Accordion.Body>
        </Accordion.Item>

        <Accordion.Item className="AcordeonItem" eventKey="3">
          <Accordion.Header> Ejercicio 3</Accordion.Header>
          <Accordion.Body>
            <p>Crear un Componente Main el cual llame dos veces a un mismo componente, es decir,
              que Main anide a Hijo e Hijo. </p>
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
            <img src={Ejercicio3} alt="Ejercicio 3 Enunciado" />
            <p></p>
            <Link className="linkBtn" to="/ejercicio3"> <Button variant="outline-info">Ver</Button></Link>
          </Accordion.Body>
        </Accordion.Item>

        <Accordion.Item className="AcordeonItem" eventKey="4">
          <Accordion.Header> Ejercicio 4</Accordion.Header>
          <Accordion.Body>
            <p>Crear un proyecto compuesto por 4 componentes bajo la siguiente jerarquía.</p>
            <ul>
              <li>Index.js </li>
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
            <img src={Ejercicio4A} alt="Descripcion Ejercicio 4-Imagen1" />
            <p></p>
            <p>En la siguiente imagen se vera como establecer la navegación. Se sugiere ver los videos
              explicativos que encontrarán en el canal de Youtube de Egg.</p>
            <img src={Ejercicio4B} alt="Descripcion Ejercicio 4-Imagen2" />
            <p></p>
            <Link className="linkBtn" to="/ejercicio4"> <Button variant="outline-info">Ver</Button></Link>
          </Accordion.Body>
        </Accordion.Item>

        <Accordion.Item className="AcordeonItem" eventKey="5">
          <Accordion.Header> Ejercicio 5</Accordion.Header>
          <Accordion.Body>
            <p>Crear un proyecto compuesto de un solo componente y hacer uso de useState y mostrar
              el state del componente.</p>
            <p>Se podrá crear un contador de clicks o crear un input que mediante onChange cambie
              el valor del state. Cualquiera de las dos opciones, son validas para este ejercicio.</p>
            <Link className="linkBtn" to="/ejercicio5"> <Button variant="outline-info">Ver</Button></Link>
          </Accordion.Body>
        </Accordion.Item>

        <Accordion.Item className="AcordeonItem" eventKey="6">
          <Accordion.Header> Ejercicio 6</Accordion.Header>
          <Accordion.Body>
            <p>Crear un proyecto compuesto de un solo componente y un servicio, quien deberá ser
              capaz de llamar desde el servicio, mediante la funcionalidad Fetch, a la API de Rick and
              Morty <a href="https://rickandmortyapi.com/api/character">https://rickandmortyapi.com/api/character</a>.</p>
            <p> Una vez llamado los datos desde el servicio, hacer uso de useEffect en el componente
              creado, deberá mostrar una lista compuesta de los nombres de los 20 primeros
              personajes.</p>
            <Link className="linkBtn" to="/ejercicio6"><Button variant="outline-info">Ver</Button></Link>
          </Accordion.Body>
        </Accordion.Item>
      </Accordion>
      <a className="enlaceAtras" href="https://xzoun.github.io/Guia-FrontEnd/"><button className="btn ejercicio btnAtras"><img className="imgAtras"
        src={Izquierda} alt="flechaAtras" />Volver</button></a>
    </div>
  );
}

