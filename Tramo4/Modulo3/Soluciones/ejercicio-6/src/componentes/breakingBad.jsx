import { useState, useEffect } from 'react';

const breakingBad = () => {
  const [characters, setCharacters] = useState([]);

  useEffect(() => {
    const apiUrl = 'https://api.breakingbadquotes.xyz/v1/quotes';

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
