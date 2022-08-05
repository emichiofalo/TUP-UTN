/*
AUTHOR: zobayer
INSTRUCTION:
just make this file a header like "conio.h"
and use the getch() and getche() functions.
*/

#define pausa                  {mostrar << "En pausa. <Escape> para continuar...";while ((int)getch() != 27);}
#define leeTecla(x)            x=getche()
#define leeTecSinEco(x)        x=getch()

