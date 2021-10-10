package exercises.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact c){
        if(findContact(c.getName()) != -1){
            return false;
        }
        myContacts.add(c);
        return true;
    }

    public boolean updateContact(Contact oldC, Contact newC){
        if(!myContacts.contains(oldC)){
            return false;
        }
        myContacts.remove(oldC);
        myContacts.add(newC);
        return true;
    }

    public boolean removeContact(Contact c){
        return myContacts.remove(c);
    }

    private int findContact(Contact c){
        return myContacts.indexOf(c);
    }

    private int findContact(String s){
        for(Contact c:myContacts){
            if(c.getName().equals(s)){
                return myContacts.indexOf(c);
            }
        }
        return -1;
    }

    public Contact queryContact(String s){
        for(Contact c:myContacts){
            if(c.getName().equals(s)){
                return c;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        int count = 1;
        for(Contact c:myContacts){
            System.out.println(count+". "+c.getName()+" -> "+c.getPhoneNumber());
        }
    }
}