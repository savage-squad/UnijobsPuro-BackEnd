package br.uniamerica.unijobs.web;

//import com.sun.net.httpserver.HttpHandler;

import br.uniamerica.unijobs.controller.UsuarioController;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class UsuarioHttpHandler implements HttpHandler {
    private HttpExchange httExchange;

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        switch (httExchange.getRequestMethod()) {
            case "GET" :
                handleGetRequest(httExchange);
            break;
            case "POST" :
                handlePostRequest(httExchange);
            break;
            case "DELETE" :
                handleDeleteRequest(httExchange);
            break;
            case "PUT" :
                handlePUTRequest(httExchange);
            break;

        }

    } //implements HttpHandler

    private void handlePUTRequest(HttpExchange httExchange) {
        UsuarioController controller = new UsuarioController();
        String request_uri = httExchange.getRequestURI().toString();

        int id = 0;

    }

    private void handleDeleteRequest(HttpExchange httExchange) {
    }

    private void handlePostRequest(HttpExchange httExchange) {
    }

    private void handleGetRequest(HttpExchange httExchange) {
    }

}
