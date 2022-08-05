// Inclusiones (¿todo?)
#include <iostream>
#include <iomanip>
#include <fstream>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstring>
#include <list>
#include <vector>
#include <queue>
#include <algorithm>
#include <conio.h>

using namespace std;

#define pausa                  {mostrar << "En pausa. <Escape> para continuar...";while (getch() != 27);}
#define leeTecla(x)            x=getche()
#define leeTecSinEco(x)        x=getch()

/*
   Tipos de datos
*/
#define largo                   long
#define Largo			        largo
#define entero                  int
#define Entero			        entero
#define real                    float
#define Real			        real
#define doble                   double
#define Doble			        doble
#define caracter                char
#define Caracter		        caracter
#define logico                  bool
#define Logico			        logico
#define estructura              struct
#define Estructura		        estructura
#define campo
#define Cadena                  cadena
#define cadena                  string
//#define cadena               char *
//typedef char cadena[256];
//typedef char cadena20[20];
//typedef unsigned char byte;
#define plantilla(tipo)         template <class tipo>
#define FALSO                   0
#define PI                      3.1415927
#define VERDADERO               NO FALSO
#define sinSigno                unsigned

// Objetos
#define clase                               class
#define publico                             public
#define privado                             private
#define estatica                            estatico
#define estatico                            static
#define protegido                           const
#define nuevo                               new
#define borrar                              delete

/*
   Procedimientos
*/
#define mostrar                cout
#define mostrarConAncho(x)     cout.width(x)
#define mostrarConDecim(x)     cout.precision(x)
#define leer                   cin >>
#define leerM(x,y)             mostrar << y;leer x
#define limpiar                system("cls")
/*
   Traducciones genéricas
*/
#define Principal              principal
#define principal              int main(int argc, char *argv[]) { //unitbuf(cout);
#define finPrincipal           return EXIT_SUCCESS;}
#define programa               void main() { /##/                               // Borland
#define finPrograma            }
#define procedimiento          Procedimiento
#define Procedimiento          void
#define finProcedimiento       }
#define Funcion
#define funcion
#define finFuncion             }
#define regresa(x)             retorna(x)
#define retorna(x)             return(x)
#define noCompartido           static
#define global                 extern
// Decisiones
#define si(x)                  if(x)
#define entonces               {
#define sino                   } else {
#define finSi                  }
#define sinoSi(x)              } else if(x)
#define segun(x)               segunCaso(x)
#define segunCaso(x)           switch (x) {
#define finSegun               }
#define sale                   break
#define caso                   case
#define otroCaso               break; case
#define casoAsumido            break; default

// Bucles
#define iterar                 do {
#define salirSi(x)             if(x) break
#define finIterar              } while (VERDADERO)
#define mientras(x)            while (x) {
#define finMientras            }
#define repetir                do {
#define hasta(x)               } while (NO (x))
#define variar2(vc,vi,vf)      variar1(vc,vi,vf)
#define variar1(vc,vi,vf)      variar(vc,vi,vf,1)
#define variar(vc,vi,vf,inc)   si(1+((vf-vi)/(inc))>0) for(vc=vi;((inc>0)?(vc<=vf):(vc>=vf));vc+=inc) {
#define finVariar              }

// Equivalencias
#define salto                  endl
#define tabulado               (char) 9
#define ES                     ==
#define NO                     !
#define NOES                   !=
#define O                      ||
#define Y                      &&
#define ref                    &
#define porVal
#define porRef                 ref
#define deref                  *
#define constante              const

// Pseudo funciones
#define signo(x)               fSi(x>0,1,fSi(x<0,(-1),0))
#define raiz2(x)               sqrt(x)
#define fSi(x,y,z)             (x?y:z)
#define longitud(x)            strlen(x)
#define XalaY(x,y)             pow(x,y)
#define SIoNO(x)               ((x)?" Sï¿½ ": " No ")
#define mayusculas(x)          toupper(x)
#define cadIguales(x,y)        (strcmp(x,y) ES 0)
#define agregaYaX(x,y)         strcat(x,y)
#define maximo(a,b)            (a>b?a:b)
#define minimo(a,b)            (a<b?a:b)
#define esMult(a,b)            ((a % b) ES 0)
#define esImpar(x)             (x % 2)
#define esPar(x)               (NO (esImpar(x)))
#define esDigito(x)            ((x >= '0') Y (x <= '9'))
#define esLetra(x)             (strchr("ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyzáéíóúüÁÉÍÓÚÜ",x))
#define esSigno(x)             NO (esLetra(x) O esDigito(x))
#define esVocal(x)             (strchr("AEIOUaeiouáéíóúüÁÉÍÓÚÜ",x))
#define esConso(x)             (esLetra(x) Y NO esVocal(x))
#define plural(x)              fSi(x NOES 1,"s","")
#define esComPal(x,y)          (esSigno(x) Y NO esSigno(y))
#define esFinPal(x,y)          (NO esSigno(x) Y esSigno(y))
#define aCaracter(x)           "0123456789"[x]
#define arcoTangente(x,y)      atan2(x,y)
#define seno(x)                sin(x)
#define coseno(x)              cos(x)
#define tangente(x)            tan(x)
#define grados(x)              (180.0/PI*(x))
#define radianes(x)            (PI/180.0*(x))
#define grados360(x)           fSi(x < 0,grados(x+2*PI),grados(x))

