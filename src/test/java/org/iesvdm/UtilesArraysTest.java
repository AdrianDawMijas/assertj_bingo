package org.iesvdm;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;
public class UtilesArraysTest {

    @Test
    void limpiar(){
        assertThat(UtilesArrays.limpiar()).isEmpty();
    }

    @Test
    void rellenar(){
        int[] array = new int[5];
        int elementos = 3;
        int[] arrayFinal =UtilesArrays.rellenar(array,elementos);
        assertThat(arrayFinal).hasSize(elementos);

    }

    @Test
    void rellenarValor(){
        int[] array = new int[5];
        int elementos = 3;
        int valor = 4;
        int contador =0;
        int[] arrayFinal =UtilesArrays.rellenar(array,elementos,valor);
        for (int j : arrayFinal) {
            if (j == valor) {
                contador++;
            }
        }
        assertThat(contador).isEqualTo(elementos);
    }

    @Test
    void insertarAlFinal(){
        int[] array = new int[5];
        int numero = 3;
        int[] arrayFinal=UtilesArrays.insertarAlFinal(array,3);
        assertThat(arrayFinal).hasSize(array.length+1);
        assertThat(arrayFinal[arrayFinal.length-1]).isEqualTo(numero);
        assertThat(arrayFinal).contains(array);
    }

    @Test
    void insertarAlPrincipio(){
        int[] array = new int[5];
        int numero = 3;
        int[] arrayFinal=UtilesArrays.insertarAlPrincipio(array,3);
        assertThat(arrayFinal).hasSize(array.length+1);
        assertThat(arrayFinal[0]).isEqualTo(numero);
        assertThat(arrayFinal).contains(array);
    }
    @Test
    void insertarEnPosicion(){
        int[] array = new int[5];
        int numero = 3;
        int lugar = 2;
        int[] arrayFinal=UtilesArrays.insertarEnPosicion(array,3,lugar);
        assertThat(arrayFinal).hasSize(array.length+1);
        assertThat(arrayFinal[lugar]).isEqualTo(numero);
        assertThat(arrayFinal).contains(array);
    }

    @Test
    void insertarOrdenado(){
        int[] array = {1,2,5,6,7};
        int numero = 3;
        int[] arrayEsperado={1,2,3,5,6,7};
        int[] arrayFinal=UtilesArrays.insertarOrdenado(array,3);
        assertThat(arrayFinal).isEqualTo(arrayEsperado);
    }

    @Test
    void eliminarUltimo(){
        int[] array = {1,2,5,6,7};
        int[] arrayFinal=UtilesArrays.eliminarUltimo(array);
        assertThat(arrayFinal).hasSize(array.length-1);
        assertThat(array).contains(arrayFinal);
        assertThat(array[array.length-2]).isEqualTo(arrayFinal[arrayFinal.length-1]);
    }
    @Test
    void eliminarPrimero(){
        int[] array = {1,2,5,6,7};
        int[] arrayFinal=UtilesArrays.eliminarPrimero(array);
        assertThat(arrayFinal).hasSize(array.length-1);
        assertThat(array).contains(arrayFinal);
        assertThat(array[1]).isEqualTo(arrayFinal[0]);
    }
    @Test
    void eliminarPosicion(){
        int[] array = {1,2,5,6,7};
        int posicion= 1;
        int[] arrayFinal=UtilesArrays.eliminarPosicion(array,posicion);
        assertThat(arrayFinal).hasSize(array.length-1);
        assertThat(array).contains(arrayFinal);
        assertThat(array[array.length-2]).isEqualTo(arrayFinal[arrayFinal.length-1]);
    }

}
