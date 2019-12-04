package main;

import java.awt.Dimension;
import javax.swing.JFrame;
import controller.RegisterController;
import model.RegisterModel;
import view.RegisterView;

public class Main {

	public static void main(String[] args) {
		RegisterView registerScreen = new RegisterView();
		registerScreen.setTitle("Tela de Registro");
		registerScreen.setResizable(false);
		//registerScreen.setPreferredSize(new Dimension(600,400));
		registerScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
