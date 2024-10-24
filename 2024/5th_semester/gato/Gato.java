// Made by Mónica Gómez (Autumn64)
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class Gato extends JFrame implements ActionListener{
    JLabel titulo, jugador;
    JButton[] botones;
    JButton reiniciar;
    String[] jugadores = {"Turno: J1", "Turno: J2"};
    int turno;
    boolean gano;
    
    public Gato(){
        setLayout(new GridLayout(4, 3, 5, 5));
        turno = 0;
        titulo = new JLabel("Juego de gato",JLabel.CENTER );
        jugador = new JLabel(jugadores[turno],JLabel.CENTER );
        botones = new JButton[9];
        reiniciar = new JButton();
        reiniciar.setEnabled(false);
        reiniciar.setText("Reiniciar");
        add(titulo);
        add(jugador);
        add(reiniciar);
        for (int i = 0; i < 9; i++){
            botones[i] = new JButton();
            add(botones[i]);
            botones[i].addActionListener(this);
        }
        reiniciar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        JButton boton = (JButton) e.getSource();
        if (boton == reiniciar){
            for (int i = 0; i < 9; i++){
                botones[i].setText("");
                botones[i].setEnabled(true);
            }
            this.turno = 0;
            this.jugador.setText(jugadores[turno]);
            reiniciar.setEnabled(false);
            return;
        }
        
        reiniciar.setEnabled(true);
        
        if (this.turno == 0){
            boton.setText("O");
            this.turno = 1;
        } else if (this.turno == 1){
            boton.setText("X");
            this.turno = 0;
        }
        this.jugador.setText(jugadores[turno]);
        boton.setEnabled(false);
        
        for (int i = 0; i < 8; i += 3){
            if (gano) break;
            if (botones[i].getText() == "O" && botones[i + 1].getText() == "O" && botones[i + 2].getText() == "O"){
                this.jugador.setText("Jugador 1 ganó!");
                gano = true;
                break;
            } else if (botones[i].getText() == "X" && botones[i + 1].getText() == "X" && botones[i + 2].getText() == "X"){
                this.jugador.setText("Jugador 2 ganó!");
                gano = true;
                break;
            }
        }
        
        for (int i = 0; i < 3; i++){
            if (gano) break;
            if (botones[i].getText() == "O" && botones[i + 3].getText() == "O" && botones[i + 6].getText() == "O"){
                this.jugador.setText("Jugador 1 ganó!");
                gano = true;
                break;
            }
            if (botones[i].getText() == "X" && botones[i + 3].getText() == "X" && botones[i + 6].getText() == "X"){
                this.jugador.setText("Jugador 2 ganó!");
                gano = true;
                break;
            }
        }
        
        if (botones[0].getText() == "O" && botones[4].getText() == "O" && botones[8].getText() == "O"){
            this.jugador.setText("Jugador 1 ganó!");
            gano = true;
        }
        if (botones[2].getText() == "O" && botones[4].getText() == "O" && botones[6].getText() == "O"){
            this.jugador.setText("Jugador 1 ganó!");
            gano = true;
        }
        
        if (botones[0].getText() == "X" && botones[4].getText() == "X" && botones[8].getText() == "X"){
            this.jugador.setText("Jugador 2 ganó!");
        }
        if (botones[2].getText() == "X" && botones[4].getText() == "X" && botones[6].getText() == "X"){
            this.jugador.setText("Jugador 2 ganó!");
        }
        
        if (gano){
            for (int i = 0; i < 9; i++){
                botones[i].setEnabled(false);
            }
            gano = false;
        }
    }
    
    public static void main(String[] args) {
        Gato ventana = new Gato();
        ventana.setSize(370, 480);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Gato UVM");
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
