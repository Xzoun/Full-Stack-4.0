/*
17. Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el
resultado
*/
const cargarBtn = document.getElementById("cargar"),
    popBtn = document.getElementById("pop"),
    arrayOutput = document.getElementById("array"),
    numeroHTML = document.getElementById("numero"),
    array = []; // Declarar un array vacío fuera de la función

cargarBtn.addEventListener("click", () => {
    let numero = numeroHTML.value || Math.floor(Math.random() * 10);
    numeroHTML.value = "";
    cargarArray(numero)
});

function cargarArray(nuevoElemento) {
    array.push(nuevoElemento);
    let newOutput = array.join(", ");
    arrayOutput.innerText = newOutput;
}

popBtn.addEventListener("click", () => {
    array.pop();
    array.pop();
    let newOutput = array.join(", ");
    arrayOutput.innerText = newOutput;
})


