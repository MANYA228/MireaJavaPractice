package Practice8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout; // Импортировать класс FlowLayout

public class number2 {
    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("Приложение с двумя панелями");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем первую панель
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Панель 1");
        label1.setFont(new Font("Arial", Font.PLAIN, 24));
        label1.setForeground(Color.RED);
        panel1.add(label1);

        // Создаем вторую панель
        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Панель 2");
        label2.setFont(new Font("Arial", Font.PLAIN, 36));
        label2.setForeground(Color.BLUE);
        panel2.add(label2);

        // Добавляем панели в окно
        frame.getContentPane().add(panel1);
        frame.getContentPane().add(panel2);

        // Устанавливаем размер окна
        frame.setPreferredSize(new Dimension(400, 200));

        // Размещаем панели в окне с использованием FlowLayout
        frame.setLayout(new FlowLayout());

        // Автоматически выбираем размер окна
        frame.pack();

        // Отображаем окно
        frame.setVisible(true);
    }
}

