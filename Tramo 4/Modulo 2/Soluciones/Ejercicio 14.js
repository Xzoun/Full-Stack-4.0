/*
Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/
const cargarBtn = document.getElementById("cargar"),
    salida = document.getElementById("salida"),
    isbnHTML = document.getElementById("isbn"),
    tituloHTML = document.getElementById("titulo"),
    autorHTML = document.getElementById("autor"),
    paginaHTML = document.getElementById("pagina");

cargarBtn.addEventListener("click", () => {
    if (isbnHTML.value == "" || tituloHTML.value == "" || autorHTML == "" || paginaHTML.value == "") {
        alert("Debes completar todos los campos para cargar un libro. Lo sentimos!")
    } else if (isbnHTML.value < 0) {
        alert("Ingrese un ISBN válido.")
    } else {
        mostrarLibro(crearLibro());
    }
})

function crearLibro() {

    var libro = {
        isbn: isbnHTML.value,
        titulo: tituloHTML.value,
        autor: autorHTML.value,
        pagina: paginaHTML.value
    }

    isbnHTML.value = "";
    tituloHTML.value = "";
    autorHTML.value = "";
    paginaHTML.value = "";

    return libro;
}

function mostrarLibro(libro) {
    let libroString = "ISBN: " + libro.isbn + ", Titulo: " + libro.titulo + ", Autor: " + libro.autor + ", Cantidad de páginas: " + libro.pagina;
    salida.innerText = "Carga Exitosa! \n" + libroString;
}