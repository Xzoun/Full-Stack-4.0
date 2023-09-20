const verificar = document.getElementById("verificar"),
    outPut = document.getElementById("salida"),
    inPut = document.getElementById("edad");

verificar.addEventListener("click", () => {
    if (inPut.value < 18 && inPut.value > 2) {
        outPut.innerText = "Eres menor de edad."
    } else if (inPut.value >= 18 && inPut.value < 110) {
        outPut.innerText = "Eres mayor de edad."
    } else if (inPut.value <= 2) {
        outPut.innerText = "Lo sentimos debes ser mayor de dos años para verificar!"
    } else {
        outPut.innerText = "Lo sentimos debes ser menor de ciento diez años para verificar!"
    }
})