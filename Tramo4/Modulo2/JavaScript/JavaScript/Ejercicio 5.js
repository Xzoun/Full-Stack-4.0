const numero = document.getElementById("numeros"),
    operacion = document.getElementById("operaciones"),
    salida = document.getElementById("salida"),
    salidaOperador = document.getElementById("salidaOperador"),
    extra = document.getElementById("extra");

let primerNumero = null,
    segundoNumero = null,
    operador = null,
    resultadoFinal = null;

// ----------------------------- Funciones principales -----------------------------
function crearNumero(numeroNuevo) {
    let numeroActual = salida.innerText;
    // Esta condicion borra el operador si no afectara al resultado. Es decir al ingresar el primer numero.
    if ((numeroActual == 0 || salida.innerText == primerNumero || salida.innerText == resultadoFinal) && primerNumero == null) {
        salidaOperador.innerText = "";
    }
    // Esta condicion borra el resultado anterior, el primer numero (para ingresar el segundo) o el cero (si no se ingreso nada aun).
    if (numeroActual == 0 || salida.innerText == primerNumero || salida.innerText == resultadoFinal) {
        salida.innerText = numeroNuevo;
    } else {
        salida.innerText = numeroActual + numeroNuevo;
    }
}

function SRMD(operador) {
    if (primerNumero == null) {
        primerNumero = salida.innerText;
        primerNumero = parseInt(primerNumero);
    }
    salidaOperador.innerText = operador;
}

function resultado(operador) {
    segundoNumero = salida.innerText;
    segundoNumero = parseInt(segundoNumero);

    switch (operador) {
        case '+':
            resultadoFinal = primerNumero + segundoNumero;
            break;
        case '-':
            resultadoFinal = primerNumero - segundoNumero;
            break;
        case '*':
            resultadoFinal = primerNumero * segundoNumero;
            break;
        case '/':
            resultadoFinal = primerNumero / segundoNumero;
            break;
    }

    salidaOperador.innerText = "=";
    salida.innerText = resultadoFinal;
    primerNumero = null;
    segundoNumero = null;
    operador = null;
}

function borrar() {
    salida.innerText = 0;
    salidaOperador.innerText = "";
    primerNumero = null;
    segundoNumero = null;
    operador = null;
}

// ----------------------------- Escuchas -----------------------------

// ----------------------------- Teclado -----------------------------
document.addEventListener('keydown', function (event) {
    if (event.key === 'Enter') {
        resultado(operador);
    } else if (!isNaN(event.key) && event.key !== ' ') {
        let numeroPresionado = parseInt(event.key);
        crearNumero(numeroPresionado);
    } else if (['/', '*', '-', '+', 's', 'S', 'r', 'R', 'd', 'D', 'm', 'M'].includes(event.key)) {
        if (event.key == 's' || event.key == 'S' || event.key == '+') {
            operador = '+';
        } else if (event.key == 'r' || event.key == 'R' || event.key == '-') {
            operador = '-';
        } else if (event.key == 'm' || event.key == 'M' || event.key == '*') {
            operador = '*';
        } else if (event.key == 'd' || event.key == 'D' || event.key == '/') {
            operador = '/';
        }
        SRMD(operador);
    } else if (event.key == 'Backspace') {
        borrar();
    }
});

// ----------------------------- Mouse -----------------------------
numero.addEventListener("click", (e) => {
    let numeroX = e.target.getAttribute("data-num");
    if (numeroX != null) {
        crearNumero(numeroX);
    }
})

operacion.addEventListener("click", (e) => {
    operador = e.target.getAttribute("data-operacion");
    SRMD(operador);
})

extra.addEventListener("click", (e) => {
    if (e.target.getAttribute("data-operacion") == "=") {
        resultado(operador);
    } else if (e.target.getAttribute("data-operacion") == "c") {
        borrar();
    }
})


