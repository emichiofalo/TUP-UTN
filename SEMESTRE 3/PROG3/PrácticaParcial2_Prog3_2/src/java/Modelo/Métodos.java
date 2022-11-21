/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Emi Chiófalo
 */
public class Métodos {
    public char[][] romboMatrix(char[][] matrix, char value)
        {
            int n = matrix.length;
            int m = (int)n / 2;
            int i = 0;
            int j = m;

            //primer loop
            while (i <= m && j >= 0)
            {
                matrix[i][j] = value;
                i++;
                j--;
            }
            //segundo loop
            i = m ;
            j = 0;
            while (i <= n - 1 && j <= m )
            {
                //Console.WriteLine(i + "-" + j);
                matrix[i][j] = value;
                i++;
                j++;
            }
            //tercer loop
            i = n-1;
            j = m;
            while (i >= m && j <= n-1 )
            {
                //Console.WriteLine(i + "-" + j);
                matrix[i][j] = value;
                i--;
                j++;
            }
            //cuarto loop
           i = m;
            j = n - 1;
            while (i >= 0 && j >= m )
            {
                //Console.WriteLine(i + "-" + j);
                matrix[i][j] = value;
                i--;
                j--;
            }
            
            return matrix;
        }
}
