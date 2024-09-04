package org.example.leetCode.arrayAndString;

import java.util.Arrays;

public class MergeSortedArray02 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < nums1.length; i++) {
            if (i >= m) {
                nums1[i] = 0;
            }
        }


        int[] mergedSum = new int[m + n];

        System.arraycopy(nums1, 0, mergedSum, 0, m);
        System.arraycopy(nums2, 0, mergedSum, m, n);

        Arrays.sort(mergedSum);

        for (int i = 0; i < mergedSum.length; i++) {
            nums1[i] = mergedSum[i];
        }


        /*
        Solução alternativa:
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;  // Índice do último elemento de nums1 válido
            int j = n - 1;  // Índice do último elemento de nums2
            int k = m + n - 1;  // Índice do último espaço disponível em nums1

            // Mescla os arrays de trás para frente
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;
            }

            // Se houver elementos restantes em nums2, copie-os
            while (j >= 0) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }

            // Se restarem elementos em nums1, eles já estão no lugar, então não é preciso fazer nada.
            }

            Explicação:
            Por que essa solução é eficiente?
            Essa abordagem aproveita o fato de que os arrays nums1 e nums2 já estão ordenados. Em vez de tentar ordená-los novamente após a mesclagem (como na sua solução inicial), esta abordagem mescla os dois arrays de forma eficiente, evitando operações desnecessárias de ordenação e cópia.

            Comparação com a Solução O((M + N) log(M + N))
            Velocidade: A solução O(M + N) é mais rápida porque evita a ordenação desnecessária, essencialmente realizando uma mesclagem linear.
            Espaço: Ambas as soluções têm uma complexidade de espaço eficiente, mas a solução O(M + N) evita a criação de arrays adicionais.
            Essa é a solução mais eficiente para o problema, dado que os arrays de entrada já estão ordenados.
         */

    }
}
