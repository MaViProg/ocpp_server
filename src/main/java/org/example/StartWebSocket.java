package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ocpp.BootNotificationConfirmation;
import org.example.ocpp.BootNotificationRequest;
import org.example.ocpp.RegistrationStatusEnumType;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

import static java.util.Objects.requireNonNull;

@ServerEndpoint("/")
@ApplicationScoped
public class StartWebSocket {

    private final ObjectMapper mapper = new ObjectMapper();

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("onOpen> ");
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("onClose> ");
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        System.out.println("onError> " + ": " + throwable);
    }

    @OnMessage
    public String onMessage(String message) throws JsonProcessingException {
        BootNotificationConfirmation response = new BootNotificationConfirmation();
        try {
            BootNotificationRequest request = mapper.readValue(message, BootNotificationRequest.class);
            System.out.println("onMessage> : " + request);

            response.setStatus(RegistrationStatusEnumType.Accepted);
        } catch (JsonProcessingException e) {
            response.setStatus(RegistrationStatusEnumType.Rejected);
        }
        return mapper.writeValueAsString(response);
    }
}
