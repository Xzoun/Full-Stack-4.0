const canvas = document.getElementById("canvas"),
    ctx = canvas.getContext("2d"),
    resolverBtn = document.getElementById("resolver"),
    datoHTML = document.getElementById("dato"),
    valorHTML = document.getElementById("valor"),
    outPut = document.getElementById("salida"),
    container = document.getElementById("canvasCont"),
    pi = Math.PI,
    datoOutPut = document.getElementById("datoOutPut");

let dato = "";
datoHTML.addEventListener("click", () => {
    dato = datoHTML.value;
    switch (dato) {
        case "area":
            datoOutPut.innerText = "Ingrese el área del circulo";
            break;
        case "perimetro":
            datoOutPut.innerText = "Ingrese el perímetro del circulo";
            break;
        case "diametro":
            datoOutPut.innerText = "Ingrese el diámetro del circulo";
            break;
        case "radio":
            datoOutPut.innerText = "Ingrese el radio del circulo";
            break;
        default:
            datoOutPut.innerText = " ";  
            break;
    }
})

resolverBtn.addEventListener("click", () => {
    let valor = valorHTML.value,
        verdadero = true,
        falso = false,
        radio = 0,
        area = 0,
        perimetro = 0;

    switch (dato) {
        case "area":
            radio = Math.sqrt(valor / pi);
            falso = false;
            break;
        case "perimetro":
            radio = valor / (2 * pi);
            falso = false;
            break;
        case "diametro":
            radio = valor / 2;
            falso = false;
            break;
        case "radio":
            verdadero = false;
            perimetro = 2 * pi * valor;
            area = pi * valor * valor;
            radio = valor;
            falso = false;
            break;
        default:
            alert("Debes seleccionar una opción.")
            falso = true;
            break;
    }
    if (!falso) {
        if (verdadero) {
            limpiarCanvas();

            ctx.beginPath();
            ctx.arc(container.clientWidth / 2, radio, radio, 0, 2 * Math.PI);
            ctx.fillStyle = "#F5B041";

            ctx.fill();
            ctx.closePath();
            outPut.innerText = "Radio: " + radio;

        } else {
            limpiarCanvas();

            ctx.beginPath();
            ctx.arc(container.clientWidth / 2, radio, radio, 0, 2 * Math.PI);
            ctx.fillStyle = "#F5B041";

            ctx.fill();
            ctx.closePath();
            outPut.innerText = "Área: " + area + "\n" + "Perímetro: " + perimetro;
        }
    }
});

function limpiarCanvas() {
    ctx.beginPath();
    ctx.fillStyle = "white";
    ctx.fillRect(0, 0, 1000, 1000);

    ctx.closePath();
}

function ajustarCanvas() {
    canvas.width = container.clientWidth;
    canvas.height = 1000;

}

ajustarCanvas();
window.addEventListener('resize', ajustarCanvas);
