package ihm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListeEnseignants extends JFrame {
	
	public void listeE(){        
		// Création de la fenêtre
      
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création du modèle de données pour la liste des enseignants (exemple avec des données statiques)
        String[] enseignants = {"Enseignant 1", "Enseignant 2", "Enseignant 3", "Enseignant 4"};
        JList<String> listEnseignants = new JList<>(enseignants);

        // Création des boutons de mise à jour et de suppression
        JButton btnMaj = new JButton("Mise à Jour");
        JButton btnSupprimer = new JButton("Supprimer");

        // Ajout d'un écouteur d'événement pour la sélection d'un enseignant dans la liste
        listEnseignants.addListSelectionListener(e -> {
            // Activer les boutons de mise à jour et de suppression lorsqu'un élément est sélectionné
            btnMaj.setEnabled(true);
            btnSupprimer.setEnabled(true);
        });

        // Désactiver les boutons de mise à jour et de suppression initialement
        btnMaj.setEnabled(false);
        btnSupprimer.setEnabled(false);

        // Gestion des actions des boutons de mise à jour et de suppression
        btnMaj.addActionListener(e -> {
            // Code pour la mise à jour de l'enseignant sélectionné
            // Remplacez ce commentaire par le code approprié pour la mise à jour
            System.out.println("Mise à jour de l'enseignant sélectionné");
        });

        btnSupprimer.addActionListener(e -> {
            // Code pour la suppression de l'enseignant sélectionné
            // Remplacez ce commentaire par le code approprié pour la suppression
            System.out.println("Suppression de l'enseignant sélectionné");
        });

        // Création d'un panneau pour organiser les composants
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(listEnseignants), BorderLayout.CENTER);

        // Panneau pour les boutons de mise à jour et de suppression
        JPanel panelBoutons = new JPanel();
        panelBoutons.add(btnMaj);
        panelBoutons.add(btnSupprimer);

        // Ajout des panneaux à la fenêtre
        this.add(panel, BorderLayout.CENTER);
        this.add(panelBoutons, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
