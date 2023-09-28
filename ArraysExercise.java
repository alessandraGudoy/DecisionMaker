public class ArraysExercise{
    public static void main(String[] args){
        String[] customers = {"Alice", "Bob", "Carol"};
        double[] balances = {153.75, 104.60, 209.18};
        String transaction = "Alice,Bob,50";

        for(int i=0; i<customers.length-1; i++){
            System.out.print(customers[i] + " has $" + balances[i] + ", ");
        }

        System.out.println(customers[customers.length-1] + " has $" + balances[customers.length-1] + ".");

        String giver = transaction.substring(0, transaction.indexOf(","));
        String recipient = transaction.substring(giver.length()+1, giver.length()+1+transaction.substring(transaction.indexOf(",") + 1).indexOf(","));
        String amount = transaction.substring(giver.length()+recipient.length()+2);
        int who = 0;

        if(giver.equals(customers[0]) && Double.parseDouble(amount) > balances[0]){
            who = 0;
            System.out.print(giver + " does not have enough money for the transaction");
        } else if(giver.equals(customers[1]) && Double.parseDouble(amount) > balances[1]){
            who = 1;
            System.out.print(giver + " does not have enough money for the transaction");
        } else if(giver.equals(customers[2]) && Double.parseDouble(amount) > balances[2]){
            who = 2;
            System.out.print(giver + " does not have enough money for the transaction");
        } else{
            System.out.println(giver + " gives " + recipient + " $" + amount);
            balances[who] = balances[who] - Double.parseDouble(amount);
            
            if(recipient.equals(customers[0])){
                balances[0] += Double.parseDouble(amount);
            } else if(recipient.equals(customers[1])){
                balances[1] += Double.parseDouble(amount);
            } else{
                balances[2] += Double.parseDouble(amount);
            }
        }

        for(int i=0; i<customers.length-1; i++){
            System.out.print(customers[i] + " has $" + balances[i] + ", ");
        }

        System.out.println(customers[customers.length-1] + " has $" + balances[customers.length-1] + ".");

    }
}