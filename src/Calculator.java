import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator<mathOperator> {
    private double _result = 0.0;
    private double _resultTwo = 0.0;
    private char mathOperator;

    private JPanel MainPanel;
    private JTextField Result;
    private JButton Finalize;
    private JButton MultiplyOperation;
    private JButton ButtonNTwo;
    private JButton ButtonNThree;
    private JButton ButtonNFive;
    private JButton ButtonNEight;
    private JButton ButtonNZero;
    private JButton PlusOperation;
    private JButton ButtonNSix;
    private JButton ButtonNNine;
    private JButton ButtonComma;
    private JButton MinusOperation;
    private JButton DevideOperation;
    private JButton ButtonNOne;
    private JButton ButtonNFour;
    private JButton ButtonNSeven;
    private JButton ButtonClear;
    private JButton CosOperation;
    private JButton SinOperation;

    private void getOperator(String buttonText){
        mathOperator = buttonText.charAt(0);
        _result = _result + Double.parseDouble(Result.getText());
        Result.setText("");
    }

    public Calculator() {
        ButtonNOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNOne.getText());
            }
        });

        ButtonNTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNTwo.getText());
            }
        });

        ButtonNThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNThree.getText());
            }
        });

        ButtonNFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNFour.getText());
            }
        });

        ButtonNFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNFive.getText());
            }
        });

        ButtonNSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNSix.getText());
            }
        });

        ButtonNSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNSeven.getText());
            }
        });

        ButtonNEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNEight.getText());
            }
        });

        ButtonNNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNNine.getText());
            }
        });

        ButtonNZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ButtonNOne.getText());
            }
        });

        MinusOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = MinusOperation.getText();
                getOperator(buttonText);
            }
        });

        MultiplyOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = MultiplyOperation.getText();
                getOperator(buttonText);
            }
        });

        DevideOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _result = _result + Double.parseDouble(Result.getText());
                Result.setText("");
            }
        });

        ButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _resultTwo = 0;
                Result.setText("");
            }
        });

        Finalize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (mathOperator) {
                    case '+' -> _resultTwo = _result + Double.parseDouble(Result.getText());
                    case '-' -> _resultTwo = _result - Double.parseDouble(Result.getText());
                    case '*' -> _resultTwo = _result * Double.parseDouble(Result.getText());
                    case '/' -> _resultTwo = _result / Double.parseDouble(Result.getText());
                }

                Result.setText(Double.toString(_resultTwo));
                _result = 0;
            }
        });

        CosOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _result = 0;
                _resultTwo = 0;

                Result.setText(Double.toString(Math.cos(Double.parseDouble(Result.getText()))));
            }
        });

        SinOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Double.toString(Math.sin(Double.parseDouble(Result.getText()))));
            }
        });

        PlusOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = PlusOperation.getText();
                getOperator(buttonText);
            }
        });
        ButtonComma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Result.getText().equals("")) {
                    Result.setText("0");
                }
                else if (Result.getText().contains(".")){
                    ButtonComma.setEnabled(false);
                } else {
                    Result.setText(Result.getText() + ButtonComma.getText());
                }
                ButtonComma.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
