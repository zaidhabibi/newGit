/* 
WHILE Finch is still away
    obstacleLockedDoor
        generate random number
        if number = ALOHOMORA
            move on
        else if number = WLEVIOSA 
            you're wrong
            decrease distance
        else if number = IMMOBULOUS
            you're wrong 
            decrease distance

    obstacleBilliwigs
        generate random number
        if number = IMMOBULOUS
            move on
        else if number = WLEVIOSA 
            you're wrong
            decrease distance
        else if number = ALOHOMORA
            you're wrong 
            decrease distance

    obstaclePumpkin
        generate random number
        if number = WLEVIOSA
            move on
            change distance to -1
        else if number = IMMOBULOUS 
            you're wrong
            decrease distance
        else if number = ALOHOMORA
            you're wrong 
            decrease distance 

If -1 you win
if 0 you lose

*/

import java.util.Scanner;

import java.util.Random;



public class harryPotterGame{
    public static void main(String[] args){
        final int ALOHOMORA = 1;
        final int IMMOBULOUS = 2;
        final int WLEVIOSA = 3;
        final int numObstacles = 3;
        final int MAX = 3;
        final int MIN = 1;

        int minFilchAway = 3;
        
        int numObstaclesLeft = 3;
        int spellUsed = 0;

        //Flag
        boolean isFilchAway = true;

        Scanner keyboard = new Scanner(System.in);
        final Random randomSpell = new Random();

        while (numObstaclesLeft > 0 && minFilchAway > 0){

           
            if (numObstaclesLeft == 3) {

                System.out.println("The door is locked!");

                while (numObstaclesLeft == 3 && minFilchAway >0){
                        
                        System.out.println("Hit enter to choose a spell");
                        keyboard.nextLine();
                        spellUsed = randomSpell.nextInt((MAX - MIN) + 1) + MIN;

                        if (spellUsed == ALOHOMORA){
                            
                            System.out.println("You get to move on.");
                            numObstaclesLeft -= 1;
                        }

                        else if (spellUsed == IMMOBULOUS){
                            minFilchAway -= 1;
                            if (minFilchAway != 0){
                                System.out.println("Wrong!");
                                System.out.println ("Filch distance: " + minFilchAway);
                            }
                            
                        }

                        else if (spellUsed == WLEVIOSA){
                            minFilchAway -= 1;
                                if (minFilchAway != 0){
                                    System.out.println("Wrong!");
                                    System.out.println ("Filch distance: " + minFilchAway);
                                }   
                        }
                        else {
                            System.out.println("Error is here!");
                            System.out.println(spellUsed);
                        }
                }
                
            }

            else if (numObstaclesLeft == 2){
                System.out.println("Fairies be flying everywhere.");
                while (numObstaclesLeft == 2 && minFilchAway > 0){
                    System.out.println("Choose a spell hit enter");
                    keyboard.nextLine();
                    spellUsed = randomSpell.nextInt((MAX - MIN) + 1) + MIN;

                    if (spellUsed == IMMOBULOUS) {
                        
                        System.out.println("You get to move on");
                        numObstaclesLeft -= 1;
                        
                    }
                    
                    else if (spellUsed == ALOHOMORA){
                        minFilchAway -= 1;
                        if (minFilchAway != 0){
                            System.out.println("Wrong!");
                            System.out.println ("Filch distance: " + minFilchAway);
                        }   
                    }

                    else if (spellUsed == WLEVIOSA){
                        minFilchAway -= 1;
                        if (minFilchAway != 0){
                            System.out.println("Wrong!");
                            System.out.println ("Filch distance: " + minFilchAway);
                        }   
                    }
                }

                
            }

            else if (numObstaclesLeft == 1){
                System.out.println("There be a FAT pumpkin!");
                
                while (numObstaclesLeft == 1 && minFilchAway > 0){
                    System.out.println("Enter a spell: ");
                    keyboard.nextLine();
                    spellUsed = randomSpell.nextInt((MAX - MIN) + 1) + MIN;

                    if (spellUsed == WLEVIOSA){
                        System.out.println("You got it.");
                        numObstaclesLeft -= 1;
                    }

                    else if (spellUsed == IMMOBULOUS){
                        minFilchAway -= 1; 
                        if (minFilchAway != 0){
                            System.out.println("Wrong!");
                            System.out.println ("Filch distance: " + minFilchAway);
                        }   
                    }

                    else if (spellUsed == ALOHOMORA){
                        System.out.println("Wrong idiot.");
                        minFilchAway -= 1; 
                        System.out.println ("Filch distance: " + minFilchAway);
                    }
                }
                
            }
        }

        if (minFilchAway == 0 && numObstaclesLeft > 0){
            System.out.println("You Lost!");
        }
        else if (numObstaclesLeft == 0 && minFilchAway > 0){
            System.out.println("You win!");
        }

    }
}