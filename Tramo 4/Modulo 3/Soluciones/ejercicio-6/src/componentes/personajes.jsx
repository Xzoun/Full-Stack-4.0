import { useState, useEffect } from 'react';

const CharacterList = () => {
  const [characters, setCharacters] = useState([]);

  useEffect(() => {
    const apiUrl = 'https://rickandmortyapi.com/api/character';

    fetch(apiUrl)
      .then(response => response.json())
      .then(data => setCharacters(data.results))
      .catch(error => console.error('Error:', error));
  }, []);

  return (
    <div>
      <h1>Character List</h1>
      <ul>
        {characters.map(character => (
          <li key={character.id}>{character.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default CharacterList;
