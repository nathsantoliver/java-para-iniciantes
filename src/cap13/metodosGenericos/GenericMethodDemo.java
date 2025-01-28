package cap13.metodosGenericos;

// Demonstra um metodo genérico simples.
class GenericMethodDemo {

    // Determina se o conteúdo de dois arrays é igual.
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        // Se o tamanho dos arrays for diferente, os arrays também serão.
        if(x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if(!x[i].equals(y[i])) return false;    // os arrays são diferentes.
        }

        return true;    // os conteúdos dos arrays são equivalentes.
    }

    public static void main(String[] args) {

        Integer nums1[] = { 1, 2, 3, 4, 5 };
        Integer nums2[] = { 1, 2, 3, 4, 5 };
        Integer nums3[] = { 1, 2, 3, 4, 5 };
        Integer nums4[] = { 1, 2, 3, 4, 5 };

        if(arraysEqual(nums1, nums1)) System.out.println("nums1 equals nums1");

        if(arraysEqual(nums1, nums2)) System.out.println("nums1 equals nums2");

        if(arraysEqual(nums1, nums3)) System.out.println("nums1 equals nums3");

        if(arraysEqual(nums1, nums4)) System.out.println("nums1 equals nums4");

        // Cria um array de Doubles
        Double dvals[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        // Essa parte não será compilada, porque nums e dvals não são do mesmo tipo.
//        if(arraysEqual(nums1, dvals)) System.out.println("nums1 equals dvals");

    }
}
