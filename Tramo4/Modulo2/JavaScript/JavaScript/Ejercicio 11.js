/* Escribir una función que reciba un String y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript”*/

const fraseInput = document.getElementById("palabra"),
    buscarBtn = document.getElementById("buscar");

const buscarPalabra = (frase) => {

    let subPalabra = "";
    let palabraMasLarga = "";

    for (let i = 0; i < frase.length; i++) {

        subPalabra += frase.substring(i+1, i);

        if (subPalabra.length > palabraMasLarga.length && frase.substring(i + 1, i) != " ") {
            palabraMasLarga = subPalabra;
        }

        if (frase.substring(i + 1, i) == " ") {
            subPalabra = "";
        }
    }
    return palabraMasLarga;
}

buscarBtn.addEventListener("click", () => {
    frase = fraseInput.value;
    fraseInput.value = "";
    let palabraMasLarga = buscarPalabra(frase);
    console.log(palabraMasLarga);
    document.getElementById("salida").innerText = palabraMasLarga;
    document.getElementById("respuesta").style.display = "block";
});