import Button from 'react-bootstrap/Button';
import { useState } from 'react';

const Ejercicio5UseState = () => {
    const [state, setState] = useState(0);
    const [backgroundColor, setBackgroundColor] = useState('white');
    const [color, setColor] = useState('black');
    const [continuar, setContinue] = useState('Aún hay mas!');
    const [outPut, setOutPut] = useState("Blanco!");
    let cont = 0;

    function handleClick() {
        cont = state + 1;

        switch (cont) {
            case 3:
                setOutPut("Azul!");
                setBackgroundColor("blue");
                setColor("white")
                break;
            case 5:
                setOutPut("Negro!");
                setBackgroundColor("black");
                setColor("white")
                break;
            case 17:
                setOutPut("Rosa!");
                setBackgroundColor("violet");
                setColor("white")
                break;
            case 30:
                setOutPut("Naranja!");
                setBackgroundColor("orange");
                setColor("black")
                break;         
            case 50:
                setOutPut("Fin");
                setBackgroundColor("white");
                setColor("black")
                setContinue("Excelente, hasta acá llegamos!")
                break;
            case 51:
                setOutPut("Para loco, no hay nada más.");
                setContinue("Para loco, no hay nada más.");
                break;
            case 55:
                setContinue("Bueno apaga la luz, no se. Chau!");
                break;
            case 60:               
                setBackgroundColor("black");
                break;
            default:
                setOutPut(continuar);
        }
        setState(cont);
    }

    return (
        <div className="background padding">
            <Button onClick={handleClick}>Click here!</Button>
            <div className="padding center outPut" style={{ background: backgroundColor, color: color }}>
                {state !== 0 && state !== 3 && state !== 5 && state !== 17 && state !== 30 && state !== 50 ? <h4>Clicks: {state}</h4> : <h4></h4>}
                <h4>{outPut}</h4>
            </div>
        </div>
    );
};

export default Ejercicio5UseState;