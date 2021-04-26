package br.uniamerica.unijobs.web;


import br.uniamerica.unijobs.controller.ServicoController;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import javax.json.JsonObject;
import java.io.IOException;

public class ServicoHttpHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        HttpExchange httpExchange = null;
        switch (httpExchange.getRequestMethod()) {
            case "GET" :
                handleGetRequest(httpExchange);
                break;
            case "POST" :
                handlePostRequest(httpExchange);
                break;
            case "DELETE" :
                handleDeleteRequest(httpExchange);
                break;
            case "PUT" :
                handlePutRequest(httpExchange);
                break;
        }

        // TODO Auto-generated method stub


    }

    private void handlePutRequest(HttpExchange httpExchange) {
        ServicoController controller = new ServicoController();
        String request_uri = httpExchange.getRequestURI().toString();

        int id = 0;
        JsonObject json;

    }

    private void handleDeleteRequest(HttpExchange httpExchange) {
    }

    private void handlePostRequest(HttpExchange httpExchange) {
    }

    private void handleGetRequest(HttpExchange httpExchange) {
    }

    private void handleGetResquest(Object httpExchange) {
    }
}
