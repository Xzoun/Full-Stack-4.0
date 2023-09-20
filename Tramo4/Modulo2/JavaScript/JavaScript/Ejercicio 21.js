const cargarBtn = document.getElementById("cargar"),
    outPut = document.getElementById("salida"),
    nombreHTML = document.getElementById("nombre"),
    edadHTML = document.getElementById("edad"),
    sexoHTML = document.getElementById("sexo"),
    pesoHTML = document.getElementById("peso"),
    alturaHTML = document.getElementById("altura");

cargarBtn.addEventListener("click", () => {
    if (edadHTML.value < 3) {
        alert("Debes ser mayor de 3 años para poder registrarte. Lo sentimos!")
    } else if (alturaHTML.value < 0) {
        alert("Debes ingresar una altura mayor a cero para poder registrarte.")
    } else if (pesoHTML.value < 10) {
        alert("Debes pesar más de 10 kg para completar el registro.")
    } else {
        crearArray(crearPersona());
    }
})

function crearPersona() {

    let persona = [nombreHTML.value, edadHTML.value, sexoHTML.value, pesoHTML.value, alturaHTML.value]

    nombreHTML.value = "";
    edadHTML.value = "";
    sexoHTML.value = "";
    pesoHTML.value = "";
    alturaHTML.value = "";

    return persona;
}

function crearArray(persona) {
    if (persona[2] = "H") {
        persona[2] = "Hombre";
    } else if (persona[2] = "M") {
        persona[2] = "Mujer";
    } else if (persona[2] = "O") {
        persona[2] = "Otro";
    } else {
        persona[2] = "Indefinido";
    }
    let newOutput = persona.join(", ");
    outPut.innerText = "[" + newOutput + "]";
}