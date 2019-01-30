package com.fabiohbarbosa;

import com.fabiohbarbosa.models.Client;

public class Main {

    public static void main(String... args) {
        Client client = Client.builder()
                .id(1L)
                .name("Gru")
                .address("Avenue Code")
                .build();

        System.out.println(client.getName());
    }

}
