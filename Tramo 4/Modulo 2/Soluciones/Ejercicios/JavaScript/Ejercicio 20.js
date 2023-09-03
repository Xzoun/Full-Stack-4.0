const matriz = [[3], [6], [9], [12], [15]],
    aBtn = document.getElementById("a"),
    outPut = document.getElementById("array");
let array = [],
    auxiliar;

aBtn.addEventListener("click", () => {
    array = [];
    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz.length; j++) {
            auxiliar = matriz[i][j] + 3;
            if (!isNaN(matriz[i][j])) {
                array.push(auxiliar);
            }
        }
    }
    ordenarArray();

    let newOutput = array.join(", ");
    outPut.innerText = "[" + newOutput + "]";
});

function ordenarArray() {
    array.sort(function (a, b) {
        return a - b;
    });
}