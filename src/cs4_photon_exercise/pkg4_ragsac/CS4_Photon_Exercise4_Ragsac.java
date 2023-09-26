/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_photon_exercise.pkg4_ragsac;

/**
 *
 * @author PHOTON
 */
import java.util.Scanner;
public class CS4_Photon_Exercise4_Ragsac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
	Move player = null;
        Move computer = null;
        
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
	
	int roundsToWin = 2;
        boolean ongoing = true;
        
        Scanner sc = new Scanner(System.in);
        
        while(ongoing) {
            int playerScore = 0;
            int computerScore = 0;
            boolean startedGame = false;
            
            while(!startedGame) {
                System.out.printf("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.printf("%n1. Start game");
                System.out.printf("%n2. Change number of rounds");
                System.out.printf("%n3. Exit application%n> ");
                int option = sc.nextInt();

                switch(option) {
                        case 1:
                            startedGame = true;
                            break;
                        case 2:
                            System.out.printf("%nHow many wins are needed to win a match?%n> ");
                            roundsToWin = sc.nextInt();
                            System.out.printf("%nNew setting has been saved!%n%n");
                            break;
                        default:
                            ongoing = false;
                            startedGame = true;
                            System.out.printf("%nThank you for playing!%n");
                            break;
                }
            }

            if(ongoing) {
                System.out.printf("%nThis match will be first to %d wins.", roundsToWin);
                
                while(playerScore < roundsToWin && computerScore < roundsToWin) {

                    int random = (int) Math.floor(Math.random()*3) + 1;
                    switch(random) {
                        case 1:
                            computer = rock;
                            break;
                        case 2:
                            computer = paper;
                            break;
                        case 3:
                            computer = scissors;
                        default:
                            break;
                    }

                    System.out.printf("%nThe computer has selected its move. Select your move:");
                    System.out.printf("%n1. Rock");
                    System.out.printf("%n2. Paper");
                    System.out.printf("%n3. Scissors%n> ");
                    int move = sc.nextInt();

                    switch(move) {
                        case 1:
                            player = rock;
                            break;
                        case 2:
                            player = paper;
                            break;
                        case 3:
                            player = scissors;
                            break;
                        default:
                            break;
                    }

                    switch(Move.compareMoves(player, computer)) {
                        case 0:
                            playerScore += 1;
                            System.out.printf("%nPlayer chose %s. Computer chose %s. Player wins round!", player.getName(), computer.getName());
                            break;
                        case 1:
                            computerScore += 1;
                            System.out.printf("%nPlayer chose %s. Computer chose %s. Computer wins round!", player.getName(), computer.getName());
                            break;
                        default:
                            System.out.printf("%nPlayer chose %s. Computer chose %s. Round is tied!", player.getName(), computer.getName());
                            break;
                    }

                    System.out.printf("%nPlayer: %d - Computer: %d%n", playerScore, computerScore);

                    if(playerScore == roundsToWin) {
                        System.out.printf("%nPlayer wins!%n%n");
                    }
                    if(computerScore == roundsToWin) {
                        System.out.printf("%nComputer wins!%n%n");
                    }
                }
            }
        }
    }
}