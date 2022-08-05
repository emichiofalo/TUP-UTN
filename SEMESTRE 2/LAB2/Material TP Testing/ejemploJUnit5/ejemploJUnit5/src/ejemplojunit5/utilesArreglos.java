

package ejemplojunit5;


public class utilesArreglos {
    int a[];
    int b[];
    public utilesArreglos(int a[], int b[]) {
        this.a = a;
        this.b = b;
    }

    public boolean compara() {
        for(int i=0; i<a.length; i++)
            if( a[i] != b[i])
                return false;

        return true;
    }

    public int sumaInterna(int a[]) {
        int total=0;
        for(int i=0; i<a.length; i++)
            total += a[i];

        return total;
    }

    public int[] sumaDosVectores(int a[], int b[]) {
        int total[] = new int[ a.length ];

        for(int i=0; i<a.length; i++)
            total[i] = a[i] + b[i];

        return total;
    }

     public int elMayor() {
        int elmayor =0;
        for(int i=0; i<a.length; i++) {
            if(a[i]>elmayor)
                elmayor = a[i];
        }
        return elmayor;
    }
     public int elMenor() {
        int elmenor =0;
        for(int i=0; i<a.length; i++) {
            if(a[i]>elmenor)
                elmenor = a[i];
        }
        return elmenor;
    }

     public int producto2() {
         int producto=0;

         for(int i=0; i<a.length; i++) {
             producto += a[i] * b[i];
         }

         return producto;
     }

}
