/* 12. Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de
dato. */
const tipodeDatoBtn = document.getElementById("tipoDeDatoBtn"),
    entrada = document.getElementById("entrada"),
    tipoDeDato = document.getElementById("tipoDeDato");

tipodeDatoBtn.addEventListener("click", () => {
    document.getElementById("respuesta").style.display = "block";
    let valor = entrada.value;
    if (valor == "") {
        document.getElementById("respuesta").style.display = "none";
        alert("Debes completar el campo!")
    } else if (!isNaN(valor)) {
        tipoDeDato.innerText = "Number";
    } else if (valor.toLowerCase() === "true" || valor.toLowerCase() === "false") {
        tipoDeDato.innerText = "Boolean";
    } else if (valor === "null") {
        tipoDeDato.innerText = "null";
    } else {
        tipoDeDato.innerText = "String";
    }
})