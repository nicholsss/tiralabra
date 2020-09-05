# Käyttöohje

## Ohjelman lataaminen ja käynnistäminen
Ohjelman lataaminen tapahtuu github repositoryn *Code* napista, josta valitaan download ZIP. Zipin purkamisen jälkeen ohjelma voidaan avata IDE avulla.
Ohjelman käynnistämiseen täytyy koneella olla [Maven](https://maven.apache.org/) asennettuna.

## ohjelman toiminnallisuudet
Ohjelman käyttöliittymänä on tekstikäyttöliittymä, joten sen käyttö tapahtuu antamalla ohjelmalle vastaukset numeroilla.

## Syötteet
Käyttäjä antaa ohjelman käynnistyessä rivien ja sarakkaiden määrän, jotka ohjelma ottaa talteen tulevien sokkeloiden generointiin. Käyttäjä voi myös muokata
antamiaan arvoja sokkeloiden kokoon liittyen.

## Toiminnallisuudet
Käyttäjälle annetaan vaihtoehdot siitä että mitkä sokkelot halutaan generoida. Käyttäjä voi generoida sokkelot yks kerrallaan, tai kaikki samaanaikaan. Käyttäjä pystyy
myös samalla näkemään sokkelon generointiin käytetyn ajan.

## Tehokkuustestit
Käyttäjä voi halutessaan generoida jokaisen sokkelon 10 kertaa ja saada näiden generointien keskiarvon. Tehokkuusvertailu suoritetaan niillä arvoilla jotka käyttäjä
on aikaisemmin antanut, joten isojen sokkeloiden generointi on työlästä.
