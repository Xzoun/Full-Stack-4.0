/*
Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer,
'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript.
*/

const cargarBtn = document.getElementById("cargar"),
    salida = document.getElementById("salida"),
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
        mostrarPersona(crearPersona());
    }
})

function crearPersona() {

    let persona = {
        nombre: nombreHTML.value,
        edad: edadHTML.value,
        sexo: sexoHTML.value,
        peso: pesoHTML.value,
        altura: alturaHTML.value
    }

    nombreHTML.value = "";
    edadHTML.value = "";
    sexoHTML.value = "";
    pesoHTML.value = "";
    alturaHTML.value = "";

    return persona;
}

function mostrarPersona(persona) {
    if (persona.sexo = "H") {
        persona.sexo = "Hombre";
    } else if (persona.sexo = "M") {
        persona.sexo = "Mujer";
    } else if (persona.sexo = "O") {
        persona.sexo = "Otro";
    } else {
        persona.sexo = "Indefinido";
    }
    let personaString = "Nombre: " + persona.nombre + ", Edad: " + persona.edad + ", Sexo: " + persona.sexo + ", Peso: " + persona.peso + ", Altura: " + persona.altura;
    salida.innerText = personaString;
}
