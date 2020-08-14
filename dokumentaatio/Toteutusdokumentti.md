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
