package data;

import dao.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    private static final String greenString = "\u001B[32m";
    private static final String resetString = "\u001B[0m";
    
    public static void greenSysout(String _text) {
        System.out.print(greenString + _text + resetString);
    }

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        List<Pessoa> pessoaList = new ArrayList<>();
        
        byte option;
        
        try {
            do {
                System.out.print("Press 1 for carry out a new register or 0 for exit: ");
                option = Byte.parseByte(reader.nextLine());

                if (option == 0) {
                    System.out.println("\nSoftware finish.");
                }
                else if (option == 1) {
                    System.out.print("\nName: ");
                    String name = reader.nextLine();
                    System.out.print("Telephone:");
                    String telephone = reader.nextLine();
                    
                    boolean rgxTelephone = telephone.matches("[0-9]{2}[ ][0-9]{1}[ ][0-9]{4}[-][0-9]{4}");
                    
                    if (rgxTelephone == true) {
                        String ddd = telephone.substring(0, 2);
                        String city = "";
                        
                        if ("11".equals(ddd)) {
                            city = "São Paulo";
                        } 
                        else if ("21".equals(ddd)) {
                            city = "Rio de Janeiro";
                        } 
                        else if ("31".equals(ddd)) {
                            city = "Belo Horizonte";
                        } 
                        else if ("41".equals(ddd)) {
                            city = "Curitiba";
                        } 
                        else if ("51".equals(ddd)) {
                            city = "Porto Alegre";
                        } 
                        else if ("71".equals(ddd)) {
                            city = "Salvador";
                        } 
                        else if ("81".equals(ddd)) {
                            city = "Recife";
                        } 
                        else if ("85".equals(ddd)) {
                            city = "Fortaleza";
                        }
                        else {
                            city = "Unknown";
                        }
                        
                        Pessoa pessoa = new Pessoa(name, telephone, city);
                    
                        boolean verification = false;
                        for (Pessoa p : pessoaList) {
                            if (p.getName().equals(name) && p.getTelephone().equals(telephone)) {
                                verification = true;
                                break;
                            }
                        }

                        if (verification) {
                            System.err.println("[It was not possible to register because the user already exists]\n");
                        }
                        else {
                            pessoaList.add(pessoa);
                            greenSysout("[Register successfully]\n\n");
                        }
                    }
                    else {
                        System.err.println("[Insert the phone as follows: 99 9 9999-9999]\n");
                    }
                }
                else {
                    System.err.println("\nSelect a valid option.\n");
                }
            }
            while (option != 0);
        }
        catch (NumberFormatException e) {
            System.err.println("\nNon-numeric value entered.\n");
        }
        
        Collections.sort(pessoaList);
        System.out.println("\nPhonebook (name, telephone):");
        for (Pessoa p : pessoaList) {
            System.out.println("\t| "+ p.getName()+ " | "+ p.getTelephone()+ " | "+ p.getCity()+ " |");
        }
    
    } // close static main
} // close main
