import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FinancialAccountingSystem financialAccountingSystem = new FinancialAccountingSystem();

        Scanner scanner = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1 ghnjgfh");
        System.out.println("2g fdfg");
        System.out.println("3 gh dghdfg");
        System.out.println("4 fgdfgdfg");
        System.out.println("выход");
        System.out.println("Выберите пункт");
        int choise = scanner.nextInt();

        switch (choise) {
            case 1:
                System.out.println("gryhdesoekfiju");
                // ваши действия и создаем кейсы сколько там надо будет
                break;

        }
        scanner.close();

        Wallet wallet1 = new Wallet("кошелек первый", 1000.0);
        Wallet wallet2 = new Wallet("кошелек 2", 10600.0);
        Wallet wallet3 = new Wallet("кошелек 3", 8000.0);

        financialAccountingSystem.AddList(wallet1);
        financialAccountingSystem.AddList(wallet2);
        financialAccountingSystem.AddList(wallet3);


        CreditCard creditCard1 = new CreditCard("visa", 643900.00);
        CreditCard creditCard2 = new CreditCard("mir", 120000.00);
        CreditCard creditCard3 = new CreditCard("mastercard", 700000.00);

        financialAccountingSystem.AddList1(creditCard1);
        financialAccountingSystem.AddList1(creditCard2);
        financialAccountingSystem.AddList1(creditCard3);

        Expense expense = new Expense(" Затрата 1", 2000.0);
        Expense expense2 = new Expense(" Затрата 2", 8000.0);
        Expense expense3 = new Expense(" Затрата 3", 12000.0);

        financialAccountingSystem.Exp(expense);
        financialAccountingSystem.Exp(expense2);
        financialAccountingSystem.Exp(expense3);

        financialAccountingSystem.ShowListWallet();

        PotentialExpense potentialExpense = new PotentialExpense("Потенциальная затрата1", 5600);
        PotentialExpense potentialExpense2 = new PotentialExpense("Потенциальная затрата2", 10000);

        financialAccountingSystem.PE(potentialExpense);
        financialAccountingSystem.PE(potentialExpense2);


        PotentialInCome potentialInCome = new PotentialInCome("Потенциальные доходы 1", 20000);
        PotentialInCome potentialInCome2 = new PotentialInCome("Потенциальные доходы 2", 2000);

        financialAccountingSystem.Come(potentialInCome);
        financialAccountingSystem.Come(potentialInCome2);

        potentialInCome.displayPotentialInCome();
        potentialInCome2.displayPotentialInCome();


        potentialExpense.displayPotentialExpense();
        potentialExpense2.displayPotentialExpense();

        expense.displayExpense();
        expense2.displayExpense();
        expense3.displayExpense();


        wallet1.displayWallet();
        wallet2.displayWallet();
        wallet3.displayWallet();

        creditCard1.displayCreditCard();
        creditCard2.displayCreditCard();
        creditCard3.displayCreditCard();





    }
}

// это класс для кошелька
class Wallet {
    private String name;
    private double amount;

    public Wallet(String name, double amount) {
        this.name = name;
        this.amount = amount;

    }

    public double getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }


    public void displayWallet() {
        System.out.println("Название кошелька: " + name);
        System.out.println("Сумма: " + amount);
        System.out.println("**************************");
        // добавить информацию о кошельке
    }
}
  //это класс для кредитной карты

    class CreditCard {
        private String name;
        private double amount;

        public CreditCard(String name, double amount) {
            this.name = name;
            this.amount = amount;

        }

        public double getAmount() {
            return this.amount;
        }

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void displayCreditCard() {
            System.out.println("Название кредитной карты : " + name);
            System.out.println("Сумма на карте: " + amount);
            System.out.println("**************************");
            // добавить информацию о кредитке
        }


    }
class Expense{
    private String name;
    private double amount;

    public Expense(String name, double amount) {
        this.name = name;
        this.amount = amount;

    }

    public double getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayExpense() {
        System.out.println("Название  расходов : " + name);
        System.out.println("Сумма  расходов: " + amount);
        System.out.println("**************************");
        // добавить информацию о расходах в виде списка
    }

}
    class PotentialExpense{
        private String name;
        private double amount;

        public PotentialExpense(String name, double amount) {
            this.name = name;
            this.amount = amount;

        }

        public double getAmount() {
            return this.amount;
        }

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void displayPotentialExpense() {
            System.out.println("Название потенциальных расходов : " + name);
            System.out.println("Сумма потенциальных расходов: " + amount);
            System.out.println("**************************");
            // добавить информацию о расходах в виде списка
        }

    }
