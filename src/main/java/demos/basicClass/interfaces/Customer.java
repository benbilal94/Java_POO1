package demos.basicClass.interfaces;

import demos.exeption.SoldeInsuffisantException;

public interface Customer {
     double getSolde();
     void retrait(double montant) throws SoldeInsuffisantException;
     void depot(double montant);

}
