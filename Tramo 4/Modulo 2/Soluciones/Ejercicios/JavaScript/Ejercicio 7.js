const limiteInput = document.getElementById("limite"),
    sumandoInput = document.getElementById("sumando"),
    outPut = document.getElementById("salida"),
    ingreseOtro = document.getElementById("ingreseOtro"),
    limiteOutPut = document.getElementById("limiteOutPut"),
    iniciarBtn = document.getElementById("iniciar"),
    verificarBtn = document.getElementById("verificar"),
    reiniciarBtn = document.getElementById("otro");

let limite = null,
    nuevoLimite = null,
    contador = 0;

iniciarBtn.addEventListener("click", () => {
    limite = limiteInput.value;
    nuevoLimite = limite;
    if (limite > 0) {
        limiteOutPut.innerText = "Límite: " + limite;
        limiteOutPut.style.display = "block";
        document.getElementById("display").style.display = "none";
        document.getElementById("respuesta").style.display = "block";
    } else {
        limiteOutPut.innerText = "Lo sentimos. El límite debe ser positivo.\n" +
            "Intente nuevamente por favor";
        limiteOutPut.style.display = "block";
    }
})

verificarBtn.addEventListener("click", () => {
    let entrada = sumandoInput.value;

    if (entrada > 0) {
        nuevoLimite -= entrada;
        limiteOutPut.innerText = "Límite: " + limite;
    }

    sumandoInput.value = "";

    if (nuevoLimite < 0) {
        limiteOutPut.innerText = "Límite superado!";
        document.getElementById("respuesta").style.display = "none";
        document.getElementById("otro").style.display = "block";
        contador = 0;
        ingreseOtro.innerText = "Bien, ingrese un número."
    } else {
        if (contador == 0) {
            ingreseOtro.innerText = "Perfecto, ahora ingrese otro número.";
            contador++;
        } else if (contador > 0) {
            ingreseOtro.innerText = "Continúe así hasta superar el limite.";
        }

    }
})

reiniciarBtn.addEventListener("click", () => {
    document.getElementById("display").style.display = "block";
    document.getElementById("otro").style.display = "none";
    limiteOutPut.style.display = "none";
})