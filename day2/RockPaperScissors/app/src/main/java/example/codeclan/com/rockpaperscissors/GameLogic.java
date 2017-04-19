package example.codeclan.com.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on AD 2017/4/19.
 */

public class GameLogic {
    
    private RPS choice;
    private RPS computerChoice;



    public GameLogic(RPS choice){
        this.choice = choice;
        this.computerChoice = RPS.UNASSIGNED;
    }


    public void setComputerChoice(RPS newChoice){
        this.computerChoice = newChoice;
    }


    public RPS getChoice() {
        return choice;
    }

    public String getWinner(RPS computerChoice) { //this accepts the enum
        if (this.choice == RPS.UNASSIGNED || computerChoice == RPS.UNASSIGNED){
            return "Error";
        }
        else if (this.choice == RPS.ROCK) {
            if (computerChoice == RPS.PAPER) {
                return "Computer Wins!";
            }
            else if(computerChoice == RPS.SCISSORS) {
                return "Player Wins!";
            }
        }

        else if(this.choice == RPS.SCISSORS) {
                if (computerChoice == RPS.PAPER) {
                    return "Player Wins!";
                }
                else if(computerChoice == RPS.ROCK) {
                    return "Computer Wins!";
                }

        }
        else if(this.choice == RPS.PAPER) {
            if (computerChoice == RPS.ROCK) {
                return "Player Wins!";
            }
            else if (computerChoice == RPS.SCISSORS){
                return "Computer Wins!";
            }
        }

        return "Draw";

    }


    public RPS getComputerChoice() {
        return computerChoice;
    }

    public void randomComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);

        switch (choice){
            case 0:
                this.computerChoice = RPS.ROCK;
                break;
            case 1:
                this.computerChoice = RPS.PAPER;
                break;
            case 2:
                this.computerChoice = RPS.SCISSORS;
                break;

            default:
                this.computerChoice = RPS.UNASSIGNED;
                break;

        }

    }
}
