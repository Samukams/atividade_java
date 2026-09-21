public class PrimeiroExemploWHILE
{
    public static void main(String args[])
    {
        // saldo inicial da conta
        double saldo = 600.00;

        // valor solicitado para retirada
        double retirada =
            Teclado.leDouble("Informe um valor para retirada: ");

        // enquanto o valor for maior que o saldo
        while(retirada > saldo)
        {
            System.out.println(
                "Saldo indisponivel para este valor de retirada."
            );

            retirada = Teclado.leDouble(
                "Informe um novo valor para retirada: "
            );
        }

        // realiza o saque
        saldo = saldo - retirada;

        // mostra o saldo restante
        System.out.println("Seu novo saldo eh: " + saldo);
    }
}

/*
Primeiro Exemplo utilizando WHILE

Simula um saque em caixa eletrônico.

Enquanto o valor solicitado for maior que o saldo,
o sistema continua solicitando um novo valor.

Quando o valor for válido,
o saque é realizado.
*/