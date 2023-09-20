const labelInput = document.getElementById("labelInput"),
    cargarBtn = document.getElementById("cargar"),
    inPut = document.getElementById("entrada"),
    outPut = document.getElementById("salida");
let array = [],
    finalizado = false;

cargarBtn.addEventListener("click", () => {
    let numero = inPut.value;
    inPut.value = "";
    if (numero == 0) {
        let sumatoria = 0;
        for (let i = 0; i < array.length; i++) {
            sumatoria += array[i];
        }
        let promedio = sumatoria / array.length;
        outPut.innerText = "Mayor Número ingresado = " + Math.max(...array) + "\n"
            + "Menor Número ingresado = " + Math.min(...array) + "\n"
            + "Promedio= " + promedio;
            labelInput.innerText = "Para reiniciar ingrese un número";
        finalizado = true;
    } else {
        if (!finalizado) {
            outPut.innerText += " " + numero;
            array.push(parseInt(numero));
            labelInput.innerText = "Bien, continue así y recuerde que debe ingresar 0 (cero) para finalizar."
        } else {
            labelInput.innerText = "Bien, continue así y recuerde que debe ingresar 0 (cero) para finalizar."
            outPut.innerText = "";
            outPut.innerText += " " + numero;
            array = [];
            array.push(parseInt(numero));
            finalizado = false;
        }
    }
})