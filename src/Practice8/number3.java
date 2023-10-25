package Practice8;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class number3 {
    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("Приложение с изображениями и подписями");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем панель
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Создаем изображения
        Map<String, ImageIcon> images = new HashMap<>();
        images.put("Кот", new ImageIcon("C:\\Users\\i212\\Desktop\\kot\\Кот.jpg"));
        images.put("Собака", new ImageIcon("C:\\Users\\i212\\Desktop\\kot\\Собака.jpg"));

        for (Map.Entry<String, ImageIcon> entry : images.entrySet()) {
            JLabel label = new JLabel(entry.getKey(), entry.getValue(), JLabel.CENTER);
            panel.add(label);
        }

        // Добавляем панель в окно
        frame.getContentPane().add(panel);

        // Устанавливаем размер окна
        frame.setPreferredSize(new Dimension(600, 400));

        // Автоматически выбираем размер окна
        frame.pack();

        // Отображаем окно
        frame.setVisible(true);
    }
}

