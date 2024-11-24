import java.util.Scanner;

class Guesser{
    int GuesserNum;
    public int GuesserNumb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser please guess your a no.");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}
class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}

class Umpire{
      int Guessernum;
      int Playernum1;
      int Playernum2;
      int Playernum3;

      public void CollectNumFromGuesser(){
        Guesser Gu = new Guesser();
        Guessernum = Gu.GuesserNumb();
      }

      public void CollectNumFromPlayer(){
        System.out.println("Player1 Guess your no.");
        Player Play1 = new Player();
        Playernum1 = Play1.PlayerNumb();

        System.out.println("Player2 Guess your no.");
        Player Play2 = new Player();
        Playernum2 = Play2.PlayerNumb();

        System.out.println("Player3 Guess your no.");
        Player Play3 = new Player();
        Playernum3 = Play3.PlayerNumb();
      }

      public void Compare(){
          if(Guessernum == Playernum1){
            if(Guessernum == Playernum2 && Guessernum == Playernum3){
                System.out.println("All players won");
            }

            else if(Guessernum == Playernum2){
                System.out.println("Player 1 and Player 2 won the game");
            }

            else if(Guessernum == Playernum3){
                System.out.println("Player 1 and Player 3 won the game");
            }

            else{
                System.out.println("Only Player 1 won the game");
            }
        }

        else if(Guessernum == Playernum2){
            if(Guessernum == Playernum3){
                System.out.println("Player 2 and Player 3 won the game");
            }
            else{
                System.out.println("Only Player 2 won the game");
            }
        }

        else if(Guessernum == Playernum3){
            System.out.println("Only Player 3 won the game");
        }

        else{
            System.out.println("All players lost");
        }

      }
}


public class GuesserGameProject {
    public static void main(String[] args) {
        System.out.println("-----Game Started----");
        Umpire Um = new Umpire();
        Um.CollectNumFromGuesser();
        Um.CollectNumFromPlayer();
        Um.Compare();
        System.out.println("-----Game Over----");
    }
}
