# ![](resources/logo.jpeg) Projet personnel de programmation

### IUT Montpellier-Sète - Département Informatique

* **Participants** [Matthias DELON](mailto:m.delon858@gmail.com)
* Lien serveur Discord : [https://discord.gg/zcxUpm8](https://discord.gg/zcxUpm8)

# Projet - _Chess_

## Présentation
Le but de ce projet est de produire un _jeu d'échec_ complètement fonctionnel en _Java_.
De ce fait, on respectera l'ensemble des [règles et notations](https://en.wikipedia.org/wiki/Chess).

### Déroulement d'une partie
La partie commence par demander à l'utilisateur de choisir un mode de jeu:
`PvP (0) ou PvE(1) ? ou Battle of the Artificial Intelligence (2) ?`
- PvP : joueur humain contre joueur humain.
- PvP : joueur humain contre une intelligence artificielle.
- EvE : une intelligence artificielle contre une autre intelligence artificielle

Dans chaque mode, l'utilisateur a la liberté de choisir les options suivantes :
- En mode PvP, les noms des joueurs sont demandés.
- En mode PvE, on demande au joueur humain son nom, s'il veut jouer en premier ou en deuxième et le niveau de
l'intelligence artificielle qui varie entre 0 et 4 (cf. [Intelligence Artificielle](#intelligence-artificielle)).
- En mode EvE, l'utilisateur choisit les niveaux des deux intelligences artificielles.

Ensuite, le(s) joueur(s) peuvent choisir de jouer en mode `hardcore` ou non. En mode `hardocre`, il n'est pas
possible d'annuler un coup joué.
À chaque tour d'un joueur humain, on demande au joueur correspondant de rentre les coordonnées de départ (numéro de ligne puis lettre de colone) et les coordonnées d'arrivée.

### Les classes importantes

#### `Piece`
La classe `Piece` modélise une pièce.
Une pièce possède comme attributs, sa couleur (`Couleur couleur`) et sa lettre la représentant (`char lettre`).

#### `Move`
La classe `Move` modélise un coup.
