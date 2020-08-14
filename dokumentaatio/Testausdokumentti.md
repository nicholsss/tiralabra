# Tehokkuuden Testaus

## Recursive Backtracking Vs Binary Tree

Kun annetaan molemmille algoritmeille Gridin X = 100, Y = 100, niin huomataan että
10 otoksen jälkeen

*Recursive backtracker* aika noin 0.0098...

*Binary tree* aika noin 0.0022...

*Binary Tree* yksi valtti on siinä ei tarvitse pitää kirjaa käydyistä soluista, eikä sen tarvitse palata taaksepäin etsimään mahdollisia ohitettuja soluja,
koska siinä mennään systemaattisesti kaikki solut läpi kerran.
