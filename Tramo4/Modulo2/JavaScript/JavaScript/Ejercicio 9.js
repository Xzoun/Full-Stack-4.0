const reiniciarBtn = document.getElementById("reiniciar"),
    verificarBtn = document.getElementById("verificar"),
    inPut = document.getElementById("entrada"),
    outPut = document.getElementById("salida");

reiniciarBtn.style.display = "none";
let array = [];

verificarBtn.addEventListener("click", () => {
    let frase = inPut.value
    palabra = "";

    for (let i = 0; i < frase.length; i++) {
        palabra += frase.substring(i + 1, i) + " ";
    }

    outPut.innerText = palabra;
    reiniciarBtn.style.display = "block";
    document.getElementById("inicio").style.display = "none";
})

reiniciarBtn.addEventListener("click", () => {
    inPut.value = "";
    outPut.innerText = "";
    document.getElementById("inicio").style.display = "block";
    reiniciarBtn.style.display = "none";
})