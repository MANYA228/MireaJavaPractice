package Practice8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;

public class number1 {
    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("Мое первое GUI приложение");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем панель
        JPanel panel = new JPanel();

        // Создаем надпись
        JLabel label = new JLabel("Привет МИР!");

        // Добавляем надпись на панель
        panel.add(label);

        // Добавляем панель в окно
        frame.getContentPane().add(panel);

        // Устанавливаем размер окна
        frame.setPreferredSize(new Dimension(300, 100));

        // Автоматически выбираем размер окна
        frame.pack();

        // Отображаем окно
        frame.setVisible(true);
    }
}

