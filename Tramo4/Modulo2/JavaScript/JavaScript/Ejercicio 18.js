/*
18. A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
dos elementos numéricos
*/
const salida = document.getElementById("salida"),
    aBtn = document.getElementById("a"),
    bBtn = document.getElementById("b"),
    cBtn = document.getElementById("c"),
    valores = [true, 5, false, "hola", "adios", 2];

aBtn.addEventListener("click", () => {
    let masLarga = "";
    for (let i = 0; i < valores.length; i++) {
        if (typeof valores[i] == "string") {
            let actual = valores[i];
            if (actual > masLarga) {
                masLarga = actual;
            }
        }
    }
    salida.innerText = "Es mayor: " + masLarga;
})

bBtn.addEventListener("click", () => {
    let boolean1, boolean2;
    for (let i = 0; i < valores.length; i++) {
        if (typeof valores[i] == "boolean") {
            if (boolean1 != null && boolean2 == null) {
                boolean2 = valores[i];
            }

            if (boolean1 == null) {
                boolean1 = valores[i];
            }

        }
    }
    let resultadoTrue = boolean1 || boolean2,
        resultadoFalse = boolean1 && boolean2;
    salida.innerText = "true || false:   " + resultadoTrue + "\n" +
        "true && false: " + resultadoFalse;
})

cBtn.addEventListener("click", () => {
    let num1, num2;
    for (let i = 0; i < valores.length; i++) {
        if (typeof valores[i] == "number") {
            if (num1 != null && num2 == null) {
                num2 = valores[i];
            }

            if (num1 == null) {
                num1 = valores[i];
            }

        }

    }
    salida.innerText = num1 + " + " + num2 + " = " + (num1 + num2) + "\n" +
        num1 + " - " + num2 + " = " + (num1 - num2) + "\n" +
        num1 + " * " + num2 + " = " + (num1 * num2) + "\n" +
        num1 + " / " + num2 + " = " + (num1 / num2) + "\n" +
        num1 + " % " + num2 + " = " + (num1 % num2);
})