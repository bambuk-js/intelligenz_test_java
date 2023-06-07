package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // add all questions here
        ArrayList<Intelligence> intelligenceList = new ArrayList<Intelligence>() {{
            add(new Intelligence("Spatial Intelligence", new ArrayList<Question>() {{
                add(new Question(
                        "Welche Aktivität macht dir am meisten Spass?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Malen",
                                    2
                            ));
                            add(new Answer(
                                    "Zeichnen",
                                    2
                            ));
                            add(new Answer(
                                    "Basteln",
                                    1
                            ));
                            add(new Answer(
                                    "Keine dieser Aktivitäten",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Wie gut bist du darin, Puzzles oder räumliche Probleme zu lösen?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Sehr gut",
                                    2
                            ));
                            add(new Answer(
                                    "Gut",
                                    2
                            ));
                            add(new Answer(
                                    "Durchschnittlich",
                                    1
                            ));
                            add(new Answer(
                                    "Nicht besonders gut",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Kannst du Muster oder Formen leicht erkennen und interpretieren?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Magst du es, visuelle Informationen zu verwenden, um dich an Dinge zu erinnern?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
            }}));
            add(new Intelligence("Bodily-Kinesthetic Intelligence", new ArrayList<Question>() {{
                add(new Question(
                        "Welche Sportarten oder körperlichen Aktivitäten interessieren dich besonders?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Fußball",
                                    2
                            ));
                            add(new Answer(
                                    "Basketball",
                                    2
                            ));
                            add(new Answer(
                                    "Tanz",
                                    2
                            ));
                            add(new Answer(
                                    "Kampfsport",
                                    2
                            ));
                            add(new Answer(
                                    "Keine dieser Aktivitäten",
                                    0
                            ));
                        }}
                ));
            }}));
            add(new Intelligence("Musical Intelligence", new ArrayList<Question>() {{
                add(new Question(
                        "Hast du eine besondere Vorliebe für Musik und einen Sinn für Rhythmus?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Denkst du oft in Klängen und Melodien?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Hast du ein gutes Verständnis für musikalische Strukturen und Noten?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
            }}));
            add(new Intelligence("Linguistic Intelligence", new ArrayList<Question>() {{
                add(new Question(
                        "Liest und schreibst du gerne?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Bist du gut darin, vor anderen zu sprechen und sie zu überzeugen?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Kannst du komplexe Konzepte und Ideen gut erklären?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
            }}));
            add(new Intelligence("Logical-Mathematical Intelligence", new ArrayList<Question>() {{
                add(new Question(
                        "Bist du ein schneller Problemlöser?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Hast du ein gutes Verständnis für komplexe Berechnungen und logisches Denken?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Fühlst du dich von abstrakten Ideen und Problemen angezogen?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
            }}));
            add(new Intelligence("Interpersonal Intelligence", new ArrayList<Question>() {{
                add(new Question(
                        "Hast du starke emotionale Intelligenz-Fähigkeiten und verstehst andere gut?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Bist du gut darin, gesunde Beziehungen zu schaffen und Konflikte zu lösen?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
            }}));
            add(new Intelligence("Intrapersonal Intelligence", new ArrayList<Question>() {{
                add(new Question(
                        "Bist du dir deiner eigenen Stärken und Schwächen bewusst?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Nimmst du dir Zeit für Selbstreflexion und Selbstverbesserung?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Kannst du deine eigenen Gefühle gut verstehen und Probleme lösen?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
            }}));
            add(new Intelligence("Naturalistic Intelligence", new ArrayList<Question>() {{
                add(new Question(
                        "Hast du ein Interesse an den Naturwissenschaften wie Botanik, Biologie oder Zoologie?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Schätzt du die Natur und genießt Aktivitäten im Freien wie Camping, Gärtnern oder Wandern?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
                add(new Question(
                        "Bist du gut darin, Muster und Beziehungen in der Natur zu erkennen?",
                        new ArrayList<Answer>() {{
                            add(new Answer(
                                    "Ja",
                                    2
                            ));
                            add(new Answer(
                                    "Nein",
                                    0
                            ));
                        }}
                ));
            }}));
        }};

        Scanner sc = new Scanner(System.in);

        // Print the intelligence test questions
        for (Intelligence intelligence : intelligenceList) {
            int questionCount = 1;
            for (Question question : intelligence.getQuestionsList()) {
                System.out.println("Question " + questionCount + ": " + question.getQuestion());
                int answerCount = 1;
                int choosenIndex = -1;
                for (Answer answer : question.getAnswers()) {
                    System.out.println("   Option " + answerCount + ": " + answer.getAnswer());
                    answerCount++;
                }
                while (choosenIndex == -1){
                    System.out.print("Choose option nr: ");
                    int inputNr = sc.nextInt();
                    if(question.getAnswers().size() > inputNr || inputNr < 1){
                        System.out.println("Number is out of scope. Try again.");
                    }
                    choosenIndex = inputNr;
                }
                intelligence.setPoints(
                        intelligence.getPoints() + question.getAnswers().get(choosenIndex -1).getPoints()
                );
                System.out.println();
                questionCount++;
            }
            System.out.println();
        }

        for (Intelligence intelligence : intelligenceList) {
            if(intelligence.getPoints() >= 0 || intelligence.getPoints() <=4){
                System.out.println("Geringe Ausprägung in dem Intelligenztyp "+intelligence.getName());
            }else if(intelligence.getPoints() >= 5 || intelligence.getPoints() <=9){
                System.out.println("Geringe Ausprägung in dem Intelligenztyp "+intelligence.getName());
            }else if(intelligence.getPoints() >= 10 || intelligence.getPoints() <=14){
                System.out.println("Geringe Ausprägung in dem Intelligenztyp "+intelligence.getName());
            }
            System.out.println();
        }
    }
}
