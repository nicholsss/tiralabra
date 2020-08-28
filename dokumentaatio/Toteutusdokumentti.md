# Toteutusdokumentti

### Recursive backtracker
Algoritmi päätietorakenteina on käytössä **kaksiulotteinen taulukko**, **pino** ja **lista**. Kaksiulotteisessa taulukon jokaisessa kohdassa on Cell objekti,
joka pitää sisällää solun  X, Y arvon, tiedon siitä onko siinä vielä käyty, sekä solun kaikki mahdolliset seinät. 

**Pino** on algoritmin toiminnalta erittäin tärkeä,
sillä se sisältää solut, joissa on ehditty käymään. Ja koska algoritmin toimintaperiaate toimii niin että solu valitsee satunnaisesti naapureistaan solun , johon mennä, niin lopulta
tulee tilanne vastaan, jossa algoritmi jää jumiin, ja tällöin voimme ottaa pinon käyttöön. Kun ei pystytä enään menemään naapurisoluun, niin pinosta otetaan viimeksi sinne lisätty solu, jonka naapueita voidaan tarkistella,
ja mahdollisesti löytää naapuri jossa ei ole vielä käyty.

**Listassa** säilytetään solun naapureita, joissa ei olla vielä käyty. Tästä kyseisestä listasta valitaan satunnaisesti naapuri, jonka jälkeen poistamme naapurin, sekä aktiivisen solun seinät, jolloin saamme pienen palasen tehtyä sokkeloa.
Tämän jälkeen naapurista tulee aktiivinen solu, jonka naapurit katsomme ja toteutamme saman operaation.

Algoritmi toimii niin pitkään, kunnes **pino** on tyhjä, jolloin tiedämme että olemme käyneet kaikissa mahdollisissa soluissa.

### Binary Tree
Algoritmi päätietorakenteina on käytössä **kaksiulotteinen taulukko**. Kaksiulotteisessa taulukokko on täytetty Cell olioilla, jotka pitävät sisällään solun  X, Y arvon, tiedon siitä onko siinä vielä käyty, sekä solun kaikki mahdolliset seinät.

Algoritmin toiminta on suhteellisen yksinkertainen sillä valitsemme kaksi suuntaa johon katsoa, Algoritmissani katsotaan *TOP* ja *LEFT* seiniä. Algoritmi aloittaa *Gridin* vasemmasta yläkulmasta, ja poistaa satunnaisesti *TOP* seinän tai *LEFT* seinän, mutta koska kumpaakaan ei ole mahdollista tehdä, siirrtyään seuraavaan soluun. Algoritmi valitsee taas satunnaisesti *TOP* tai *LEFT* seinän väliltä, mutta koska *TOP* seinää ei voida poistaa, poistaa algoritmi tällöin *LEFT* seinän. Algoritmi etenee siis yläkulmasta sen vastakulmaan eli alakulmaan, ja tämä tapahtuu menemällä rivi ja solu kerrallaan, kunnes päästään loppuun, jolloin jokaiselle solulle tulee sama valinta eli poistaa satunnaisesti *TOP* tai *LEFT* seinä.

### Hunt And Kill
Algoritmin Päätietorakenteina on käytössä  **kaksiulotteinen taulukko** ja **Lista**. Kaksiulotteinen taulukko pitää sisällään Cell objektin, joka pitää sisällään solun tiedot.

Hunt And Kill algoritmin perustuu siihen, että aloitetaan satunnaisesta kohdasta, ja katsotaan viereiset naapurit ja siirrytään naapuri soluun. Tätä jatketaan niin kauan kunnes ei pystytä. Kun ei ole enää naapureita, niin aloitamme etsimään käymätöntä solua ekalta riviltä, jonka jälkeen otamme käymättömän solun, ja jatkamme siitä viereisten solujen etsimistä joissa ei olla käyty.

### Aldour-Bolder
Algoritmin Päätietorakenteina on käytössä  **kaksiulotteinen taulukko** ja **Lista**. Kaksiulotteinen taulukko pitää sisällään Cell objektin, joka pitää sisällään solun tiedot.
Listassa sälilytämme solun naapureita.
Aldour - Bolder algoritmi on hitain tekemistäni algoritmeista, sillä se aloittaa satunnaisesta paikasta, jonka jälkeen se valitsee yhden naapureistaan satunnaisesti, ja poistetaan näiden solujen väliltä seinä. Tämän jälkeen solu joka oli naapuri on meidän "current" solu, ja valitsemme sille satunnaisen naapurin, ja jos naapurissa ei olla käyty, niin poistetaan seinämät taas. Jos solussa on käyty, niin siirrymme vain kyseiseen soluun. Tätä jatkuu kunnes olemme käyneet kaikki solut, tämä voidaan tehdä esimerkiksi jonkinmuotoisella laskurilla.

### UI
Tarkoituksena on toteuttaa tekstipohjainen sokkelo, jossa käytän **+** **|** ja **_** merkintöjä.


