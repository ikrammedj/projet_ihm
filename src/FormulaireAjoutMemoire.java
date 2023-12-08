package ihm;

import javax.swing.*;
import java.awt.*;

public class FormulaireAjoutMemoire extends JFrame{

	public void ajoutM() {
      
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création d'un panneau pour le formulaire
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10)); // GridLayout : 6 lignes, 2 colonnes

        // Labels et champs de texte pour les détails du mémoire
        JLabel lblTitre = new JLabel("Titre:");
        JTextField txtTitre = new JTextField(20);

        JLabel lblAuteur = new JLabel("Auteur:");
        JTextField txtAuteur = new JTextField(20);

        JLabel lblAnnee = new JLabel("Année:");
        JTextField txtAnnee = new JTextField(4);

        JLabel lblCote = new JLabel("Cote:");
        JTextField txtCote = new JTextField(10);

        JLabel lblResume = new JLabel("Résumé:");
        JTextArea txtResume = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(txtResume);

        // Bouton d'ajout du mémoire
        JButton btnAjouter = new JButton("Ajouter le Mémoire");

        // Ajout des composants au panneau
        panel.add(lblTitre);
        panel.add(txtTitre);
        panel.add(lblAuteur);
        panel.add(txtAuteur);
        panel.add(lblAnnee);
        panel.add(txtAnnee);
        panel.add(lblCote);
        panel.add(txtCote);
        panel.add(lblResume);
        panel.add(scrollPane);
        panel.add(new JLabel()); // Espace vide
        panel.add(btnAjouter);

        // Ajout du panneau à la fenêtre
        this.add(panel);
        this.setVisible(true);
    }

}
