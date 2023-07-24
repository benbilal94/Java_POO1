package demos.exeption;


// RuntimeException -> On ne peut pas y faire grand chose (la methode qui la throw ne dpit rien faire de speciale)
// Exception -> On peut et on doit la gerer ( la méthode qui la throw doit le specifier avec le mot clef throws)
public class SoldeInsuffisantException extends IllegalArgumentException{


    public SoldeInsuffisantException(){
        super("Solde insuffisant");
    }

    public SoldeInsuffisantException(String message){
        super(message);
    }
}
