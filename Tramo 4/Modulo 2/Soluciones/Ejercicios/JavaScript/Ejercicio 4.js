import { selectorAdivinanza, selectorSolucion } from "./DB/Arrays.js";
const adivinaInput = document.getElementById("adivina"),
    solucionInput = document.getElementById("solucion"),
    verificarBtn = document.getElementById("verificar"),
    outPut = document.getElementById("salida"),
    otroBtn = document.getElementById("otro");

let aleatorio = Math.floor(Math.random() * 19),
    contador = 3;
outPut.innerText = selectorAdivinanza(aleatorio);

adivinaInput.addEventListener("input", () => {
    if (adivina.value == "s" || adivina.value == "S") {
        document.getElementById("respuesta").style.display = "block";
        outPut.style.display = "block";
    } else if (adivina.value == "n" || adivina.value == "N") {
        outPut.style.display = "none";
        document.getElementById("respuesta").style.display = "none";
        otroBtn.style.display = "block";
    } else {
        adivina.value = "";
        document.getElementById("respuesta").style.display = "none";
        otroBtn.style.display = "none";
    }
})

verificarBtn.addEventListener("click", () => {
    let respuestaUser = solucionInput.value;
    if (respuestaUser.toLowerCase() === selectorSolucion(aleatorio)) {
        outPut.innerText = "Correcto! La respuesta es: " + respuestaUser;
        solucionInput.value = "";
        document.getElementById("respuesta").style.display = "none";
        otroBtn.style.display = "block";
    } else {
        contador--;
        outPut.innerText = selectorAdivinanza(aleatorio) + "\nIncorrecto, Intentos: " + contador;
        solucionInput.value = "";
    }
    if (contador < 1) {
        outPut.innerText = "Lo sentimos, perdiste!\n" + "La palabra correcta es: " + selectorSolucion(aleatorio);
        contador = 3;
        document.getElementById("respuesta").style.display = "none";
        solucionInput.value = "";
        otroBtn.style.display = "block";
    }
})

otroBtn.addEventListener("click", () => {
    aleatorio = Math.floor(Math.random() * 19);
    outPut.innerText = selectorAdivinanza(aleatorio);
    adivina.value = "";
    otroBtn.style.display = "none";
    outPut.style.display = "block";
    contador = 3;
})
