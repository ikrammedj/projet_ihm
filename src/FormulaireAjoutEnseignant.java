package ihm;

import javax.swing.*;
import java.awt.*;

public class FormulaireAjoutEnseignant  extends JFrame{

		public void ajoutE() {
        // Création de la fenêtre
 
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création d'un panneau pour le formulaire
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // GridLayout : 4 lignes, 2 colonnes

        // Labels et champs de texte pour les détails de l'enseignant
        JLabel lblNom = new JLabel("Nom:");
        JTextField txtNom = new JTextField(20);

        JLabel lblPrenom = new JLabel("Prénom:");
        JTextField txtPrenom = new JTextField(20);

        JLabel lblSpecialite = new JLabel("Spécialité:");
        JTextField txtSpecialite = new JTextField(20);

        // Bouton d'ajout de l'enseignant
        JButton btnAjouter = new JButton("Ajouter l'Enseignant");

        // Ajout des composants au panneau
        panel.add(lblNom);
        panel.add(txtNom);
        panel.add(lblPrenom);
        panel.add(txtPrenom);
        panel.add(lblSpecialite);
        panel.add(txtSpecialite);
        panel.add(new JLabel()); // Espace vide
        panel.add(btnAjouter);

        // Ajout du panneau à la fenêtre
        this.add(panel);
        this.setVisible(true);
    }
    
 
}
