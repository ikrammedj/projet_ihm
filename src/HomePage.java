package ihm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame  {

    public HomePage  () {
    	
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        JButton btnAjoutMemoire = new JButton("Formulaire Ajout Mémoire");
        JButton btnListeMemoires = new JButton("Liste des Mémoires");
        JButton btnAjoutEnseignant = new JButton("Formulaire Ajout Enseignant");
        JButton btnListeEnseignants = new JButton("Liste des Enseignants");

        btnAjoutMemoire.addActionListener(e -> {
            FormulaireAjoutMemoire formulaireAjoutMemoire = new FormulaireAjoutMemoire();
            formulaireAjoutMemoire.ajoutM();
           
        });

        btnListeMemoires.addActionListener(e -> {
            ListeMemoires listeMemoires = new ListeMemoires();
            listeMemoires.listeM();
        });

        btnAjoutEnseignant.addActionListener(e -> {
            FormulaireAjoutEnseignant formulaireAjoutEnseignant = new FormulaireAjoutEnseignant();
            formulaireAjoutEnseignant.ajoutE();
        });

        btnListeEnseignants.addActionListener(e -> {
            ListeEnseignants listeEnseignants = new ListeEnseignants();
            listeEnseignants.listeE();
        });

        panel.add(btnAjoutMemoire);
        panel.add(btnListeMemoires);
        panel.add(btnAjoutEnseignant);
        panel.add(btnListeEnseignants);

        this.add(panel);
        this.setVisible(true);
}
}
  

