const parrafo = document.getElementById("parrafo"),
    resolver = document.getElementById("resolver");
let palabras = parrafo.textContent.split(" ");

resolver.addEventListener("click", () => {
    for (var i = 0; i < palabras.length; i++) {
        if (palabras[i].length > 8) {
            var palabraResaltada = document.createElement("span");
            palabraResaltada.textContent = palabras[i];           
            palabraResaltada.style.backgroundColor = "yellow";
            palabras[i] = palabraResaltada.outerHTML;
        }
    }
    parrafo.innerHTML = palabras.join(" ");
},{once:true});
