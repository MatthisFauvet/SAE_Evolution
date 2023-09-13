### VARIABLES ###

JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none

JVM = java
JVMFLAGS = 

### COMPILATTION FICHIER ###

Main.class : Main.java Fenetre.class
	${JC} ${JCFLAGS} Main.java

Fenetre.class : Fenetre.java Point.class Terrain.class
	${JC} ${JCFLAGS} Fenetre.java

Point.class : Point.java
	${JC} ${JCFLAGS} Point.java


Terrain.class : Terrain.java
	${JC} ${JCFLAGS} Terrain.java


### REGLES OPTIONNELLES ###

run : Main.class
	${JVM} ${JVMFLAGS} Main

clean :
	-rm -f *.class

nettoyer :
	rm .\*.class

mrproper : clean Main.class

### BUTS FACTICES ###

.PHONY : run clean mrproper

### FIN ###