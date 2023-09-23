import Nav from 'react-bootstrap/Nav';
import { Link } from 'react-router-dom';

const EjercicioNavBar = (props) => {
    return (
        <Nav as="ul" className="navPadding fixed">
            <Nav.Item as="li" className="linkPadding-right">
                <Link  className="linkWhite" to={props.link}>{props.nombre}</Link>
            </Nav.Item>
            <Nav.Item as="li" className="linkPadding-right">
                <Link className="linkWhite" to={props.link1}>{props.nombre1}</Link>
            </Nav.Item>
            <Nav.Item as="li" className="linkPadding-right">
                <Link className="linkWhite" to={props.link2}>{props.nombre2}</Link>
            </Nav.Item>
        </Nav>
    )
};

export default EjercicioNavBar;