### VARIABLES ###

JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none

JVM = java
JVMFLAGS = 

### COMPILATTION FICHIER ###

Main.class : Start.java FenetreInit.class Fenetre.class
	${JC} ${JCFLAGS} Start.java

Fenetre.class : Fenetre.java Point.class
	${JC} ${JCFLAGS} Fenetre.java

Point.class : Point.java
	${JC} ${JCFLAGS} FenetreInit.java

### REGLES OPTIONNELLES ###

run : Start.class
	${JVM} ${JVMFLAGS} Start

clean :
	-rm -f *.class

nettoyer :
	rm .\*.class

mrproper : clean Start.class

### BUTS FACTICES ###

.PHONY : run clean mrproper

### FIN ###