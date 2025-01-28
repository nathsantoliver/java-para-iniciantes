package cap02.operadores;

// Demonstra os operadores de curto-circuuito
public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }

        d = 0;  // configura d com zero

        // Já que d é igual a zer, o segundo operando não é avaliado
        if (d != 0 && (n % d) == 0) {       // O operador de curto-circuito impede uma divisão por zero
            System.out.println(d + " is a factor of " + n);
        }

		/*
			Tente a mesma coisa sem o operador de curto-circuito.
			Isso causará um erro de divisão por zero.
		*/
        if (d != 0 & (n % d) == 0) {        // agora as duas expressões são avaliadas
            System.out.println(d + " is a factor of " + n);
        }
    }
}
