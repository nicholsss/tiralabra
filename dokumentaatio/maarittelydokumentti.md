# Määrittelydokumentti


## Käyttötarkoitus
Sovelluksen tarkoitus on luoda satunnainen labyrintti kahdella eri algoritmillä, recursive backtracking,Kruskalin algoritmilla ja Binary Tree algoritmilla

## Algoritmit ja tietorakenteet
Labyrintin luominen tapahtuu syvyyshaulla, johon on implementoitu  rekursiivinen peruuttavahaku, tietorakenteina käytän taulukkoa, ja pinoa.
Toisena algoritminä käytän satunnaista Kruskalin algoritmia, jonka tietorakenteina käytän listaa, pinoa ja taulua.
Kolmantena käytän Binary Tree algoritmia, joka satunnaisesti solun Ylä tai vasemman seinän.

## Syötteet
Syötteenä käyttäjä antaa siitä, että kuinka suuri labyrintti halutaan generoida.

## Aikavaativuudet
Aikavaativuudeltaan peruuttava syvyyshaku tulisi olla  O((|V| + |E|))
Ja tilavaativuudeltaan O(|V|)
Kruskalin aikavaativuus on O(∝(V))

# Lähteet



* [Maze generating algorithm](https://en.m.wikipedia.org/wiki/Maze_generation_algorithm) Wikipedia
* [Stackoverflow](https://stackoverflow.com/questions/38502/whats-a-good-algorithm-to-generate-a-maze)
* [jamisbuck](http://weblog.jamisbuck.org/)

