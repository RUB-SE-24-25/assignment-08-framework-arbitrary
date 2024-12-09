package structra.assignment.task.impl;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

import structra.assignment.framework.llm.KeyProvider;
import structra.assignment.framework.llm.MachineLearningModel;
import structra.assignment.framework.llm.gen.questions.OpenQuestionTarget;
import structra.assignment.framework.llm.gen.questions.RandomTargetProvider;
import structra.assignment.framework.llm.gen.questions.TargetProvider;
import structra.assignment.framework.llm.model.Mimic;
import structra.assignment.framework.provide.ModelQuestionProvider;
import structra.assignment.framework.provide.QuestionProvider;

public class QuestionViewer {
    //classes we may need
    KeyProvider keyProvider = new KeyCreation();
    MachineLearningModel mimic = new Mimic(keyProvider);
    TargetProvider provider = new RandomTargetProvider(new OpenQuestionTarget(Mimic.MULTIPLE_CHOICE));
    QuestionProvider questionProvider = new ModelQuestionProvider(mimic, provider, new ArrayList<>());


    //very basic GUI to begin with, can be adjusted later
    public static void createAndShowGUI() {

        //very basic GUI to begin with, can be adjusted later
        // Create JFrame
        JFrame frame = new JFrame("Question Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create JLabel
        JLabel questionLabel = new JLabel("Press 'Next Question' to start!", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(questionLabel, BorderLayout.CENTER);

        // Create JButton
        JButton nextButton = new JButton("Next Question");
        nextButton.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(nextButton, BorderLayout.SOUTH);

        //make it visible
        frame.setVisible(true);

        //TODO Next Question Button: A button that, when pressed, retrieves and displays the next question using ModelQuestionProvider.next()
        //TODO Ensure the GUI remains responsive while tasks are being processed (Properly use CompletableFuture)
        //TODO Handling Different Question Types: Display the question properly formatted in non JSON form

    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(QuestionViewer::createAndShowGUI);
    }

}

