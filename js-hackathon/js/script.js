const movies = [
    'The Matrix 4',
    'The Batman',
    'Doctor Strange in the Multiverse of Madness',
    'Thor: Love and Thunder',
    'Black Panther 2',
    'Black Widow',
    'Jurassic World: Dominion',
    'Star Trek 4',
    'Ted',
    'Ted 2',
    'The Mummy'
]
const favourites = []
const movieList = document.getElementById("movieList");
  movieList.innerHTML=''
for (let i = 0; i < movies.length; i++) {
  const movieItem = document.createElement("li");
  movieItem.textContent = movies[i];
  const addButton = document.createElement("button");
  addButton.textContent = "Add to Favourites";
  addButton.addEventListener("click", () => {
    addToFavorites(movies[i]);
  });
  movieItem.appendChild(addButton);
  movieList.appendChild(movieItem);
}
addButton.addEventListener('click',()=>{
    addToFavourites(movie);
});
remove.addEventListener('click',()=>{
    removeFromFavourites(movie);
});
const addToFavourites = (movie) => {
    if (!favourites.includes(movie)) {
        favourites.push(movie);
        const index = movies.indexOf(movie);
        if (index !== -1) {
          movies.splice(index, 1);
        }
      }
    // Function that adds a movie to the favourites array
    // If the movie is already in the favourites array, it should not be added again
    // If the movie is not in the favourites array, it should be added
    // Once the movie is added the movie should be removed from the movies array
    // and rendered to the DOM.
    // The favourites array should also be rendered to the DOM
}
const removeFromFavourites = (movie) => {
    const index = favourites.indexOf(movie);
    if (index > -1) {
        favourites.splice(index, 1);
        movies.push(movie);
    }
    // Function that removes a movie from the favourites array
    // If the movie is not in the favourites array, it should not be removed
    // If the movie is in the favourites array, it should be removed
    // Once the movie is removed the movie should be added to the movies array
    // and rendered to the DOM.
    // The favourites array should also be rendered to the DOM
};
  const favoritesList = document.getElementById("favList");
  // Add favorites to the list
  for (let i = 0; i < favorites.length; i++) {
    const favoriteItem = document.createElement("li");
    favoriteItem.textContent = favorites[i];
    const removeButton = document.createElement("button");
    removeButton.textContent = "Remove from Favourites";
    removeButton.addEventListener("click", () => {
      removeFavorite(favorites[i]);
    });
    favoriteItem.appendChild(removeButton);
    favoritesList.appendChild(favoriteItem);
  }