/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado
de 20*/

const aBtn = document.getElementById("a"),
    bBtn = document.getElementById("b"),
    outPut1 = document.getElementById("array1"),
    outPut2 = document.getElementById("array2");
let array1 = [],
    array2 = [];

aBtn.addEventListener("click", () => {
    llenarArray1();
    mostrarArrays();
});

bBtn.addEventListener("click",()=>{
    ordenarArray1();
    
    for (let i = 0; i < 20; i++) {
        array2[i] = array1[i]; 
        if(i>=10){
            array2[i] = 0.5;
        }
    }

    mostrarArrays();
})

function llenarArray1() {
    array1 = [];
    for (let i = 0; i < 50; i++) {
        array1.push(Math.floor(Math.random() * 100));
    }
}

function ordenarArray1() {
    array1.sort(function (a, b) {
        return a - b;
    });
}

function mostrarArrays() {
    let newOutput = array1.join(", "),
        newOutput2 = array2.join(", ")
    outPut1.innerText = newOutput;
    outPut2.innerText = newOutput2;
}