import java.util.Scanner;

public class Launcher {

    static void ping() throws PingException{
        System.out.println("Methode Ping");
        throw new PingException();
    }
    static void pong() throws PongException{
        System.out.println("Methode Pong");
        throw new PongException();
    }
    static void pingPong() throws PingPongException{
        System.out.println("Methode Ping Pong");
        throw new PingPongException();
    }
    static void showMenu() throws PingException, PongException, PingPongException {
        System.out.println("1-Ping");
        System.out.println("2-Pong");
        System.out.println("3-PingPong");
        System.out.println("Geben sie Methode ein");
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        switch (zahl){
            case 1:
                ping();
                break;
            case 2:
                pong();
                break;
            case 3:
                pingPong();
                break;
            default:
                System.err.println("Fehler ist aufgetreten");
                break;
        }

        sc.close();
    }

    public static void main(String[] args) {
        try {
            showMenu();
        } catch (PingException e) {
           System.out.println("Ping Exception");
        } catch (PongException e) {
            System.out.println("Pong Exception");
        } catch (PingPongException e) {
            System.out.println("PingPong Exception");
        }

    }
}
