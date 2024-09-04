package org.example.leetCode.arrayAndString;

import java.util.Arrays;

public class RemoveElement03 {

    public int removeElement(int[] nums, int val) {
        /*
        Essa questão pede que a mudança na estrutura seja feita in-place.
        Remover uma ocorrência de um array "in-place" em Java significa modificar o próprio array para remover o elemento,
        sem usar uma nova estrutura de dados ou criar uma cópia do array original.
        O objetivo é realizar a operação dentro do array existente, reutilizando o espaço já alocado.
         */

        int size = nums.length;
        int k = 0;
        for (int j = 0; j < size; j++) {
            if (nums[j] != val) {
                nums[k] = nums[j];
                k++;
            }
        }

        System.out.println("K value: " + k);
        return k;
    }
}
