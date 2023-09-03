export function selectorAdivinanza(posicion) {

    let adivinanzas = ["Blanco por dentro, verde por fuera, si quieres que te lo diga, espera.",
        "Larga como una serpiente, pero no es una criatura, guarda tesoros y secretos, en un libro se encuentra su escritura.",
        "Tengo llaves pero no abro puertas, tengo espacio pero no tengo habitaciones.",
        "Siempre sube, pero nunca baja.",
        "Delante de ti siempre, detrás de ti nunca.",
        "Tengo patas, pero no camino.",
        "Lo encuentras en un baño, tiene una tapa, y en él haces un alto antes de salir de casa.",
        "Puedo volar sin alas, llorar sin ojos.",
        "En la mañana me verás en un rincón, en la tarde estaré en el cielo, y de noche me esconderé.",
        "Puedo ser dulce o salado, y siempre se me come.",
        "Soy redondo como el sol, pero no puedo brillar.",
        "Cuando más me quitas, más grande me vuelvo.",
        "Tengo hojas pero no soy un libro, agua pero no soy un río.",
        "Soy pequeño como un ratón, pero puedo sostener todo un mundo en mis manos.",
        "No puedo hablar, pero siempre cuento todo.",
        "Soy una casa sin puertas ni ventanas, pero las personas entran y salen constantemente.",
        "Tengo cuatro patas pero no soy un animal.",
        "Cuando me necesitas, me tiras; cuando no, me guardas.",
        "Soy un lugar donde las estrellas nacen y mueren, pero no soy el cielo."];
    return adivinanzas[posicion];
}

export function selectorSolucion(posicion) {

    const soluciones = [
        "pera",
        "libro",
        "teclado",
        "edad",
        "futuro",
        "silla",
        "inodoro",
        "viento",
        "sol",
        "pan",
        "pizza",
        "agujero",
        "arbol",
        "celular",
        "reloj",
        "refugio",
        "mesa",
        "pañuelo",
        "observatorio"
      ];
    return soluciones[posicion];
}

export function selectorColor() {
    let colores = ["black", "blue", "white", "yellow", "#29ECE2", "#BC47DD", "#EA04AC", "#EAA904",
        "#C6EA04", "#04EA14", "#04EAAA", "#86B6FF", "#B186FF", "#E286FF", "#E63063", "#F5B041"],
        posicion = Math.floor(Math.random() * colores.length);
    return colores[posicion];
}

export function selectorFrase() {
    let frases = ["Sólo sé que no sé nada. \n - Sócrates",
        "La vida sin reflexión no merece ser vivida. \n - Sócrates",
        "Cogito, ergo sum. (Pienso, luego existo.) \n - René Descartes",
        "La verdadera sabiduría está en reconocer la propia ignorancia. \n - Sócrates",
        "No podemos resolver problemas pensando de la misma manera que cuando los creamos. \n - Albert Einstein",
        "El hombre es la medida de todas las cosas. \n - Protágoras",
        "El único conocimiento que conduce es el que se convierte en acción. \n - Friedrich Hayek",
        "Lo que no me mata, me hace más fuerte. \n - Friedrich Nietzsche",
        "El ser humano es libre, pero está condenado a ser libre. \n - Jean-Paul Sartre",
        "La filosofía es un combate, no una doctrina; una proposición en proceso, no una proposición concluida. \n - Michel Foucault",
        "El conocimiento es poder. \n - Francis Bacon",
        "El camino del exceso conduce al palacio de la sabiduría. \n - William Blake",
        "No hay viento favorable para quien no sabe a dónde va. \n - Séneca",
        "Si buscas la verdad, prepárate para lo inesperado. \n - Heraclito",
        "El amor es la fuerza más humilde, pero la más poderosa de que dispone el ser humano. \n - Mahatma Gandhi",
        "El mayor enemigo del conocimiento no es la ignorancia, sino la ilusión del conocimiento. \n - Stephen Hawking",
        "La libertad es la posibilidad del aislamiento. Si un hombre es libre, es porque, de algún modo, se las ha arreglado para aislarse del mundo. \n - Albert Camus",
        "Somos lo que hacemos repetidamente. La excelencia, entonces, no es un acto, sino un hábito. \n - Aristóteles",
        "El mundo es mi representación. \n- Arthur Schopenhauer",
        "No importa cuán ocupada esté tu vida, haz tiempo para leer, ya que el tiempo que dediques a pensar será siempre tiempo bien invertido. \n -  Elizabeth Gilbert"
    ],
        posicion = Math.floor(Math.random() * frases.length);
    return frases[posicion];
}

