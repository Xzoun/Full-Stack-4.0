const lista = document.getElementById("lista"),
    outPut = document.getElementById("salida");

lista.addEventListener("click", (e) => {
    let clima = e.target.getAttribute("data-Clima");
    document.getElementById("respuesta").style.display = "block";
    outPut.innerText = clima;
})