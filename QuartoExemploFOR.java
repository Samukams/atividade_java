public class QuartoExemploFOR
{
    public static void main(String args[])
    {
        // valor do empréstimo
        double emprestimo =
            Teclado.leDouble("Informe um valor para o emprestimo: ");

        // quantidade de parcelas
        int parcelas =
            Teclado.leInt("Informe a qtde de parcelas para o emprestimo (1-12): ");

        // valor inicial da parcela
        double valorParcela = emprestimo / parcelas;

        // cálculo das parcelas com acréscimo de 5%
        for(int contador = 1; contador <= parcelas; contador++)
        {
            valorParcela = valorParcela * 1.05;

            System.out.printf(
                "O valor da parcela %d é: %.2f\n",
                contador,
                valorParcela
            );
        }
    }
}