package br.uniamerica.unijobs.web;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Server {
    private final static int PORT = 8080;

    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress("localhost", PORT),0);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
            server.createContext("/users", new UsuarioHttpHandler());
            server.setExecutor(threadPoolExecutor);
            server.start();
            System.out.println("O servidor foi iniciado na porta " +PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
