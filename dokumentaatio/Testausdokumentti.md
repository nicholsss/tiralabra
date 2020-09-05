# Tehokkuuden Testaus

## Ui
Ui on jätetty kokonaan testaamatta, koska ohjelmassa on tekstikäyttöliittymä, joten käyttöliittymän testaaminen ei ole oleellista kurssille.

## Util
Sisältää tietorakenteet Stack, ja ArrayList, sekä olion Cell
#### Stack
Stackin luontivaihteessa varmistetaan että se on tyhjä, sekä sen että Stackissa toimii *pop()* ominaisuus, sillä sen toiminnallisuus on algoritmin kannalta tärkeää.

#### ArrayList
Listan luontivaiheessa tarkistetaan että se on tyhjä. Listasta testataan myös se että se pystyy pitää sisällään useita Cell olioita, sekä sen että sieltä voidaan ottaa olio käyttöön.

#### Cell
Testataan että Cell(solulla) on oikeat arvot. Testataan että solulta voidaan poistaa sen seinät, täytyy myös tarkistaa että solulla on seinät luontivaiheessa. Testataan myös että solussa voidaan käydä(visited), ja että kun solulta poistetaan seinä sen naapurin kanssa, niin oikeat seinät poistuvat.

## domain
Sisältää ohjelman algoritmit, AldousBroder, BinaryTree, Randomized depth-first search ja HuntAndKill.

#### AldousBroder
|  Rows * Cols  | Time ms       | Iterations    | Second Header |  
| ------------- | ------------- | ------------- | ------------- |
| 10            | 0.5           | Content Cell  | Content Cell  |
| 100           | 27            | Content Cell  | Content Cell  |
| 200           | 126.9         | Content Cell  | Content Cell  |
| 400           | 625.8         | Content Cell  | Content Cell  |
| 800           | 2888          | Content Cell  | Content Cell  |
|1600           | 14775         | Content Cell  | Content Cell  |


#### BinaryTree
|  Rows * Cols  | Time ms       | Iterations    | Second Header |  
| ------------- | ------------- | ------------- | ------------- |
| 10            | 0.043           | Content Cell  | Content Cell  |
| 100           | 1.4          | Content Cell  | Content Cell  |
| 200           | 2.9         | Content Cell  | Content Cell  |
| 400           | 10.5          | Content Cell  | Content Cell  |
| 800           | 40            | Content Cell  | Content Cell  |
|1600           | 162           | Content Cell  | Content Cell  |



#### Dfs
|  Rows * Cols  | Time ms       | Iterations    | Second Header |  
| ------------- | ------------- | ------------- | ------------- |
| 10            | 0.07           | Content Cell  | Content Cell  |
| 100           | 1.4           | Content Cell  | Content Cell  |
| 200           | 4.1          | Content Cell  | Content Cell  |
| 400           | 15.7          | Content Cell  | Content Cell  |
| 800           | 57.4          | Content Cell  | Content Cell  |
|1600           | 247          | Content Cell  | Content Cell  |



*Binary Tree* yksi valtti on siinä ei tarvitse pitää kirjaa käydyistä soluista, eikä sen tarvitse palata taaksepäin etsimään mahdollisia ohitettuja soluja,
koska siinä mennään systemaattisesti kaikki solut läpi kerran.
