public class SegundoExemploDOWHILE
{
    public static void main(String args[])
    {
        // saldo da conta
        double saldo = 600.00;

        // valor solicitado
        double retirada =
            Teclado.leDouble("Informe um valor para retirada: ");

        do
        {
            System.out.println(
                "Saldo indisponivel para este valor de retirada."
            );

            retirada = Teclado.leDouble(
                "Informe um novo valor para retirada: "
            );

        }while(retirada > saldo);

        saldo = saldo - retirada;

        System.out.println("Seu novo saldo eh: " + saldo);
    }
}
/*
Segundo Exemplo utilizando DO WHILE

O bloco do DO executa primeiro.
A condição é testada somente no final.

Mesmo que o valor esteja correto,
o bloco será executado uma vez.
*/
