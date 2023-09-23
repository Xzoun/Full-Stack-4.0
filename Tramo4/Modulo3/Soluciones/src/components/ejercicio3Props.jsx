const Nombres = (props) => {

    return (
        <>
            <h3>Hola, {props.nombre}</h3>
            {props.nombre2 && <h3>Hola, {props.nombre2}</h3>}
        </>
    );

}
export default Nombres;