# Exercice 3 : Créer un projet Java par exercice sous Eclipse, ex ici : « BaseEx3Loop »

Cette application Java permet d’analyser **un ou plusieurs entiers** pour dire, pour chacun d’eux, s’il est **pair ou impair** et s’il est **positif, négatif ou nul**. Elle fonctionne aussi bien **en mode ligne de commande** (plusieurs nombres à la suite) qu’en **mode interactif** (saisie clavier).

## Sommaire
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Règles-du-jeu](#règles-du-jeu)
- [Fonctionnalités](#fonctionnalités)
- [Structure du code](#structure-du-code)

## Installation

1. **Pré-requis** : installer le **JDK** (Java Development Kit) version 8 ou supérieure.
2. Téléchargez le fichier `src/BaseEx3Loop.java`.
3. Compilez le fichier :

   ```bash
   javac BaseEx3Loop.java
   ```

4. Exécutez le programme :

   ```bash
   java BaseEx3Loop
   ```

   ou avec des nombres en argument :

   ```bash
   java BaseEx3Loop 5 -3 0 12
   ```

## Utilisation

### 1. Mode ligne de commande (plusieurs entiers)

* Vous pouvez passer **plusieurs valeurs** après le nom du programme.

* Exemple :

  ```bash
  java BaseEx3Loop 5 -3 0 12
  ```

  Affichage possible :

  ```text
  5 est impair
  5 est positif
  -3 est impair
  -3 est négatif
  0 est pair
  0 est nul
  12 est pair
  12 est positif
  ```

* Le programme boucle sur **tous les arguments** (`for (int i=0; i<args.length; i++)`) et applique les mêmes tests à chacun.

### 2. Mode interactif (sans argument)

* Si vous lancez :

  ```bash
  java BaseEx3Loop
  ```

  le programme demande :

  ```text
  Entrez un nombre
  ```

* Si l’utilisateur tape autre chose qu’un entier, il redemande :

  ```text
  Entrée invalide, veuillez entrer un entier :
  ```

* Une fois un entier saisi, il affiche sa **parité** puis son **signe**.

## Règles du jeu

1. **S’il y a des arguments**, le programme **ne demande pas** de saisie clavier : il traite uniquement les arguments.
2. **S’il n’y a pas d’arguments**, le programme **passe en mode saisie utilisateur**.
3. La saisie clavier est **validée** : tant que l’utilisateur n’entre pas un entier, le programme redemande.
4. Pour **chaque entier** (qu’il vienne de la ligne de commande ou du clavier), le programme affiche **deux informations** :

   * pair / impair
   * négatif / positif / nul
5. Le programme s’arrête une fois tous les entiers traités.

## Fonctionnalités

* ✅ Lecture **d’un ou plusieurs entiers** via les **arguments de la ligne de commande**
* ✅ Mode **interactif** si aucun argument n’est donné
* ✅ **Validation d’entrée** (boucle jusqu’à obtention d’un entier)
* ✅ Détermination de la **parité** :

  * `% 2 == 0` → “est pair”
  * sinon → “est impair”
* ✅ Détermination du **signe** :

  * `< 0` → “est négatif”
  * `> 0` → “est positif”
  * `== 0` → “est nul”
* ✅ Code **factorisé** grâce à deux méthodes (`computeParity` et `computePositivity`)
* 🧩 Facile à étendre (par ex. compter le nombre de pairs, calculer une moyenne, etc.)

## Structure du code

* **Classe principale :** `BaseEx3Loop`

  * Contient la méthode `main`.

* **Méthode `main(String[] args)` :**

  * Vérifie s’il y a **des arguments**.
  * Si oui → **boucle sur chaque argument**, le convertit en `int`, puis appelle :

    * `computeParity(int)`
    * `computePositivity(int)`
  * Si non → **demande une saisie** à l’utilisateur avec `Scanner`, valide l’entrée, puis appelle les deux méthodes.

* **Méthode `computeParity(int integerInt)` :**

  * Affiche si le nombre est **pair** ou **impair**.

* **Méthode `computePositivity(int integerInt)` :**

  * Affiche si le nombre est **négatif**, **positif** ou **nul**.

