# Määrittelydokumentti


## Käyttötarkoitus
Sovelluksen tarkoitus on luoda satunnainen labyrintti kahdella eri algoritmillä, recursive backtracking,Kruskalin algoritmilla ja Binary Tree algoritmilla

## Algoritmit ja tietorakenteet
Labyrintin luominen tapahtuu syvyyshaulla, johon on implementoitu  rekursiivinen peruuttavahaku, tietorakenteina käytän taulukkoa, ja pinoa.

toisena käytän Binary Tree algoritmia, joka satunnaisesti solun Ylä tai vasemman seinän.

Kolmantena käytän Hunt And Kill  algoritmia, joka valitsee käymättömän solun, jos se ei löydä käymätöntä solua, se käy rivit läpi ja valitsee ensinmäisen käymättömän solun, ja jatkaa siitä.

Neljäntenä algoritmina käytän Aldrous boulder algoritmia, joka menee viereiseen soluun, ja jos siellä ei ole käyty, niin poistetaan kyseisen ja viereisen solujen väliltä seinä.

## Syötteet
Syötteenä käyttäjä antaa siitä, että kuinka suuri labyrintti halutaan generoida.

## Aikavaativuudet
Aikavaativuudeltaan peruuttava syvyyshaku tulisi olla  O((|V| + |E|))
Ja tilavaativuudeltaan O(|V|)

# Lähteet



* [Maze generating algorithm](https://en.m.wikipedia.org/wiki/Maze_generation_algorithm) Wikipedia
* [Stackoverflow](https://stackoverflow.com/questions/38502/whats-a-good-algorithm-to-generate-a-maze)
* [jamisbuck](http://weblog.jamisbuck.org/)

