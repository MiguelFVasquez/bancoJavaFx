package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import model.Banco;

public class BancoController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAceptarPrincipal;

    @FXML
    private ToggleGroup tiposDeCuenta;

    @FXML
    private Button btnCerrarPrincipal;

    @FXML
    private RadioButton rbtnAhorro;

    @FXML
    private RadioButton rbtnCorriente;

	private Aplicacion aplicacion;

	private Banco Banco;

    @FXML
    void aceptarPrincipal(ActionEvent event) {

    }

    @FXML
    void cerrarPrincipal(ActionEvent event) {

    }

    @FXML
    void initialize() {


    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion= aplicacion;
		this.Banco= aplicacion.getBanco();

	}
}
