/*
Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
radio del círculo lo proporcionará el usuario.
*/
const radioHTML = document.getElementById("radio"),
    calcularBtn = document.getElementById("calcular"),
    perimetroOutput = document.getElementById("perimetro"),
    areaOutput = document.getElementById("area"),
    pi = Math.PI;

calcularBtn.addEventListener("click", () => {
    if (radioHTML.value < 0) {
        alert("Ingrese un radio valido.")
    } else {
        calcularPerimetro(radioHTML.value);
        calcularArea(radioHTML.value);
    }
})

function calcularPerimetro(radio) {
    perimetroOutput.innerText = "Perimetro: " + 2 * pi * radio;
}

function calcularArea(radio) {
    areaOutput.innerText = "Area: " + pi * radio * radio;
}