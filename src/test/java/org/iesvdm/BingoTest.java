package org.iesvdm;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
public class BingoTest {


    @Test
    void buscarValorRepetido(){
        int elemento = 2;
        int[] array = {1,2,3,4,5};
        assertTrue(Bingo.buscarValorRepetido(array,elemento));
    }
    @Test
    void rellenarNumerosCarton(){
        int[][] arrayBi= new int[8][3];
        Bingo.rellenarNumerosCarton(arrayBi);

        for(int i=0 ;i< arrayBi.length;i++){
            for(int j=0;j< arrayBi[0].length;j++){
                assertNotEquals(arrayBi[i][j],0);//Comprobamos que no tiene elementos null
                assertTrue(arrayBi[i][j]<10*(i+1));//Comprobamos que efectivamente esta cada columna en su respectiva decena
            }
        }
}


    @Test
    void buscarFila(){
        int[][] arrayBi={{-1},{-1}};
        int fila = 0;
        int posicion = 0;

        assertTrue(Bingo.buscarFila(arrayBi,fila,posicion));
    }

    @Test
    void buscarColumna(){
        int[][] arrayBi={{-1,-1,0},{-1,1,1}};
        int posicion = 0;

        assertTrue(Bingo.buscarColumna(arrayBi,posicion));
    }

    @Test
    void ponerBlancos(){
        int[][] array = new int[9][3];
        int contador=0;
        Bingo.rellenarNumerosCarton(array);
        Bingo.ponerBlancos(array);
        for(int i=0;i<array[0].length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j][i]==-1){
                    contador++;
                }
            }
        }

        assertTrue(contador==12);
    }


    @Test
    void pintarCarton(){

        int[][] arrayBi = {{1,2,3},{10,11,12},{21,22,23}};
        int[] bolas = {1,10,11,12,13,14,15,16,21};
        int aciertos=5;

        assertEquals(aciertos,Bingo.pintarCarton(arrayBi,bolas));
    }

    @Test
    void insertarAlFinal(){
        int[] array={2,3};
        int elemento= 4;
        int[] arrayEsperado={2,3,4};
        assertArrayEquals(arrayEsperado,Bingo.insertarAlFinal(array,elemento));
    }

    @Test
    void ordenar(){
        int[] array={1,2,5,4,0};
        int[] arrayEsperado={0,1,2,4,5};
        assertArrayEquals(arrayEsperado,Bingo.ordenar(array));
    }
}
