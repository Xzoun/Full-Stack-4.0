import { selectorAdivinanza, selectorSolucion } from "./DB/Arrays.js";
const adivinaInput = document.getElementById("adivina"),
    solucionInput = document.getElementById("solucion"),
    verificarBtn = document.getElementById("verificar"),
    outPut = document.getElementById("salida"),
    otroBtn = document.getElementById("otro"),
    correcto = document.getElementById("correcto"),
    sn = document.getElementById("sn");

let aleatorio = Math.floor(Math.random() * 19),
    contador = 3;
outPut.innerText = selectorAdivinanza(aleatorio);

adivinaInput.addEventListener("input", () => {
    if (adivina.value == "s" || adivina.value == "S") {
        document.getElementById("respuesta").style.display = "block";
        outPut.style.display = "block";
        correcto.style.display = "block";    
        correcto.innerText = "Correcto, ingrese una respuesta!";
    } else if (adivina.value == "n" || adivina.value == "N") {
        outPut.style.display = "none";
        correcto.style.display = "block";       
        correcto.innerText = "Correcto, podes intentar con otro.";
        document.getElementById("respuesta").style.display = "none";
        otroBtn.style.display = "block";
    } else {
        adivina.value = "";
        correcto.innerText = "Incorrecto!";
        document.getElementById("respuesta").style.display = "none";
        otroBtn.style.display = "none";
    }
})

verificarBtn.addEventListener("click", () => {
    let respuestaUser = solucionInput.value;
    if (respuestaUser.toLowerCase() === selectorSolucion(aleatorio)) {
        outPut.innerText = "Exacto! La respuesta es: " + respuestaUser;
        solucionInput.value = "";
        document.getElementById("respuesta").style.display = "none";
        otroBtn.style.display = "block";
        correcto.style.display = "none";
        sn.style.display = "none";
    } else {
        contador--;
        outPut.innerText = selectorAdivinanza(aleatorio) + "\n\nIncorrecto! \n Intentos restantes: " + contador;
        solucionInput.value = "";
    }
    if (contador < 1) {
        outPut.innerText = "Lo sentimos, perdiste!\n" + "La palabra correcta es: " + selectorSolucion(aleatorio);
        contador = 3;
        document.getElementById("respuesta").style.display = "none";
        solucionInput.value = "";
        otroBtn.style.display = "block";
        correcto.style.display = "none";
        sn.style.display = "none";
    }
})

otroBtn.addEventListener("click", () => {
    aleatorio = Math.floor(Math.random() * 19);
    outPut.innerText = selectorAdivinanza(aleatorio);
    adivina.value = "";
    sn.style.display = "block";
    otroBtn.style.display = "none";
    outPut.style.display = "block";
    contador = 3;
})
