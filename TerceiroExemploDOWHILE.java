public class TerceiroExemploDOWHILE
{
    public static void main(String args[])
    {
        // saldo inicial
        double saldo = 600.00;

        // variável para controlar nova operação
        char opcao;

        do
        {
            // valor da retirada
            double retirada = Teclado.leDouble("Informe um valor para retirada: ");

            // verifica saldo
            while(retirada > saldo)
            {
                System.out.println("Saldo indisponível para este valor de retirada.");
                retirada = Teclado.leDouble("Informe um novo valor para retirada: ");
            }

            // atualiza saldo
            saldo = saldo - retirada;

            // mostra saldo
            System.out.println("Seu novo saldo é: " + saldo);

            // pergunta se deseja continuar
            opcao = Teclado.leChar("Deseja fazer uma nova operação (S/N): ");

        }
        while(Character.toLowerCase(opcao) == 's');
    }
}