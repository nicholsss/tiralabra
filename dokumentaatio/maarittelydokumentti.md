# Määrittelydokumentti


## Käyttötarkoitus
Sovelluksen avulla voidaan verrata eri algoritmien nopeutta löytää reitti labyrintin läpi.

## Algoritmit ja tietorakenteet
Käytän leveyshakua löytämään labyrintin lyhyimmän reitin, tietorakenteina täyssä käytän jonoa, sekä taulukkoa.

Toisena algoritminä käytän *A Algoritmia, joka on tehokkain algoritmi reitin löytämiseen.

## Syötteet
Syötteenä ohjelmalle annetaan labyrintti [Movingai](https://www.movingai.com/benchmarks/) sivulta, josta molemmat algoritmi aloittavat samasta kohtaan, ja pyrkivät pääsemään labyrintin loppuun.

## Aikavaativuudet
Syvyyshaulla tähdätään O(|V| + |E|) aikavaativuuteen, ja tilavaativuuteen O(|V|) 
*A Tähdätään O(|E|) aikavaativuuteen, ja tilavaatutena pyritään saavuttamaan (|V|)
## Lähteet


* [Maze solving algorithm](https://en.wikipedia.org/wiki/Maze_solving_algorithm) Wikipedia
* [Labyrintit](https://www.movingai.com/benchmarks/maze/index.html)

