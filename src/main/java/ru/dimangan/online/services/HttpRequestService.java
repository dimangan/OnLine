//package ru.dimangan.online.services;
//
//
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//public class HttpRequestService {
//
//    public static String httpRequest(String requestUrl) throws UsernameNotFoundException {
//        HttpClient httpClient = HttpClient.newHttpClient();
//        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(requestUrl)).build();
//        try {
//            String response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();
//            return response;
//        }
//        catch (InterruptedException | IOException e) {
//            throw new UsernameNotFoundException(e.getMessage());
//        }
//    }
//
//}