export function selectorChiste() {
    let chistes = ["Un niño llega al parque, se le acerca un amigo y le dice al oído:\n" +
        "— ¡Tienes puesto un zapato marrón y otro negro!\n" +
        "Y el niño le responde:\n" + "— Y eso no es nada, en mi casa tengo otro par igualito",

    "Dos amigos van caminando por la calle y uno le pregunta al otro:\n" +
    "— ¿Qué hora es?\n" + "— Las doce.\n" + "— ¡Uy, qué tarde!\n" + "— Me hubieses preguntado antes.",

    "— ¿Qué coche usa Papá Noel?\n" + "— Un renol.",

    "— ¿Qué le dice una iguana a su hermana gemela?\n" + "— Somos iguanitas.",

    "— ¿Qué le dijo un mosquito a un grupo de gente?\n" +
    "—No aplaudan que todavía falta para mi cumpleaños.",

    "— ¿Cuál es la fruta más divertida?\n" + "— La naranja ja, ja, ja.",

    "— ¿Cómo se dice ‘espejo’ en chino?" + "— Aitoiyo.",

    "— ¿Por qué la computadora fue al médico?\n" + "— Porque tenía un virus.",

    "Una niña le dice a su amiga:\n" + "— ¿Te gustan mis gafas nuevas?\n" +
    "— La verdad que no mucho.\n" + "— Son progresivas.\n" +
    "— ¡Ah bueno! Entonces ya me irán gustando.",

    "— ¿Qué le dice un semáforo a otro?\n" + "— ¡No me mires que me estoy cambiando!",

    "— Oiga, ¿el otorrino va por número?\n" + "— Van nombrando.\n" + "— Qué gran actor, pero no me cambie de tema.",

        "¿Por qué las mujeres de Nordelta beben agua del mar? Para ser más saladas.",

        "¿Qué le dice un jardinero a otro? Nos vemos cuando podamos.",

        "La mayor exportación de Australia son los boomerangs. También son la mayor importación.",

        "Intenté organizar un torneo profesional de escondite, pero fue un completo fracaso. Los buenos jugadores son difíciles de encontrar.",

        "El otro día vendí mi aspiradora. Lo único que hacía era acumular polvo.",

        "¿Qué es rojo y tiene forma de cubo? Un cubo azul pintado de rojo.",

    "— Ojalá lloviera.\n" + "— Ojalá yo también.",

        "Había un tipo que era tan borrachín que le llamaban genio porque cada vez que destapaban una botella aparecía.",

        "Un chiste comunista no tiene gracia si no lo entiende todo el mundo.",

    "¿Qué le dijo Batman a Robin antes de subir al coche?\n" + "-Robin, sube al coche.",

        "Tengo un amigo otaku que estaba triste, así que lo animé.",

        "Van dos fantasmas y se cae el del médium.",

    "— Oye, ¿sabes cómo se llaman los habitantes de Nueva York?\n" + "— Hombre, pues todos no.",

    "— Hola, ¿tienen libros para el cansancio?\n" + "— Sí, pero están agotados.",

    "¿Qué es rojo y malo para tus dientes?\n" + "Un ladrillo.",

        "¿Has oído hablar del astronauta claustrofóbico? Solo necesitaba un poco de espacio.",

    "— ¿Te gusta el rock progresivo?\n" + "— Cada vez más.",

    "— Hola, soy paraguayo y quiero pedirle la mano de su hija para casarme con ella.\n" +
    "— ¿Para qué?\n" + "- Paraguayo.",

        "¿Cómo se despiden los químicos? Ácido un placer.",

        "¿Cómo se llama el campeón de buceo japonés? Tokofondo.",

        "Iba a contar un chiste sobre sodio... pero Na.",

        "Conocí a mi novia en un ascensor. Dice que soy el amor de subida.",

    "— Perdone, ¿dónde está la sección de libros sobre el sentido del gusto?\n" +
    "— Lo siento, sobre gustos no hay nada escrito.",

    "— Ha cometido usted un crimen matemático.\n" + "— Pues lo asumo.\n" + "— Pues lo arresto.",

    "— Doctor, sin rodeos, dígame la verdad, ¿tengo problemas de memoria?\n" + "— ¡Que sí!",

    "— Hombre, Pepe, cómo has cambiado.\n" + "— Yo no soy Pepe.\n" + "- Pues más a mi favor.",

        "¿De dónde sale la porcelana? De las porceovejas.",

        "Me gustan los elefantes. Todo lo demás me parece irrelefante.",

        "¿Por qué no pueden hablar los dinosaurios? Porque están muertos.",

        "¿Cuál es el animal más tonto de la selva? El oso polar.",

        "¿Qué le dice un gusano a otro? Me voy a dar la vuelta a la manzana.",

        "¿Cuáles eran los personajes de dibujos animados favoritos del capitán del Titanic? Timón y Pumba.",

        "¿Qué hace una abeja en un gimnasio? Zumba.",

        "¿Qué le dice un ganso a una gansa? ¡Vengansa!",

        "Si se muere una pulga, ¿dónde va? Al pulgatorio.",

        "¿Qué es un pez en un cine? Un mero espectador.",

        "¿Por qué la gallina cuida tanto a sus pollitos? Porque le costó un huevo tenerlos.",

        "¿Qué hace un pez mago? Nada por aquí, nada por allá",

        "¿Qué le dice la foca a su madre? I love you, mother foca.",

        "¿Cuál es el colmo de un carnicero? Tener un perro salchicha y un hijo chuleta."],
        posicion = Math.floor(Math.random() * chistes.length);
    return chistes[posicion];
}