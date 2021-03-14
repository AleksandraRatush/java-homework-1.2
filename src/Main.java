public class Main {

    //Предполагается что у клиета есть овердрафт.
    // Если сумма перевода отрицательная деньги снимаются со счета
    public static void main (String ... args) {

        int accountBalance = -1_000;
        int recipeSum = -2_147_483_647;

        accountBalance = accountBalance + recipeSum;
        System.out.println(accountBalance);

    }
}
