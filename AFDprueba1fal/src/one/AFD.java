package one;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AFD {
    private Set<Integer> states;
    private Set<Character> alphabet;
    private Set<Integer> finalStates;
    private Map<Integer, Map<Character, Integer>> transitions;
    private int initialState; // Estado inicial

    public AFD(Set<Integer> states, Set<Character> alphabet) {
        this.states = states;
        this.alphabet = alphabet;
        this.transitions = new HashMap<>();
        this.initialState = -1; // Estado inicial no definido
    }

    public void addTransition(int startState, char symbol, int endState) {
        if (!transitions.containsKey(startState)) {
            transitions.put(startState, new HashMap<>());
        }
        transitions.get(startState).put(symbol, endState);
    }

    public void setFinalStates(Set<Integer> finalStates) {
        this.finalStates = finalStates;
    }

    public void setInitialState(int initialState) {
        this.initialState = initialState;
    }

    public boolean isDeterministic() {
        for (Map<Character, Integer> map : transitions.values()) {
            if (map.size() != alphabet.size()) {
                return false;
            }
        }
        return true;
    }

    public void drawDFA() {
        JFrame frame = new JFrame("DFA Diagram");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Configuración del diseño
                int radius = 40;
                int spacing = 100; // Espacio entre los estados
                int numStates = states.size();
                int startX = 50;
                int startY = 50;

                int rows = (int) Math.ceil(Math.sqrt(numStates));
                int cols = (int) Math.ceil((double) numStates / rows);

                Map<Integer, int[]> statePositions = new HashMap<>();
                int xPos = startX;
                int yPos = startY;

                for (int state : states) {
                    if (xPos + 2 * radius > getWidth()) {
                        xPos = startX;
                        yPos += 2 * radius + spacing;
                    }
                    statePositions.put(state, new int[]{xPos + radius, yPos + radius});

                    // Dibujar el círculo del estado
                    g2d.setColor(Color.BLACK);
                    g2d.drawOval(xPos, yPos, 2 * radius, 2 * radius);
                    g2d.drawString("q" + state, xPos + radius - 10, yPos + radius + 5);

                    // Si es estado final, dibujar un segundo círculo
                    if (finalStates.contains(state)) {
                        g2d.drawOval(xPos + 4, yPos + 4, 2 * (radius - 4), 2 * (radius - 4));
                    }

                    xPos += 2 * radius + spacing;
                }

                // Dibujar flecha al estado inicial
                if (initialState != -1) {
                    int[] initialPos = statePositions.get(initialState);
                    g2d.setColor(Color.GREEN); // Color para la flecha de estado inicial
                    g2d.setStroke(new BasicStroke(2));
                    g2d.drawLine(startX - 30, startY + radius, initialPos[0] - radius, initialPos[1] - radius);
                    g2d.setColor(Color.GREEN);
                    int arrowSize = 10;
                    double angleRad = Math.atan2(initialPos[1] - (startY + radius), initialPos[0] - (startX - 30));
                    int arrowX = initialPos[0] - (int) (arrowSize * Math.cos(angleRad));
                    int arrowY = initialPos[1] - (int) (arrowSize * Math.sin(angleRad));
                    g2d.drawLine(initialPos[0] - radius, initialPos[1] - radius, arrowX - (int) (arrowSize * Math.sin(angleRad)), arrowY + (int) (arrowSize * Math.cos(angleRad)));
                    g2d.drawLine(initialPos[0] - radius, initialPos[1] - radius, arrowX + (int) (arrowSize * Math.sin(angleRad)), arrowY - (int) (arrowSize * Math.cos(angleRad)));
                }

                // Dibujar transiciones
                for (Map.Entry<Integer, Map<Character, Integer>> entry : transitions.entrySet()) {
                    int startState = entry.getKey();
                    Map<Character, Integer> map = entry.getValue();

                    int[] startPos = statePositions.get(startState);
                    Map<Integer, StringBuilder> symbolsOnTransition = new HashMap<>();

                    // Agrupar los símbolos que llevan al mismo estado final
                    for (Map.Entry<Character, Integer> trans : map.entrySet()) {
                        char symbol = trans.getKey();
                        int endState = trans.getValue();
                        if (!symbolsOnTransition.containsKey(endState)) {
                            symbolsOnTransition.put(endState, new StringBuilder());
                        }
                        symbolsOnTransition.get(endState).append(symbol).append(',');
                    }

                    // Dibujar las transiciones
                    for (Map.Entry<Integer, StringBuilder> entrySymbols : symbolsOnTransition.entrySet()) {
                        int endState = entrySymbols.getKey();
                        String symbols = entrySymbols.getValue().toString();
                        if (symbols.endsWith(",")) {
                            symbols = symbols.substring(0, symbols.length() - 1); // Eliminar la última coma
                        }
                        int[] endPos = statePositions.get(endState);

                        // Dibujar la línea de transición
                        g2d.setColor(Color.BLUE);
                        g2d.setStroke(new BasicStroke(2));
                        g2d.drawLine(startPos[0], startPos[1], endPos[0], endPos[1]);

                        // Dibujar la flecha de la transición
                        int arrowSize = 10;
                        double angleRad = Math.atan2(endPos[1] - startPos[1], endPos[0] - startPos[0]);
                        int arrowX = endPos[0] - (int) (arrowSize * Math.cos(angleRad));
                        int arrowY = endPos[1] - (int) (arrowSize * Math.sin(angleRad));
                        g2d.drawLine(endPos[0], endPos[1], arrowX - (int) (arrowSize * Math.sin(angleRad)), arrowY + (int) (arrowSize * Math.cos(angleRad)));
                        g2d.drawLine(endPos[0], endPos[1], arrowX + (int) (arrowSize * Math.sin(angleRad)), arrowY - (int) (arrowSize * Math.cos(angleRad)));

                        // Cambiar el color y ajustar la posición del símbolo en la transición
                        g2d.setColor(Color.RED); // Ajusta el color aquí
                        // Dibujar todos los símbolos en la misma línea si va al mismo estado
                        g2d.drawString(symbols, (startPos[0] + endPos[0]) / 2, (startPos[1] + endPos[1]) / 2 - 10); // Eleva el símbolo
                    }
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
    