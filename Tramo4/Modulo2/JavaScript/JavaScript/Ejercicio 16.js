/*
Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
y los muestre por pantalla.
*/

const iniciarBtn = document.getElementById("iniciar"),
    arrayHTML = document.getElementById("Array1"),
    array2HTML = document.getElementById("Array2");
let contador = 0,
    array1 = [],
    array2 = [];

iniciarBtn.addEventListener("click", () => {
    array1 = [],
    array2 = [];
    for (let i = 0; i < 10; i++) {
        cargarArray(Math.floor(Math.random()*100));
    }
    mostrarArrays();
})

function cargarArray(random) {
    if (array1.length < 5) {
        array1.push(random);
    } else {
        array2.push(random);
    }
}

function mostrarArrays() {
    let cadenaArray1 = array1.join(", "),
        cadenaArray2 = array2.join(", ");

    arrayHTML.innerText = "Array 1: [ " + cadenaArray1 + " ]";
    array2HTML.innerText = "Array 2: [ " + cadenaArray2 + " ]";
}