class PotentialInCome{
    private String name;
    private double amount;

    public PotentialInCome(String name, double amount) {
        this.name = name;
        this.amount = amount;

    }

    public double getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayPotentialInCome() {
        System.out.println("Название потенциальных доходов : " + name);
        System.out.println("Сумма потенциальных доходов: " + amount);
        System.out.println("**************************");
        // добавить информацию о расходах в виде списка
    }
}
 class FinancialAccountingSystem {
     private List<Wallet> wallets;
     private List<CreditCard> creditCards;
     private List<Expense> expenses;
     private List<PotentialExpense> potentialExpenses;
     private List<PotentialInCome> potentialInComes;

     public FinancialAccountingSystem() {
         wallets = new ArrayList<>();
         creditCards = new ArrayList<>();
         expenses = new ArrayList<>();
         potentialExpenses = new ArrayList<>();
         potentialInComes = new ArrayList<>();

     }



     public double sumAllWalletandCreditcard() {
         double sum1 = 0;
         for (int i = 0; i < wallets.size(); i++) {
             sum1 += wallets.get(i).getAmount();
         }
         double sum2 = 0;
         for (int i = 0; i < creditCards.size(); i++) {
             sum2 += creditCards.get(i).getAmount();
         }
         return sum1 + sum2;
     }

     public double sumAllWallet() {
         double sum = 0;
         for (int i = 0; i < wallets.size(); i++) {
             sum += wallets.get(i).getAmount();
         }
         return sum;
     }

     public double SumCreditCards() {
         double sum = 0;
         for (int i = 0; i < creditCards.size(); i++) {
             sum += creditCards.get(i).getAmount();
         }
         return sum;
     }

     public double SumExpenses() {
         double sum = 0;
         for (int i = 0; i < expenses.size(); i++) {
             sum += expenses.get(i).getAmount();
         }
         return sum;
     }

     public double SumPotentialExpenses() {
         double sum = 0;
         for (int i = 0; i < potentialExpenses.size(); i++) {
             sum += potentialExpenses.get(i).getAmount();
         }
         return sum;
     }

     public double SumPotentialInComes() {
         double sum = 0;
         for (int i = 0; i < potentialInComes.size(); i++) {
             sum += potentialInComes.get(i).getAmount();
         }
         return sum;
     }

     public void EditWallet(String name, double amount) {
         for (int i = 0; i < wallets.size(); i++) {
             if (wallets.get(i).getName().equals(name)) {
                 wallets.get(i).setAmount(amount);

             }
         }
     }

     public void EditCreditCard(String name, double amount) {
         for (int i = 0; i < creditCards.size(); i++) {
             if (creditCards.get(i).getName().equals(name)) {
                 creditCards.get(i).setAmount(amount);

             }
         }
     }

     public void ShowListWallet() {
         for (int i = 0; i < wallets.size(); i++) {
             wallets.get(i).displayWallet();
         }
     }

     public void setCreditCards() {
         for (int i = 0; i < creditCards.size(); i++) {
             creditCards.get(i).displayCreditCard();
         }
     }

     public void setExpenses() {
         for (int i = 0; i < expenses.size(); i++) {
             expenses.get(i).displayExpense();
         }
     }

     public void setPotentialExpenses(List<PotentialExpense> potentialExpense) {
         for (int i = 0; i < potentialExpense.size(); i++) {
             potentialExpense.get(i).displayPotentialExpense();
         }
     }

     public void setPotentialInComes(List<PotentialInCome> potentialInComes) {
         for (int i = 0; i < potentialInComes.size(); i++) {
             potentialInComes.get(i).displayPotentialInCome();
         }
     }

     public void AddList(Wallet wallets) {
         this.wallets.add(wallets);
     }

     public void AddList1(CreditCard creditCards) {
         this.creditCards.add(creditCards);
     }

     public void PE(PotentialExpense potentialExpense) {
         this.potentialExpenses.add(potentialExpense);
     }

     public void Come(PotentialInCome potentialInCome) {
         this.potentialInComes.add(potentialInCome);
     }

     public void Exp(Expense expense) {
         this.expenses.add(expense);
     }
 }