// Posiblemente innecesarias en G++
#define borraCad(x)            while(strlen(x)) x[longitud(x)-1]='\0'
#define asigna(carX,cadY)      borraCad(cadY);cadY[0]=carX
#define agrega(cadX,carY)      cadX[longitud(cadX)] = carY
#define inserta(carX,cadY)     {int largoCadY = longitud(cadY);for(int p=largoCadY;p>0;p--)cadY[p] = cadY[p-1];cadY[0] = carX;}
#define duplicaCadena(o,d)     strcpy(d,o)
#define carALargo(c)           strtol(c,NULL,10)
// Al azar
#define iniciAlAzar            randomize
#define alAzar                 rand()
#define alAzarHasta(x)         random(x)
#define alAzarEntre(x,y)       ((x)+alAzarHasta(y-x))
#define alAzarReal             (rand()/(real)RAND_MAX)
#define alAzarRealEntre(x,y)   (x+(y-x)*alAzarReal)
#define alAzarDec(x)           alAzar*(entero)XalaY(10,x)/XalaY(10,x)
#define alAzarDecHasta(x,y)    alAzarHasta(x * (entero)XalaY(10,x))/XalaY(10,x)

//Archivos
#define archivo                             fstream
#define abrir(arch, nombre)                 arch.open(#nombre)
//#define abrir(arch, nomb, modo)             arch.open(#nomb,modo)
#define cerrar(arch)                        arch.close()
#define estaAbierto(arch)                   arch.is_open()
#define esFinDarch(arch)                    arch.eof()
#define todoBien(arch)                      arch.good()
#define errorEn(arch)                       arch.fail()
#define estaMal(arch)                       arch.bad()
#define leeRenglon(arch,cad)                getline(arch,cad)
#define puntLectura(arch)                   arch.tellg()
#define puntEscritura(arch)                 arch.tellp()
#define posAbsLectura(arch)                 arch.seekg()
#define posAbsEscritura(arch)               arch.seekp()
#define posRelLectura(arch,cuanto,desde)    arch.seekg(cuanto,desde)
#define posRelEscritura(arch,cuanto,desde)  arch.seekp(cuanto,desde)
#define DESDEINICIO                         ios::beg
#define DESDEFIN                            ios::end
#define DESDEACA                            ios::cur
#define ALEER                               ios::in
#define AESCRIBIR                           ios::out
#define ALFINAL                             ios::ate
#define AGREGAR                             ios::app
#define ATRUNCAR                            ios::trunc
#define BINARIO                             ios::binary

// Gráficos OpenGL
#define grafico                             glutInit (&argc, argv)
#define Gr_iniModo(modo)                    glutInitDisplayMode(modo)
#define Gr_iniTamVent(tHor,tVert)           glutInitWindowSize(tHor,tVert)
#define Gr_iniPosVent(posX,posY)            glutInitWindowPosition(posX,posY)
#define Gr_creaVentana(titulo)              glutCreateWindow(titulo)
#define Gr_mostrar()                        glutMainLoop()
#define Gr_limpiar(buff)                    glClear(buff)
#define Gr_RVA(rojo,verde,azul)             glColor3f(rojo,verde,azul)
#define Gr_RVA4(rojo,verde,azul,op)         glColor4f(rojo,verde,azul,op)
#define Gr_colorFondo(rojo,verde,azul,op)   glClearColor(rojo,verde,azul,op)
#define Gr_empieza(algo)                    glBegin(algo)
#define Gr_empiezaPuntos()                  Gr_empieza(GL_POINTS)               // Puntos
#define Gr_tamPunto(tama)                   glPointSize(tama)
#define Gr_empiezaSegmentos()               Gr_empieza(GL_LINES)                // Pares de puntos definiendo segmentos no conectados
#define Gr_empiezaLineas()                  Gr_empieza(GL_LINE_STRIP)           // Vértices conectados por líneas
#define Gr_empiezaLineasCerradas()          Gr_empieza(GL_LINE_LOOP)            // Vértices conectados por líneas más la última con la primera
#define Gr_lineaDePuntos(bitX16)            glLineStipple(1,bitX16)             // Patrón de dibujo de la línea
#define Gr_anchoLinea(ancho)                glLineWidth(ancho)                  // Ancho de la linea
#define Gr_HabLineaDePuntos()               Gr_habilita(GL_LINE_STIPPLE)
#define Gr_empiezaTriangulos()              Gr_empieza(GL_TRIANGLES)            // Triplas de vértices definiendo triángulos
#define Gr_empiezaTriangulosConectados()    Gr_empieza(GL_TRIANGLE_STRIP)       // Triángulos conectados
#define Gr_empiezaVentilador()              Gr_empieza(GL_TRIANGLE_FAN)         // Triángulos conectados como aspas de un ventilador
#define Gr_empiezaCuadrilateros()           Gr_empieza(GL_QUADS)                // Cuatriplas definiendo cuadriláteros
#define Gr_empiezaCuadrilaterosConectados() Gr_empieza(GL_QUAD_STRIP)           // Cuadriláteros conectados
#define Gr_empiezaPoligonos()               Gr_empieza(GL_POLYGON)              // Polígono
#define Gr_termina                          glEnd
#define Gr_habilita(algo)                   glEnable(algo)
#define Gr_inhabilita(algo)                 glDisable(algo)
#define Gr_estaHabilitado(algo)             glIsEnabled(algo)
#define Gr_vertice(x,y,z)                   glVertex3f(x,y,z)
#define Gr_procesa()                        glFlush()
#define Gr_procMuestra(proc)                glutDisplayFunc(proc)
#define Gr_eventoRedim(proc)                glutReshapeFunc(proc)
#define Gr_eventoTecla(proc)                glutKeyboardFunc(proc)
#define Gr_eventoRaton(proc)                glutMouseFunc(proc)
#define Gr_eventoMueve(proc)                glutMotionFunc(proc)
#define Gr_eventoDescanso(proc)             glutIdleFunc(proc)
#define Gr_modeloDibujo(modelo)             glShadeModel(modelo)

// Otras
#define GENERAZAR
#define DEPURACION
#define ORDENADO
