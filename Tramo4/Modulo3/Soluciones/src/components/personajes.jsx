import { useState, useEffect } from 'react';
import Stack from 'react-bootstrap/Stack';
import Pagination from 'react-bootstrap/Pagination';

const RickAndMorty = () => {
  const [characters, setCharacters] = useState([]);
  const [page, setPage] = useState(1);
  const [info, setInfo] = useState(null);

  useEffect(() => {
    const apiUrl = `https://rickandmortyapi.com/api/character/?page=${page}`;

    fetch(apiUrl)
      .then(response => response.json())
      .then(data => {
        setCharacters(data.results);
        setInfo(data.info);
      })
      .catch(error => console.error('Error:', error));
  }, [page]);

  const handlePaginationClick = (pageNumber) => {
    setPage(pageNumber);
  };

  const paginationItems = [];
  if (info?.pages) {
    const totalPages = info.pages;
    const displayPages = 2;

    let startPage = Math.max(1, page - displayPages);
    let endPage = Math.min(totalPages, page + displayPages);

    if (startPage > totalPages - 2 * displayPages) {
      startPage = totalPages - 2 * displayPages + 1;
    }

    if (endPage < 2 * displayPages + 1) {
      endPage = 2 * displayPages + 1;
    }

    for (let number = startPage; number <= endPage; number++) {
      paginationItems.push(
        <Pagination.Item
          key={number}
          active={number === page}
          onClick={() => handlePaginationClick(number)}
        >
          {number}
        </Pagination.Item>
      );
    }
  }


  return (
    <div className="padding">
      <Stack gap={3} className="card">
        {characters.map(character => (
          <div className="p-2 characterCard" key={character.id} >
            <img className="characterPhoto" src={character.image} alt="" />
            <div className="characterDesc">
              <h2>{character.name}</h2>
              <h4>{character.status}</h4>
              <h4>{character.origin.name}</h4>
            </div>
          </div>
        ))}
      </Stack>
      <Pagination className="justify-content-center fixed-bottom">
        <Pagination.First
          onClick={() => handlePaginationClick(1)}
          disabled={page === 1}
        />
        <Pagination.Prev
          onClick={() => handlePaginationClick(page - 1)}
          disabled={page === 1}
        />
        {paginationItems}
        <Pagination.Next
          onClick={() => handlePaginationClick(page + 1)}
          disabled={page === info?.pages}
        />
        <Pagination.Last
          onClick={() => handlePaginationClick(info?.pages)}
          disabled={page === info?.pages}
        />
      </Pagination>
    </div>
  );
};

export default RickAndMorty;
