package cap02.variaveis;

/*
	Este programa tenta declarar uma variável em um escopo
	interno com o mesmo nome de uma definida em um escopo externo

	*** NÃO COMPILAR ***
*/

public class NestVar {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count+=1) {
            System.out.println("This is count: " + count);

            //int count;   // inválido!!! (Não pode declarar count novamente pois ele já foi declarado)
            for (count = 0; count < 2; count++) {
                System.out.println("This program is in error!");
            }
        }
    }
}
