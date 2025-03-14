Projet Spring - Injection de dépendances

Description

Ce projet illustre les concepts d'injection de dépendances en Java avec Spring. Il met en œuvre plusieurs manières d'injecter des dépendances :

Injection par constructeur

Injection par setter

Injection avec Spring (annotations et XML)

Réflexion pour une instanciation dynamique des classes

Structure du projet

Le projet est organisé en plusieurs packages :

net.lamsiyeh.dao : Contient les classes qui représentent l'accès aux données.

IDao : Interface d'accès aux données.

DaoImpl : Implémentation accédant à une base de données.

DaoImpV2 : Une autre implémentation utilisant des capteurs.

net.lamsiyeh.metier : Contient la logique métier.

IMetier : Interface du métier.

IMetierImpl : Implémentation qui utilise un IDao injecté.

net.lamsiyeh.pres : Contient les classes de présentation (main).

Pres : Instanciation manuelle des dépendances.

Pres2 : Instanciation dynamique via réflexion.

PresSpringAnnotation : Utilisation de Spring avec annotations.

PresSpringXml : Utilisation de Spring avec configuration XML.