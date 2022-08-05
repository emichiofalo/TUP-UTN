
package ejemplojunit5;


public class utilesMatrices {
  int a[][];
        int b[][];
    public utilesMatrices(int a[][], int b[][]) {
        this.a = a;
        this.b = b;
    }

    public boolean compara() {
        for(int i=0; i<a.length; i++)
        for(int j=0; j<a.length; j++)
            if( a[i][j] != b[i][j])
                return false;

        return true;
    }

    public int sumaInterna(int a[][]) {
        int total=0;
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a.length; j++)
            total += a[i][j];

        return total;
    }


    public int[][] sumaDosMatrices(int a[][], int b[][]) {
        int total[][] = new int[ a.length ][a.length];   //suponemos que es una matriz cuadrada

        for(int i=0; i<a.length; i++)
        for(int j=0; j<a.length; j++)
            total[i][j] = a[i][j] + b[i][j];

        return total;
    }
     public int elMayor() {
        int elmayor =0;
        for(int i=0; i<a.length; i++) {
        for(int j=0; j<a.length; j++) {
            if(a[i][j]>elmayor)
                elmayor = a[i][j];
        }
        }
        return elmayor;
    }
     public int elMenor() {
        int elmenor =0;
        for(int i=0; i<a.length; i++) {
        for(int j=0; j<a.length; j++) {
            if(a[i][j]>elmenor)
                elmenor = a[i][j];
        }
        }
        return elmenor;
    }

    public int producto2() {
         int producto=0;

         for(int i=0; i<a.length; i++) {
         for(int j=0; j<a.length; j++) {
             producto += a[i][j] * b[i][j];
         }
        }

         return producto;
     }

}
