package exercises.Banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) == null){
            return branches.add(new Branch(name));
        }
        return false;
    }

    public boolean addCustomer(String branch, String customer, double amount){
        if(findBranch(branch) != null){
            Customer currCust = null;

            for(Customer c:findBranch(branch).getCustomers()){
                if(c.getName().equals(customer)){
                    currCust = c;
                }
            }

            if(currCust == null){
                findBranch(branch).newCustomer(customer, amount);
                return true;
            }

        }
        return false;
    }

    public boolean addCustomerTransaction(String branch, String customer, double amount){
        if(findBranch(branch) != null){
            Customer currCust = null;

            for(Customer c:findBranch(branch).getCustomers()){
                if(c.getName().equals(customer)){
                    currCust = c;
                }
            }

            if(currCust != null){
                currCust.addTransaction(amount);
                return true;
            }
        }
        return false;
    }

    private Branch findBranch(String branch){
        for(Branch b:branches){
            if(b.getName().equals(branch)){
                return b;
            }
        }
        return null;
    }

    public boolean listCustomers(String name, boolean printTrans){
        Branch b = findBranch(name);
        if(b != null){
            System.out.println("Customer details for branch "+name);
            int count = 1;
            for(Customer c : b.getCustomers()){
                System.out.println("Customer: "+c.getName()+"["+count+"]");
                count++;

                if(printTrans){
                    int transCount = 1;

                    System.out.println("Transactions");
                    for(Double trans:c.getTransactions()){
                        System.out.println("["+transCount+"]  Amount "+trans);
                        transCount++;
                    }
                }
            }
            return true;
        }
        return false;
    }
}