import { selectorChiste,selectorFrase,selectorColor } from "./DB/Arrays.js";
const fondoBtn = document.getElementById("fondo"),
    fraseBtn = document.getElementById("frase"),
    chisteBtn = document.getElementById("chiste"),
    atrasBtn = document.getElementById("atrasBtn"),
    outPut = document.getElementById("salida"),
    flechaAtras = document.getElementById("flechaAtras");

chisteBtn.addEventListener("click", () => {    
    outPut.innerText = selectorChiste();
});

fraseBtn.addEventListener("click", () => {    
    outPut.innerText = selectorFrase();
});

fondoBtn.addEventListener("click", () => {
    let color = selectorColor();
    document.body.style.background = color;
    if (color == "black" || color == "blue") {
        document.body.classList.add("Dark");
        fondoBtn.classList.add("btn-outline-info");
        fondoBtn.classList.remove("btn-outline-secondary");
        fraseBtn.classList.add("btn-outline-info");
        fraseBtn.classList.remove("btn-outline-secondary");
        chisteBtn.classList.add("btn-outline-info");
        chisteBtn.classList.remove("btn-outline-secondary");
        atrasBtn.classList.add("btn-outline-info");
        atrasBtn.classList.remove("btn-outline-secondary");
        flechaAtras.classList.add("Filter");
    } else {
        document.body.classList.remove("Dark");
        fondoBtn.classList.add("btn-outline-secondary");
        fondoBtn.classList.remove("btn-outline-info");
        fraseBtn.classList.add("btn-outline-secondary");
        fraseBtn.classList.remove("btn-outline-info");
        chisteBtn.classList.add("btn-outline-secondary");
        chisteBtn.classList.remove("btn-outline-info");
        atrasBtn.classList.add("btn-outline-secondary");
        atrasBtn.classList.remove("btn-outline-info");
        flechaAtras.classList.remove("Filter");
    }
});