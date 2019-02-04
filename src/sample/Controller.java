package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;


public class Controller implements Initializable {

    @FXML
    TextField addrbar;
    @FXML
    WebEngine engine;
    @FXML
    WebView webView;
    String addlink;
    String http = "http://";

    public void search(ActionEvent event){
        addlink = addrbar.getText().toString();
        engine.load(http+addlink);
    }
    public void home(ActionEvent event){
        engine = webView.getEngine();
        engine.load(http+"yahoo.com");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine = webView.getEngine();
        engine.load(http+"google.com");
    }
}
