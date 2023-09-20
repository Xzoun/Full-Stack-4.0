const apellido = document.getElementById("apellido"),
    nombre = document.getElementById("nombre"),
    salida = document.getElementById("salida");

let apellidoValue,
    nombreValue;

function getFormValores() {
    event.preventDefault();
    apellidoValue = apellido.value;
    nombreValue = nombre.value;
    apellido.value = "";
    nombre.value = "";
    salida.innerText = "Nombre: " + nombreValue + ", Apellido: " + apellidoValue;
}