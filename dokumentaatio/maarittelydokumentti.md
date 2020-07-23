# Määrittelydokumentti


## Käyttötarkoitus
Sovelluksen avulla voidaan verrata eri algoritmien nopeutta luoda satuinnainen labyrintti annetuista parametreista.

## Algoritmit ja tietorakenteet
Käytän syvyyshakua, johon on lisätty satunnaisuutta, jossa valitaan satunnainen naapuri joka on vielä käymätön.
Toisena algoritminä käytän Kruskalin algoritmia
Tietorakenteina käytän taulukkoa, sekä pinoa


## Syötteet
Syötteenä annetaan labyrintin leveys sekä korkeus arvot, joita käytetään labyrintin alustan koon pohjana. Labyrintti siis kasaantuu näiden arvojen sisälle.

## Aikavaativuudet
Syvyyshaulla tähdätään O(|V| + |E|) aikavaativuuteen, ja tilavaativuuteen O(|V|)
Kruskalilla nopeudessa tähdätään O(a(V)) 
## Lähteet


* [Maze generation algorithm](https://en.wikipedia.org/wiki/Maze_generation_algorithm) Wikipedia

* [Different algorithm for maze generation](https://stackoverflow.com/questions/38502/whats-a-good-algorithm-to-generate-a-maze) Stackoverflow
