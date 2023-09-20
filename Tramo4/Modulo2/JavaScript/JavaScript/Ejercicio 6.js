const inPut = document.getElementById("entrada"),
    outPut = document.getElementById("salida"),
    verificarBtn = document.getElementById("verificar");

verificarBtn.addEventListener("click", () => {
    let numero = inPut.value;
    numero = parseInt(numero);
    if (inPut.value != "") {
        if (numero == 0) {
            outPut.innerText = "El número ingresado no es par ni impar."
        } else if (numero % 2 == 0) {
            outPut.innerText = "El número ingresado es par."
        } else {
            outPut.innerText = "El número ingresado es impar."
        }
    }else{
        outPut.innerText = "Ingrese un número para verificar."
    }
})