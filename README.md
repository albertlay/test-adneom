# test-adneom
Projet de maison pour recrutement à Adneom

## Objectif du projet

1 - Écrivez une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
Exemples d'entrées et sorties :
partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ] 
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ] 
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ] 

 2 - Écrivez des tests unitaires avec Junit4 pour vérifier votre implémentation.

Important : Partez du principe que votre implémentation fera partie d'une librairie utilisé par plein d'autres applications (en production)

Livraison attendu : une archive contenant les sources du projet, et les instructions pour les utiliser.


## Présentation du contenu du projet

### Classe principale
Le projet contient une classe **MaFonction** dans le package **org.test.maison**.
La classe MaFonction offre une fonction static **"partition"** qui prend deux paramètres : une liste d'entier et un entier taille (représente la taille des sous listes à retourner).
La fonction **"partition"** retourne une liste de sous liste.

### Classe test
Le projet contient aussi une classe **MaFonctionTest** dans le package **org.test.maison** qui permet de tester la fonction **partition** décrite plus haut.
Trois (3) tests sont mis en place : 
- le premier retourne des sous listes de un élément chacune
- le second retourne des sous listes de deux éléments chacune
- le troisième retourne des sous listes de trois éléments chacune

### Informations supplémentaires
Utilisation de la version 1.8 de java pour accès au **Stream** et aux expressions **Lambda**

## Comment tester le projet
```
git clone https://github.com/albertlay/test-adneom.git
mvn clean install
```
