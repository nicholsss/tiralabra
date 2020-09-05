# Tehokkuuden Testaus
## JUnit testaus
Testauksessa on käytetty JUnit testejä, joiden kattavuuden näkee alla olevasta kuvasta


![jacoco test](https://github.com/nicholsss/tiralabra/blob/master/dokumentaatio/jacoco2.png)


### Ui
Ui on jätetty kokonaan testaamatta, koska ohjelmassa on tekstikäyttöliittymä, joten käyttöliittymän testaaminen ei ole oleellista kurssille.

### Util
Sisältää tietorakenteet Stack, ja ArrayList, sekä olion Cell
#### Stack
Stackin luontivaihteessa varmistetaan että se on tyhjä, sekä sen että Stackissa toimii *pop()* ominaisuus, sillä sen toiminnallisuus on algoritmin kannalta tärkeää.

#### ArrayList
Listan luontivaiheessa tarkistetaan että se on tyhjä. Listasta testataan myös se että se pystyy pitää sisällään useita Cell olioita, sekä sen että sieltä voidaan ottaa olio käyttöön.

#### Cell
Testataan että Cell(solulla) on oikeat arvot. Testataan että solulta voidaan poistaa sen seinät, täytyy myös tarkistaa että solulla on seinät luontivaiheessa. Testataan myös että solussa voidaan käydä(visited), ja että kun solulta poistetaan seinä sen naapurin kanssa, niin oikeat seinät poistuvat.

## domain
Sisältää ohjelman algoritmit, AldousBroder, BinaryTree, Randomized depth-first search ja HuntAndKill.

Kyseisistä algoritmeistä testataan se että kun sokkelon pohja luodaan, on tämä pohja täynnä koskemattomia soluja.

Testataan myös että koskemattomassa solussa, on solu, jolla on pakosti ainakin yksi naapuri

Testataan että että soluilla ei ole sellaista tilannetta että generoinnin jälkeen alustalla ei ole sellaista solua, jolla on kaikki seinät pystyssä.

## Tehokkuusvertailu
Satunnaisesti rakennettu sokkelo, jonka koot on mainittu taulukossa. Algoritmien nopeudet ovat keskiarvo 10 eri suorituksesta.



#### AldousBroder
Aldous broderin heikkous on siinä että jos sillä aloitetaan tekemään liian suurta sokkeloa, niin voi syntyä tilanne jossa se ei koskaan saa sokkeloa tehtyä,
sillä algoritmi valitsee aina satunnaisesti solun johon mennä, ja tämän takia on mahdollisuus ettei sokkelo koskaan valmistuisi.

|  Rows         | Cols           |   Time ms     |
| ------------- | ------------- | -------------  |
| 10            | 10          |             0.5|
| 100           | 100            |              27|
| 200           | 200        |           126.9|
| 400           | 400        |  625.8|
| 800           | 800        |  2888|
|1600           | 1600        |  14775|


#### BinaryTree
BinaryTree suoriutuu ajassa O(n), koska algoritmi käy kaikissa soluissa ainoastaan kerran, eikä sen tarvitse pitää kirjaa mistään, tämän takia Kyseisellä algoritmilla pystytään tekemään erittäin suuria sokkeloita. 

|  Rows   | Cols       |    Time ms |
| ------------- | ------------- | ------------- | 
| 10            | 10           | 0.043  |
| 100           |100         | 1.4  | 
| 200           | 200        | 2.9 | 
| 400           | 400         | 10.5  | 
| 800           | 800           | 40  | 
|1600           | 1600          |162 |



#### Dfs
Randomized Depth-First_search(recursive backtracker) suoriutuu ajassa O(|V| + |E|), ja sen tilavaativuus on O(|V|), koska käytössämme on *Stack*, jonka tilavaativuus on pahimmassa tapauksessa O(n). Isoille sokkeloille tämä saattaa on ongelmaista, sillä *Stack* koko pitää olla vähintään sokkelon kokoinen.
|  Rows         | Cols          | Time ms      
| ------------- | -------------  | ------------- |
| 10            | 10             | 0.07  |
| 100           | 100           | 1.4 |
| 200           | 200          |4.1  |
| 400           | 400          | 15.7  |
| 800           | 800          | 57.4 |
|1600           | 1600          | 247 |

#### Hunt And Kill
|  Rows          | Cols       | Time ms    | 
| ------------- | ------------- | ------------- | 
| 10            | 10        | 0.11 | 
| 100           | 100       | 3.4 | 
| 200           | 200        | 35.8  | 
| 400           | 400         | 549.2 | 
| 800           | 800         | 23089 | 
|1600           | 1600        | - |

