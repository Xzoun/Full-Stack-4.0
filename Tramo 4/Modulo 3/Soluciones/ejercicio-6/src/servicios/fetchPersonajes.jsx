const API_URL = "http://rickandmortyapi.com/api/character";
const fetchCharacter = async () => {
    try {
        const response = await fetch(API_URL);
        const data = await response.json();
        return data.results;
    } catch (error) {
        console.error("Error en la busqueda de personajes: ", error);
        return [];
    }
};

export default fetchCharacter;